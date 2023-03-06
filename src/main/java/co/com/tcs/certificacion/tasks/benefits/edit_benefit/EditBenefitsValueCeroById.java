package co.com.tcs.certificacion.tasks.benefits.edit_benefit;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tcs.certificacion.userinterfaces.benefits.CheckDetailBenefitUser.*;
import static co.com.tcs.certificacion.userinterfaces.benefits.EditBenefitUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class EditBenefitsValueCeroById implements Task {
    private final String cedulaFilter;
    private final String editBenefitCeroValue;
    public EditBenefitsValueCeroById(String cedulaFilter, String editBenefitCeroValue) {
        this.cedulaFilter = cedulaFilter;
        this.editBenefitCeroValue = editBenefitCeroValue;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MODULO_BENEFICIOS),
                Click.on(BTN_MODULO_BENEFICIOS),
                WaitElement.isClickable(BTN_VER_HISTORICOS_BENEFICIOS),
                Click.on(BTN_VER_HISTORICOS_BENEFICIOS),
                Wait.aTime(10000),
                WaitElement.isClickable(BTN_DEPLOY_FILTER_BENEFITS),
                Click.on(BTN_DEPLOY_FILTER_BENEFITS),                WaitElement.isClickable(FIELD_CEDULA_BENEFITS),
                Click.on(FIELD_CEDULA_BENEFITS),
                Enter.theValue(cedulaFilter).into(FIELD_CEDULA_BENEFITS),
                Hit.the(ENTER).into(FIELD_CEDULA_BENEFITS),
                Wait.aTime(10000),
                WaitElement.isClickable(BTN_EDIT_BENEFIT_VALUE),
                Click.on(BTN_EDIT_BENEFIT_VALUE),
                WaitElement.isClickable(BOX_EDIT_BENEFIT_VALUE),
                Click.on(BOX_EDIT_BENEFIT_VALUE),
                Enter.theValue(editBenefitCeroValue).into(BOX_EDIT_BENEFIT_VALUE),
                Click.on(BTN_SAVE_RECORD),
                WaitElement.isClickable(BTN_GENERAR_NOVEDADES),
                Click.on(BTN_GENERAR_NOVEDADES),
                Wait.aTime(5000)
        );
    }
    public static EditBenefitsValueCeroById editBenefitsValueCeroById(String cedulaFilter, String editBenefitCeroValue) {
        return instrumented(EditBenefitsValueCeroById.class, cedulaFilter, editBenefitCeroValue);
  }
}