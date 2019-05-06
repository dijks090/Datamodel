package deelname;

import meta.Meta;
import meta.MetaData;
import meta.Metable;
import product.Product;
import waarde.Waarde;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Deelname implements Metable {

    public List<Waarde> aangepasteWaardes;
    public List<Product> afgenomenProducten;
    private MetaData metaData;

    public Deelname(List<Waarde> aangepasteWaardes, List<Product> afgenomenProducten) {
        this.aangepasteWaardes = aangepasteWaardes;
        this.afgenomenProducten = afgenomenProducten;
        this.metaData = new MetaData();
    }

    @Override
    public void setState(Meta.State newState) {
        metaData.setState(newState);
    }

    @Override
    public Meta.State getState() {
        return metaData.getState();
    }

    @Override
    public Date getBegindatum() {
        return metaData.getBegindatum();
    }

    @Override
    public UUID getGroupId() {
        return metaData.getGroupId();
    }
}
