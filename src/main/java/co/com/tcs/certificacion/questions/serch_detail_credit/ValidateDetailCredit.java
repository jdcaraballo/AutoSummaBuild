package co.com.tcs.certificacion.questions.serch_detail_credit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.VALIDATION_VIEW_DETAIL_CREDIT;
public class ValidateDetailCredit implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATION_VIEW_DETAIL_CREDIT.resolveFor(actor).isVisible())
        return true;
        return false;

    }
    public static ValidateDetailCredit inPage() {
        return new ValidateDetailCredit();
    }
}

