package raca.interfacezero;

import core.NPC;
import core.Raca;

public class Bioroide extends Raca {
	public static final String NOME = "Bioróide";
	public static final String DESCRICAO = """
			Bioróides sangram, tem que comer e beber, ficam cansados quando não dormem, e funcionam de maneira muito semelhante aos humanos. E isso deixa muita gente nervosa.Bioróides são humanos criados em tanques e que tem um sistema de computador instalado em seus crânios. Geralmente usados como dubs, eles ganharam alguma fama nnegativa nos últimos anos. Após uma série de assassinatos ligados a bioróides em dubbings defeituosos, bioróides com aparência humana tornaram-se ilegais na maioria dos países. Contudo, bioróides marcados com um código de barras matriz enxertado em algum lugar da sua pele (o ombro ou a nuca são posições padrão) ainda são permitidos em muitos países (mais notavelmente o Japão, que prefere bioróides a simulacros por causa da sua longevidade).\s
			• Vulnerabilidade a PEM: Bioróides sofrem dano completo de Armas PEM.
			• Processador Duplo: Bioróides começam com um d6 em Astúcia.
			• Marcado ou Segredo: Na criação de personagem, o jogador precisa decidir se seu bioróide é ou não marcado. Se ele for marcado, ele ganha a Complicação Forasteiro, sofrendo uma penalidade de -2 no Carisma com pessoas que veem bioróides com suspeita ou como “apenas uma máquina”. Bioróides não marcados tem a Complicação Segredo (Maior). Bioróides não marcados são ilegais e podem ser presos ou executados, se descobertos.
			• Protocolo Primário: Bioróides começam com um d6 de graça em uma perícia, representando o seu sistema operacional central.
			• Antinatural: Psiônicos, tanto benéficos quanto maléficos, sofre uma penalidade de -2 para afetar bioróides. Isso não tem efeito em poderes que causam dano, que os afetam normalmente.""";

	public Bioroide() {
		super(NOME, DESCRICAO);
	}


	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
