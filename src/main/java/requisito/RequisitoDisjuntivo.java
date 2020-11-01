package requisito;

import core.NPC;
import core.Requisito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RequisitoDisjuntivo implements Requisito {
    private final List<Requisito> requisitos;

    public RequisitoDisjuntivo(Requisito ... requisitos) {
        this.requisitos = new ArrayList<>();
        Collections.addAll(this.requisitos, requisitos);
    }

    @Override
    public List<Requisito> getRequisito() {
        return requisitos;
    }

    @Override
    public boolean check(NPC npc) {
        for(Requisito req: requisitos) {
            if(req.check(npc))
                return true;
        }

        return false;
    }
}
