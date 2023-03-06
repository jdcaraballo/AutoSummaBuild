package co.com.tcs.certificacion.model.ipc_new.dtf_new;

import java.util.List;
import java.util.Map;

public class DatosIpcBuilder {

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

    public static DatosIpcBuilder con() {
        return new DatosIpcBuilder();
    }

    public DatosIpcBuilder name (List<Map<String, String>> datos) {
        this.name = datos.get(0).get("name");
        return this; }

    public DatosIpcBuilder mail (List<Map<String, String>> datos) {
        this.mail = datos.get(0).get("mail");
        return this;}

    public DatosIpcBuilder currentAdress (List<Map<String, String>> datos) {
        this.currentAdress = datos.get(0).get("currentAdress");
        return this; }

    public DatosIpcBuilder permanentAdress (List<Map<String, String>> datos) {
        this.permanentAdress = datos.get(0).get("permanentAdress");
        return this; }

    public CreateIpc build() {
        return new CreateIpc(this);
    }



}
