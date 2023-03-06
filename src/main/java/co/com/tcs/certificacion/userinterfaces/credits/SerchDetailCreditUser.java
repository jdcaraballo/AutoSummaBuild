package co.com.tcs.certificacion.userinterfaces.credits;

import net.serenitybdd.screenplay.targets.Target;

public class SerchDetailCreditUser {

    public static final Target BTN_PRINCIAPAL_VER_CREDITOS=Target.the("BOTON PARA VER CREDITOS MASIVOS").locatedBy("//*[contains(text(),'Créditos')]");
    public static final Target BTN_VER_CREDITOS_MASIVOS=Target.the("BOTON PARA VER CREDITOS").locatedBy("//*[@class='container']//*[contains(text(),'Ver créditos')]");
    public static final Target BOX_CONSULTAR_CRED_COMPANIA=Target.the("BOX PARA VER POR COMPANIA").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[1]");
    public static final Target BOX_CONSULTAR_CRED_COMPANIA_FILLED=Target.the("BOX PARA VER POR COMPANIA LLENA").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[1]");

    public static final Target ICON_LUPA_WATCH_DETAIL=Target.the("ICONO VER DETALLES DEL CREDITO").locatedBy("//*[@class='p-button-icon pi pi-search']");
    public static final Target ICON_LUPA_WATCH_DETAIL_ALTER=Target.the("ICONO VER DETALLES DEL CREDITO").locatedBy("(//*[@type='button'] //*[@class='p-button-icon pi pi-search'])[1]");
    public static final Target SCROLL_UNTIL_PAYS_HISTORICS=Target.the("SCroll para bajar hasta Pagos históricos").locatedBy("//*[contains(text(),'Histórico de pagos')]");
    public static final Target ICON_PENCIL_EDIT_PAY=Target.the("Botón-Lapiz para editar abono ").locatedBy("//*[@icon='pi pi-pencil'] //*[@class='p-button-icon pi pi-pencil']");
    public static final Target BOX_FIELD_INTERES_APPLIED=Target.the("Caja para ingresar valor de Interés Aplicado").locatedBy("(//*[@class='p-inputnumber p-component']//*[@inputmode='decimal'])[1]");
    public static final Target BOX_FIELD_CAPITAL_APPLIED=Target.the("Caja para ingresar valor de Capital Aplicado").locatedBy("(//*[@class='p-inputnumber p-component']//*[@inputmode='decimal'])[2]");
    public static final Target BTN_SAVE_VALUE_PAID=Target.the("Botón para guardar el abono de capital/interés aplicado").locatedBy("//*[@class='p-button-icon pi pi-check']");
    public static final Target VALIDATION_VIEW_DETAIL_CREDIT=Target.the("Validación de vista de DETALLES DEL CREDITO").locatedBy("//*[contains(text(),'Nombres:')]");
    public static final Target VIEW_MASSIVE_CREDIT=Target.the("vista de  CREDITOS MASIVO").locatedBy("//*[@id='p-panel-7-titlebar' and contains(.,('Créditos'))]");


    public static final Target BOX_CONSULTAR_CRED_IDENTIFICATION=Target.the("BOX PARA VER POR IDENTIFICACION").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[2]");
    public static final Target BOX_CONSULTAR_CRED_NAME=Target.the("BOX PARA VER POR NOMBRE").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted' and @type='text'])[3]");
    public static final Target BOX_CONSULTAR_CRED_LASTNAME=Target.the("BOX PARA VER POR APELLIDO").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[4]");
    public static final Target BOX_CONSULTAR_CRED_COUNTER=Target.the("BOX PARA VER POR CONSECUTIVO").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[5]");
    public static final Target BOX_CONSULTAR_CURRENT_BALANCE=Target.the("BOX PARA VER POR SALDO FINAL").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[6]");
    public static final Target VALIDATE_CURRENT_BALANCE=Target.the("BOX PARA VALIDAR USUARIO POR SALDO ACTUAL").locatedBy("(//*[@class='p-element p-button-rounded p-button-success p-button-text p-button p-component p-button-icon-only'])[1]");
    public static final Target VALIDATE_FILLED_BOX=Target.the("VALIDAR LLENADO DE CAJA DE TEXTO ").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted p-filled'])");


    public static final Target SCROLL_END_PAGE=Target.the("Scroll hasta el final de la pagina").locatedBy("//*[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
    public static final Target SCROLL_START_PAGE=Target.the("Scroll para inicio de pagina").locatedBy("//*[@class='p-element p-sortable-column' and contains(.,'Compañia')]");
    public static final Target PANEL_MASIVE_CREDITS=Target.the("Panel de créditos masivos").locatedBy("//*[@id='pr_id_1']");
    public static final Target VALIDATE_EXISTING_RECORD=Target.the("Validación de registro existente").locatedBy("(//*[@class='p-button-icon pi pi-search'])[1]");


}
