package core;
import raca.interfacezero.*;

import java.util.List;

public enum TipoRaca {
    ANDROIDE(new Androide()), BIOROIDE(new Bioroide()), CIBORGUE(new Ciborgue()), HIBRIDO_AQUATICO(new HibridoAquatico()),
    HIBRIDO_DURAO(new HibridoDurao()), HIBRIDO_FEROZ(new HibridoFeroz()), HIBRIDO_FURTIVO(new HibridoFurtivo()),
    HIBRIDO_LIGEIRO(new HibridoLigeiro()), HUMANO(new Humano()), HUMANO_2(new Humano2()), SIMULACRO_LUXO(new SimulacroLuxo()),
    SIMULACRO_SOLDADO(new SimulacroSoldado()), SIMULACRO_TRABALHADOR(new SimulacroTrabalhador());

    private final Raca raca;

    TipoRaca(Raca raca){
        this.raca = raca;
    }

    public Raca getRaca() {
        return raca;
    }

    //TODO: make this less hardcoded
    public Hibrido getHibridoAleatorio() {
        TipoRaca[] temp = TipoRaca.values();
        return (Hibrido) temp[4 + ((int) (Math.random() * 5))].getRaca();
    }

    //TODO: make this less hardcoded
    public Simulacro getSimulacroAleatorio() {
        TipoRaca[] temp = TipoRaca.values();
        return (Simulacro) temp[11 + ((int) (Math.random() * 3))].getRaca();
    }
}
