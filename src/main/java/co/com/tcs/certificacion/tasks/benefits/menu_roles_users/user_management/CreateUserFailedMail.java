package co.com.tcs.certificacion.tasks.benefits.menu_roles_users.user_management;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.BOX_EDIT_NEW_USER;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.FILTER_CHECK_ROLES;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUserFailedMail implements Task {
    private final String newFailedMailUser;
    private final String gestorRole;
    public CreateUserFailedMail(String newFailedMailUser, String gestorRole) {
        this.newFailedMailUser = newFailedMailUser;
        this.gestorRole = gestorRole;
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
                Enter.theValue(newFailedMailUser).into(BOX_EDIT_NEW_USER),
                WaitElement.isClickable(FILTER_CHECK_ROLES),
                Click.on(FILTER_CHECK_ROLES),
                Enter.theValue(gestorRole).into(FILTER_CHECK_ROLES),
                WaitElement.isClickable(SELECT_USER_ROL),
                Click.on(SELECT_USER_ROL),
                Click.on(BTN_SAVE_USER),
                Wait.aTime(5000)
        );
    }
    public static CreateUserFailedMail createUserFailedMail(String newFailedMailUser, String gestorRole) {
        return instrumented(CreateUserFailedMail.class, newFailedMailUser, gestorRole);
  }
}