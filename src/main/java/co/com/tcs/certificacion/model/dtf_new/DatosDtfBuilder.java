package co.com.tcs.certificacion.model.dtf_new;

import java.util.List;
import java.util.Map;

public class DatosDtfBuilder {

    private String description;
    private String initialDate;
    private String finalDate;
    private String feeValue;

    public String getDescription() {
        return description;
    }
    public String getInitialDate() {
        return initialDate;
    }
    public String getFinalDate() {return finalDate; }
    public String getFeeValue() {return feeValue; }

    public static DatosDtfBuilder con() {
        return new DatosDtfBuilder();
    }

    public DatosDtfBuilder description (List<Map<String, String>> datos) {
        this.description = datos.get(0).get("description");
        return this; }

    public DatosDtfBuilder initialDate (List<Map<String, String>> datos) {
        this.initialDate = datos.get(0).get("initialDate");
        return this;}

    public DatosDtfBuilder finalDate (List<Map<String, String>> datos) {
        this.finalDate = datos.get(0).get("finalDate");
        return this; }

    public DatosDtfBuilder feeValue (List<Map<String, String>> datos) {
        this.feeValue = datos.get(0).get("feeValue");
        return this; }

    public CreateDtf build() {
        return new CreateDtf(this);
    }

}
