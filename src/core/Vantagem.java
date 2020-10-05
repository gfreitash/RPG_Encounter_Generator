package core;

import requisito.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Vantagem implements Checavel{
	RICO("Rico", "Personagens Ricos triplicam seus fundos iniciais e ganham "
			+ "um bônus de 12,500 créditos em cada Progresso. Contudo, o dinheiro sempre vêm "
			+ "com uma obrigação. Eles podem ganhar dinheiro de um patrocínio corporativo, "
			+ "um fundo trust ou mesmo um negócio que o personagem tem e administra. "
			+ "Exemplos de personagens ricos no gênero são Sylvia Stingray de Bubblegum "
			+ "Crisis e logan Cale de Dark Angel; ambos tinham obrigações (administrando "
			+ "um negócio, ser legal com a família) que eles cumprem a fim de manter "
			+ "seu dinheiro. Esta é uma Complicação Voto (Menor) que você deve "
			+ "discutir com o seu Mestre — falhar em cumprir o Voto "
			+ "significa que o personagem não recebe seus créditos extras até "
			+ "que ele cuide dessas obrigações. Se o personagem perder completamente"
			+ " os benefícios da Vantagem, ele pode, a critério do Mestre, substituir"
			+ " a Vantagem com outra coisa.",Jogo.INTERFACE_ZERO, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)), new RequisitoComplicacao(Complicacao.VOTO)),

	AMBIDESTRO("Ambidestro", "Seu herói é hábil tanto com a sua mão " +
			"esquerda quanto com a sua direita. Personagens " +
			"normalmente sofrem uma penalidade de -2 ao " +
			"executar tarefas físicas utilizando a mão inábil " +
			"(presume-se que personagens sejam destros). Com " +
			"esta Vantagem, seu herói ignora a penalidade de -2 " +
			"por usar sua mão inábil", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))
			),

	ANTECEDENTE_ARCANO("Antecedente Arcano", "Esta é a Vantagem que o seu personagem precisa " +
			"comprar para ter qualquer tipo de habilidade " +
			"mágica, psíquica ou sobrenatural.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	ATRAENTE("Atraente", "Não é segredo que pessoas bonitas têm mais " +
			"facilidade em seguir o seu caminho na vida. " +
			"Esta Vantagem concede +2 no Carisma do seu " +
			"personagem belo ou atraente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.VIGOR, 6)),

	CORAJOSO("Corajoso", "Aqueles com esta Vantagem aprenderam " +
			"a dominar o seu medo. Ou talvez estejam tão " +
			"calejados ou emocionalmente distantes que " +
			"perderam sua reação normal de “lutar ou correr”. " +
			"De qualquer maneira, seu herói adiciona +2 a " +
			"testes de Medo. Caso o personagem esteja em " +
			"um cenário que usa Coragem como uma Regra " +
			"de Ambientação, o bônus é adicionado à perícia " +
			"também.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.ESPIRITO, 6)),

	CURA_RAPIDA("Cura Rápida", "Alguns indivíduos parecem se curar mais " +
			"rapidamente que os outros. Aqueles com esta " +
			"benção adicionam +2 a suas rolagens de Vigor " +
			"em seus testes para cura natural. Veja a página " +
			"101 para regras completas de Cura.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.VIGOR, 8)),

	FURIOSO("Furioso", "Logo após sofrer um ferimento (incluindo um " +
			"resultado de Abalado por dano físico), seu herói " +
			"precisa fazer uma rolagem de Astúcia ou entrará " +
			"em fúria. " +
			"Enquanto em fúria, seu Aparar é reduzido " +
			"em 2, mas adiciona +2 em todas as rolagens de " +
			"Lutar, Força, dano de combate corpo a corpo " +
			"e Resistência. O guerreiro ignora todos os " +
			"modificadores de ferimento enquanto em fúria, " +
			"mas não pode usar quaisquer perícias, Vantagens " +
			"ou manobras que exijam concentração, incluindo " +
			"Atirar e Provocar, exceto Intimidar. " +
			"Furiosos atacam de forma imprudente. " +
			"Sempre que seu dado de Lutar for um 1 " +
			"(independente do seu Dado Selvagem), ele " +
			"atinge um alvo adjacente aleatório (não o alvo " +
			"original). O ataque pode atingir tanto um amigo " +
			"quanto um inimigo. Se não houver outros alvos " +
			"adjacentes, o golpe simplesmente erra. " +
			"O personagem pode encerrar sua fúria não " +
			"fazendo nada (nem mesmo se mover) por uma " +
			"ação completa e efetuando uma rolagem de " +
			"Astúcia com -2.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	LIGEIRO("Ligeiro", "A Movimentação do herói é aumentada em " +
			"+2 e ele rola um d10 ao invés de um d6 para " +
			"correr.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.AGILIDADE, 6)),

	LINGUISTA("Linguista", "O personagem possui um ouvido para idiomas " +
			"e um talento raro para reconhecer similaridades " +
			"entre eles. Um personagem com esta Vantagem " +
			"começa com um número de idiomas igual a " +
			"seu dado de Astúcia e pode fazer uma rolagem " +
			"33 " +
			"de Astúcia com -2 para se fazer entender em " +
			"qualquer idioma ou dialeto que tenha ouvido ser " +
			"falado por pelo menos uma semana.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.ASTUCIA, 6)),

	MUITO_ATRAENTE("Muito Atraente", "Seu herói é lindo de morrer. O seu Carisma é " +
			"aumentado em +4.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoVantagem(Vantagem.ATRAENTE)),

	MUSCULOSO("Musculoso", "O seu lutador é muito grande ou talvez apenas " +
			"esteja em boa forma. Sua massa resiste a dano " +
			"melhor que a da maioria e adiciona +1 a sua " +
			"Resistência. Além disso, o personagem pode " +
			"carregar mais do que o proporcional a sua Força: " +
			"quatro vezes a sua Força em quilos sem penalidade " +
			"ao invés do normal de 2,5 vezes a sua Força.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.FORCA, 6),
			new RequisitoAtributo(Atributo.VIGOR, 6)),

	NOBRE("Nobre", "Aqueles nascidos de sangue nobre têm " +
			"muitos privilégios na vida, mas frequentemente " +
			"possuem também muitas responsabilidades. " +
			"Nobres possuem posição elevada em suas " +
			"sociedades, têm direto a tratamento especial " +
			"de seus inimigos, recebem +2 de Carisma e " +
			"também possuem a Vantagem Rico. Isso dá ao " +
			"herói diversas Vantagens pelo preço de uma, mas " +
			"as responsabilidades mais do que compensam " +
			"os privilégios adicionais. Nobres normalmente " +
			"possuem tropas sob o seu comando, bem como " +
			"uma terra, uma casa de sua família e outras " +
			"posses. Tudo isso deve ser determinado pelo " +
			"Mestre e equilibrado pelos sérios encargos " +
			"enfrentados pelo personagem. " +
			"Como exemplo, um personagem em " +
			"uma campanha de fantasia poderia ter uma " +
			"companhia de espadachins, um pequeno forte e " +
			"mesmo uma espada mágica herdada de seu pai. " +
			"Entretanto, também teria uma região inteira " +
			"para administrar, criminosos para julgar, justiça " +
			"para aplicar e um vizinho invejoso cobiçando a " +
			"sua terra e constantemente conspirando contra " +
			"ele na corte.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	PRONTIDAO("Prontidao", "Pouca coisa passa pelo seu herói. Ele é muito " +
			"observador e perceptivo, e adiciona +2 a suas " +
			"rolagens de Perceber para ouvir, ver ou sentir o " +
			"mundo a seu redor de qualquer outra maneira.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	RAPIDO("Rápido", "Personagens rápidos possuem reflexos velozes " +
			"como um raio e uma cabeça fria. Sempre que " +
			"você sacar um 5 ou menos em combate, você " +
			"pode descartar e sacar de novo até pegar uma " +
			"carta superior a 5. " +
			"Personagens com ambas as Vantagens " +
			"Equilibrado e Rápido sacam suas cartas adicionais " +
			"e pegam a melhor. Se esta carta for um Cinco ou " +
			"menor, a Vantagem Rápido pode ser usada para " +
			"sacar uma substituta até sair um Seis ou maior.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	RESISTENCIA_ARCANA("Resistência Arcana", "Este indivíduo é particularmente resistente " +
			"a magia (inclusive psiquismo, ciência estranha, " +
			"etc.), seja por natureza ou herdado. Ele age como  " +
			"se tivesse 2 pontos de Armadura quando for " +
			"atingido por poderes arcanos causadores de dano e " +
			"adiciona +2 a suas rolagens de Características para " +
			"resistir a poderes opostos. Mesmo poderes arcanos " +
			"amigáveis precisam subtrair esse modificador para " +
			"afetar o herói resistente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.ESPIRITO, 8)),

	RESISTENCIA_ARCANA_APRIMORADA("Resistência Arcana Aprimorada", "Este indivíduo é particularmente resistente " +
			"a magia (inclusive psiquismo, ciência estranha, " +
			"etc.), seja por natureza ou herdado. Ele age como " +
			"se tivesse 4 pontos de Armadura quando for " +
			"atingido por poderes arcanos causadores de dano e " +
			"adiciona +4 a suas rolagens de Características para " +
			"resistir a poderes opostos. Mesmo poderes arcanos " +
			"amigáveis precisam subtrair esse modificador para " +
			"afetar o herói resistente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoVantagem(RESISTENCIA_ARCANA));

	private final Identidade id;
	private final TipoVantagem tipo;
	private final List<Requisito> requisitos;
	private String especializacao;

	
	Vantagem(String nome, String descricao, Jogo jogo, TipoVantagem tipo,
			 Requisito ... requisitos) {

		id = new Identidade(nome, descricao);
		this.tipo = tipo;
		this.requisitos = new ArrayList<>();
		Collections.addAll(this.requisitos, requisitos);
	}

	public Identidade getId() {
		return id;
	}

	public TipoVantagem getTipo() {
		return tipo;
	}

	public List<Requisito> getRequisitos() {
		return requisitos;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public static Vantagem getAleatoria() {
		int random = (int) (Math.random() * Vantagem.values().length);

		return Vantagem.values()[random];
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String toString() {
		return id.toString();
	}

	@Override
	public boolean check(NPC npc) {
		return npc.getVantagens().contains(this);
	}
}
