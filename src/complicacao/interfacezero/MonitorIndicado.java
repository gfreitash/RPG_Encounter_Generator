package complicacao.interfacezero;

import core.Complicacao;

public class MonitorIndicado extends Complicacao {
	public static final String nome = "Monitor Indicado";
	public static final String desc = "Seu personagem tem um cão de guarda. "
			+ "Esta é uma Com-plicação Menor se o monitor raramente "
			+ "interfere nas ações do seu herói, contudo ele "
			+ "provavelmente reportará as ativi-dades do personagem "
			+ "aos seus superiores. Está é uma Complicação Maior "
			+ "se o monitor irá interferir em qualquer ação que vá "
			+ "contra as ordens dos seus superiores e sempre irá "
			+ "reportar as atividade do personagem, independente do "
			+ "que elas sejam. Se um Monitor Indicado é morto, um "
			+ "novo monitor o substituirá, a menos que ele tenha "
			+ "sido morto pelo personagem, que será acusado de "
			+ "homicídio (ou isto é substituído com a Complicação "
			+ "Procurado). Um monitor pode ser uma pessoa, mas também "
			+ "pode ser um Aspecto carregado dentro do TAP do personagem, "
			+ "dependendo da natureza dos seus superiores.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public MonitorIndicado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonitorIndicado(String tipo) {
		super(tipo);
	}
}
