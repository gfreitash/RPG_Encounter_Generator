package complicacao.interfacezero;

import core.Complicacao;

public class Segredo extends Complicacao {
	public static final String nome = "Segredo";
	public static final String desc = "Seu personagem tem um segredo que, se descoberto, " + 
			"irá complicar a sua vida severamente. Pode ser que ele " + 
			"já tenha trabalhado para uma das grandes megacorporações " + 
			"e ajudado a desenvolver uma arma biológica que " + 
			"atualmente aflige grandes parcelas da população. Talvez " + 
			"seu personagem seja um policial disfarçado que está atualmente " + 
			"infiltrado em uma gangue. Talvez ele usou seu " + 
			"próprio simulacro e fez todo tipo de coisas ruins com ele. " + 
			"Ou talvez ele seja um bioróide tentando desesperadamente " + 
			"fingir que é humano. Em todos os casos, a revelação do " + 
			"segredo causará grandes problemas para o seu personagem. " + 
			"A versão Menor desta Complicação simplesmente " + 
			"significa que a revelação do segredo será um grande embaraço, " + 
			"e possivelmente tornará o personagem procurado; " + 
			"ou perderá contatos, amigos e associados devido a sua " + 
			"natureza. A versão Maior desta Complicação significa que " + 
			"a vida do personagem será posta em perigo direto a partir " + 
			"da revelação desse segredo. Se o caldo for permanentemente " + 
			"entornado e não há esperança de acobertar isso, o " + 
			"Mestre pode substituir esta Complicação por uma outra de " + 
			"igual medida: ex. Forasteiro para a versão Menor ou Inimigo " + 
			"(Maior) para a versão Maior.";
	
	public Segredo(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
