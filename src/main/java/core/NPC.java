package core;

import java.util.*;

import exception.NotAvailablePointsLeftException;
import exception.RequirementNotMetException;

public class NPC {
	private Map propriedadesPrimarias;
	private Map propriedadesGenericas;

	private Identidade id;
	private Raca raca;
	private int idade, altura, peso;
	private int creditos, salario, estiloVida;

	private Classe classe;
	private final Progresso progresso;
	private int pontosDispAtrib;
	private Atributo[] atributos;
	private int pontosDispPericia;
	private List<Pericia> pericias;
	private List<Complicacao> complicacoes;
	private List<Vantagem> vantagens;
	private int aparar, resistencia, carisma, movimentacao, tensao;

	public NPC() {
		//Progresso
		progresso = new Progresso(0);
		pontosDispAtrib = 8;
		pontosDispPericia = 15;

		//Classe
		classe = Classe.FRANCO_ATIRADOR;

		//Raça
		raca = classe.getRacaPreferencia().obter().getRaca();

		//Atributos
		atributos = Atributo.values();
		while(pontosDispAtrib > 0)
			adicionarDado(classe.getAtributoPreferencia().obter(), 1);


		//Pericias
		pericias = new ArrayList<>();
		while(pontosDispPericia > 0) {
			adicionarPericia(classe.getPericiaPreferencia().obter(), 1);
		}

		//Complicação
		complicacoes = new ArrayList<>();
		var erro = true;
		while(erro) {
			try{
				setComplicacoes(classe.getComplicacaoPreferencia().obter(),
						classe.getComplicacaoPreferencia().obter(), classe.getComplicacaoPreferencia().obter());
				erro = false;
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		//Vantagens
		vantagens = new ArrayList<>();
		erro = true;
		while(erro){
			try{
				addVantagem(classe.getVantagemPreferencia().obter());
				erro = false;
			} catch(Exception e) {
				System.out.println(e);
				try {
					Thread.sleep(5000);
				} catch (Exception f) {

				}
			}
		}


	}

	public Raca getRaca() {
		return raca;
	}

	private Identificavel procurar(Identificavel objeto, List<Identificavel> lista) {
		if(lista.contains(objeto))
			return(lista.get(lista.indexOf(objeto)));
		else throw new IllegalArgumentException("Objeto não encontrado");
	}

	private Identificavel procurar(Identificavel objeto, Identificavel[] objetos) {
		for(Identificavel o: objetos)
			if(o.equals(objeto))
				return o;

		throw new IllegalArgumentException("Objeto não encontrado");
	}

	private void setComplicacoes(Complicacao maior, Complicacao menor1, Complicacao menor2)
			throws IllegalArgumentException {

		if (!(maior.checkSeTipoValido(TipoComplicacao.MAIOR) && menor1.checkSeTipoValido(TipoComplicacao.MENOR)
				&& menor2.checkSeTipoValido(TipoComplicacao.MENOR)))
			throw new IllegalArgumentException();

		complicacoes.add(maior);
		complicacoes.add(menor1);
		complicacoes.add(menor2);
	}

	public <PossuiDado> void setDado(PossuiDado dado) {
		;
		//x = dado;
	}

	public void adicionarDado(Atributo atributo, int pontos) {
		if((pontos > 0 && pontosDispAtrib > 0)) {
			if (pontos <= pontosDispAtrib) {
				pontos *= 2;
				Atributo x = (Atributo) procurar(atributo, atributos);
				x.setNivelDado(x.getNivelDado() + pontos);
				pontosDispAtrib--;
			} else throw new NotAvailablePointsLeftException("Não há pontos disponíveis");
		} else throw new IllegalArgumentException("Argumentos não são válidos");
	}

	public void addComplicacao(Complicacao... complicacao) throws Exception {
		if (complicacoes.size() > 0)
			Collections.addAll(this.complicacoes, complicacao);
		else
			throw new Exception("complicacoes não foi inicializada");
	}

	public boolean removeComplicacao(Complicacao complicacao) {
		if (complicacoes.contains(complicacao)) {
			complicacoes.remove(complicacao);
			return true;
		}
		return false;
	}

	public void addVantagem(Vantagem... vants) {
		for(Vantagem l: vants) {
			var possui = true;

			for(Requisito req: l.getRequisitos()){
				if (!req.check(this)) {
					possui = false;
					break;
				}
			}

			if(possui)
				vantagens.add(l);
		}
	}

	public void addVantagem(List<Vantagem> vants) throws RequirementNotMetException {
		for(Vantagem l: vants) {
			if(l.check(this))
				vantagens.add(l);
			else throw new RequirementNotMetException("O membro não tem os requisitos necessários.");
		}
	}

	public Atributo[] getAtributos() {
		return atributos;
	}

	public Identidade getId() {
		return id;
	}

	public void setIdentidade(Identidade identidade) {
		id = identidade;
	}

	private void setAtributos(Atributo[] atributos) {
		this.atributos = atributos;
	}

	public List<Pericia> getPericias() {
		return pericias;
	}

	public void adicionarPericia(Pericia p, int pontos) {
		if(pericias.contains(p))
			pericias.get(pericias.indexOf(p)).addNivelDado(pontos);
		else
			pericias.add(p);

		pontosDispPericia--;
	}

	private void setPericias(Pericia[] pericias) {
		Collections.addAll(this.pericias, pericias);
	}

	public List<Complicacao> getComplicacoes() {
		return complicacoes;
	}

	public List<Vantagem> getVantagens() {
		return vantagens;
	}

	public Progresso getProgresso() {
		return progresso;
	}

	public String toString()  {
		StringBuilder toString = new StringBuilder();
		int i = 0;

		toString.append("\nAtributos: \n");
		for(Atributo x: this.atributos) {
			toString.append(x.getId().getNome()).append(": ").append(x.getNivelDado()).append("\n");
		}

		toString.append("\nPericias: \n");
		for(;i < pericias.size(); i++)
			toString.append(pericias.get(i).getId().getNome()).append(": ").append(pericias.get(i).getNivelDado()).append("\n");

		toString.append("\nComplicações: \n");
		for(i = 0; i < complicacoes.size(); i++)
			toString.append(complicacoes.get(i).getId().getNome()).append("\n");

		toString.append("\nVantagens: \n");
		for(i = 0; i < vantagens.size(); i++)
			toString.append(vantagens.get(i).getId().getNome()).append("\n");

		return toString.toString();
	}

	public Map getPropriedadesPrimarias() {
		return propriedadesPrimarias;
	}
}
