package complicacao.savageworlds;

import core.Complicacao;

public class Heroico extends Complicacao {
	public static final String nome = "Heróico";
	public static final String desc = "Esta nobre alma nunca diz não a uma pessoa " + 
			"necessitada. Ela não precisa ficar feliz com isto, " + 
			"mas sempre virá em socorro daqueles que (pelo " + 
			"menos de forma aparente) não podem ajudar a " + 
			"si mesmos. É a primeira a correr para dentro de " + 
			"um prédio em chamas, geralmente aceita caçar " + 
			"monstros por pouco ou nenhum pagamento e " + 
			"normalmente é um alvo fácil para uma história " + 
			"triste.";
	
	public Heroico(String tipo) {
		super(tipo, "Maior");
	}
}
