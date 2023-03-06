package co.com.tcs.certificacion.questions.benefits.check_detail_benefit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.benefits.CheckDetailBenefitUser.VALIDATE_VIEW_DETAIL_BENEFIT;

public class ValidateCheckDetailBenefit implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if(VALIDATE_VIEW_DETAIL_BENEFIT.resolveFor(actor).isVisible())
        return true;
        return false;
    }
    public static ValidateCheckDetailBenefit inPage() {
        return new ValidateCheckDetailBenefit();
    }
}

