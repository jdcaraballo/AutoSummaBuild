package co.com.tcs.certificacion.questions.autentication;

import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.LogoutUser.VAL_LOGOUT;
public class ValidateLogoutDirAct implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VAL_LOGOUT));
        return true;

    }
    public static ValidateLogoutDirAct inPage() {
        return new ValidateLogoutDirAct();
    }
}

