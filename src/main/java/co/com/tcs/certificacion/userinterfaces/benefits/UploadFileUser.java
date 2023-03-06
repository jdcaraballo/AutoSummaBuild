package co.com.tcs.certificacion.userinterfaces.benefits;

import net.serenitybdd.screenplay.targets.Target;

public class UploadFileUser {
    public static final Target BTON_BENEFITS_MODUL=Target.the("Boton ingresar al portal CRÉDITOS").locatedBy("//*[@class='container']//*[contains(text(),'Beneficios')]");
    public static final Target BTN_LOAD_CURRENT_BENEFITS=Target.the("Boton ingresar al portal CRÉDITOS").locatedBy("//*[@class='container']//*[contains(text(),'Cargar beneficios')]");
    public static final Target DROPDOWN_SELECT_TYPE_BENEFIT=Target.the("Boton ingresar al portal CRÉDITOS").locatedBy("//*[contains(text(),'Selecciona el tipo de plantilla')]");
    public static final Target OPTION_AUXILIOS=Target.the("opción auxilios").locatedBy("//*[contains(text(),'Auxilios')]");
    public static final Target OPTION_POLIZAS=Target.the("Opción pólizas").locatedBy("//*[contains(text(),'Pólizas')]");
    public static final Target BTN_SELECT_FILE=Target.the("Botón seleccionar archivo").locatedBy("//*[contains(text(),'Arrastra o Selecciona un archivo aquí')]");
    public static final Target BTN_SEND=Target.the("Boton Enviar").locatedBy("//*[contains(text(),'Enviar ')]");

}
