package co.com.tcs.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LogoutUser {
    public static final Target BTN_LOGOUT=Target.the("Botón Logout").locatedBy("//*[@src='/assets/icons/logout.png']");
    public static final Target BTN_LOGOUT_FROM_MENU=Target.the("Botón Logout desde el menu").locatedBy("//*[contains(text(),'Salir')]");
    public static final Target BTN_MODULO_BENEFITS=Target.the("Botón INN beneficios ").locatedBy("(//*[contains(text(),'Beneficios')])[1]");
    public static final Target VAL_LOGOUT=Target.the("Validar Logout").locatedBy("//*[@id='Cementos']");
    public static final Target BTN_LOGOUT_FROM_SECOND_MENU=Target.the(" Logout desde el Emnu secundario").locatedBy("//*[@src='/assets/icons/sidebarButton.png']");

}
