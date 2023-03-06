package co.com.tcs.certificacion.tasks.credits.masive_credits;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BOX_CONSULTAR_CRED_LASTNAME;
import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BTN_VER_CREDITOS_MASIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchCreditByLastName implements Task {
    private final String lastName;

    public SerchCreditByLastName(String lastName) {
        this.lastName = lastName;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_LASTNAME),
                Click.on(BOX_CONSULTAR_CRED_LASTNAME),
                Enter.theValue(lastName).into(BOX_CONSULTAR_CRED_LASTNAME),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_LASTNAME),
                Wait.aTime(5000));
    }
    public static SerchCreditByLastName serchCreditByLastName(String lastName) {
        return instrumented(SerchCreditByLastName.class, lastName);
  }
}
