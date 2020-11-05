package requisito;

import core.NPC;
import core.Requisitavel;
import core.Requisito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RequisitoDisjuntivo extends Requisito {

    public RequisitoDisjuntivo(Requisitavel... requisitos) {
        super(requisitos);
    }

    @Override
    public boolean check(NPC npc) {
        for(Requisitavel req: this.getRequisitos()) {
            if(req.check(npc))
                return true;
        }

        return false;
    }
}
