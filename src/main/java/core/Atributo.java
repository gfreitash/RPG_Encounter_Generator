package core;


import utils.NonStaticEnum;
import utils.Utils;

public class Atributo extends NonStaticEnum implements Requisitavel, Identificavel, PossuiDado {

	public static final Atributo AGILIDADE = new Atributo("Agilidade",
			"AGILIDADE é a rapidez, velocidade e " + "destreza do seu herói.");

	public static final Atributo ASTUCIA = new Atributo("Astúcia",
			"ASTÚCIA é uma medida de quão bem seu "
			+ "personagem conhece seu mundo e sua cultura, " + "quão bem planeja os seus passos e a sua agilidade "
			+ "mental.");

	public static final Atributo ESPIRITO = new Atributo("Espírito",
			"ESPÍRITO reflete sabedoria interior e força " +
			"de vontade. Espírito é muito importante, pois " + "ajuda seu personagem a " +
			"se recuperar do estado " + "Abalado");

	public static final Atributo FORCA = new Atributo("Força",
			"FORÇA representa força bruta e aptidão física " +
			"no geral. Força também é usada para gerar o dano " +
			"do seu guerreiro em combate corpo a corpo.");

	public static final Atributo VIGOR = new Atributo("Vigor", "VIGOR representa a tolerância, resistência " +
			"a doenças, venenos ou toxinas e quanta dor e " +
			"dano físico um herói pode suportar.");


	private final Identidade id;
	private int modificadorDado;
	private int nivelDado;
	
	private Atributo(String nome, String descricao) {
		super(nome);
		id = new Identidade(nome, descricao);
		setNivelDado(4);
	}

	public static Atributo[] values() {
		return (Atributo[]) NonStaticEnum.values();
	}

	public Atributo setNivelDado(int nivel) throws IllegalArgumentException {
		if ((nivel % 2) == 0 && nivel >= 4)
			if (nivel <= 12)
				nivelDado = nivel;
			else {
				nivelDado = 12;
				modificadorDado = (nivel - nivelDado) / 2;
			}
		else
			throw new IllegalArgumentException("\"nivel\" deve ser par e maior ou igual a 4");

		return this;
	}

	public void setModificadorDado(int modificador) {
		modificadorDado = modificador;
	}

	public static Atributo[] getAtributosAleatorios() {
		Atributo[] atributos = Atributo.values();
		for(Atributo x: atributos) {
			x.setNivelDado(Utils.arredondarParaProximoPar(Math.random() * 8) + 4);
		}

		return atributos;
	}

	public static Atributo getAleatorio(Atributo a) {
		a.setNivelDado(Utils.arredondarParaProximoPar(Math.random() * 8) + 4);
		return a;
	}

	public Identidade getId() {
		return id;
	}

	public int getNivelDado() {
		return nivelDado;
	}

	public int getModificadorDado() {
		return modificadorDado;
	}

	@Override
	public boolean check(NPC npc) {
		boolean possuiAtributo = false;

		for(Atributo x: npc.getAtributos()) {
			if(x.getId() == this.getId()) {
				if(x.getNivelDado() >= this.getNivelDado())
					return true;
			}
		}
		return false;
	}

	public String toString() {
		return id.toString();
	}
}
