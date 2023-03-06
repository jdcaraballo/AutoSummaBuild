package co.com.tcs.certificacion.questions.autentication;

import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.LoginUser.VALIDATE_ERROR_CREDENTIALS_ACT_DIREC;
public class ValidateFailedLoginDirAct implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VALIDATE_ERROR_CREDENTIALS_ACT_DIREC));
        return true;
    }
    public static ValidateFailedLoginDirAct inPage() {
        return new ValidateFailedLoginDirAct();
    }
}

