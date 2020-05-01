package core;

import vantagem.interfacezero.*;
import vantagem.savageworlds.*;

public enum Vantagens {
	AMBIDESTRO(new Ambidestro()), ANTECEDENTE_ARCANO(new AntecedenteArcano("")), ATRAENTE(new Atraente()),
	CORAJOSO(new Corajoso()), CURA_RAPIDA(new CuraRapida()), FURIOSO(new Furioso()), LIGEIRO(new Ligeiro()),
	LINGUISTA(new Linguista()), MUITO_ATRAENTE(new MuitoAtraente()), MUSCULOSO(new Musculoso()), NOBRE(new Nobre()),
	PRONTIDAO(new Prontidao()), RAPIDO(new Rapido()), RICO(new Rico()), RESISTENCIA_ARCANA(new ResistenciaArcana()), 
	RESISTENCIA_ARCANA_APRIMORADA(new ResistenciaArcanaAprimorada());
	
	Vantagem vantagem;
	
	Vantagens(Vantagem vantagem) {
		this.vantagem = vantagem;
	}
	
	public Vantagem get() {
		return vantagem;
	}
	
	public static Vantagem getRandom() {
		Vantagens[] v = Vantagens.values();
		Vantagem vant = null;
		int tamanho = v.length;
		int random = (int) (Math.random() * tamanho);
		
		for (int i = 0; i < tamanho; i++) {
			if (i == random)
				vant = v[i].get();
		}
		
		System.out.println("Vantagem encontrada = " + vant.getNome());
		
		return vant;
	}
}
