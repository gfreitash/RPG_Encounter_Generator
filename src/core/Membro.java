package core;

import java.util.ArrayList;
import java.util.List;

import atributo.Agilidade;
import atributo.Astucia;
import atributo.Espirito;
import atributo.Forca;
import atributo.Vigor;
import exception.RequirementNotMetException;
import requisito.Requisito;
import requisito.RequisitoAtributo;
import requisito.RequisitoComplicacao;
import requisito.RequisitoPericia;
import requisito.RequisitoProgresso;
import requisito.RequisitoVantagem;

public class Membro extends Core{
	@SuppressWarnings("unused")
	private int idade, altura, peso;
	@SuppressWarnings("unused")
	private int creditos, salario, estiloVida;
	@SuppressWarnings("unused")
	private int aparar, resistencia, carisma, movimentação, tensão;
	
	Progresso progresso;

	int pontosDispAtrib;
	Agilidade agilidade;
	Astucia astucia;
	Espirito espirito;
	Forca forca;
	Vigor vigor;

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
		setAtributos(Atributos.getRandom());

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

	private void setAtributos(Atributos[] atributos) throws IllegalArgumentException {
		Atributo atrib;
		for (Atributos x : atributos) {
			atrib = x.get();
			
			if(atrib instanceof Agilidade)
				agilidade = (Agilidade) x.get();

			else if(atrib instanceof Astucia)
				astucia = (Astucia) x.get();

			else if(atrib instanceof Espirito)
				espirito = (Espirito) x.get();

			else if(atrib instanceof Forca)
				forca = (Forca) x.get();

			else if(atrib instanceof Vigor)
				vigor = (Vigor) x.get();
		}

		if (agilidade == null || astucia == null || espirito == null || forca == null || vigor == null) {
			agilidade = null;
			astucia = null;
			espirito = null;
			forca = null;
			vigor = null;

			throw new IllegalArgumentException("o valor de \"atributo\" é inválido");
		}
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
				System.out.println("Requisito de atributo: " + ((Atributo) req.getRequisito()).getNome());
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
	
	public boolean checkAtributo(Atributo atrib) throws IllegalArgumentException{
		if(atrib instanceof Agilidade) {
			if(agilidade.getNivelDado() >= atrib.getNivelDado())
				return true;
			else return false;
			
		} else if(atrib instanceof Astucia) {
			if(astucia.getNivelDado() >= atrib.getNivelDado())
				return true;
			else return false;
			
		} else if(atrib instanceof Espirito) {
			if(espirito.getNivelDado() >= atrib.getNivelDado())
				return true;
			else return false;
		} else if(atrib instanceof Forca) {
			if(forca.getNivelDado() >= atrib.getNivelDado())
				return true;
			else return false;
		} else if(atrib instanceof Vigor) {
			if(vigor.getNivelDado() >= atrib.getNivelDado())
				return true;
			else return false;
		}
		throw new IllegalArgumentException("atrib não é um atributo válido");
	}

	public String toString()  {
		String toString = "";
		int i = 0;
		toString += "Atributos: \n";
		toString += "Agilidade: " + agilidade.getNivelDado() + "\n";
		toString += "Astúcia: " + astucia.getNivelDado() + "\n";
		toString += "Espírito: " + espirito.getNivelDado() + "\n";
		toString += "Força: " + forca.getNivelDado() + "\n";
		toString += "Vigor: " + vigor.getNivelDado() + "\n";
		
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
	
	protected void setNome(String nome) {
		super.setNome(nome);
	}
	
	protected void setDesc(String desc) {
		super.setDesc(desc);
	}
}
