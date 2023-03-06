package co.com.tcs.certificacion.userinterfaces.benefits;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditBenefitUser {

    public static final Target BTN_EDIT_BENEFIT_VALUE=Target.the("Botón editar monto del beneficio").located(By.id("button-edit"));
    public static final Target BOX_EDIT_BENEFIT_VALUE=Target.the("Caja  editar monto del beneficio").located(By.id("selected-value"));
    public static final Target BTN_SAVE_RECORD=Target.the("Botón editar monto del beneficio").located(By.id("buttton-edit-register"));



}
