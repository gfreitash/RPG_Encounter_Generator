package pericia.savageworlds;

import atributo.Espirito;
import core.Pericia;

public class Persuadir extends Pericia {
	public static final String nome = "Persuadir";
	public static final String desc = "Persuadir é a habilidade de convencer outros a " + 
			"fazerem o que você deseja. " +  
			"Extras iniciam em uma destas cinco atitudes " + 
			"diferentes: Hostil, Não Cooperativo, Neutro, " + 
			"Amigável ou Prestativo. Uma rolagem bemsucedida " + 
			"de Persuadir melhora a atitude do Extra " + 
			"em um passo ou dois com uma ampliação. Falhar, " + 
			"pelo contrário, piora a atitude do personagem em " + 
			"um passo ou dois se um 1 for rolado no dado de " + 
			"Persuadir (independente do Dado Selvagem). " + 
			"Muitos Extras não vão alterar sua reação mais " + 
			"do que um ou dois níveis durante uma única " + 
			"mudança, mas isto depende inteiramente do " + 
			"Mestre e da situação.";
	
	public Persuadir() {
		super(new Espirito());
	}
	
	public Persuadir(int nivelDado) {
		super(new Espirito(), nivelDado);
	}
}
