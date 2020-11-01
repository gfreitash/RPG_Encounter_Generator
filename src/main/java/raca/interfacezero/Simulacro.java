package raca.interfacezero;

import core.Raca;

public abstract class Simulacro extends Raca {
    public static final String NOME = "Simulacro";
    public static final String DESCRICAO = "Para propósitos de criação de personagem, um simulacro\n" +
            "não é mais do que um personagem normal com habilidades" +
            "especiais baseadas no modelo que você escolheu.";

    public Simulacro(String nome, String descricao) {
        super(NOME + " " + nome, NOME + " " + nome + ":\n" + DESCRICAO + "\n" + descricao);
    }
}
