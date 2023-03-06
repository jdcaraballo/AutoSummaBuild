package co.com.tcs.certificacion.stepdefinitions.benefits.menu_roles_users;

import co.com.tcs.certificacion.interactions.HomePage;
import co.com.tcs.certificacion.questions.benefits.menu_roles_users_q.ValCreationRoleFailed;
import co.com.tcs.certificacion.questions.benefits.menu_roles_users_q.ValCreationUserFailed;
import co.com.tcs.certificacion.questions.benefits.menu_roles_users_q.ValCreationUserOk;
import co.com.tcs.certificacion.tasks.autentication.LoginDirAct;
import co.com.tcs.certificacion.tasks.benefits.menu_roles_users.user_management.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserManagementSteps {
    @Given("^que el Gestor Senior/Admin inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesionEnLaPagina(String user, String key) {
        theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @When("^el gestor/administrador crea un nuevo usuario (.*) con rol de (.*)$")
    public void elCreaNuevoUsuario(String newAdminUser, String adminRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateAdminUserRole.createNewAdminUser(newAdminUser, adminRole)
        );
    }
    @Then("^se vera nuevo usuario en pantalla$")
    public void seVeranLogsEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValCreationUserOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo usuario (.*) con rol de (.*)$")
    public void elCreaNuevoUsuarioGestor(String newGestorUser, String gestorRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateGestorUserRole.createNewGestorUser(newGestorUser, gestorRole)
        );
    }
    @Then("^se vera nuevo usuario en la pantalla$")
    public void seVeraUsuarioEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValCreationUserOk.inPage()));
    }

    @When("^el gestor/admin crea nuevo usuario (.*) con rol de (.*)$")
    public void elCreaNuevoUsuarioAuxiliar(String newAuxiliarUser, String auxiliarRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateAuxiliarUserRole.createNewAuxiliarUser(newAuxiliarUser, auxiliarRole)
        );
    }
    @Then("^se puede ver nuevo usuario en la pantalla$")
    public void seVeraNuevoUsuarioAuxiliarEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValCreationUserOk.inPage()));
    }
    @When("^el gestor/admin crea un nuevo usuario (.*) con Multi Rol (.*) - (.*) - (.*)$")
    public void elCreaNuevoUsuarioMultiRol(String newMultiRoleUser, String gestorRole, String adminRole, String auxiliarRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateMultiRoleUser.createMultiRoleUser(newMultiRoleUser, gestorRole, adminRole, auxiliarRole)
        );
    }
    @Then("^se podra ver nuevo usuario en la pantalla$")
    public void seVeraNuevoUsuarioMultiRolEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValCreationUserOk.inPage()));
    }
    @When("^el gestor/admin intenta crear un nuevo usuario fallido (.*) con Rol (.*)$")
    public void elCreaNuevoUsuarioFailedRol(String newFailedUser, String gestorRole) {
        theActorInTheSpotlight().attemptsTo(
                CreateUserFailedMail.createUserFailedMail(newFailedUser, gestorRole)
        );
    }
    @Then("^se vera mensaje de error en la pantalla$")
    public void seVeraNuevoUsuarioFailedRolEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValCreationUserFailed.inPage()));
    }
    @When("^el gestor/admin intenta crear un nuevo usuario (.*) sin rol$")
    public void elCreaNuevoUsuarioNotRol(String newNotRoleUser) {
        theActorInTheSpotlight().attemptsTo(
                CreateUserNoRole.createUserNoRole(newNotRoleUser)
        );
    }
    @Then("^se vera mensaje de error en pantalla por ausencia de rol$")
    public void seVeraNuevoUsuarioNotRolEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValCreationRoleFailed.inPage()));
        // Esta validación esta pendiente por el BUG que deja crear usuario sin Rol Asignado

    }
}