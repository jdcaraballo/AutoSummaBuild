package co.com.tcs.certificacion.tasks.credits.dtf_add_new_fee;

import co.com.tcs.certificacion.interactions.Wait;
import co.com.tcs.certificacion.interactions.WaitElement;
import co.com.tcs.certificacion.model.dtf_new.CreateDtf;
import co.com.tcs.certificacion.model.dtf_new.DatosDtfBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static co.com.tcs.certificacion.userinterfaces.credits.DtfAddUser.*;
import static java.awt.Event.ENTER;
import static java.awt.Event.KEY_PRESS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DatosDtf2023 implements Task {
    public final CreateDtf createDtf;

    public DatosDtf2023(CreateDtf createDtf) {
        this.createDtf = createDtf;
    }

    public static DatosDtf2023 inPage (DatosDtfBuilder createDtf){
       return instrumented(DatosDtf2023.class, createDtf.build());
    }
//
//    public DatosDtf2023(CreateDtf createDtf) {
//        this.createDtf = createDtf;
//    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.aTime(5000),
                WaitElement.isVisible(BTN_IN_PORTAL_CREDITOS),
                Click.on(BTN_IN_PORTAL_CREDITOS),
                WaitElement.isVisible(BTN_VER_TASA_DE_INTERES),
                Click.on(BTN_VER_TASA_DE_INTERES),
                Wait.aTime(5000),

                WaitElement.isVisible(BTN_AGREGAR_DTF),
                Click.on(BTN_AGREGAR_DTF),
//                WaitElement.isVisible(VALIDATE_BOX_ADD_FEE),
                Wait.aTime(5000),
//                SecondTabs.a("Agregar indicador de tasas para DTF"),
                WaitElement.isVisible(BOX_DESCRIPTION),
                Click.on(BOX_DESCRIPTION),
                Enter.theValue(createDtf.getDescription()).into(BOX_DESCRIPTION),
//                Enter.theValue(createDtf.getDescription()).into(BOX_DESCRIPTION),
                Click.on(BOX_INITIAL_DATE),
                Enter.theValue(createDtf.getInitialDate()).into(BOX_INITIAL_DATE),
                Hit.the(Keys.ENTER).into(BOX_INITIAL_DATE),
                Click.on(BOX_FINAL_DATE),

                Enter.theValue(createDtf.getFinalDate()).into(BOX_FINAL_DATE),
                Hit.the(Keys.ENTER).into(BOX_FINAL_DATE),

//                Click.on(BOX_ACTUAL_MONTH),
//                Click.on(DEC_MONTH),
//                Click.on(DEC_31),
//                Wait.aTime(1000),


                Click.on(BOX_ADD_FEE_VALUE),
                Enter.theValue(createDtf.getFeeValue()).into(BOX_ADD_FEE_VALUE),
                Click.on(SAVE_FEE),
                Wait.aTime(10000)
        );
    }
}
