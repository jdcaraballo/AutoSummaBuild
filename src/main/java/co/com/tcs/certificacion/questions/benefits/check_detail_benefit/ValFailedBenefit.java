package co.com.tcs.certificacion.questions.benefits.check_detail_benefit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.benefits.CheckDetailBenefitUser.*;
public class ValFailedBenefit implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VALIDATE_NO_BENEFITS_RECORD.resolveFor(actor).isVisible())
            return true;
        return false;
    }
    public static ValFailedBenefit inPage() {
        return new ValFailedBenefit();
    }
}