package co.com.tcs.certificacion.userinterfaces.credits;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DtfAddUser {
    public static final Target BTN_IN_PORTAL_CREDITOS=Target.the("Boton ingresar al portal CRÉDITOS").locatedBy("(//*[contains(text(),'Créditos')])[2]");
    public static final Target BTN_VER_TASA_DE_INTERES=Target.the("Boton ver tasas de interés").locatedBy("//*[@class='container']//*[contains(text(),'Indicadores tasas de interés')]");
    public static final Target BTN_INDICADORES_TASAS_INTERES=Target.the("Botón add new fee").locatedBy("//*[@class='container']//*[contains(text(),'Indicadores tasas de interés')]");
    public static final Target BTN_ADD_FEE_DTF=Target.the("Botón para agregar nueva DTF").locatedBy("(//*[contains(text(),'Agregar')])[2]");
//    public static final Target BOX_DESCRIPTION_FEE=Target.the("Caja para agregar Interés").located(By.id("description"));

    public static final Target BTN_AGREGAR_DTF=Target.the("Boton AGREGAR DTF").locatedBy("(//*[contains(text(),'Agregar')])[2]");
    public static final Target BTN_AGREGAR_DTF_FULL=Target.the("Boton AGREGAR DTF").locatedBy("(//*[@class='p-panel-content ng-tns-c33-0']//*[contains(.,'DTF')]//*[contains(.,'Agregar')])[10]");
    public static final Target VALIDATE_BOX_ADD_FEE=Target.the("Validar box para agregar fee").locatedBy("//*[contains(text(),'Agregar indicador de tasas par')]");
    public static final Target BOX_DESCRIPTION=Target.the("CAJA PARA AGREGAR DESCRIPCIÓN DE LA FEE").locatedBy("/html/body/app-root/app-skeleton/div/app-interests/div/p-dialog/div/div/div[3]/div[1]/input");
    public static final Target BOX_INITIAL_DATE=Target.the("CAJA FECHA INICIAL").locatedBy("(//*[@id='basic'])[1]");
    public static final Target BOX_FINAL_DATE=Target.the("CAJA FECHA FINAL").locatedBy("(//*[@id='basic'])[2]");
    public static final Target BOX_MONTH_NEXT=Target.the("Boton mes siguiente").locatedBy("//*[@class='p-datepicker-next-icon pi pi-chevron-right ng-tns-c67-6']");
    public static final Target BOX_ACTUAL_MONTH=Target.the("Mes actual").locatedBy("//*[contains(text(),'January')]");
    public static final Target DEC_MONTH=Target.the("Boton mes diciembre").locatedBy("//*[contains(text(),' Dec')]");
    public static final Target DEC_31=Target.the("Día 31").locatedBy("//*[contains(text(),' 31')]");
    public static final Target BOX_ADD_FEE_VALUE=Target.the("Cpara agregar valor del interés ").locatedBy("//*[@id='value']/span/input");
    public static final Target BOX_ADD_FEE=Target.the("CAJA AGREGAR FEE").locatedBy("//*[@class='p-inputnumber p-component']//*[@class='p-inputtext p-component p-element p-inputnumber-input']");
    public static final Target SAVE_FEE=Target.the("GUARDAR FEE").locatedBy("//*[contains(text(),'Guardar')]");
}
