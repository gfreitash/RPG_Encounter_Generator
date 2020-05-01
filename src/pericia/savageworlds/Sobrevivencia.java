package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Sobrevivencia extends Pericia {
	public static final String nome = "Sobreviv�ncia";
	public static final String desc = "Sobreviv�ncia permite encontrar comida, �gua " + 
			"ou abrigo em ambientes hostis. O personagem pode " + 
			"fazer apenas uma rolagem por dia. Uma rolagem " + 
			"bem sucedida encontra sustento para uma pessoa, " + 
			"com uma amplia��o encontra comida e �gua para " + 
			"cinco adultos. Cavalos e outros animais grandes " + 
			"contam como dois adultos. Crian�as, camelos ou " + 
			"outros com pouco apetite contam como �meio� " + 
			"adulto. Todos os beneficiados pela rolagem n�o " + 
			"precisam fazer rolagens de Fadiga para comida, " + 
			"�gua ou abrigo por esse dia.";
	
	public Sobrevivencia() {
		super(nome, desc, new Astucia());
	}
	
	public Sobrevivencia(int nivelDado) {
		super(nome, desc, new Astucia(), nivelDado);
	}
}
