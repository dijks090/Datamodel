package meta;

import java.util.Date;
import java.util.UUID;

public interface Metable {

    void setState(Meta.State newState);

    Meta.State getState();

    Date getBegindatum();

    UUID getGroupId();

}
