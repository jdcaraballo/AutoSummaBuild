package co.com.tcs.certificacion.tasks.benefits.menu_roles_users.user_management;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.*;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAuxiliarUserRole implements Task {
    private final String newAuxiliarUser;
    private final String auxiliarRole;
    public CreateAuxiliarUserRole(String newAuxiliarUser, String auxiliarRole) {
        this.newAuxiliarUser = newAuxiliarUser;
        this.auxiliarRole = auxiliarRole;
}

@Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_SECURITY_MENU),
                Click.on(BTN_SECURITY_MENU),
                WaitElement.isClickable(BTN_USERS_MENU),
                Click.on(BTN_USERS_MENU),
                WaitElement.isClickable(BTN_ADD_USER),
                Click.on(BTN_ADD_USER),
                WaitElement.isClickable(BOX_EDIT_NEW_USER),
                Click.on(BOX_EDIT_NEW_USER),
                Enter.theValue(newAuxiliarUser).into(BOX_EDIT_NEW_USER),
                WaitElement.isClickable(FILTER_CHECK_ROLES),
                Click.on(FILTER_CHECK_ROLES),
                Enter.theValue(auxiliarRole).into(FILTER_CHECK_ROLES),
                WaitElement.isClickable(SELECT_USER_ROL),
                Click.on(SELECT_USER_ROL),
                Click.on(BTN_SAVE_USER),
                Wait.aTime(5000)
        );
    }
    public static CreateAuxiliarUserRole createNewAuxiliarUser(String newAuxiliarUser, String auxiliarRole) {
        return instrumented(CreateAuxiliarUserRole.class, newAuxiliarUser, auxiliarRole);
  }
}