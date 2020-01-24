package status;

import core.Status;

public class Abalado extends Status {
	private static final String nome = "Abalado";
	private static final String desc = "Se o dano de um ataque for um simples sucesso " + 
			"(de 0 a 3 pontos acima da Resistência), o personagem " + 
			"é Abalado. Personagens Abalados estão " + 
			"perturbados, distraídos ou momentaneamente em " + 
			"choque. Eles não estão atordoados, mas temporariamente " + 
			"suprimidos e podem hesitar. " + 
			"Na sua ação, um personagem Abalado precisa " + 
			"tentar sair deste estado fazendo uma rolagem de " + 
			"Espírito: " + 
			"\n• Falha: O personagem permanece Abalado. " + 
			"Ele pode realizar apenas ações livres" + 
			"\n• Sucesso: O personagem não está mais " + 
			"Abalado e pode agir normalmente.";
	
	public Abalado() {
		super(nome, desc);
	}
	
	public Abalado(int modificador) {
		super(nome, desc, modificador);
	}
}
