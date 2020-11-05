package core;

import requisito.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Vantagem implements Requisitavel, Identificavel{
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
			new Requisito(Progresso.NOVATO, Complicacao.VOTO));

	/*AMBIDESTRO("Ambidestro", "Seu herói é hábil tanto com a sua mão " +
			"esquerda quanto com a sua direita. Personagens " +
			"normalmente sofrem uma penalidade de -2 ao " +
			"executar tarefas físicas utilizando a mão inábil " +
			"(presume-se que personagens sejam destros). Com " +
			"esta Vantagem, seu herói ignora a penalidade de -2 " +
			"por usar sua mão inábil", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new Requisito(Progresso.NOVATO)
	),

	ANTECEDENTE_ARCANO("Antecedente Arcano", "Esta é a Vantagem que o seu personagem precisa " +
			"comprar para ter qualquer tipo de habilidade " +
			"mágica, psíquica ou sobrenatural.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new Requisito(Progresso.NOVATO),

	ATRAENTE("Atraente", "Não é segredo que pessoas bonitas têm mais " +
			"facilidade em seguir o seu caminho na vida. " +
			"Esta Vantagem concede +2 no Carisma do seu " +
			"personagem belo ou atraente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new Requisito(Progresso.NOVATO, Atributo.VIGOR.setNivelDado(6))),

	CORAJOSO("Corajoso", "Aqueles com esta Vantagem aprenderam " +
			"a dominar o seu medo. Ou talvez estejam tão " +
			"calejados ou emocionalmente distantes que " +
			"perderam sua reação normal de “lutar ou correr”. " +
			"De qualquer maneira, seu herói adiciona +2 a " +
			"testes de Medo. Caso o personagem esteja em " +
			"um cenário que usa Coragem como uma Regra " +
			"de Ambientação, o bônus é adicionado à perícia " +
			"também.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new Requisito(new Progresso(Estagio.NOVATO), Atributo.ESPIRITO.setNivelDado(6))),

	CURA_RAPIDA("Cura Rápida", "Alguns indivíduos parecem se curar mais " +
			"rapidamente que os outros. Aqueles com esta " +
			"benção adicionam +2 a suas rolagens de Vigor " +
			"em seus testes para cura natural. Veja a página " +
			"101 para regras completas de Cura.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new Requisito(new Progresso(Estagio.NOVATO), Atributo.VIGOR.setNivelDado(8))),

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
			new Requisito(new Progresso(Estagio.NOVATO))),

	LIGEIRO("Ligeiro", "A Movimentação do herói é aumentada em " +
			"+2 e ele rola um d10 ao invés de um d6 para " +
			"correr.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new Requisito(new Progresso(Estagio.NOVATO), Atributo.AGILIDADE.setNivelDado(6))),

	LINGUISTA("Linguista", "O personagem possui um ouvido para idiomas " +
			"e um talento raro para reconhecer similaridades " +
			"entre eles. Um personagem com esta Vantagem " +
			"começa com um número de idiomas igual a " +
			"seu dado de Astúcia e pode fazer uma rolagem " +
			"33 " +
			"de Astúcia com -2 para se fazer entender em " +
			"qualquer idioma ou dialeto que tenha ouvido ser " +
			"falado por pelo menos uma semana.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)),
			new RequisitoAtributo(Atributo.ASTUCIA, 6)),

	MUITO_ATRAENTE("Muito Atraente", "Seu herói é lindo de morrer. O seu Carisma é " +
			"aumentado em +4.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)),
			new RequisitoVantagem(Vantagem.ATRAENTE)),

	MUSCULOSO("Musculoso", "O seu lutador é muito grande ou talvez apenas " +
			"esteja em boa forma. Sua massa resiste a dano " +
			"melhor que a da maioria e adiciona +1 a sua " +
			"Resistência. Além disso, o personagem pode " +
			"carregar mais do que o proporcional a sua Força: " +
			"quatro vezes a sua Força em quilos sem penalidade " +
			"ao invés do normal de 2,5 vezes a sua Força.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)),
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
			new RequisitoProgresso(new Progresso(Estagio.NOVATO))),

	PRONTIDAO("Prontidao", "Pouca coisa passa pelo seu herói. Ele é muito " +
			"observador e perceptivo, e adiciona +2 a suas " +
			"rolagens de Perceber para ouvir, ver ou sentir o " +
			"mundo a seu redor de qualquer outra maneira.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO))),

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
			new RequisitoProgresso(new Progresso(Estagio.NOVATO))),

	RESISTENCIA_ARCANA("Resistência Arcana", "Este indivíduo é particularmente resistente " +
			"a magia (inclusive psiquismo, ciência estranha, " +
			"etc.), seja por natureza ou herdado. Ele age como  " +
			"se tivesse 2 pontos de Armadura quando for " +
			"atingido por poderes arcanos causadores de dano e " +
			"adiciona +2 a suas rolagens de Características para " +
			"resistir a poderes opostos. Mesmo poderes arcanos " +
			"amigáveis precisam subtrair esse modificador para " +
			"afetar o herói resistente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)),
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
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)),
			new RequisitoVantagem(RESISTENCIA_ARCANA)),

	PODRE_RICO("Podre de Rico", "Este personagem é muito rico. Ele possui " +
			"cinco vezes os recursos iniciais para o cenário " +
			"e, se apropriado, uma renda anual de cerca de " +
			"$500.000. " +
			"Personagens abastados também devem ter " +
			"um histórico muito completo. Isso precisa ser " +
			"trabalhado com o Mestre inclui muitos outro " +
			"recursos, assim como responsabilidades pesadas.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)), new RequisitoDisjuntivo(
					new RequisitoVantagem(Vantagem.NOBRE), new RequisitoVantagem(Vantagem.RICO))),

	SORTE("Sorte", "O aventureiro parece ser abençoado pelo " +
			"destino, carma, os deuses ou qualquer força externa " +
			"na qual ele acredite (ou que acredite nele!). Ele " +
			"saca um Bene adicional no início de cada sessão " +
			"de jogo, permitindo-o ser bem-sucedido em tarefas " +
			"importantes mais frequentemente que a maioria e " +
			"sobreviver a perigos incríveis.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO))),

	SORTE_GRANDE("Sorte Grande", "Como a vantagem Sorte, mas o jogador saca dois Benes " +
			"adicionais no início de cada sessão. ", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)), new RequisitoVantagem(Vantagem.SORTE)),

	ARMA_PREDILETA("Arma Predileta", "O herói conhece uma única arma (Excalibur, " +
			"Velha Betsy, Ferroada) como a palma de sua mão. " +
			"Se esta arma for utilizada, ele adiciona +1 a suas " +
			"rolagens de Arremessar, Atirar ou Lutar. Um herói " +
			"pode pegar esta Vantagem varias vezes, aplicando-a " +
			"cada vez a uma arma diferente. Se uma Arma " +
			"Predileta for perdida, o herói pode substituí-la, " +
			"mas os benefícios da Vantagem não voltam por " +
			"duas semanas de jogo.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_COMBATE, true,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)), new RequisitoDisjuntivo(
					new RequisitoPericia(Pericia.ATIRAR.setNivelDado(10)),
					new RequisitoPericia(Pericia.LUTAR.setNivelDado(10))
			)),

	ARMA_PREDILETA_APRIMORADA("Arma Predileta Aprimorada", "Como a vantagem Arma Predileta, mas o bônus ao usar a arma " +
			"aumenta para +2.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_COMBATE, true,
			new RequisitoProgresso(new Progresso(Estagio.VETERANO)), new RequisitoVantagem(Vantagem.ARMA_PREDILETA)),

	ARTISTA_MARCIAL("Artista Marcial", "Este personagem é altamente treinado em " +
			"combate corpo a corpo. Ele nunca é considerado " +
			"desarmado em combate e nunca está sujeito a " +
			"regra de Defensor Desarmado (página 94). Com " +
			"um ataque desarmado bem-sucedido, ele adiciona " +
			"+d4 a sua rolagem de Força (como se usasse uma " +
			"arma pequena).", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_COMBATE,
			new RequisitoProgresso(new Progresso(Estagio.NOVATO)), new RequisitoPericia(Pericia.LUTAR.setNivelDado(6))),

	ARTISTA_MARCIAL_APRIMORADO("Artista Marcial Aprimorado", "Assim como a vantagem Artista Marcial." +
			"O personagem agora adiciona +d6 a seu dano desarmado.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_COMBATE,
			new RequisitoProgresso(new Progresso(Estagio.VETERANO)), new RequisitoVantagem(Vantagem.ARTISTA_MARCIAL),
			new Req)*/

;
	private final Identidade id;
	private final TipoVantagem tipo;
	private final boolean repetivel;
	private final List<Requisito> requisitos;
	private String especializacao;

	
	Vantagem(String nome, String descricao, Jogo jogo, TipoVantagem tipo,
			 Requisito ... requisitos) {

		id = new Identidade(nome, descricao);
		this.tipo = tipo;
		this.requisitos = new ArrayList<>();
		Collections.addAll(this.requisitos, requisitos);
		repetivel = false;
	}

	Vantagem(String nome, String descricao, Jogo jogo, TipoVantagem tipo, boolean repetivel,
			 Requisito ... requisitos) {

		id = new Identidade(nome, descricao);
		this.tipo = tipo;
		this.requisitos = new ArrayList<>();
		Collections.addAll(this.requisitos, requisitos);
		this.repetivel = repetivel;
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

	public boolean isRepetivel() {
		return repetivel;
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
