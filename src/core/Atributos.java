package core;

import atributo.Agilidade;
import atributo.Astucia;
import atributo.Espirito;
import atributo.Forca;
import atributo.Vigor;

public enum Atributos {
	AGILIDADE(new Agilidade()), ASTUCIA(new Astucia()), ESPIRITO(new Espirito()), FORCA(new Forca()), VIGOR(new Vigor());
	Atributo atributo;
	
	Atributos(Atributo atributo) {
		this.atributo = atributo;
	}
	
	public Atributo get() {
		return atributo;
	}
	
	private void set(Atributo atributo) {
		this.atributo = atributo;
	}
	
	public static Atributos[] getRandom() {
		Atributos[] atributos = Atributos.values();
		for(Atributos x: atributos) {
			//System.out.println(x.get().getNome() + ": " + x.get().getNivelDado());
			x.get().setNivelDado((int) roundToNextEven((Math.random() * 8)) + 4);
			//System.out.println(x.get().getNome() + ": " + x.get().getNivelDado());	
		}
		return atributos;
	}
	
	public static Forca getRandomForca() {
		int random = (int) roundToNextEven((Math.random() * 8)) + 4;
		return new Forca(random);
	}
	
	public static Vigor getRandomVigor() {
		int random = (int) roundToNextEven((Math.random() * 8)) + 4;
		return new Vigor(random);
	}
	
	public static Agilidade getRandomAgilidade() {
		int random = (int) roundToNextEven((Math.random() * 8)) + 4;
		return new Agilidade(random);
	}
	
	public static Astucia getRandomAstucia() {
		int random = (int) roundToNextEven((Math.random() * 8)) + 4;
		return new Astucia(random);
	}
	
	public static Espirito getRandomEspirito() {
		int random = (int) roundToNextEven((Math.random() * 8)) + 4;
		return new Espirito(random);
	}
	
	private static int roundToNextEven(double d) {
	    int hlp = (int)Math.ceil(d);
	    if (hlp%2 == 0)
	        return hlp;
	    return hlp-1;
	}
}
