package co.com.tcs.certificacion.interactions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Present implements Task {
  Target element;

  public Present(Target element) {
    this.element = element;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(element, isPresent()).forNoMoreThan(30).seconds());
  }
}
