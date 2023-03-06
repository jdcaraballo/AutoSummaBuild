package co.com.tcs.certificacion.questions.autentication;

import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.LoginUser.VALIDATE_ERROR_CREDENTIALS_BTOC;
public class ValidateFailedLoginBtoC implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VALIDATE_ERROR_CREDENTIALS_BTOC));
        return true;
    }
    public static ValidateFailedLoginBtoC inPage() {
        return new ValidateFailedLoginBtoC();
    }
}

