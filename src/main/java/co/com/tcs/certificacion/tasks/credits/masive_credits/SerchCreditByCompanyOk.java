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
public class SerchCreditByCompanyOk implements Task {
    private final String company;

    public SerchCreditByCompanyOk(String company) {
        this.company = company;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_PRINCIAPAL_VER_CREDITOS),
                Click.on(BTN_PRINCIAPAL_VER_CREDITOS),
                Wait.aTime(10000),
                WaitElement.isClickable(BTN_VER_CREDITOS_MASIVOS),
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                WaitElement.isVisible(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(BOX_CONSULTAR_CRED_COMPANIA),
                Wait.aTime(10000),
                Enter.theValue(company).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COMPANIA),
                Wait.aTime(5000));
    }
    public static SerchCreditByCompanyOk serchCreditsOk(String company) {
        return instrumented(SerchCreditByCompanyOk.class, company);
  }


    }
