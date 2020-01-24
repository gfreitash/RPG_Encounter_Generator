package pericia.savageworlds;

import core.Pericia;

public class Sobrevivencia extends Pericia {
	private static String desc = "Sobrevivência permite encontrar comida, água " + 
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
		super("Sobrevivência", desc, new atributo.Astucia());
	}
	
	public Sobrevivencia(int nivelDado) {
		super("Sobrevivência", desc, new atributo.Astucia(), nivelDado);
	}
}
