package waarde;

import java.math.BigDecimal;

public class Waarde {

    private String parameterCode;
    private BigDecimal waarde;
    private boolean aanpasbaar;
    private String type;

    public Waarde(String parameterCode, BigDecimal waarde, boolean aanpasbaar, String type) {
        this.parameterCode = parameterCode;
        this.waarde = waarde;
        this.aanpasbaar = aanpasbaar;
        this.type = type;
    }

    public String getParameterCode() {
        return parameterCode;
    }

    public void setParameterCode(String parameterCode) {
        this.parameterCode = parameterCode;
    }

    public BigDecimal getWaarde() {
        return waarde;
    }

    public void setWaarde(BigDecimal waarde) {
        this.waarde = waarde;
    }

    public boolean isAanpasbaar() {
        return aanpasbaar;
    }

    public void setAanpasbaar(boolean aanpasbaar) {
        this.aanpasbaar = aanpasbaar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
