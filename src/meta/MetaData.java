package meta;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

//embeddable
public class MetaData {

    private Meta.State state;
    private LocalDateTime laatstGewijzigd;
    private UUID groupId;
    private Date begindatum;

    public Meta.State getState() {
        return state;
    }

    public void setState(Meta.State state) {
        this.state = state;
    }

    public LocalDateTime getLaatstGewijzigd() {
        return laatstGewijzigd;
    }

    public void setLaatstGewijzigd(LocalDateTime laatstGewijzigd) {
        this.laatstGewijzigd = laatstGewijzigd;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public Date getBegindatum() {
        return begindatum;
    }

    public void setBegindatum(Date begindatum) {
        this.begindatum = begindatum;
    }
}
