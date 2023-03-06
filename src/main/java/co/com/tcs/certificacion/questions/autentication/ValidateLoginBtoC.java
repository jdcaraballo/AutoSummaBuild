package co.com.tcs.certificacion.questions.autentication;

import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.LoginUser.VAL_LOGIN;
public class ValidateLoginBtoC implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VAL_LOGIN));
        return true;

    }
    public static ValidateLoginBtoC inPage() {
        return new ValidateLoginBtoC();
    }
}

