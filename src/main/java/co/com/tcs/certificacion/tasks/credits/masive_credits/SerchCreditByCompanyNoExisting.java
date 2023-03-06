package co.com.tcs.certificacion.tasks.credits.masive_credits;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BOX_CONSULTAR_CRED_COMPANIA;
import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.BTN_VER_CREDITOS_MASIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;
public class SerchCreditByCompanyNoExisting implements Task {
    private final String companyNoOk;

    public SerchCreditByCompanyNoExisting(String companyNoOk) {
        this.companyNoOk = companyNoOk;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(BOX_CONSULTAR_CRED_COMPANIA),
                Enter.theValue(companyNoOk).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COMPANIA),
                Wait.aTime(5000));
    }
    public static SerchCreditByCompanyNoExisting serchCreditsNoOk(String companyNoOk) {
        return instrumented(SerchCreditByCompanyNoExisting.class, companyNoOk);
  }
}
