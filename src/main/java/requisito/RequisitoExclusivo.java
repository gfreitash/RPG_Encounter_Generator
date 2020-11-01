package requisito;

import core.NPC;
import core.Requisito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RequisitoExclusivo implements Requisito {
    private final List<Requisito> requisitos;

    public RequisitoExclusivo(Requisito ... requisitos) {
        this.requisitos = new ArrayList<>();
        Collections.addAll(this.requisitos, requisitos);
    }

    @Override
    public List<Requisito> getRequisito() {
        return requisitos;
    }

    @Override
    public boolean check(NPC npc) {
        boolean possui = false;
        for(Requisito req: requisitos) {
            if(req.check(npc))
                if(possui)
                    return false;
                else
                    possui = true;
        }

        return true;
    }
}
