package pericia.interfacezero;

import pericia.savageworlds.Conhecimento;

public class ConhecimentoProgramacao extends Conhecimento {
	private static final String especializacao = "Programação";
	private static final String nome = "Conhecimento (Programação)";
	private static final String desc = "Personagens usam esta " + 
			"perícia quando tentam fazer qualquer tipo de alteração em " + 
			"uma rede que eles invadiram. Essa perícia permite a um " + 
			"personagem desfazer um dano resultante de um hack. Com " + 
			"ela, um personagem pode fazer coisas como desfazer e " + 
			"editar um arquivo de dados ou vídeo, restaurar um arquivo " + 
			"deletado, reparar um SAM, " + 
			"recuperar um Engrama de perícia deletado ou reconectar " + 
			"um TAP que ficou offline.";
	
	public ConhecimentoProgramacao() {
		super(especializacao);
	}
}
