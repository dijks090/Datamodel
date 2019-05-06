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
    private MetaData metaData =new MetaData();

    public Contract(List<Waarde> aangepasteWaardes, List<Product> gekozenProducten) {
        this.aangepasteWaardes = aangepasteWaardes;
        this.gekozenProducten = gekozenProducten;
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
