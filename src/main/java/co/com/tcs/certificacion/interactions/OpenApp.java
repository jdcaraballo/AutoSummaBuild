package co.com.tcs.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenApp implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://app-expcolaborador-frontend-qa.azurewebsites.net")
        );
    }
    public static OpenApp inPage(){ return instrumented(OpenApp.class);
    }
}
