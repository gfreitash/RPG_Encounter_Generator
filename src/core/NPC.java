package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exception.RequirementNotMetException;
import requisito.Requisito;
import requisito.RequisitoAtributo;
import requisito.RequisitoComplicacao;
import requisito.RequisitoPericia;
import requisito.RequisitoProgresso;
import requisito.RequisitoVantagem;

public class NPC {
	private Identidade id;
	private int idade, altura, peso;
	private int creditos, salario, estiloVida;
	private int aparar, resistencia, carisma, movimentação, tensão;

	private final Progresso progresso;

	private int pontosDispAtrib;
	private Atributo[] atributos;
	private int pontosDispPericia;
	private final List<Pericia> pericias;
	private final List<Complicacao> complicacoes;
	private final List<Vantagem> vantagens;

	public NPC() throws InterruptedException {
		//Progresso
		progresso = new Progresso(0);
		// Personalidade

		// Raça

		// Profissão

		// Classe

		// Tier

		// Atributos
		System.out.println("Definindo atributos");
		setAtributos(Atributo.getAtributosAleatorios());
		System.out.println("Atributos escolhidos: \n");
		for(Atributo x: atributos)
			System.out.println(x.getId().getNome() + " - d" + x.getNivelDado());

		// Pericias
		System.out.println("Definindo perícias");
		this.pericias = new ArrayList<>();
		setPericias(Pericia.getPericiasAleatorias(6));
		System.out.println("Perícias escolhidas: \n");
		for(Pericia x: pericias)
			System.out.println(x.getId().getNome() + " - d" + x.getNivelPericia());

		// Complicações
		complicacoes = new ArrayList<>();
		boolean erro = false;
		int contErro = 0;
		do {
			try {
				Complicacao[] c = new Complicacao[3];
				Complicacao temp;
				boolean jaEscolhida = false;

				System.out.println("Tentando encontrar complicações");
				System.out.println("Tentativa " + contErro);
				for(int i = 0; i < 3; i++){
					temp = Complicacao.getAleatoria();

					for(Complicacao x: c)
						if (x != null)
							if(x.getId() == temp.getId()) {
								jaEscolhida = true;
								break;
							}

					if(!jaEscolhida)
						c[i] = temp;
				}

				setComplicacoes(c[0], c[1], c[2]);
				erro = false;
				System.out.println("Complicação encontrada");
				for(Complicacao x: complicacoes)
					System.out.println(x.getId().getNome() + " - " + x.getTipo());
			} catch(Exception e) {
				erro = true;
				contErro++;
			}
		} while(erro);

		// Vantagens
		erro = false;
		contErro = 0;
		vantagens = new ArrayList<>();
		do {
			try {
				System.out.println("Tentando encontrar vantagens");
				System.out.println("Tentativa " + contErro);
				Vantagem vant = Vantagem.getAleatoria();
				System.out.println("Vantagem escolhida: " + vant);
				addVantagem(vant);
			} catch(Exception e) {
				System.out.println(e);
				Thread.sleep(5000);
				erro = true;
				contErro++;
			}
		} while(erro);
	}

	private void setAtributos(Atributo[] atributos) {
		this.atributos = atributos;
	}

	private void setPericias(Pericia[] pericias) {
		Collections.addAll(this.pericias, pericias);
	}

	private void setComplicacoes(Complicacao maior, Complicacao menor1, Complicacao menor2)
			throws IllegalArgumentException {

		for(TipoComplicacao x: maior.getTipoPossível())
			System.out.println(x);
		for(TipoComplicacao x: menor1.getTipoPossível())
			System.out.println(x);
		for(TipoComplicacao x: menor2.getTipoPossível())
			System.out.println(x);

		if (!(maior.checkSeTipoValido(TipoComplicacao.MAIOR) && menor1.checkSeTipoValido(TipoComplicacao.MENOR)
				&& menor2.checkSeTipoValido(TipoComplicacao.MENOR)))
			throw new IllegalArgumentException();

		complicacoes.add(maior);
		complicacoes.add(menor1);
		complicacoes.add(menor2);
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
			if(checkRequisitos(l.getRequisitos()))
				vantagens.add(l);
			else throw new RequirementNotMetException("O membro não tem os requisitos necessários.");
		}
	}

	public void addVantagem(List<Vantagem> vants) throws RequirementNotMetException {
		for(Vantagem l: vants) {
			if(checkRequisitos(l.getRequisitos()))
				vantagens.add(l);
			else throw new RequirementNotMetException("O membro não tem os requisitos necessários.");
		}
	}

	public boolean checkRequisitos(List<Requisito> lista) {
		boolean check = false;
		for (Requisito requisito : lista) {

			if (requisito instanceof RequisitoProgresso) {
				if (checkProgresso((Progresso) requisito.getRequisito()))
					check = true;
				else return false;

			} else if (requisito instanceof RequisitoAtributo) {
				System.out.println("Requisito de atributo: " + ((Atributo) requisito.getRequisito()).getId().getNome()
						+ " - d" + ((Atributo) requisito.getRequisito()).getNivelDado());

				if (checkAtributo((Atributo) requisito.getRequisito()))
					check = true;
				else return false;

			} else if (requisito instanceof RequisitoPericia) {
				System.out.println("Requisito de Pericia: " + ((Pericia) requisito.getRequisito()).getId().getNome()
						+ " - d" + ((Pericia) requisito.getRequisito()).getNivelPericia());

				if (checkPericia((Pericia) requisito.getRequisito()))
					check = true;
				else return false;

			} else if (requisito instanceof RequisitoVantagem) {
				System.out.println("Requisito de Vantagem: " + (((Vantagem) requisito.getRequisito()).getId().getNome()));
				System.out.println("Membro tem esse requisito? " + checkVantagem((Vantagem) requisito.getRequisito()));
				if (checkVantagem((Vantagem) requisito.getRequisito()))
					check = true;
				else return false;

			} else if (requisito instanceof RequisitoComplicacao) {
				System.out.println("Requisito de Complicacao: " + ((Complicacao) requisito.getRequisito()).getId().getNome());
				System.out.println("Membro tem esse requisito? " + checkComplicacao((Complicacao) requisito.getRequisito()));
				if (checkComplicacao((Complicacao) requisito.getRequisito()))
					check = true;
				else return false;

			}
		}
		return check;

	}

	private boolean checkComplicacao(Complicacao comp) {
		return complicacoes.contains(comp);
	}

	public boolean checkVantagem(Vantagem vant) {
		return vantagens.contains(vant);
	}

	public boolean checkPericia(Pericia pericia) {
		System.out.println("Checando se NPC tem pericia: " + pericia.getId().getNome() + " - d" + pericia.getNivelPericia());
		if(pericias.contains(pericia)) {
			Pericia x = pericias.get(pericias.indexOf(pericia));
			System.out.println("NPC possui pericia " + x.getId().getNome() + " - d" + x.getNivelPericia());
			return x.getNivelPericia() >= pericia.getNivelPericia();
		}
		return false;
	}

	public boolean checkProgresso(Progresso prog) {
		return progresso.getExperiencia() >= prog.getExperiencia();
	}

	public boolean checkAtributo(Atributo atributo){
		boolean possuiAtributo = false;
		System.out.println("Checando se NPC tem atributo: " + atributo.getId().getNome() + " - d" + atributo.getNivelDado());

		for(Atributo x: this.atributos) {
			System.out.println("\tAtributo encontrado: " + x.getId().getNome());
			if(x.getId() == atributo.getId()) {
				System.out.println("NPC possui atributo " + x.getId().getNome() + " - d" + x.getNivelDado());
				System.out.println(x.getNivelDado() >= atributo.getNivelDado());
				if(x.getNivelDado() >= atributo.getNivelDado())
					return true;
			}
		}
		return false;
	}

	public String toString()  {
		String toString = "";
		int i = 0;

		toString += "\nAtributos: \n";
		for(Atributo x: this.atributos) {
			toString += x.getId().getNome() + ": " + x.getNivelDado() + "\n";
		}

		toString += "\nPericias: \n";
		for(;i < pericias.size(); i++)
			toString += pericias.get(i).getId().getNome() + ": " + pericias.get(i).getNivelPericia() + "\n";

		toString += "\nComplicações: \n";
		for(i = 0; i < complicacoes.size(); i++)
			toString += complicacoes.get(i).getId().getNome() + "\n";

		toString += "\nVantagens: \n";
		for(i = 0; i < vantagens.size(); i++)
			toString += vantagens.get(i).getId().getNome() + "\n";

		return toString;
	}
}
