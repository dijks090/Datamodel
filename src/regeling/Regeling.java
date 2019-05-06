package regeling;

import meta.Meta;
import meta.MetaData;
import meta.Metable;
import product.Product;
import waarde.Waarde;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Regeling implements Metable {

    private List<Premie> premies;
    private List<DeelnameVoorwaarde> deelnameVoorwaardes;
    private List<Waarde> waardes;
    private List<Product> producten;
    // @Embeddable
    private MetaData meta = new MetaData();

    public Regeling(List<Premie> premies
            , List<DeelnameVoorwaarde> deelnameVoorwaardes
            , List<Waarde> waardes
            , List<Product> producten) {
        this.premies = premies;
        this.deelnameVoorwaardes = deelnameVoorwaardes;
        this.waardes = waardes;
        this.producten = producten;
    }

    public Regeling() {

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
