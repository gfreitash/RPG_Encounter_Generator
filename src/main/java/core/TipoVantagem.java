package core;

public enum TipoVantagem {
    VANTAGEM_ANTECEDENTE("Vantagem de Antecedente", "Estas Vantagens são benefícios hereditários e " +
            "históricos ou reações treinadas que se desenvolvem " +
            "em um personagem depois de treinamento " +
            "prolongado ou exposição a certos eventos. " +
            "Jogadores podem escolher estas Vantagens " +
            "depois da criação do personagem, mas o Mestre " +
            "pode exigir um pouco mais de racionalização. " +
            "Alguém pode escolher a Vantagem Atraente, " +
            "por exemplo, se arrumando, passando por uma " +
            "transformação e geralmente dando mais atenção " +
            "a sua aparência. Personagens também podem " +
            "ser capazes de ganhar a Vantagem Antecedente " +
            "Arcano, caso encontrem um livro de conhecimento " +
            "proibido ou treinando sob a tutela de outro " +
            "indivíduo arcano no seu grupo."),

    VANTAGEM_COMBATE("Vantagem de Combate", "Estas Vantagens são projetadas para ajudar o seu " +
            "herói a causar danos terríveis – ou sobreviver a eles " +
            "– nas batalhas sangrentas de Savage Worlds.")

    ;

    private final String tipo;
    private final String descricao_tipo;

    TipoVantagem(String tipo, String descricao_tipo) {
        this.tipo = tipo;
        this.descricao_tipo = descricao_tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao_tipo() {
        return descricao_tipo;
    }
}
