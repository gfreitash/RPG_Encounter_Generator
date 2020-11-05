package requisito;

import core.NPC;
import core.Requisitavel;
import core.Requisito;

public class RequisitoNegativo extends Requisito {

    public RequisitoNegativo(Requisitavel... requisitos) {
        super(requisitos);
    }

    @Override
    public boolean check(NPC npc) {
        boolean possui;
        for(Requisitavel r: this.getRequisitos()) {
            possui = r.check(npc);

            if(possui)
                return false;
        }
        return true;
    }
}
