package requisito;

import core.NPC;
import core.Requisito;

public class RequisitoNegativo implements Requisito {
    private final Requisito requisito;

    public RequisitoNegativo(Requisito requisito) {
        this.requisito = requisito;
    }

    @Override
    public boolean check(NPC npc) {
        return !(requisito.check(npc));
    }

    public Requisito getRequisito() {
        return requisito;
    }
}
