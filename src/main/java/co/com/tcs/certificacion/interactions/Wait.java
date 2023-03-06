package co.com.tcs.certificacion.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {

  private final int var;

  protected Wait(int var) {
    this.var = var;
  }

  public static Wait aTime(int var) {
    return instrumented(Wait.class, var);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    new InternalSystemClock().pauseFor(var);
  }
}
