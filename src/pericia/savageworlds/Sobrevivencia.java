package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Sobrevivencia extends Pericia {
	public static final String nome = "Sobrevivência";
	public static final String desc = "Sobrevivência permite encontrar comida, água " + 
			"ou abrigo em ambientes hostis. O personagem pode " + 
			"fazer apenas uma rolagem por dia. Uma rolagem " + 
			"bem sucedida encontra sustento para uma pessoa, " + 
			"com uma ampliação encontra comida e água para " + 
			"cinco adultos. Cavalos e outros animais grandes " + 
			"contam como dois adultos. Crianças, camelos ou " + 
			"outros com pouco apetite contam como “meio” " + 
			"adulto. Todos os beneficiados pela rolagem não " + 
			"precisam fazer rolagens de Fadiga para comida, " + 
			"água ou abrigo por esse dia.";
	
	public Sobrevivencia() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Sobrevivencia(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
