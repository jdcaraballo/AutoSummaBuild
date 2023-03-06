package co.com.tcs.certificacion.tasks;

import co.com.tcs.certificacion.interactions.SecondTabs;
import co.com.tcs.certificacion.interactions.Wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IntroDemoSite implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("Aquì va el target que abre la SecondTabs (INTRO_DEMO_SITE)"),
                Wait.aTime(15000),
                SecondTabs.secondTabs("ToolsQA"),
                //"ToolsQA" es el nombre de nombre de la SecondTabs

                Wait.aTime(5000)

        );
    }
    public static IntroDemoSite enPagina() {return instrumented(IntroDemoSite.class);}
}