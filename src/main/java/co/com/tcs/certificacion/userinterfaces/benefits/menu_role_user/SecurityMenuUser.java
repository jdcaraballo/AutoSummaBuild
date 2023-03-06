package co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecurityMenuUser {
    public static final Target BTN_SECURITY_MENU=Target.the("Ingreso al Menú de seguridad").locatedBy("(//*[@id='link-navigation-menu' and @name='link-navigation-menu'])[3]");
    public static final Target BTN_AUDIT_MENU=Target.the("Botón menú auditoría ").locatedBy("//*[contains(text(),'Menú auditoría')]");
    public static final Target BTN_USERS_MENU=Target.the("Botón menú Usuarios ").locatedBy("//*[contains(text(),'Menú usuarios')]");
    public static final Target BTN_ADD_USER =Target.the("Agregar usuario").locatedBy("//*[@id='button-add' and @name='button-add']");

    public static final Target SELECT_USER_ROL=Target.the("CheckBox Admin Rol").locatedBy("(//*[@class='p-checkbox-box p-component'])[4]");
    public static final Target CHECKBOX_ADMIN_ROLE=Target.the("CheckBox Admin Rol").locatedBy("(//*[@class='p-checkbox-box p-component'])[4]");
    public static final Target CHECKBOX_GESTOR_ROLE=Target.the("CheckBox Gestor Rol").locatedBy("(//*[@class='p-checkbox-box p-component'])[5]");
    public static final Target CHECKBOX_AUXILIAR_ROLE=Target.the("CheckBox Auxiliar Rol").locatedBy("(//*[@class='p-checkbox-box p-component'])[6]");
    public static final Target CHECKBOX_BASIC_ROLE=Target.the("CheckBox Basic Rol").locatedBy("(//*[@class='p-checkbox-box p-component'])[7]");
    public static final Target BTN_SAVE_USER=Target.the("Boton guardar usuario").locatedBy("(//*[@class='btn primary-button' and contains(text(),'Guardar')])[2]");
    public static final Target BOX_USER_FILTER=Target.the("Campo Filtro para consultar beneficiario").located(By.id("search-filter"));
    public static final Target VAL_CREATE_USER_OK=Target.the("Agregar usuario").locatedBy("(//*[@class='btn secondary-button-dialog' and contains(text(),'Cancelar')])[2]");
    public static final Target VAL_CREATE_USER_FAILED=Target.the("Validación Usuario erroneo").locatedBy("//*[contains(text(),'El email es inválido')]");

}