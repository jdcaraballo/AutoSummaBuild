package co.com.tcs.certificacion.questions.benefits.check_detail_benefit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.benefits.CheckDetailBenefitUser.BTN_GENERAR_NOVEDADES;

public class ValEditFailedNegativeValueBenefit implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(BTN_GENERAR_NOVEDADES.resolveFor(actor).isVisible())
            return false;
         return true;
    }
    public static ValEditFailedNegativeValueBenefit inPage() {
        return new ValEditFailedNegativeValueBenefit();
    }
}