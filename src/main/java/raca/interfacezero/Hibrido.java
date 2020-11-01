package raca.interfacezero;

import core.Raca;

public abstract class Hibrido extends Raca {
    public static final String NOME = "Híbrido";
    public static final String DESCRICAO = "Todos os híbridos, seus genes manipulados com DNA " +
            "animal, exibem habilidades (e ocasionalmente a aparência e comportamento) das criaturas com as quais eles foram " +
            "cruzados. Ao invés de fornecer uma centena de modelos" +
            "de animais, híbridos podem em vez disso ser divididos em " +
            "cerca de cinco diferentes categorias, com as características " +
            "simples do tipo de animal (um tigre, ou um urso, etc.). Nada " +
            "o impede de criar novos modelos de híbrido, mas tenha " +
            "certeza de trabalhar com o seu Mestre para criar um que " +
            "seja balanceado e combine com o jogo. Normalmente uma " +
            "modificação menor nesses modelos existentes é tudo o " +
            "que você precisa.";

    public Hibrido(String nome, String descricao) {
        super(NOME + " " + nome, NOME + " " + nome + ":\n" + DESCRICAO + "\n" + descricao);
    }
}
