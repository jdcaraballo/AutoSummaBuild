package co.com.tcs.certificacion.questions;

import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.credits.DtfAddUser.VALIDATE_BOX_ADD_FEE;
public class ValidateBoxAddFee implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VALIDATE_BOX_ADD_FEE));
        return true;

    }
    public static ValidateBoxAddFee inPage() {
        return new ValidateBoxAddFee();
    }
}

