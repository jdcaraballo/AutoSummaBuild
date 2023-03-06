package co.com.tcs.certificacion.tasks.benefits.menu_roles_users;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class AuditUserByFilter implements Task {
    private final String userByFilter;
    public AuditUserByFilter(String userByFilter) {
        this.userByFilter = userByFilter;
}    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_SECURITY_MENU),
                Click.on(BTN_SECURITY_MENU),
                WaitElement.isClickable(BTN_AUDIT_MENU),
                Click.on(BTN_AUDIT_MENU),
                WaitElement.isClickable(BOX_USER_FILTER),
                Click.on(BOX_USER_FILTER),

                Enter.theValue(userByFilter).into(BOX_USER_FILTER),
                Hit.the(ENTER).into(BOX_USER_FILTER),
//                WaitElement.isClickable(BTN_EDIT_BENEFIT_VALUE),
//                Click.on(BTN_EDIT_BENEFIT_VALUE),
//                Click.on(BOX_EDIT_BENEFIT_VALUE),
//                Enter.theValue(editBenefitValue).into(BOX_EDIT_BENEFIT_VALUE),
//                Click.on(BTN_SAVE_RECORD),
//                WaitElement.isClickable(BTN_GENERAR_NOVEDADES),
//                Click.on(BTN_GENERAR_NOVEDADES),
                Wait.aTime(5000)
        );
    }
    public static AuditUserByFilter auditUserByFilter(String userByFilter) {
        return instrumented(AuditUserByFilter.class, userByFilter);
  }
}
