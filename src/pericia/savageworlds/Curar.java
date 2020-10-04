package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Curar extends Pericia {
	public static final String nome = "Curar";
	public static final String desc = "Curar é a arte de estancar ferimentos e tratar " + 
			"lesões existentes. Em geral, cada sucesso e " + 
			"ampliação em uma rolagem de Curar eliminam " + 
			"um ferimento. O curandeiro precisa subtrair não " + 
			"apenas seus próprios ferimentos da rolagem, mas " + 
			"também os do seu paciente.";
	
	public Curar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Curar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
