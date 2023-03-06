package co.com.tcs.certificacion.tasks.credits.masive_credits;

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

public class SerchCreditById implements Task {

    private final String id;

    public SerchCreditById(String id) {
        this.id = id;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_PRINCIAPAL_VER_CREDITOS),
                Click.on(BTN_PRINCIAPAL_VER_CREDITOS),
                WaitElement.isClickable(BTN_VER_CREDITOS_MASIVOS),
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                Wait.aTime(15000),
//                WaitElement.isClickable(BOX_CONSULTAR_CRED_IDENTIFICATION),
                Click.on(BOX_CONSULTAR_CRED_IDENTIFICATION),
                Enter.theValue(id).into(BOX_CONSULTAR_CRED_IDENTIFICATION),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_IDENTIFICATION),
                Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(5000));
    }
    public static SerchCreditById serchCreditById(String id) {
        return instrumented(SerchCreditById.class, id);
  }
    }
