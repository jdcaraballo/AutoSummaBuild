package co.com.tcs.certificacion.model.datospersonales;

import java.util.List;
import java.util.Map;

public class DatosPersonalesBuilder {

    private String name;
    private String mail;
    private String currentAdress;
    private String permanentAdress;

    public String getName() {
        return name;
    }
    public String getMail() {
        return mail;
    }
    public String getCurrentAdress() {return currentAdress; }
    public String getPermanentAdress() {return permanentAdress; }

    public static DatosPersonalesBuilder con() {
        return new DatosPersonalesBuilder();
    }

    public DatosPersonalesBuilder name (List<Map<String, String>> datos) {
        this.name = datos.get(0).get("name");
        return this; }

    public DatosPersonalesBuilder mail (List<Map<String, String>> datos) {
        this.mail = datos.get(0).get("mail");
        return this;}

    public DatosPersonalesBuilder currentAdress (List<Map<String, String>> datos) {
        this.currentAdress = datos.get(0).get("currentAdress");
        return this; }

    public DatosPersonalesBuilder permanentAdress (List<Map<String, String>> datos) {
        this.permanentAdress = datos.get(0).get("permanentAdress");
        return this; }

    public CreateDatosPersonales build() {
        return new CreateDatosPersonales(this);
    }



}
