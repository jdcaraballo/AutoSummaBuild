package co.com.tcs.certificacion.tasks.upload_files;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Optional;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectList implements Interaction {

  private final String value;
  private final Target target;
  private boolean isButton = false;

  public SelectList(String value, Target target) {
    super();
    this.value = value;
    this.target = target;
  }

  public SelectList(String value, Target target, Boolean isButton) {
    super();
    this.value = value;
    this.target = target;
    this.isButton = isButton;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    Optional<WebElementFacade> itemOptional =
        target
            .resolveAllFor(actor)
            .stream()
            .filter(item -> item.getText().toLowerCase().contains(value.toLowerCase()))
            .findFirst();
    WebElementFacade itemFound = itemOptional.orElseThrow(() -> new RuntimeException(""));
    actor.attemptsTo(Scroll.to(itemFound));

    if (isButton) {
      itemFound.find(By.cssSelector("button")).click();
    } else {
      itemFound.click();
    }
  }

  public static Performable anOpcion(String value, Target target) {
    return instrumented(SelectList.class, value, target);
  }

  public static Performable anOpcion(String value, Target target, Boolean isButton) {
    return instrumented(SelectList.class, value, target, isButton);
  }
}
