package co.com.tcs.certificacion.stepdefinitions.benefits.menu_roles_users;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.benefits.menu_roles_users_q.ValCreationRoleFailed;
import co.com.tcs.certificacion.questions.benefits.menu_roles_users_q.ValCreationRoleOk;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.benefits.menu_roles_users.AuditUserByFilter;
import co.com.tcs.certificacion.tasks.benefits.menu_roles_users.roles_management.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RolesManagementSteps {
    @Given("^que el Gestor Senior/Admin inicia la sesion con usuario (.*) con clave (.*)$")
    public void gestorAdminIniciaSesion(String user, String key) {
        theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @When("^el gestor/admin crea un nuevo rol de Admin (.*)$")
    public void elGestorCreaNuevoRolAdmin(String newAdminRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateAdminRole.createAdminRole(newAdminRole)
        );
    }
    @Then("^se vera nuevo rol en la pantalla$")
    public void seVeraNuevoRolAdminEnPantallaAdmin() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo rol de Gestor (.*)$")
    public void elGestorCreaRolGestor(String newGestorRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateGestorRole.createGestorRole(newGestorRole)
        );
    }
    @Then("^se vera nuevo rol en pantalla$")
    public void seVeraNuevoRolGestorEnPantallaGestor() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo rol de Auxiliar (.*)$")
    public void elGestorCreaNuevoRolDeAuxiliar(String newAuxiliarRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateAuxiliarRole.createAuxiliarRole(newAuxiliarRole)
        );
    }
    @Then("^se puede ver nuevo rol en la pantalla$")
    public void sePuedeVerUnNuevoRolAuxiliarEnLaPantallaAuxiliar() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo rol de Basic (.*)$")
    public void elGestorCreaRolBasic(String newBasicRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateBasicRole.createBasicRole(newBasicRole)
        );
    }
    @Then("^se podra ver nuevo rol en la pantalla$")
    public void sePodraVerNuevoRolEnPantallaBasic() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo rol de Otro (.*)$")
    public void elGestorCreaRolOtro(String newOtroRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateOtroRole.createOtroRole(newOtroRole)
        );
    }
    @Then("^se vera nuevo rol Otro en la pantalla$")
    public void seVeraNuevoRolOtroEnLaPantallaOtro() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo rol Null$")
    public void elGestorCreaRolNull() {
        theActorInTheSpotlight().attemptsTo(
                CreateNullRole.createNullRole()
        );
    }
    @Then("^se vera mensaje Este campo es obligatorio en la pantalla$")
    public void seVeraNuevoRolEnLaPantallaNull() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleFailed.inPage()));
    }
}