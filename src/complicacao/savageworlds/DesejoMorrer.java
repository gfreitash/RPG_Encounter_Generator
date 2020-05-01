package complicacao.savageworlds;

import core.Complicacao;

public class DesejoMorrer extends Complicacao {
	public static final String nome = "Desejo de Morrer";
	public static final String desc = "Ter um desejo de morrer n�o significa que "
			+ "seu her�i seja um suicida � mas ele quer morrer " + "depois de completar algum objetivo importante. "
			+ "Talvez queira vingan�a pelo assassinato de sua " + "fam�lia ou talvez esteja morrendo de alguma "
			+ "doen�a e queira partir em um lampejo de gl�ria. " + "Ele n�o vai jogar sua vida fora por qualquer "
			+ "raz�o, mas quando houver uma chance de " + "completar o seu objetivo, far� qualquer coisa � e "
			+ "aceitar� qualquer risco � para alcan��-lo. " + "Essa normalmente � uma Complica��o menor, "
			+ "a menos que o objetivo seja relativamente f�cil " + "de ser alcan�ado (muito raro).";
	public static final String tipoPossivel[] = { "Menor", "Maior" };

	public DesejoMorrer() {
		super(nome, desc, tipoPossivel);
	}

	public DesejoMorrer(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
