package co.com.tcs.certificacion.setup.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetScenario {
    @Before
    public void prepararEscenario(){
        setTheStage(new OnlineCast());
        theActorCalled("Gestor");
    }
}
