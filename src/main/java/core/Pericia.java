package core;


import java.util.List;

public enum Pericia implements Checavel, Identificavel, PossuiDado {
	CONHECIMENTO_DEMOLICAO("Conhecimento (Demolição)", "Uso bem sucedido de " +
			"demolições pode significar a diferença entre destruição " +
			"do alvo como planejado e perda indesejada de vidas e " +
			"propriedade. A perícia também permite que o personagem " +
			"tenha um entendimento de qual é o melhor tipo " +
			"de explosivo e quanto será preciso para remover o obstáculo. " +
			"Além disso, uma ampliação no resultado permitirá " +
			"saber a distância exata que é preciso estar da explosão, " +
			"baseada no tamanho da carga, a contenção e o dano criado. " +
			"Esta perícia é usada toda vez que um personagem quiser " +
			"colocar junto uma bolsa de cargas ou acionar explosivos " +
			"Uma falha crítica resultará em detonação imediata. Uma " +
			"falha simples resultará em detonação prematura ou em " +
			"nenhuma detonação.", Atributo.ASTUCIA, Jogo.INTERFACE_ZERO,"Demolição"),

	CONHECIMENTO_PROGAMACAO("Conhecimento (Programação)", "Personagens usam esta " +
			"perícia quando tentam fazer qualquer tipo de alteração em " +
			"uma rede que eles invadiram. Essa perícia permite a um " +
			"personagem desfazer um dano resultante de um hack. Com " +
			"ela, um personagem pode fazer coisas como desfazer e " +
			"editar um arquivo de dados ou vídeo, restaurar um arquivo " +
			"deletado, reparar um SAM, " +
			"recuperar um Engrama de perícia deletado ou reconectar " +
			"um TAP que ficou offline.", Atributo.ASTUCIA, Jogo.INTERFACE_ZERO, "Programação"),

	HACKING("Hacking", "A perícia Hacking e usada sempre que " +
			"um personagem quer invadir uma rede de computadores. " +
			"Personagens em Interface Zero 2.0 não mais começam " +
			"com um d4 automático em Hacking. Além disso, personagens " +
			"que desejem usar a DataNet Global para propósitos " +
			"cotidianos como pesquisa ou encontrar notícias na Deep, " +
			"o fazem com suas perícias de Investigar e Manha", Atributo.ASTUCIA, Jogo.INTERFACE_ZERO),

	ARREMESSAR("Arremessar", "Arremessar governa todos os tipos de armas de " +
			"arremesso, de granadas de mão a facas, machados e " +
			"lanças. Arremessar funciona de maneira similar à " +
			"perícia Atirar e utiliza os mesmos modificadores, " +
			"incluindo aqueles a distância. A Cadência de Tiro " +
			"de um ataque de arremesso é de 1 por mão. Deste " +
			"modo, um personagem humano pode arremessar dois itens de uma só vez, um com cada mão, "
			+ "sofrendo as penalidades habituais de ação múltipla " +
			"e mão inábil.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ARROMBAR("Arrombar", "Arrombar é a habilidade de passar por travas " +
			"mecânicas e eletrônicas. Arrombar também " +
			"é usado para desarmar as iscas e gatilhos de " +
			"armadilhas, a menos que uma perícia mais " +
			"relevante pareça mais apropriada para uma " +
			"armadilha em particular.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ATIRAR("Atirar", "Atirar cobre todas as tentativas de atingir um " +
			"alvo com armas de combate a distância como " +
			"arcos, pistolas ou lança-foguetes. A Dificuldade " +
			"básica para acertar é 4. Contudo, existe um número " +
			"importante de modificadores, como a distância em " +
			"que o alvo se encontra, aparecendo frequentemente " +
			"no jogo.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ATLETISMO("Atletismo", "Atletismo é um apanhado para uma quantidade de façanhas "
			+ "físicas abrangendo desde escalar, nadar até se mover "
			+ "efetivamente em um ambiente sem — ou com baixa gravidade. "
			+ "Atletismo deve ser usado no lugar de Agilidade em "
			+ "perseguições a pé e efetivamente substitui as perícias"
			+ " Escalar e Nadar.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	CAVALGAR("Cavalgar", "Cavalgar permite a um herói montar, controlar e " +
			"conduzir qualquer animal comum em seu cenário. " +
			"Jogadores devem notar que personagens montados " +
			"usam a menor entre suas perícias de Cavalgar ou " +
			"Lutar quando estiverem em combate montado", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	CONHECIMENTO("Conhecimento", "Conhecimento é uma perícia abrangente " +
			"que deve possuir algum tipo de foco, como " +
			"Conhecimento (Ocultismo) ou Conhecimento " +
			"(Ciência). O jogador pode escolher o foco do " +
			"Conhecimento do seu personagem, devendo " +
			"refletir seu histórico e instrução. Um arqueólogo, " +
			"por exemplo, deveria ter Conhecimento (História) " +
			"e Conhecimento (Arqueologia). " +
			"Focos gerais como Ciência são aceitáveis, mas o " +
			"Mestre deve dar um bônus a um personagem cujo " +
			"foco escolhido seja mais relevante a uma tarefa em " +
			"particular, como usar um Conhecimento (Biologia) " +
			"para identificar uma planta ou animal. " +
			"Alguns focos de Conhecimento são: Área, " +
			"Batalha (usado em Combate em Massa, veja a " +
			"página 109), Computadores, Eletrônica, História, " +
			"Jornalismo, vários idiomas, Lei, Medicina (embora " +
			"cuidar de alguém exija a perícia Curar) ou Ciência.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	CONSERTAR("Consertar", "Consertar é a habilidade de reparar engenhocas, " +
			"veículos, armas e outras máquinas. Personagens " +
			"sofrem uma penalidade de -2 nas suas rolagens " +
			"se não tiverem acesso a ferramentas básicas. Uma " +
			"ampliação em uma rolagem de Consertar reduz " +
			"à metade o tempo exigido por uma tarefa em " +
			"particular.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	CURAR("Curar", "Curar é a arte de estancar ferimentos e tratar " +
			"lesões existentes. Em geral, cada sucesso e " +
			"ampliação em uma rolagem de Curar eliminam " +
			"um ferimento. O curandeiro precisa subtrair não " +
			"apenas seus próprios ferimentos da rolagem, mas " +
			"também os do seu paciente.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	DIRIGIR("Dirigie", "Dirigir permite que seu herói conduza veículos " +
			"e flutuadores terrestres comuns em seu cenário. " +
			"Dirigir também " +
			"é frequentemente usado com as Regras de " +
			"Perseguição", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ESCALAR("Escalar", "Personagens às vezes podem ter de escalar " +
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
			"caso de uma escalada livre.", Atributo.FORCA, Jogo.SAVAGE_WORLDS),

	FURTIVIDADE("Furtividade", "Furtividade é tanto a habilidade de permanecer " +
			"escondido e mover-se em silêncio como também " +
			"de furtar objetos e bater carteiras. Em muitos " +
			"jogos de Savage Worlds, saber exatamente quando " +
			"seu personagem foi visto e quando não foi pode " +
			"ser decisivo. " +
			"Para um personagem se aproximar sorrateiramente " +
			"de inimigos e se infiltrar nas linhas inimigas, " +
			"comece definindo se os “guardas” dos quais " +
			"seus heróis estão se escondendo são “ativos” ou " +
			"“inativos”. Guardas Inativos não estão particularmente " +
			"prestando atenção ao seu redor. O grupo " +
			"só precisa conseguir um sucesso padrão em suas " +
			"rolagens individuais de Furtividade para evitar " +
			"ser visto. Falhar numa rolagem de Furtividade na " +
			"presença de guardas inativos torna-os ativos. " +
			"Guardas Ativos fazem rolagens resistidas " +
			"de Perceber contra a perícia Furtividade dos " +
			"personagens se esgueirando. Falhar numa " +
			"rolagem contra guardas ativos faz com que os " +
			"personagens sejam vistos.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	INTIMIDAR("Intimidar", "Intimidar é a arte de aterrorizar um oponente " +
			"com pura força de vontade, ameaças veladas " +
			"ou evidentes ou, às vezes, apenas com armas " +
			"realmente grandes. Essa é uma rolagem resistida " +
			"entre a Intimidar do herói e o Espírito de seu " +
			"oponente.", Atributo.ESPIRITO, Jogo.SAVAGE_WORLDS),

	INVESTIGAR("Investigar", "Um personagem treinado em Investigar sabe " +
			"como fazer bom uso de bibliotecas, manchetes de " +
			"jornais, internet ou outros recursos escritos de " +
			"informação. Para obter informações de pessoas " +
			"ao invés de livros e computadores, use a perícia " +
			"Manha.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	JOGAR("Jogar", "Jogar é útil dos salões do Velho Oeste aos " +
			"alojamentos da maioria dos exércitos. Aqui está " +
			"uma maneira rápida de simular cerca de meia hora " +
			"de jogatina sem ter de rolar para cada lance dos " +
			"dados ou mão de cartas. " +
			"Primeiro todos devem concordar com as apostas, " +
			"como $10, 10 peças de ouro, etc. Agora todos no " +
			"jogo têm de fazer uma rolagem de Jogar. O menor " +
			"resultado paga ao maior resultado a diferença " +
			"vezes a aposta. O segundo menor resultado paga ao " +
			"segundo maior resultado a diferença vezes a aposta " +
			"e assim por diante. Se sobrar alguém sozinho no " +
			"meio, ele fica na média. " +
			"Exemplo: Kali rola mais alto com um 10 e Yuri " +
			"rola mais baixo com um 4. A diferença é 6, assim " +
			"Yuri paga a Kali 6x a aposta de $10 ou $60. " +
			"• Trapaceando: Um personagem " +
			"trapaceando adiciona +2 a sua rolagem. " +
			"O Mestre pode aumentar ou diminuir " +
			"este modificador dependendo do jogo ou " +
			"dos métodos específicos de trapaça. Se o " +
			"personagem alguma vez rolar um 1 em seu " +
			"dado de perícia (independente do seu Dado " +
			"Selvagem), é apanhado. As consequências " +
			"variam dependendo do cenário, mas " +
			"normalmente são bastante severas.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	LUTAR("Lutar", "Lutar cobre todos os ataques corpo a corpo, " +
			"sejam eles com os punhos, machados, espadas laser " +
			"ou artes marciais. A Dificuldade para atingir um " +
			"oponente é o seu Aparar (2 mais a metade do seu " +
			"Lutar).", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	MANHA("Manha", "Personagens com Manha são capazes de obter " +
			"informações das ruas, salões ou outros contatos " +
			"através de subornos, ameaças ou barganhas. " +
			"Encontrar informação escrita em bibliotecas e " +
			"similares é coberto pela perícia Investigar. Manha " +
			"é sempre modificada pelo Carisma do personagem.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	NADAR("Nadar", "Nadar determina se um personagem flutua ou " +
			"afunda na água, bem como quão rápido ele se move " +
			"dentro dela. A Movimentação de um personagem " +
			"é igual à metade da sua perícia Natação em quadros " +
			"por turno em águas normais (arredondado para " +
			"cima). Águas agitadas contam como terreno " +
			"acidentado reduzindo essa taxa à metade. " +
			"Personagens não podem “correr” enquanto nadam " +
			"para ter movimento extra.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	NAVEGAR("Navegar", "Personagens com esta perícia podem conduzir " +
			"qualquer embarcação ou navio comum em seus " +
			"cenários e histórico de personagem. Geralmente " +
			"também sabem como lidar com as tarefas mais " +
			"comuns associadas a seus barcos (dar nós, " +
			"encordar velas, etc.).", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	PERCEBER("Percerber", "Perceber é a prontidão geral e habilidade de " +
			"um herói para procurar por itens ou pistas. Isso " +
			"cobre rolagens para ouvir, detectar emboscadas, " +
			"enxergar armas escondidas e até mesmo examinar " +
			"outros personagens para ver se estão mentindo, " +
			"assustados e assim por diante. Quanto mais " +
			"ampliações um personagem consegue em uma " +
			"rolagem de Perceber, mais informações o Mestre " +
			"deve revelar.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	PERSUADIR("Persuadir", "Persuadir é a habilidade de convencer outros a " +
			"fazerem o que você deseja. " +
			"Extras iniciam em uma destas cinco atitudes " +
			"diferentes: Hostil, Não Cooperativo, Neutro, " +
			"Amigável ou Prestativo. Uma rolagem bem sucedida " +
			"de Persuadir melhora a atitude do Extra " +
			"em um passo ou dois com uma ampliação. Falhar, " +
			"pelo contrário, piora a atitude do personagem em " +
			"um passo ou dois se um 1 for rolado no dado de " +
			"Persuadir (independente do Dado Selvagem). " +
			"Muitos Extras não vão alterar sua reação mais " +
			"do que um ou dois níveis durante uma única " +
			"mudança, mas isto depende inteiramente do " +
			"Mestre e da situação.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	PILOTAR("Pilotar", "Pilotar permite a um personagem voar com " +
			"aviões, helicópteros, mochilas a jato e qualquer " +
			"outro dispositivo aéreo comum em seu cenário e " +
			"histórico", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	PROVOCAR("Provocar", "Provocar é um Teste de Vontade contra o orgulho " +
			"de uma pessoa através de zombaria, piadas cruéis " +
			"ou humilhação. É uma rolagem resistida contra " +
			"a Astúcia do inimigo.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	RASTREAR("Rastrear", "Rastrear permite que um personagem siga os " +
			"rastros de um ou mais indivíduos em qualquer tipo " +
			"de terreno. Cada rolagem geralmente cobre seguir " +
			"os rastros por cerca de um quilômetro e meio, mas " +
			"o Mestre pode ajustar isso dramaticamente para " +
			"escalas de busca mais específicas ou menores.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	SOBREVIVENCIA("Sobrevivência", "Sobrevivência permite encontrar comida, água " +
			"ou abrigo em ambientes hostis. O personagem pode " +
			"fazer apenas uma rolagem por dia. Uma rolagem " +
			"bem sucedida encontra sustento para uma pessoa, " +
			"com uma ampliação encontra comida e água para " +
			"cinco adultos. Cavalos e outros animais grandes " +
			"contam como dois adultos. Crianças, camelos ou " +
			"outros com pouco apetite contam como “meio” " +
			"adulto. Todos os beneficiados pela rolagem não " +
			"precisam fazer rolagens de Fadiga para comida, " +
			"água ou abrigo por esse dia.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS);

	private final Identidade id;
	private final Atributo tipoAtributo;
	private final Jogo jogo;
	private int nivelPericia;
	private int modNivelPericia;
	private String especializacao = "";

	
	Pericia(String nome, String descricao, Atributo tipoAtributo, Jogo jogo) {
		id = new Identidade(nome, descricao);
		this.tipoAtributo = tipoAtributo;
		this.jogo = jogo;
		nivelPericia = 4;
	}
	Pericia(String nome, String descricao, Atributo tipoAtributo, Jogo jogo, String especializacao) {
		id = new Identidade(nome, descricao);
		this.tipoAtributo = tipoAtributo;
		this.especializacao = especializacao;
		this.jogo = jogo;
		nivelPericia = 4;
	}

	public Identidade getId() {
		return id;
	}

	public Atributo getTipoAtributo() {
		return tipoAtributo;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public int getNivelDado() {
		return nivelPericia;
	}

	public int getModNivelPericia() {
		return modNivelPericia;
	}

	public static Pericia[] getPericiasAleatorias(int quantidade) {
		Pericia[] pericias = new Pericia[quantidade];
		Pericia p;
		boolean jaEscolhida;
		int random;

		for(int i = 0; i < quantidade; i++) {
			jaEscolhida = false;
			p = Pericia.values()[(int) (Math.random() * Pericia.values().length)];

			for(Pericia x: pericias)
				if(x != null)
					if(x.getId().getNome().equals(p.getId().getNome())){
						jaEscolhida = true;
						break;
					}

			if(!jaEscolhida)
				pericias[i] = p;
			else
				i--;
		}

		for(Pericia x: pericias)
			x.setNivelDado(Util.arredondarParaProximoPar(Math.random() * 8) + 4);

		return pericias;
	}

	public static Pericia getAleatoria(Pericia p) {
		p.setNivelDado(Util.arredondarParaProximoPar(Math.random() * 8) + 4);
		return p;
	}

	public void setNivelDado(int nivel) throws IllegalArgumentException {
		if ((nivel % 2) == 0 && nivel >= 4)
			if (nivel <= 12)
				nivelPericia = nivel;
			else {
				nivelPericia = 12;
				modNivelPericia = (nivel - nivelPericia) / 2;
			}
		else
			throw new IllegalArgumentException("\"nivel\" deve ser par e maior ou igual a 4");
	}

	public void addNivelDado(int pontos) throws IllegalArgumentException {
		if (pontos > 0)
			if (nivelPericia + (pontos * 2) <= 12)
				nivelPericia += (pontos * 2);
			else {
				var temp = nivelPericia + (pontos * 2);
				nivelPericia = 12;
				modNivelPericia += (temp - nivelPericia) / 2;
			}
	}

	public String toString() {
		return id.toString();
	}

	@Override
	public boolean check(NPC npc) {
		List<Pericia> lista = npc.getPericias();

		System.out.println("Checando se NPC tem pericia: " + this.getId().getNome() + " - d" + this.getNivelDado());
		if(lista.contains(this)) {
			Pericia x = lista.get(lista.indexOf(this));
			System.out.println("NPC possui pericia " + x.getId().getNome() + " - d" + x.getNivelDado());
			return x.getNivelDado() >= this.getNivelDado();
		}
		return false;
	}
	
}
