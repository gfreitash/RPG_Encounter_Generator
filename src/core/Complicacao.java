package core;

public enum Complicacao implements Checavel{
	ANALFABETO("Analfabeto","Seu herói não consegue ler. Ele provavelmente " +
			"pode assinar seu nome e sabe o significado de um " +
			"sinal de PARE, mas não pode fazer muito mais que " +
			"isso. Também não sabe muito sobre matemática. " +
			"Consegue provavelmente efetuar 2+2=4, mas " +
			"multiplicações e similares estão fora do seu alcance. " +
			"A propósito, analfabetos não podem ler ou" +
			"escrever em nenhum idioma, não importa quantos " +
			"eles realmente falem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	CEGO("Cego", "O indivíduo é completamente cego. Ele sofre " +
			"-6 em todas as tarefas físicas dependentes da visão " +
			"(ou seja, praticamente tudo) e -2 na maior parte das " +
			"tarefas sociais, pois não pode “ler” quem interage " +
			"com ele tão bem como os outros. " +
			"Por outro lado, personagens Cegos ganham uma " +
			"Vantagem gratuita a sua escolha para compensar " +
			"esta Complicação particularmente difícil.\n\n" +
			"No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	CODIGO_HONRA("Código de Honra", "Há muitos códigos de honra diferentes dentro do gênero " +
			"cyberpunk, com o mais conhecido sendo talvez o código " +
			"do Samurai das Ruas, que é baseado no código Japonês do " +
			"Bushido. Jogadores e Mestres devem se sentir livres para " +
			"modificar essa Complicação para melhor se encaixar nos " +
			"diferentes códigos de honra que alguém pode encontrar " +
			"dentro do mundo de Interface Zero 2.0.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	CREDITO_RUIM("Crédito Ruim", "Seu personagem arruinou seriamente uma missão, "
			+ "o que subtrai permanentemente 1 do seu Crédito nas Ruas.", Jogo.INTERFACE_ZERO, TipoComplicacao.MENOR),

	DESPLUGADO("Desplugado", "Você não tem um TAP e é incapaz de ver "
			+ "ou interagir com Hiper-Realidade ou realidade virtual "
			+ "de qualquer modo; incluindo, mas não limitado a, "
			+ "telas digitais, banco instantâneo e TAPPlicativos. Você "
			+ "também não pode ter a perícia Hacking, uma vez que não "
			+ "pode acessar os dados de maneira apropriada. Você pode "
			+ "remover esta Compli-cação gastando um Progresso e "
			+ "comprando um TAP por 5,000 créditos. Uma vez que tenha "
			+ "instalado um TAP, você poderá ter a perícia Hacking.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR),

	DIVIDA("Dívida", "Algumàs vezes, um personagem quer começar com "
			+ "aquele “algo” a mais além de cibernéticos, mas não "
			+ "tem os créditos para fazer acontecer. Mas ei, bro... "
			+ "isso é 2090, e se você está disposto a vender a sua "
			+ "alma para uma corporação ou gangue, sempre pode pegar "
			+ "um empréstimo, né? Se você é um entregador de pizzas "
			+ "e quer ter aquele veículo para poder trabalhar, por exemplo, "
			+ "apenas se dirija ao Honest Rex e experimente o seu programa "
			+ "de primeira compra. Como uma Complicação Menor, o personagem "
			+ "pode fazer uma única compra de até 15,000 créditos, mas tem "
			+ "que acrescentar 500 créditos ao seu custo de vida. Caso ele "
			+ "falhe em realizar o seu pagamento, deve fazê-lo na próxima "
			+ "sessão pagando o dobro. Se ele falhar em pagar por duas sessões "
			+ "consecutivas, o personagem adquire o equivalente a Complicação "
			+ "Procurado à medida que cobradores (ou capangas do Rex) o "
			+ "assediam continuamente por dinheiro. Caso o personagem continue "
			+ "a faltar com seus pagamentos, no mínimo sua compra será "
			+ "recuperada — no pior dos casos, ele se encontrará no lado errado "
			+ "de um tipo diferente de contrato.A versão Maior desta Complicação "
			+ "funciona quase igual, exceto que o personagem pode fazer uma "
			+ "única compra de até 30,000 créditos e tem que acrescentar "
			+ "1,000 créditos ao seu custo de vida. Também é provável que o "
			+ "credor fique mais... infeliz com a falta de pagamentos.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	FEIO("Feio", "Infelizmente, este indivíduo acertou mais que " +
			"alguns galhos de feiura na sua viagem de descida " +
			"da árvore da vida. Seu Carisma é reduzido em 2 " +
			"e geralmente é rejeitado por membros do sexo " +
			"oposto.\n\n" + "No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MENOR),

	FILTROS_RUINS("Filtros Ruins", "Seus filtros de spam têm glitches. Você "
			+ "está sendo con-stantemente bombardeado por spam, "
			+ "vírus e outros malwares. Este bombardeio constante "
			+ "torna mais provável que eventualmente algo ruim penetre "
			+ "no seu firewall. Con-sequentemente, seu firewall é "
			+ "reduzido em 1 com a versão Menor desta complicação, ou "
			+ "em 2 para a versão Maior.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	FORA_REDE("Fora da Rede", "De um jeito ou de outro, este personagem conseguiu " +
			"permanecer ou se tornou não registrado. Talvez o seu nascimento " +
			"por alguma razão nunca tenha sido registrado; talvez " +
			"ele (ou outra pessoa) apagou todos os seus registros oficiais. " +
			"Qualquer que seja o caso, até onde o resto do mundo sabe, " +
			"ele não existe. O lado bom é, isso torna o personagem realmente" +
			"difícil de ser rastreado; o lado ruim é que também " +
			"é impossível fazer qualquer coisa legalmente — como " +
			"comprar um carro, abrir uma conta bancária, ou arrumar " +
			"um emprego normal. Ele também é um alvo primário para " +
			"corporações procurando uma cobaia que ninguém dará por " +
			"falta, caso desapareça. O Mestre tem a palavra final, mas a " +
			"regra geralmente aceita é que qualquer coisa requerendo " +
			"uma identidade ou que não pode ser realizada com uma " +
			"transação em dinheiro, basicamente não pode ser feita. " +
			"Se um personagem tem a Vantagem Identidade Alternativa, " +
			"ele pode usar sua outra identidade para realizar essas " +
			"coisas. Mas, se a identidade do personagem for revelada " +
			"como falsa, seus recursos serão congelados no banco, ele " +
			"pode ser demitido do seu trabalho e até preso, dependendo " +
			"das circunstâncias. Em outras palavras, ele volta a estaca " +
			"zero, se não pior.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	GATILHO_ESTRESSE("Gatilho por Estresse", "A maioria dos zeeks tenta manter o controle "
			+ "sobre seus poderes, mas um personagem com esta Complicação "
			+ "parece não conseguir lidar com eles o tempo todo. Se ele for "
			+ "confrontado com uma situação estressante, existe a tendência "
			+ "desagradável de que suas habilidades psiônicas se manifestem. "
			+ "Como uma Complicação Menor, o que isso significa é que sempre "
			+ "que o personagem é forçado a fazer um teste de atributo para "
			+ "resistir a algo — seja um teste de Espírito para manter "
			+ "a moral ou um teste de Força em uma competição de queda de braço"
			+ " — se o resultado for uma falha crítica, o personagem deve "
			+ "tentar usar um dos seus poderes psiônicos com sua próxima ação. "
			+ "Sim, isso também se aplica a Testes de Vontade e de Absorção. "
			+ "Como uma Complicação Maior, qualquer falha em uma dessas rolagens "
			+ "resulta em uso obrigatório do poder. Em ambos os casos, o personagem "
			+ "pode gastar um Bene para evitar o uso forçado do poder. Esta "
			+ "Complicação pode ser assumida por um personagem com as Vantagens "
			+ "Antecedente Arcano (Psiônicos) ou Talento Selvagem.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	GIRI("Giri", "Às vezes, você apenas deve a alguém de uma maneira que dinheiro "
			+ "não pode pagar. Talvez venha do senso de dever; talvez venha do "
			+ "senso de dívida. Qualquer que seja o caso, um personagem com essa "
			+ "Complicação é uma dessas pessoas. “Giri” é uma palavra japonesa que "
			+ "implica uma certa carga de obrigação social — normalmente aos seus "
			+ "superiores — e vai mais fundo do que um simples senso de servidão."
			+ "Um personagem com Giri como uma Complicação Menor tem alguém com "
			+ "quem ele está um pouco endividado. Na maioria das vezes, não fará"
			+ " uma grande diferença além de como ele se comporta, mas "
			+ "ocasionalmente esse “alguém” pode precisar de algo como um favor "
			+ "ou alguma ajuda. O personagem pode recusar, mas irá lhe custar um "
			+ "Bene e um ponto de Crédito nas Ruas (se não uma certa quantidade "
			+ "de autoestima).Se é uma Complicação Maior, o personagem deve muito "
			+ "a alguém. Neste caso, ele pode ser chamado com mais frequência, e "
			+ "os custos de ignorar esse chamado podem ser maiores. O Mestre deve "
			+ "decidir quanto de Crédito nas Ruas o personagem perde baseado na "
			+ "natureza do favor. Se for um pequeno, talvez um único ponto "
			+ "(fazer Sem Estilo); se for um grande pode, ser até cinco pontos "
			+ "(como Falhar em um Serviço, ou pior). Além disso, o personagem deve "
			+ "pagar um número de Benes igual ao crédito perdido — qualquer falta "
			+ "deve ser paga com Crédito nas Ruas adicionais. Se por alguma razão, "
			+ "o personagem não puder pagar as penalidades, ele pode acabar com as "
			+ "complicações Inimigo ou mesmo Procurado.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	HABITO("Hábito", "Seu guerreiro possui um hábito irritante e " +
			"constante de algum tipo. Talvez ele cutuque seu " +
			"nariz, diga “cê sabe” em cada frase ou masque " +
			"chiclete como se isso transbordasse estilo. " +
			"Um Hábito menor irrita aqueles a seu redor, " +
			"mas não é perigoso. Seu herói sofre -1 no Carisma. " +
			"Um Hábito maior é uma dependência física " +
			"ou mental de alguma espécie, debilitante ou " +
			"mesmo possivelmente mortal. Isso inclui o uso " +
			"de drogas, alcoolismo ou talvez até mesmo um " +
			"vício em realidade virtual num cenário de alta " +
			"tecnologia. Um personagem que não receba " +
			"sua dose precisa fazer um teste de Fadiga a " +
			"cada 24 horas seguintes. A primeira rolagem cujo resultado seja " +
			"uma falha faz o personagem ficar Fatigado, " +
			"depois Exausto. O resultado final é um coma " +
			"por uso de drogas pesadas ou um caso grave " +
			"de choque em dependências como a de álcool " +
			"ou Realidade Virtual. Tratamento médico pode " +
			"amenizar os sintomas. Caso contrário, a vítima " +
			"precisará viver com as penalidades por 1d6 " +
			"dias. Posteriormente, o herói tem de pagar pela " +
			"Complicação sacrificando uma oportunidade de " +
			"Progresso ou eventualmente cairá de volta em " +
			"seu vício.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	LISTA_NEGRA("Lista Negra", "Devido a um evento em seu passado, ao menos "
			+ "uma cor-poração se recusa a ter qualquer coisa a ver com "
			+ "você. As razões podem variar, mas o resultado final é que, "
			+ "a menos que se esforce muito para esconder o seu envolvimento, "
			+ "negócios com essa companhia sempre irão azedar.No nível Maior, "
			+ "seu Na lista Negra não se aplica apenas a uma companhia, mas "
			+ "uma indústria inteira. Apenas imagine o quão difícil seria "
			+ "trabalhar em bancos se o seu nome é associado com um dos piores "
			+ "escândalos bancários na história.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	MAGNETICO("Magnético", "Quer seja sua aparência, fama, ou outra coisa que você " +
			"não pode explicar, certas pessoas acham o seu herói " +
			"muito atraente. Infelizmente, elas nunca são aquelas que " +
			"ele deseja que estivessem atraídas por ele. Como uma " +
			"Complicação Menor, um ou dois fãs aparecem como um " +
			"inconveniente ou uma distração ocasional. A versão Maior " +
			"tem turbas de fãs que o deixam em sérios apuros. Imagine " +
			"tentar fazer um trabalho enquanto é perseguido por meia " +
			"dúzia de repórteres! Exemplos de fãs incluem pretensos " +
			"criminosos esperando ficarem bem quistos, jornalistas ou " +
			"produtores de reality shows.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	MANCO("Manco", "Um ferimento do passado quase aleijou seu " +
			"herói. Sua Movimentação básica é reduzida " +
			"em 2 e ele rola apenas um d4 para correr. A " +
			"Movimentação de um personagem nunca pode " +
			"ser reduzida abaixo de 1." + "No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	MA_REPUTACAO("Má Reputação", "As pessoas pensam o pior do seu personagem. "
			+ "Se algo ruim acontece, ele é a primeira pessoa a levar "
			+ "a culpa. Talvez ele mereça, talvez não, mas ninguém parece "
			+ "se importar com o que ele tem a dizer sobre o assunto.Como "
			+ "uma Complicação Menor, os rumores que as pessoas levantam "
			+ "sobre seu personagem são realmente verdades exageradas ou "
			+ "completas mentiras. Talvez você tenha alguns contatos na "
			+ "Yakuza, mas isso não significa que você é “um matador durão "
			+ "que a Yakuza contrata para missões especiais”. Como uma "
			+ "Complicação Maior, você na verdade tem algum tipo de ficha criminal. "
			+ "A polícia provavelmente irá aparecer na sua porta se algo "
			+ "acontece na sua área, mesmo que você não tenha nada a ver com isso, "
			+ "e você já viu o interior de várias salas de interrogatório", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	MONITOR_INDICADO("Monitor Indicado", "Seu personagem tem um cão de guarda. "
			+ "Esta é uma Com-plicação Menor se o monitor raramente "
			+ "interfere nas ações do seu herói, contudo ele "
			+ "provavelmente reportará as ativi-dades do personagem "
			+ "aos seus superiores. Está é uma Complicação Maior "
			+ "se o monitor irá interferir em qualquer ação que vá "
			+ "contra as ordens dos seus superiores e sempre irá "
			+ "reportar as atividade do personagem, independente do "
			+ "que elas sejam. Se um Monitor Indicado é morto, um "
			+ "novo monitor o substituirá, a menos que ele tenha "
			+ "sido morto pelo personagem, que será acusado de "
			+ "homicídio (ou isto é substituído com a Complicação "
			+ "Procurado). Um monitor pode ser uma pessoa, mas também "
			+ "pode ser um Aspecto carregado dentro do TAP do personagem, "
			+ "dependendo da natureza dos seus superiores.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	NANO_INFECCAO("Nano-Infecção", "Seu personagem foi infectado com um nano-vírus e acabou " +
			"se ferrando no quesito mutação. Como uma Complicação " +
			"Menor, escolha uma Perícia, o Dado Selvagem associado " +
			"aquela perícia é um passo menor (normalmente um d4). " +
			"Como uma Complicação Maior selecione um Atributo. O " +
			"Dado Selvagem para aquele Atributo é um passo menor " +
			"(normalmente um d4). " +
			"Nano-Infecção pode ser adquirida múltiplàs vezes (se um " +
			"personagem ficar totalmente ferrado por algum nano-vírus), " +
			"embora os benefícios ganhos por assumir a Complicação " +
			"ainda sejam limitados a um Maior e dois Menores", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	POBREZA("Pobreza", "É dito que um tolo e seu dinheiro logo se " +
			"separam. Seu herói é esse tolo. Ele começa com " +
			"metade do dinheiro normal para o seu cenário " +
			"e parece não conseguir poupar os recursos " +
			"adquiridos do início do jogo. No geral, o jogador " +
			"reduz a metade os seus recursos totais a cada " +
			"semana de jogo.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	PROPRIEDADE("Propriedade", "Seja por procedimentos experimentais que o mantêm " +
			"vivo, ou um contrato de servidão para pagar uma grande " +
			"dívida, sua liberdade individual é bastante dificultada porque " +
			"você é, para todos os efeitos e propósitos, propriedade do " +
			"megaconglomerado que possui o seu contrato. Esta Complicação " +
			"é muito comum para simulacros, andróides e híbridos " +
			"trabalhando no setor corporativo. Na maior parte, esta Complicação " +
			"significa que você tem pouco a opinar sobre suas " +
			"ações; não é incomum para você receber ordens com a " +
			"expectativa que você as cumprirá. No fim de uma longa e " +
			"perigosa missão para os donos do seu contrato, você pode " +
			"pagar por esta Complicação gastando um Progresso uma " +
			"vez que atinja o Estágio Experiente.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR),

	RACISTA("Racista", "O personagem não gosta de pessoas de outras raças e " +
			"credos, acredita que a sua raça é superior. Ele não pode" +
			"se controlar em menosprezar outras raças em cada oportunidade. " +
			"Um personagem assumindo a versão Menor tem" +
			"Carisma -2 entre outras raças. A penalidade aumenta para " +
			"-4 na Complicação Maior.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	SEGREDO("Segredo", "Seu personagem tem um segredo que, se descoberto, " +
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
			"(Maior) para a versão Maior.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	TALENTO_LATENTE("Talento Latente", "Alguns zeeks desafortunados sequer se dão conta de que "
			+ "eles são zeeks até que coisas estranhas começam a acontecer a sua volta. "
			+ "Nesse ponto, ou eles aprendem a controlar, ou aprendem a conviver. "
			+ "Esta Complicação funciona como a versão Maior da Complicação "
			+ "Gatilho por Estresse (veja abaixo) com algumas grandes diferenças. "
			+ "A má noticia é que o seu personagem não tem ideia de quais são os "
			+ "seus poderes latentes, então o Mestre escolhe qual (ou quais) se "
			+ "manifestam quando o Gatilho por Estresse " +
			"se aciona — até três deles, como qualquer outro zeek. Ele " +
			"pode escolher qualquer poder, entretanto o personagem " +
			"deve ter o Estágio suficiente para usá-lo. Quando você testa " +
			"para verificar se o poder se ativa, é feito um teste de Espírito " +
			"(ao invés de um teste da perícia Psiônicos). Se você quiser " +
			"gastar um Bene para impedir o poder de se manifestar, " +
			"deve declarar antes que o Mestre diga qual é o seu poder. " +
			"A boa notícia é, você pode pagar por esta Complicação " +
			"gastando dois Progressos. Após o primeiro Progresso, esta " +
			"Complicação é tratada como a versão Menor de Gatilho" +
			"por Estresse, e os poderes só são ativados por uma falha " +
			"crítica — embora as regras acima ainda se apliquem. Após o " +
			"segundo Progresso, seu personagem pode adquirir o Antecedente " +
			"Arcano (Psiônicos) e não sofre mais de Gatilho por " +
			"Estresse. Os poderes iniciais do seu personagem devem ser " +
			"qualquer poder manifestado por causa do Talento latente. " +
			"Se todos os três ainda não tiverem sido designados, você " +
			"pode escolher qualquer poder remanescente.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	TRAUMA_GUERRA("Trauma de Guerra", "O personagem tem uma tendência de congelar em combate. "
			+ "Ele começa o primeiro turno de combate Abalado. Esta condição pode "
			+ "ser removida normalmente.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	TREMORES("Tremores", "Por alguma razão, este personagem tem alguns fios soltos " +
			"no cérebro. Seja por uma defeito de nascença ou porque " +
			"doutores prestativos de algum projeto de pesquisa fizeram " +
			"um caminho neural em zig onde deveriam ter feito um zag, " +
			"o resultado é o mesmo: ele sofre tremores se está sobrecarregado " +
			"por estresse. Sempre que esse personagem é " +
			"forçado a fazer um teste de Espírito e falha, ele deve fazer " +
			"imediatamente um teste de Vigor no qual se também falhar, " +
			"ele começa a ter uma convulsão. " +
			"A convulsão faz com que o personagem caia e sofra uma " +
			"penalidade de -2 em todos os testes até que ela passe. " +
			"Além disso, o personagem só pode realizar Movimentação " +
			"3 nesse período. A convulsão dura 15 turnos menos um " +
			"número de turnos igual ao Espírito do personagem. " +
			"A boa noticia é que sempre há alguma forma de tratamento " +
			"químico para compensar possíveis convulsões. Contanto que " +
			"Criação de Personagens " +
			"o personagem tenha acesso a sua medicação, ele não tem que "
			+ "fazer um teste de Vigor quando falha em um teste de Espírito, "
			+ "mas isso requer gasto de dinheiro — 500 créditos adicionais por "
			+ "sessão de jogo. O personagem pode gastar menos (metade) em "
			+ "fontes naturais alternativas, mais baratas, porém invariavelmente "
			+ "menos eficientes. O personagem ainda deve fazer seu teste de Vigor "
			+ "em falhas em teste de Espírito, mas ele ganha um bônus de +1.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	UMA_PERNA_SO("Uma Perna Só", "Com uma prótese, Uma Perna age exatamente " +
			"como na Complicação Manco, reduzindo a " +
			"Movimentação em 2 e as rolagens de corrida " +
			"são feitas com um d4. Sem uma prótese, " +
			"a Movimentação do Personagem é 2 e ele " +
			"nunca pode correr. Ele também sofre -2 em " +
			"Características que exijam mobilidade, como " +
			"Escalar e Lutar. Um personagem com uma perna " +
			"também sofre uma penalidade de -2 em sua " +
			"perícia Nadar (e Movimentação)." +
			"No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	UM_BRACO_SO("Um Braço Só", "Seja de nascimento ou devido a uma batalha, " +
			"seu herói perdeu um braço. Por sorte, o seu " +
			"outro é (agora) o braço “bom”. Tarefas que " +
			"requerem duas mãos, como Escalar, sofrem -4 de " +
			"penalidade.\n\n" + "No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	UM_OLHO_SO("Um Olho Só", "Seu herói perdeu um olho por alguma razão " +
			"desafortunada. Se não usar um tapa-olho ou " +
			"comprar um substituto de vidro (normalmente " +
			"$500), sofre -1 no seu Carisma pelo ferimento " +
			"grotesco. " +
			"Sofre -2 em qualquer rolagem de Característica " +
			"que exija percepção de profundidade, como " +
			"Arremessar ou Atirar, saltar uma ravina ou " +
			"telhado e assim por diante." + "No mundo de Interface Zero 2.0, "
			+ "a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	VISAO_RUIM("Visão Ruim", "Os olhos do seu herói já não são mais o que " +
			"costumavam ser. Com óculos, não há penalidade " +
			"e a Complicação é apenas Menor. Caso perca " +
			"seus óculos (geralmente uma chance de 50% " +
			"quando for ferido ou nenhuma chance com uma " +
			"“alça nerd”), sofre -2 de penalidade em qualquer " +
			"rolagem de Característica feita para atirar ou " +
			"Perceber alguma coisa a mais de 5 quadros (10m) " +
			"de distância.\r\n" +
			"Em cenários de baixa tecnologia, onde o herói " +
			"não possa usar óculos, ter Olhos Ruins é uma " +
			"Complicação Maior. Ele precisa subtrair 2 das " +
			"rolagens de Características feitas para atacar ou " +
			"perceber coisas a 5 quadros ou mais de distância." +
			"No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	ANEMICO("Anêmico", "Um personagem anêmico é particularmente " +
			"suscetível a infecções, doenças, efeitos ambientais " +
			"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " +
			"como os feitos para resistir a veneno e doença", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	ARROGANTE("Arrogante", "Seu herói não pensa ser o melhor – ele sabe " +
			"que é. Seja no que for – esgrima, kung fu, corrida " +
			"– poucos se comparam às suas habilidades e ele " +
			"ostenta isso a cada oportunidade que tem. " +
			"Só vencer não é o bastante para o seu herói. Ele " +
			"precisa dominar completamente o seu oponente. " +
			"Sempre que houver sequer uma sombra de dúvida " +
			"a respeito de quem é o melhor, deve humilhar " +
			"seu oponente e provar poder alcançar a vitória a " +
			"qualquer momento desejado. É o tipo de homem " +
			"que desarma um oponente em um duelo só para " +
			"poder pegar a sua espada e devolvê-la com um " +
			"sorriso desdenhoso. " +
			"Heróis arrogantes sempre procuram pelo " +
			"“chefe” em batalha, atacando lacaios menores " +
			"apenas se ficarem em seu caminho.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR),

	BOCA_GRANDE("Boca Grande", "Todos sabem que deve-se tomar cuidado com o " +
			"que se diz, não é mesmo? Bem, o seu personagem " +
			"não sabe. " +
			"Seu personagem não consegue guardar " +
			"muito bem um segredo. Ele revela os planos " +
			"e deixa escapar as coisas mais bem guardadas " +
			"entre amigos, geralmente nos piores momentos " +
			"possíveis.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	CAUTELOSO("Cauteloso", "Algumas pessoas acumulam inteligência " +
			"demais. Este personagem personifica a cautela " +
			"excessiva. Ele nunca toma decisões apressadas e " +
			"gosta de planejar coisas até os mínimos detalhes " +
			"antes de qualquer ação ser tomada.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	COVARDE("Covarde", "Nem todo mundo possui água gelada em suas " +
			"veias. Seu herói é suscetível à visão de sangue e " +
			"vísceras e tem medo de se machucar. Ele subtrai " +
			"2 de todos os seus testes de Espírito baseados em " +
			"medo.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	CURIOSO("Curioso", "A curiosidade matou o gato e também pode " +
			"matar seu herói. Personagens curiosos são " +
			"facilmente arrastados para qualquer aventura. Eles " +
			"têm de verificar tudo e sempre querem saber o que " +
			"há por trás de um mistério em potencial.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	DEFICIENTE_AUDITIVO("Deficiente Auditivo", "Personagens que perderam parte ou toda a " +
			"sua audição têm esta desvantagem. Como uma " +
			"Complicação Menor, ela subtrai 2 de todas as " +
			"rolagens de Perceber feitas para ouvir, incluindo " +
			"acordar devido a ruídos altos. Uma Complicação " +
			"maior significa que o personagem é surdo. Ele não " +
			"pode ouvir e falha automaticamente em todas as " +
			"rolagens de Perceber dependentes da audição.\n\n" +
			"No mundo de Interface Zero 2.0, a medicina avançou ao " +
			"ponto em que a Complicação listada " +
			"acima pode ser removida com um simples procedimento " +
			"médico. Por causa disso, qualquer personagem que assuma " +
			"essas Complicações na criação de personagem, e então " +
			"usa Aprimoramentos em jogo para removê-las, também " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complicações na criação de personagem não podem anular " +
			"os seus efeitos com Aprimoramentos durante a criação de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	DELIRANTE("Delirante", "Seu herói acredita em algo considerado muito " +
			"estranho por todos os outros. Delírios Menores " +
			"são inofensivos ou o personagem normalmente os " +
			"guarda para si mesmo (o governo colocou sedativos " +
			"em refrigerantes, cães podem falar, somos todos " +
			"apenas personagens de algum jogo bizarro etc.). " +
			"Com Delírios Maiores, ele frequentemente " +
			"expressa seu ponto de vista sobre a situação e isso " +
			"pode eventualmente levá-lo ao perigo (o governo " +
			"é comandado por alienígenas, os hospitais são " +
			"mortais, eu sou alérgico a armaduras, zumbis são " +
			"meus amigos).", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	DESAGRADAVEL("Desagradável", "Este camarada é mal-humorado e desagradável. " +
			"Ninguém gosta dele e ele tem dificuldades em fazer " +
			"qualquer coisa gentil pra quem quer que seja. Ele " +
			"deve ser pago pelos seus aborrecimentos e nem " +
			"mesmo aceita premiações graciosamente. Seu " +
			"herói sofre -2 no seu Carisma.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	DESASTRADO("Desastrado", "Algumas pessoas simplesmente não são boas " +
			"com dispositivos modernos. Personagens com " +
			"este defeito sempre sofrem uma penalidade de -2 " +
			"na perícia Consertar. Além disso, ao usar um " +
			"dispositivo mecânico ou eletrônico, uma rolagem " +
			"de 1 no seu dado de perícia (independente do " +
			"seu Dado Selvagem) significa que o dispositivo " +
			"foi quebrado. Reparar esse item normalmente " +
			"requer uma rolagem de Consertar com -2 e 1d6 " +
			"horas para o reparo.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	DESEJO_MORRER("Desejo de Morrer", "Ter um desejo de morrer não significa que "
			+ "seu herói seja um suicida – mas ele quer morrer " + "depois de completar algum objetivo importante. "
			+ "Talvez queira vingança pelo assassinato de sua " + "família ou talvez esteja morrendo de alguma "
			+ "doença e queira partir em um lampejo de glória. " + "Ele não vai jogar sua vida fora por qualquer "
			+ "razão, mas quando houver uma chance de " + "completar o seu objetivo, fará qualquer coisa – e "
			+ "aceitará qualquer risco – para alcançá-lo. " + "Essa normalmente é uma Complicação menor, "
			+ "a menos que o objetivo seja relativamente fácil " + "de ser alcançado (muito raro).", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	EXCESSO_CONFIANCA("Excesso de Confiança", "Não existe nada que seu herói não possa " +
			"derrotar. Pelo menos é isso que pensa. Ele acredita " +
			"poder fazer quase tudo e nunca quer fugir de um " +
			"desafio. O herói não é um suicida, mas certamente " +
			"faz mais do que dita o bom senso.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	FOBIA("Fobia", "Fobias são medos esmagadores e irracionais "
			+ "que permanecem com o herói pelo resto da sua " + "vida. Sempre que um personagem estiver na "
			+ "presença de sua fobia, subtraia 2 de todos os testes " + "de Característica no caso de uma Complicação "
			+ "Menor e 4 se o medo for uma Fobia Maior. " + "Fobias não devem ser muito óbvias – todos "
			+ "devem temer vampiros, por exemplo. Sendo " + "assim, isso não é uma fobia – é senso comum. "
			+ "Ao invés disso, a fobia geralmente se concentra " + "em algum elemento aleatório focado pela "
			+ "mente durante qualquer que seja o encontro " + "causador deste terror. Lembre, fobias são medos "
			+ "irracionais.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	FORASTEIRO("Forasteiro", "Em uma sociedade formada por apenas alguns " +
			"tipos de pessoa, o seu herói não é uma delas. " +
			"Um índio em uma cidade do Velho Oeste, um " +
			"alienígena em um jogo de ficção científica de " +
			"fuzileiros humanos ou um meio-orc em um grupo " +
			"de elfos, anões e humanos são todos exemplos de " +
			"Forasteiros. Habitantes locais são suscetíveis a " +
			"aumentar os preços para o Forasteiro, ignorar " +
			"seus pedidos de socorro e geralmente tratam-no " +
			"como se fosse de uma classe mais baixa que a do " +
			"resto de sua sociedade. " +
			"Além dos efeitos de interpretação acima, o " +
			"Carisma do seu herói sofre um modificador de " +
			"-2 em relação a todos menos o seu próprio povo.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MENOR),

	GANANCIOSO("Ganancioso", "Seu herói avarento mede seu valor em tesouro. " +
			"Se for uma Complicação Menor, ele argumenta " +
			"amargamente sobre qualquer despojo adquirido " +
			"durante o jogo. Se for uma Complicação Maior, " +
			"luta por qualquer coisa que considerar desleal e " +
			"pode até mesmo matar pela sua “parte justa”.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	HEROICO("Heróico", "Esta nobre alma nunca diz não a uma pessoa " +
			"necessitada. Ela não precisa ficar feliz com isto, " +
			"mas sempre virá em socorro daqueles que (pelo " +
			"menos de forma aparente) não podem ajudar a " +
			"si mesmos. É a primeira a correr para dentro de " +
			"um prédio em chamas, geralmente aceita caçar " +
			"monstros por pouco ou nenhum pagamento e " +
			"normalmente é um alvo fácil para uma história " +
			"triste.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	IDOSO("Idoso", "Seu herói está ficando velho, mas não " +
			"está totalmente pronto para o asilo. Sua " +
			"Movimentação é reduzida em 1 e sua Força " +
			"e Vigor caem um tipo de dado até um " +
			"mínimo de d4 e não podem ser aumentados " +
			"posteriormente. " +
			"Por outro lado, a sabedoria dos seus anos " +
			"concede ao herói 5 pontos de perícia adicionais " +
			"que podem ser usados em quaisquer perícias " +
			"associadas à Astúcia.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	INIMIGO("Inimigo", "Alguém odeia seu herói e quer vê-lo morto. " +
			"O valor da Complicação depende do quão " +
			"poderoso é o Inimigo e de quantas vezes ele " +
			"poderá aparecer. Um Inimigo Menor pode ser " +
			"um pistoleiro solitário buscando vingança. " +
			"Um Inimigo Maior pode ser um pistoleiro " +
			"sobrenatural que deseja o seu herói morto. " +
			"Se o Inimigo um dia for vencido, o Mestre " +
			"deve trabalhar gradualmente em um substituto " +
			"ou o herói pode pagar pela Complicação " +
			"sacrificando um Progresso.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	JOVEM("Jovem", "Crianças às vezes são forçadas a partir em " +
			"aventuras perigosas devido a circunstâncias " +
			"infelizes. Pense cuidadosamente antes de escolher " +
			"esta Complicação, pois seu jovem começará com " +
			"uma desvantagem significativa. " +
			"Heróis jovens geralmente têm entre 8-12 anos " +
			"de idade (em anos humanos – faça os devidos " +
			"ajustes para raças com paradigmas diferentes de " +
			"envelhecimento). Têm apenas três pontos para " +
			"ajustar os seus atributos e 10 pontos de perícia. " +
			"Em compensação, jovens como estes têm certa " +
			"porção de sorte. Eles sacam um Bene adicional " +
			"no início de cada sessão de jogo, em adição a " +
			"quaisquer Benes adicionais ganhos de coisas " +
			"como as Vantagens Sorte e Sorte Grande. " +
			"Se o personagem viver tempo o suficiente " +
			"para atingir a maturidade, a Complicação não " +
			"precisa ser paga, pois o preço já foi pago pela " +
			"Complicação por ter começado em desvantagem. " +
			"Entretanto, ele deixa de receber o Bene adicional " +
			"ao completar 18 anos de idade (ou a idade da " +
			"maioridade do cenário em questão).", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR),

	LEAL("Leal", "Seu personagem pode não ser um herói, " +
			"mas daria a sua vida pelos seus amigos. Esse " +
			"personagem nunca pode deixar um homem para " +
			"trás se houver qualquer chance dele poder ajudar.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MENOR),

	MA_SORTE("Má Sorte", "Seu herói é um pouco menos sortudo que " +
			"a maioria. Ele recebe um Bene a menos que o " +
			"normal por sessão de jogo. Um personagem não " +
			"pode ter Má Sorte e Sorte simultaneamente.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR),

	OBESO("Obeso", "Pessoas particularmente grandes têm muita " +
			"dificuldade em situações de perigo físico. " +
			"Aqueles que suportam bem o seu próprio peso " +
			"têm a Vantagem Musculoso. Aqueles que não " +
			"lidam muito bem com ele são Obesos. Um " +
			"personagem não pode ser Musculoso e Obeso " +
			"simultaneamente. " +
			"Um herói Obeso adiciona 1 a sua Resistência, " +
			"mas sua Movimentação é decrescida em 1 e seu " +
			"dado de corrida é um d4. Personagens obesos " +
			"também podem ter dificuldade para achar " +
			"armaduras ou roupas adequadas ao seu tamanho, " +
			"caber em espaços apertados ou mesmo viajar em " +
			"espaços confinados, como poltronas de aviões ou " +
			"carros compactos.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	PACIFISTA("Pacifista", "Seu herói despreza absolutamente a violência. " +
			"Pacifismo Menor significa que ele luta apenas " +
			"se não for dada nenhuma outra opção e jamais " +
			"permite a matança de prisioneiros e outras " +
			"vítimas indefesas. " +
			"Pacifistas Maiores não irão combater criaturas " +
			"vivas sob quaisquer circunstâncias. Eles podem " +
			"se defender, mas não farão nada para ferir " +
			"permanentemente criaturas vivas sencientes. " +
			"Criaturas inegavelmente malignas, mortos vivos, " +
			"demônios e similares não contam e podem ser " +
			"atacadas ou mesmo feridos. Um Pacifista Maior " +
			"também pode lutar com métodos não letais, como " +
			"os seus próprios punhos. Tais personagens, no " +
			"entanto, só o farão se obviamente ameaçados.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	PECULIARIDADE("Peculiaridade", "Seu herói tem alguma fraqueza menor, " +
			"normalmente engraçada, mas que ocasionalmente " +
			"lhe causa problemas. Um espadachim " +
			"pode sempre tentar primeiro cortar suas iniciais " +
			"em seus inimigos antes de atacar, um anão pode " +
			"se vangloriar constantemente a respeito da sua " +
			"cultura ou uma debutante esnobe pode não comer, " +
			"beber ou socializar com as classes mais baixas.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MENOR),

	PEQUENO("Pequeno", "Seu personagem é muito magro, muito baixo " +
			"ou os dois em relação a sua raça em particular. " +
			"Subtraia 1 da sua Resistência pela sua estatura " +
			"reduzida.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	PROCURADO("Procurado", "Seu herói cometeu algum crime no passado e " +
			"será preso se for descoberto pelas autoridades. " +
			"Isso pressupõe que o cenário possui leis e oficiais " +
			"de polícia para impô-las. " +
			"O nível da Complicação depende da seriedade " +
			"do crime. Um herói com várias multas de estacionamento " +
			"não pagas (em um jogo em que " +
			"ele pode ter de dirigir ocasionalmente) possui " +
			"uma Complicação Menor, assim como alguém " +
			"procurado por um crime mais grave longe da " +
			"área principal da campanha. Ser acusado de " +
			"assassinato é uma Complicação Maior em quase " +
			"qualquer cenário.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	SANGUINARIO("Sanguinário", "Seu herói nunca faz prisioneiros, exceto sob " +
			"a supervisão direta de um superior. Isso pode " +
			"causar grandes problemas em uma campanha " +
			"militar, a menos que seus superiores tolerem esse " +
			"tipo de coisa. Seu herói sofre -4 no seu Carisma " +
			"somente se seus hábitos cruéis forem conhecidos", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	SEM_NOCAO("Sem Noção", "Seu herói não é tão consciente de seu mundo " +
			"quanto a maioria das pessoas. Ele sofre -2 em " +
			"rolagens de Conhecimento Geral.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	TEIMOSO("Teimoso", "Este indivíduo sempre quer as coisas do " +
			"seu jeito e nunca admite estar errado. Mesmo " +
			"quando é dolorosamente óbvio que cometeu " +
			"um erro, tenta justificá-lo com meias-verdades e " +
			"racionalizações.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	VINGATIVO("Vingativo", "Seu personagem sempre tenta reparar um erro " +
			"que sinta ter sido cometido contra ele. Se essa " +
			"for uma Complicação Menor, ele normalmente " +
			"procura por vingança legalmente. O tipo e a " +
			"urgência de sua vingança variam de personagem " +
			"para personagem, é claro. Alguns conspiram " +
			"e planejam por meses para conseguir o que " +
			"enxergam como justiça. " +
			"Se essa for uma Complicação Maior, seu " +
			"personagem matará para retificar a sua injustiça.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	VOTO("Voto", "O personagem possui um voto de algum tipo. " +
			"Se é uma Complicação Maior ou Menor depende " +
			"do Voto em si. Alguns podem ter votos para " +
			"com ordens ou causas específicas, para com " +
			"o juramento Hipocrático, livrar o mundo do " +
			"mal e assim por diante. O risco em cumprir o " +
			"Voto e quão ocasionalmente isso pode ocorrer " +
			"determinam o nível da Complicação. Qualquer " +
			"que seja o Voto, ele só será uma Complicação se " +
			"realmente aparecer em jogo de tempos em tempos " +
			"e causar ao personagem algum desconforto.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR);



	private final Identidade id;
	private final Jogo jogo;
	private TipoComplicacao[] tipoPossível;
	private TipoComplicacao tipo;
	
	Complicacao(String nome, String descricao, Jogo jogo,TipoComplicacao ... tipoPossivel) {
		id = new Identidade(nome, descricao);
		this.jogo = jogo;
		this.tipoPossível = tipoPossivel;
	}

	public Identidade getId() {
		return id;
	}

	public TipoComplicacao[] getTipoPossível() {
		return tipoPossível;
	}

	public TipoComplicacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoComplicacao tipo) {
		boolean tipoValido = false;

		for(TipoComplicacao x: tipoPossível) {
			if(x.equals(tipo)) {
				tipoValido = true;
				break;
			}
		}

		if(tipoValido)
			this.tipo = tipo;
		else throw new IllegalArgumentException("Tipo inválido!");
	}

	public boolean checkSeTipoValido(TipoComplicacao tipo) {
		for(TipoComplicacao x: tipoPossível)
			if(x == tipo)
				return true;

		return false;
	}
	
	public static Complicacao getAleatoria() {
		int random = (int) (Math.random() * Complicacao.values().length);
		Complicacao comp = Complicacao.values()[random];

		random = (int) (Math.random() * comp.getTipoPossível().length);
		comp.setTipo(comp.getTipoPossível()[random]);


		//System.out.println("Complicação escolhida = " + comp.getNome());
		return comp;
	}

	public String toString() {
		return id.toString();
	}

	@Override
	public boolean check(NPC npc) {
		return npc.getComplicacoes().contains(this);
	}
}
