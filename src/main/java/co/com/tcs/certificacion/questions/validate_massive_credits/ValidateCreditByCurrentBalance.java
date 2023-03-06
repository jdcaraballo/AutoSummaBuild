package co.com.tcs.certificacion.questions.validate_massive_credits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.VALIDATE_CURRENT_BALANCE;
public class ValidateCreditByCurrentBalance implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATE_CURRENT_BALANCE.resolveFor(actor).isVisible())
        return true;
        return false;
    }
    public static ValidateCreditByCurrentBalance inPage() {
        return new ValidateCreditByCurrentBalance();
    }
}

