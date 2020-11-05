package requisito;

import core.NPC;
import core.Requisitavel;
import core.Requisito;

public class RequisitoExclusivo extends Requisito {

    public RequisitoExclusivo(Requisitavel... requisitos) {
        super(requisitos);
    }

    @Override
    public boolean check(NPC npc) {
        boolean possui = false;
        for(Requisitavel req: this.getRequisitos()) {
            if(req.check(npc))
                if(possui)
                    return false;
                else
                    possui = true;
        }

        return true;
    }
}
