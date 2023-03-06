package co.com.tcs.certificacion.tasks.credits.serch_detail_credit;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchDetailCreditByLastName implements Task {
    private final String lastName;
    public SerchDetailCreditByLastName(String lastName) {
        this.lastName = lastName;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_PRINCIAPAL_VER_CREDITOS),
                Click.on(BTN_PRINCIAPAL_VER_CREDITOS),
                WaitElement.isClickable(BTN_VER_CREDITOS_MASIVOS),
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                Wait.aTime(15000),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_LASTNAME),
                Click.on(BOX_CONSULTAR_CRED_LASTNAME),
                Enter.theValue(lastName).into(BOX_CONSULTAR_CRED_LASTNAME),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_LASTNAME),
                Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(5000),
                Click.on(VALIDATION_VIEW_DETAIL_CREDIT));
    }
    public static SerchDetailCreditByLastName serchDetailCreditBylastName(String lastName) {
        return instrumented(SerchDetailCreditByLastName.class, lastName);
  }
}
