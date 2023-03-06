package co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RoleManagementUser {
    public static final Target BTN_ROLES_MENU=Target.the("Ingreso al Menú de Gestión de Roles").locatedBy("(//*[contains(text(),'Menú Roles')])[1]");
 public static final Target BTN_ADD_ROLE=Target.the("Botón para Agregar usuario").locatedBy("//*[@id='button-add' and @name='button-add']");
 public static final Target BOX_EDIT_NEW_ROLE=Target.the("Botón para Agregar usuario").located(By.id("description"));
 public static final Target BOX_EDIT_NEW_USER =Target.the("Caja texto para editar nuevo USUARIO").located(By.id("description"));
    public static final Target BTN_SAVE_ROLE=Target.the("Boton guardar Rol").locatedBy("//*[contains(text(),'Guardar')]");
    public static final Target FILTER_CHECK_ROLES=Target.the("Filtro para consultar Roles").locatedBy("(//*[@id='search-filter'])[3]");
    public static final Target VAL_ADD_ROLE_OK=Target.the("VAlidación de nuevo Rol creado OK").locatedBy("//*[contains(text(),'Este campo es obligatorio*')]");
    public static final Target VAL_ADD_ROLE_FAILED=Target.the("VAlidación de nuevo Rol creado FALLIDO").locatedBy("//*[contains(text(),'Este campo es obligatorio*')]");
}