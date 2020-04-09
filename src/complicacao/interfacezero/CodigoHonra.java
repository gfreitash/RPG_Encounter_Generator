package complicacao.interfacezero;

import core.Complicacao;

public class CodigoHonra extends Complicacao {
	public static final String nome = "Código de Honra";
	public static final String desc = "Há muitos códigos de honra diferentes dentro do gênero " + 
			"cyberpunk, com o mais conhecido sendo talvez o código " + 
			"do Samurai das Ruas, que é baseado no código Japonês do " + 
			"Bushido. Jogadores e Mestres devem se sentir livres para " + 
			"modificar essa Complicação para melhor se encaixar nos " + 
			"diferentes códigos de honra que alguém pode encontrar " + 
			"dentro do mundo de Interface Zero 2.0.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public CodigoHonra() {
		
	}
	
	public CodigoHonra(String tipo) {
		super(tipo);
	}
}
