package co.com.tcs.certificacion.tasks.benefits.serch_detail_benefit;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tcs.certificacion.userinterfaces.benefits.CheckDetailBenefitUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;
public class ViewBenefitsByBenefitsTypeFilter implements Task {
    private final String benefitPolicy;
    public ViewBenefitsByBenefitsTypeFilter(String benefitPolicy) {
        this.benefitPolicy = benefitPolicy;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MODULO_BENEFICIOS),
                Click.on(BTN_MODULO_BENEFICIOS),
                WaitElement.isClickable(BTN_VER_HISTORICOS_BENEFICIOS),
                Click.on(BTN_VER_HISTORICOS_BENEFICIOS),
                Wait.aTime(5000),
                WaitElement.isClickable(BTN_DEPLOY_FILTER_BENEFITS),
                Click.on(BTN_DEPLOY_FILTER_BENEFITS),
                WaitElement.isClickable(FIELD_POLIZAS_BENEFITS),
                Click.on(FIELD_POLIZAS_BENEFITS),
                Enter.theValue(benefitPolicy).into(FIELD_POLIZAS_BENEFITS),
                Hit.the(ENTER).into(FIELD_POLIZAS_BENEFITS),
                Scroll.to(BTN_GENERAR_NOVEDADES),
                Click.on(CHECK_DETAILS_BENEFIT_USER),
//                Click.on(BTN_EDIT_BENEFIT_VALUE),
//                Click.on(BOX_EDIT_BENEFIT_VALUE),
//                Enter.theValue(editBenefitValue).into(BOX_EDIT_BENEFIT_VALUE),
//                Click.on(BTN_SAVE_RECORD),
//                WaitElement.isClickable(BTN_GENERAR_NOVEDADES),
//                Click.on(BTN_GENERAR_NOVEDADES),
                Wait.aTime(5000)
        );
    }
    public static ViewBenefitsByBenefitsTypeFilter viewBenefitsByBenefitsTypeFilter(String benefitPolicy) {
        return instrumented(ViewBenefitsByBenefitsTypeFilter.class, benefitPolicy);
  }
}
