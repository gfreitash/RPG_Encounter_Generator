package raca.interfacezero;

import core.Raca;

public class Androide extends Raca {
	private static final String nome = "Andróide";
	private static final String desc =  "Todos os andróides, independente de suas funções, compartilham "
			+ "algumas características de design fundamentais. Andróides podem comprar cibernéticos como "
			+ "todo mundo e sofrem de Tensão."
			+ "\nConstruto: Andróides acrescentam +2 para se recuperar de "
			+ "Abalado, não sofrem modificadores de ferimentos e são imunes a venenos e doenças. Andróides "
			+ "não podem se curar naturalmente. Curar um andróide requer a perícia Consertar — que é usada "
			+ "como a perícia Curar, sem a “Hora de Ouro”."
			+ "\n• Processador Duplo: Andróides começam com um d6 em Astúcia."
			+ "\n• Vulnerabilidade a PEM: Andróides sofrem dando completo de Armas PEM."
			+ "\n• Cérebro Metálico : Andróides não podem escolher Antecedente Arcano (Psiônicos)."
			+ "\n• Liga Metálica: A pele completamente metálica de um andróide oferece resistência a armas de fogo leves. "
			+ "Eles têm +2 de Armadura."
			+ "\n• Forasteiro: Raças orgânicas geralmente desconfiam ou não entendem bem andróides. Eles subtraem 2 de "
			+ "seu Carisma quando lidam com outras raças que não a sua própria."
			+ "\n• Protocolo Primário: Andróides começam com um d6 gratuito em uma perícia, representando"
			+ " o seu sistema operacional central."
			+ "\n• Recarga: Andróides necessitam de eletricidade para funcionar. Se o andróide não puder acessar uma "
			+ "saída elétrica de algum tipo ao menos uma vez por dia, ele sofre um nível de Fadiga a cada dia até que "
			+ "fique incapacitado. No dia após desse, ele fica “desligado” e tem que ser reativado com um teste de "
			+ "Consertar e uma carga de quatro horas. Isso substitui a necessidade do andróide por água e comida."
			+ "\n• Antinatural: Psiônicos, tanto benéficos quanto maléficos, sofre uma penalidade de -2 para afetar andróides. "
			+ "Isso não tem efeito em poderes que causam dano, que os afetam normalmente.";
	
	public Androide() {
		super(nome, desc);
	}
	
	protected void setModificadores() {
		
	}
}
