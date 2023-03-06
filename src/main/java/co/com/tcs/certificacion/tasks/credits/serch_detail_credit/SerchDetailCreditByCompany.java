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

public class SerchDetailCreditByCompany implements Task {
    private final String company;

    public SerchDetailCreditByCompany(String company) {
        this.company = company;
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_PRINCIAPAL_VER_CREDITOS),
                Click.on(BTN_PRINCIAPAL_VER_CREDITOS),
                WaitElement.isClickable(BTN_VER_CREDITOS_MASIVOS),
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                Wait.aTime(15000),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(BOX_CONSULTAR_CRED_COMPANIA),
                Enter.theValue(company).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(2000),
//                Scroll.to(SCROLL_UNTIL_PAYS_HISTORICS),
//                Wait.aTime(2000),
                Wait.aTime(5000));
    }
    public static SerchDetailCreditByCompany serchDetailCreditByCompany(String company) {
        return instrumented(SerchDetailCreditByCompany.class, company);
  }


}
