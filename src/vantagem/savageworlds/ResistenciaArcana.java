package vantagem.savageworlds;

import core.Atributo;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class ResistenciaArcana extends VantagemAntecedente {
	public static final String nome = "Resistência Arcana";
	public static final String desc = "Este indivíduo é particularmente resistente " + 
			"a magia (inclusive psiquismo, ciência estranha, " + 
			"etc.), seja por natureza ou herdado. Ele age como  " + 
			"se tivesse 2 pontos de Armadura quando for " + 
			"atingido por poderes arcanos causadores de dano e " + 
			"adiciona +2 a suas rolagens de Características para " + 
			"resistir a poderes opostos. Mesmo poderes arcanos " + 
			"amigáveis precisam subtrair esse modificador para " + 
			"afetar o herói resistente.";
	
	public ResistenciaArcana() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(Atributo.ESPIRITO, 8));
	}
}
