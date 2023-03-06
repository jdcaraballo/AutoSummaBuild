package co.com.tcs.certificacion.questions.benefits.menu_roles_users_q;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.VAL_ADD_ROLE_FAILED;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.VAL_ADD_ROLE_OK;

public class ValCreationRoleFailed implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_ADD_ROLE_FAILED.resolveFor(actor).isVisible())
            // Esta validación esta pendiente por el BUG que deja crear usuario sin Rol Asignado
            return false;
        return true;
    }
    public static ValCreationRoleFailed inPage() {
        return new ValCreationRoleFailed();
    }
}
