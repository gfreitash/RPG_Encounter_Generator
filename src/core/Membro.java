package core;

import java.util.ArrayList;
import java.util.List;

import exception.RequirementNotMetException;
import requisito.Requisito;
import requisito.RequisitoAtributo;
import requisito.RequisitoComplicacao;
import requisito.RequisitoPericia;
import requisito.RequisitoProgresso;
import requisito.RequisitoVantagem;

public class Membro extends Identidade {
	@SuppressWarnings("unused")
	private int idade, altura, peso;
	@SuppressWarnings("unused")
	private int creditos, salario, estiloVida;
	@SuppressWarnings("unused")
	private int aparar, resistencia, carisma, movimentação, tensão;

	Progresso progresso;

	int pontosDispAtrib;
	Atributo[] atributos;

	int pontosDispPericia;
	List<Pericia> pericias;

	List<Complicacao> complicacoes;
	List<Vantagem> vantagens;

	public Membro() {
		super("", "");
		//Progresso
		progresso = new Progresso(0);
		// Personalidade

		// Raça

		// Profissão

		// Classe

		// Tier

		// Atributos
		setAtributos(Atributo.getAtributosAleatorios());

		// Pericias
		this.pericias = new ArrayList<>();
		setPericias(Pericias.getRandom(6));

		// Complicações
		complicacoes = new ArrayList<>();
		boolean erro = false;
		int contErro = 0;
		do {
			try {
				System.out.println("Tentando encontrar complicações");
				System.out.println("Tentativa " + contErro);
				setComplicacoes(Complicacoes.getRandom(), Complicacoes.getRandom(), Complicacoes.getRandom());
				erro = false;
				System.out.println("Complicação encontrada");
			} catch(Exception e) {
				erro = true;
				contErro++;
			}
		} while(erro);

		// Vantagens
		contErro = 0;
		vantagens = new ArrayList<>();
		do {
			try {
				System.out.println("Tentando encontrar vantagens");
				System.out.println("Tentativa " + contErro);
				addVantagem(Vantagens.getRandom());
			} catch(Exception e) {
				erro = true;
				contErro++;
			}
		} while(erro);
	}

	private void setAtributos(Atributo atributos[]) {
		this.atributos = atributos;
	}

	private void setPericias(Pericia[] pericias) {
		for (Pericia x : pericias)
			this.pericias.add(x);
	}

	private void setComplicacoes(Complicacao maior, Complicacao menor1, Complicacao menor2)
			throws IllegalArgumentException {

		for(String x: maior.getTipoPossivel())
			System.out.println(x);
		for(String x: menor1.getTipoPossivel())
			System.out.println(x);
		for(String x: menor2.getTipoPossivel())
			System.out.println(x);

		if (!(maior.checkSeTipoValido("Maior") && menor1.checkSeTipoValido("Menor")
				&& menor2.checkSeTipoValido("Menor")))
			throw new IllegalArgumentException();

		complicacoes.add(maior);
		complicacoes.add(menor1);
		complicacoes.add(menor2);
	}

	public void addComplicacao(Complicacao... complicacao) throws Exception {
		if (complicacoes.size() > 0)
			for (Complicacao x : complicacao)
				complicacoes.add(x);
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
		Requisito req;
		boolean check = false;
		for (int i = 0; i < lista.size(); i++) {
			req = lista.get(i);

			if(req instanceof RequisitoProgresso) {
				if(checkProgresso((Progresso) req.getRequisito()))
					check = true;
				else return false;

			} else if(req instanceof RequisitoAtributo) {
				System.out.println("Requisito de atributo: " + ((Atributo) req.getRequisito()).getId().getNome());
				System.out.println("Membro tem esse requisito? " + checkAtributo((Atributo) req.getRequisito()));
				if(checkAtributo((Atributo) req.getRequisito()))
					check = true;
				else return false;

			} else if(req instanceof RequisitoPericia) {
				System.out.println("Requisito de Pericia: " + ((Pericia) req.getRequisito()).getNome());
				System.out.println("Membro tem esse requisito? " + checkPericia((Pericia) req.getRequisito()));
				if(checkPericia((Pericia) req.getRequisito()))
					check = true;
				else return false;

			} else if(req instanceof RequisitoVantagem) {
				System.out.println("Requisito de Vantagem: " + ((Vantagem) req.getRequisito()).getNome());
				System.out.println("Membro tem esse requisito? " + checkVantagem((Vantagem) req.getRequisito()));
				if(checkVantagem((Vantagem) req.getRequisito()))
					check = true;
				else return false;

			} else if(req instanceof RequisitoComplicacao) {
				System.out.println("Requisito de Complicacao: " + ((Complicacao) req.getRequisito()).getNome());
				System.out.println("Membro tem esse requisito? " + checkComplicacao((Complicacao) req.getRequisito()));
				if(checkComplicacao((Complicacao) req.getRequisito()))
					check = true;
				else return false;

			}
		}
		return check;

	}

	private boolean checkComplicacao(Complicacao comp) {
		if(complicacoes.contains(comp))
			return true;
		return false;
	}

	public boolean checkVantagem(Vantagem vant) {
		if(vantagens.contains(vant))
			return true;
		return false;
	}

	public boolean checkPericia(Pericia per) {
		if(pericias.contains(per)) {
			Pericia x = pericias.get(pericias.indexOf(per));
			if(x.getNivelPericia() >= per.getNivelPericia())
				return true;
		}
		return false;
	}

	public boolean checkProgresso(Progresso prog) {
		if(progresso.getExperiencia() >= prog.getExperiencia())
			return true;
		return false;
	}

	public boolean checkAtributo(Atributo atributo){
		for(Atributo x: this.atributos) {
			if(x == atributo) {
				if(x.getNivelDado() >= atributo.getNivelDado())
					return true;
				else
					return false;
			}
			return false;
		}
		return false;
	}

	public String toString()  {
		String toString = "";
		int i = 0;

		toString += "Atributos: \n";
		for(Atributo x: this.atributos) {
			toString += x.getId().getNome() + ": " + x.getNivelDado() + "\n";
		}

		toString += "\nPericias: \n";
		for(;i < pericias.size(); i++)
			toString += pericias.get(i).getNome() + ": " + pericias.get(i).getNivelPericia() + "\n";

		toString += "\nComplicações: \n";
		for(i = 0; i < complicacoes.size(); i++)
			toString += complicacoes.get(i).getNome() + "\n";

		toString += "\nVantagens: \n";
		for(i = 0; i < vantagens.size(); i++)
			toString += vantagens.get(i).getNome() + "\n";

		return toString;
	}
}
