package co.com.tcs.certificacion.tasks.autentication;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tcs.certificacion.userinterfaces.LogoutUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LogoutFromMenu implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.aTime(5000),
                WaitElement.isVisible(BTN_MODULO_BENEFITS),
                Click.on(BTN_MODULO_BENEFITS),
                Click.on(BTN_LOGOUT_FROM_SECOND_MENU),
                Wait.aTime(5000),
                Wait.aTime(3000),
                Click.on(BTN_LOGOUT_FROM_MENU),
                Wait.aTime(3000));
    }
    public static LogoutFromMenu logoutFromMenu() {
        return instrumented(LogoutFromMenu.class);
  }
}
