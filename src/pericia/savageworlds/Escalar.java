package pericia.savageworlds;

import atributo.Forca;
import core.Pericia;

public class Escalar extends Pericia {
	public static final String nome = "Escalar";
	public static final String desc = "Personagens às vezes podem ter de escalar " + 
			"objetos altos sob pressão, talvez escalar uma ravina " + 
			"para atacar arqueiros posicionados acima ou para " + 
			"escapar de uma criatura terrível no terreno abaixo. " + 
			"Normalmente nenhuma rolagem é necessária " + 
			"para subir ladeiras, cordas ou árvores com muitos " + 
			"galhos a menos que o Mestre veja uma boa razão " + 
			"para tal (sendo perseguido, ferido, etc.). Em " + 
			"situações mais estressantes, um personagem faz " + 
			"uma rolagem de Escalar e verifica o resultado " + 
			"a seguir. Lembre-se que estes parâmetros estão " + 
			"listados em quadros na mesa, com cada quadro " + 
			"representando dois metros no mundo real. " + 
			"• Falha: O personagem não faz nenhum " + 
			"progresso. Se a rolagem de Escalar tiver um " + 
			"total de 1 ou menos, ele cai para o próximo " + 
			"nível abaixo – qualquer que seja. " + 
			"Se o herói estava " + 
			"preso por uma corda ou outro freio, ele cai " + 
			"metade do comprimento do freio e sofre " + 
			"um nível de Fadiga ao invés disso. " + 
			"• Sucesso: O herói sobe um número de " + 
			"quadros verticais na mesa iguais à metade " + 
			"da sua Força. Um personagem com Força" + 
			"d6, por exemplo, consegue escalar 3 " + 
			"quadros em uma rodada se conseguir sua " + 
			"rolagem de Escalar. " + 
			"• Ampliação: Como um Sucesso, descrito " + 
			"acima, mas o personagem se move com " + 
			"um adicional de 2 quadros. " + 
			"• Cordas: Aqueles presos por uma corda " + 
			"sofrem apenas um nível de Fadiga por " + 
			"Machucados e Escoriações. É claro que o Mestre pode decidir " + 
			"que a corda tenha uma chance de se partir " + 
			"sob uma tensão súbita. Na realidade isso " + 
			"é raro, mas para efeito dramático, jogue " + 
			"um d6. Em um 1, a corda se parte e o" +
			"personagem cai toda a extensão da última " + 
			"seção escalada. " + 
			"• Escaladas Planejadas: Divida subidas " + 
			"longas em três seções aproximadamente " + 
			"iguais. Falhar em uma rolagem de Escalar " + 
			"depois de uma divisão normalmente " + 
			"significa que o herói cai essa distância no " + 
			"caso de uma escalada livre.";
	
	public Escalar() {
		super(new Forca());
	}
	
	public Escalar(int nivelDado) {
		super(new Forca(), nivelDado);
	}
}
