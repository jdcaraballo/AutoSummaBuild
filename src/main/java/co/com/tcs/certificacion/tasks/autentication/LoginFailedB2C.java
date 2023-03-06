package co.com.tcs.certificacion.tasks.autentication;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.certificacion.userinterfaces.LoginUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LoginFailedB2C implements Task {
    private final String user;
    private final String key;
    public LoginFailedB2C(String user, String key) {
        this.user = user;
        this.key = key;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isPresent(BOX_USER_BTOC),
                Click.on(BOX_USER_BTOC),
                Enter.theValue(user).into(BOX_USER_BTOC),
                Click.on(BOX_PASS_BTOC),
                Enter.theValue(key).into(BOX_PASS_BTOC),
                Wait.aTime(5000),
                WaitElement.isClickable(BTN_SIGN_IN_BTOC),
                Click.on(BTN_SIGN_IN_BTOC),
                Wait.aTime(5000));
    }
    public static LoginFailedB2C login(String user, String key) {
        return instrumented(LoginFailedB2C.class, user, key);
    }
}
