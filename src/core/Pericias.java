package core;

import pericia.interfacezero.*;
import pericia.savageworlds.*;

public enum Pericias {
	ARREMESSAR(new Arremessar()), ARROMBAR(new Arrombar()), ATIRAR(new Atirar()), ATLETISMO(new Atletismo()),
	CAVALGAR(new Cavalgar()), CONHECIMENTO_DEMOLICAO(new ConhecimentoDemolicao()),
	CONHECIMENTO_PROGRAMACAO(new ConhecimentoProgramacao()), CONSERTAR(new Consertar()), CURAR(new Curar()),
	DIRIGIR(new Dirigir()), ESCALAR(new Escalar()), FURTIVIDADE(new Furtividade()), HACKING(new Hacking()), INTIMIDAR(new Intimidar()),
	INVESTIGAR(new Investigar()), JOGAR(new Jogar()), LUTAR(new Lutar()), MANHA(new Manha()), NADAR(new Nadar()),
	NAVEGAR(new Navegar()), PERCEBER(new Perceber()), PERSUADIR(new Persuadir()), PILOTAR(new Pilotar()),
	PROVOCAR(new Provocar()), RASTREAR(new Rastrear()), SOBREVIVÊNCIA(new Sobrevivencia());
	
	Pericia pericia;
	
	Pericias(Pericia pericia) {
		this.pericia = pericia;
	}

	public Pericia get() {
		return pericia;
	}
	
	public static Pericia[] getRandom(int quantPericias) {
		Pericia[] pericias = new Pericia[quantPericias];
		int random;
		
		for(int i = 0; i < quantPericias; i++) {
			random = (int) roundToNextEven((Math.random() * 8)) + 4;
			pericias[i] = getRandomPericia(random);
		}
		
		return pericias;
		
	}

	public static Pericia getRandomPericia(int nivelDado) {
		Pericias[] p = Pericias.values();
		Pericia pericia = null;
		int tamanho = p.length;
		int random = (int) (Math.random() * tamanho);
		
		for (int i = 0; i < tamanho; i++) {
			if (i == random)
				pericia = p[i].get();
		}
		
		return pericia;
	}
	
	private static int roundToNextEven(double d) {
	    int hlp = (int)Math.ceil(d);
	    if (hlp%2 == 0)
	        return hlp;
	    return hlp-1;
	}
	
}
