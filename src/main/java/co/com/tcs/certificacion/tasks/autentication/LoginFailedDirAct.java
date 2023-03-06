package co.com.tcs.certificacion.tasks.autentication;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.certificacion.userinterfaces.LoginUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LoginFailedDirAct implements Task {
    private final String user;
    private final String key;
    public LoginFailedDirAct(String user, String key) {
        this.user = user;
        this.key = key;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CEMENTOS),
                WaitElement.isPresent(BOX_USER),
                Click.on(BOX_USER),
                Enter.theValue(user).into(BOX_USER),
                Click.on(BTN_NEXT),
                WaitElement.isPresent(BOX_PASS),
                Click.on(BOX_PASS),
                Enter.theValue(key).into(BOX_PASS),
                Click.on(BTN_SIGN_IN),
                Wait.aTime(1000));
    }
    public static LoginFailedDirAct login(String user, String key) {
        return instrumented(LoginFailedDirAct.class, user, key);
  }
}
