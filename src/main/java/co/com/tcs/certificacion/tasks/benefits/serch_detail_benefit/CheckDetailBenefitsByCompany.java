package co.com.tcs.certificacion.tasks.benefits.serch_detail_benefit;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.tcs.certificacion.userinterfaces.benefits.CheckDetailBenefitUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class CheckDetailBenefitsByCompany implements Task {
    private final String companyBenefits;

    public CheckDetailBenefitsByCompany(String companyBenefits) {
        this.companyBenefits = companyBenefits;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MODULO_BENEFICIOS),
                Click.on(BTN_MODULO_BENEFICIOS),
                WaitElement.isClickable(BTN_VER_HISTORICOS_BENEFICIOS),
                Click.on(BTN_VER_HISTORICOS_BENEFICIOS),
                WaitElement.isClickable(BTN_DEPLOY_FILTER_BENEFITS),
                Click.on(BTN_DEPLOY_FILTER_BENEFITS),
                Wait.aTime(5000),
                WaitElement.isClickable(FIELD_COMPANY_BENEFITS),
                Click.on(FIELD_COMPANY_BENEFITS),
                Enter.theValue(companyBenefits).into(FIELD_COMPANY_BENEFITS),
                Hit.the(ENTER).into(FIELD_COMPANY_BENEFITS),
                WaitElement.isClickable(CHECK_DETAILS_BENEFIT_USER),
                Click.on(CHECK_DETAILS_BENEFIT_USER),
                Wait.aTime(5000)
        );
    }
    public static CheckDetailBenefitsByCompany checkDetailBenefitsByCompanyBenefits(String companyBenefits) {
        return instrumented(CheckDetailBenefitsByCompany.class, companyBenefits);
  }
}
