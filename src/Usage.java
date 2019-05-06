import meta.Meta;
import meta.Metable;
import regeling.Regeling;

import java.util.List;

public class Usage {

    public void zoekAPI() {

        List<Regeling> regelingList = repo.findAll();
        Meta<Regeling> meta = new Meta<>(regelingList);
        boolean active = meta.hasActiveState();
        Regeling regeling = meta.createInConceptVersie();
        meta.setNaarState(regeling, Meta.State.DEFINITIEF);
    }
}
