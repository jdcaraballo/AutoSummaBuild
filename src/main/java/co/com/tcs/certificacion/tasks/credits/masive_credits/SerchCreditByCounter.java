package co.com.tcs.certificacion.tasks.credits.masive_credits;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BOX_CONSULTAR_CRED_COUNTER;
import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BTN_VER_CREDITOS_MASIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchCreditByCounter implements Task {
    private final String counterCredit;

    public SerchCreditByCounter(String counterCredit) {
        this.counterCredit = counterCredit;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_COUNTER),
                Click.on(BOX_CONSULTAR_CRED_COUNTER),
                Enter.theValue(counterCredit).into(BOX_CONSULTAR_CRED_COUNTER),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COUNTER),
                Wait.aTime(5000));
    }
    public static SerchCreditByCounter serchCreditByCounter(String counterCredit) {
        return instrumented(SerchCreditByCounter.class, counterCredit);
  }

    }
