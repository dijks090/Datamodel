package contract;

import meta.Meta;
import meta.MetaData;
import meta.Metable;
import product.Product;
import waarde.Waarde;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Contract implements Metable {

    public List<Waarde> aangepasteWaardes;
    public List<Product> gekozenProducten;
    private MetaData meta =new MetaData();

    public Contract(List<Waarde> aangepasteWaardes, List<Product> gekozenProducten, Metable meta) {
        this.aangepasteWaardes = aangepasteWaardes;
        this.gekozenProducten = gekozenProducten;
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
