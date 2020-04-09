package complicacao.savageworlds;

import core.Complicacao;

public class Inimigo extends Complicacao {
	public static final String nome = "Inimigo";
	public static final String desc = "Alguém odeia seu herói e quer vê-lo morto. " + 
			"O valor da Complicação depende do quão " + 
			"poderoso é o Inimigo e de quantas vezes ele " + 
			"poderá aparecer. Um Inimigo Menor pode ser " + 
			"um pistoleiro solitário buscando vingança. " + 
			"Um Inimigo Maior pode ser um pistoleiro " + 
			"sobrenatural que deseja o seu herói morto. " + 
			"Se o Inimigo um dia for vencido, o Mestre " + 
			"deve trabalhar gradualmente em um substituto " + 
			"ou o herói pode pagar pela Complicação " + 
			"sacrificando um Progresso.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Inimigo() {
		
	}
	
	public Inimigo(String tipo) {
		super(tipo);
	}
}
