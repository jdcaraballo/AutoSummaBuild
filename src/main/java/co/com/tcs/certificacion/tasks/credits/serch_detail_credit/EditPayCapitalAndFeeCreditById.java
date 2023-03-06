package co.com.tcs.certificacion.tasks.credits.serch_detail_credit;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;
public class EditPayCapitalAndFeeCreditById implements Task {

    private final String id;
    private final String feeApplied;
    private final String capitalApplied;

    public EditPayCapitalAndFeeCreditById(String id, String feeApplied, String capitalApplied) {
        this.id = id;
        this.feeApplied = feeApplied;
        this.capitalApplied = capitalApplied;
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
                Wait.aTime(2000),
                Scroll.to(SCROLL_UNTIL_PAYS_HISTORICS),
                Wait.aTime(2000),
                Click.on(ICON_PENCIL_EDIT_PAY),
                Click.on(BOX_FIELD_INTERES_APPLIED),
                Enter.theValue(feeApplied).into(BOX_FIELD_INTERES_APPLIED),
                Click.on(BOX_FIELD_CAPITAL_APPLIED),
                Enter.theValue(capitalApplied).into(BOX_FIELD_CAPITAL_APPLIED),
                Click.on(BTN_SAVE_VALUE_PAID),
                Wait.aTime(5000));
    }
    public static EditPayCapitalAndFeeCreditById serchDetailCreditById(String id, String feeApplied, String capitalPaplied) {
        return instrumented(EditPayCapitalAndFeeCreditById.class, id, feeApplied, capitalPaplied);
  }
}
