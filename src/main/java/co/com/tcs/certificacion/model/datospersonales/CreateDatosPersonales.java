package co.com.tcs.certificacion.model.datospersonales;

public class CreateDatosPersonales {

    private final String name;
    private final String mail;
    private final String currentAdress;
    private final String permanentAdress;

    public CreateDatosPersonales(DatosPersonalesBuilder builder) {
        this.name = builder.getName();
        this.mail = builder.getMail();
        this.currentAdress = builder.getCurrentAdress();
        this.permanentAdress = builder.getPermanentAdress();
    }

    public String getName() {return name;}
    public String getMail() { return mail;}
    public String getCurrentAdress() {  return currentAdress;}
    public String getPermanentAdress() {  return permanentAdress;}


}
