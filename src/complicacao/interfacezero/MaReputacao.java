package complicacao.interfacezero;

import core.Complicacao;

public class MaReputacao extends Complicacao {
	public static final String nome = "Má Reputação";
	public static final String desc = "As pessoas pensam o pior do seu personagem. "
			+ "Se algo ruim acontece, ele é a primeira pessoa a levar "
			+ "a culpa. Talvez ele mereça, talvez não, mas ninguém parece "
			+ "se importar com o que ele tem a dizer sobre o assunto.Como "
			+ "uma Complicação Menor, os rumores que as pessoas levantam "
			+ "sobre seu personagem são realmente verdades exageradas ou "
			+ "completas mentiras. Talvez você tenha alguns contatos na "
			+ "Yakuza, mas isso não significa que você é “um matador durão "
			+ "que a Yakuza contrata para missões especiais”. Como uma "
			+ "Complicação Maior, você na verdade tem algum tipo de ficha criminal. "
			+ "A polícia provavelmente irá aparecer na sua porta se algo "
			+ "acontece na sua área, mesmo que você não tenha nada a ver com isso, "
			+ "e você já viu o interior de várias salas de interrogatório";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public MaReputacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaReputacao(String tipo) {
		super(tipo);
	}
}
