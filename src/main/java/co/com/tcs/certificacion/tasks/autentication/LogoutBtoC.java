package co.com.tcs.certificacion.tasks.autentication;

import co.com.tcs.certificacion.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tcs.certificacion.userinterfaces.LogoutUser.BTN_LOGOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LogoutBtoC implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.aTime(5000),
                Click.on(BTN_LOGOUT),

                Wait.aTime(3000));
    }
    public static LogoutBtoC logoutFromBtoC() {
        return instrumented(LogoutBtoC.class);
  }


    }
