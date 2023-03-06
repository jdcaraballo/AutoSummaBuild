package co.com.tcs.certificacion.tasks.benefits.menu_roles_users.roles_management;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.*;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class CreateAdminRole implements Task {
    private final String newAdminRole;
    public CreateAdminRole(String newAdminRole) {
        this.newAdminRole = newAdminRole;
}

@Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_SECURITY_MENU),
                Click.on(BTN_SECURITY_MENU),
                WaitElement.isClickable(BTN_ROLES_MENU),
                Click.on(BTN_ROLES_MENU),
                WaitElement.isClickable(BTN_ADD_ROLE),
                Click.on(BTN_ADD_ROLE),
                WaitElement.isClickable(BOX_EDIT_NEW_ROLE),
                Click.on(BOX_EDIT_NEW_ROLE),
                Enter.theValue(newAdminRole).into(BOX_EDIT_NEW_ROLE),
                Click.on(BTN_SAVE_ROLE),
                Wait.aTime(5000)
        );
    }
    public static CreateAdminRole createAdminRole(String newAdminRole) {
        return instrumented(CreateAdminRole.class, newAdminRole);
  }
}