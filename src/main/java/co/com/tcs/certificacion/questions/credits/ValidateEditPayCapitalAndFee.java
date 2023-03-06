package co.com.tcs.certificacion.questions.credits;

import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.credits.SerchDetailCreditUser.ICON_PENCIL_EDIT_PAY;

public class ValidateEditPayCapitalAndFee implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(ICON_PENCIL_EDIT_PAY));
        return true;
    }
    public static ValidateEditPayCapitalAndFee inPage() {
        return new ValidateEditPayCapitalAndFee();
    }
}

