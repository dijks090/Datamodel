package deelname;

import meta.Meta;
import meta.MetaData;
import meta.Metable;
import product.Product;
import waarde.Waarde;

import java.awt.print.PrinterJob;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Deelname implements Metable {

    public List<Waarde> aangepasteWaardes;
    public List<Product> afgenomenProducten;
    private MetaData meta;

    public Deelname(List<Waarde> aangepasteWaardes, List<Product> afgenomenProducten, Metable meta) {
        this.aangepasteWaardes = aangepasteWaardes;
        this.afgenomenProducten = afgenomenProducten;
        this.meta = new MetaData();
    }


    @Override
    public void setState(Meta.State newState) {
        meta.setState(newState);
    }

    @Override
    public Meta.State getState() {
        return meta.getState();
    }

    @Override
    public Date getBegindatum() {
        return meta.getBegindatum();
    }

    @Override
    public UUID getGroupId() {
        return meta.getGroupId();
    }
}
