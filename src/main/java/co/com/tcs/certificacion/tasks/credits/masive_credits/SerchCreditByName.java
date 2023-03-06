package co.com.tcs.certificacion.tasks.credits.masive_credits;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.CheckCreditsByIdUser.BOX_CONSULTAR_CRED_NAME;
import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BTN_VER_CREDITOS_MASIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchCreditByName implements Task {
    private final String name;
    public SerchCreditByName(String name) {
        this.name = name;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_NAME),
                Click.on(BOX_CONSULTAR_CRED_NAME),
                Enter.theValue(name).into(BOX_CONSULTAR_CRED_NAME),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_NAME),
                Wait.aTime(5000));
    }
    public static SerchCreditByName serchCreditByName(String name) {
        return instrumented(SerchCreditByName.class, name);
  }
}
