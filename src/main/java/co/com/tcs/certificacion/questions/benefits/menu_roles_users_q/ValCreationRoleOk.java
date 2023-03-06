package co.com.tcs.certificacion.questions.benefits.menu_roles_users_q;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.RoleManagementUser.VAL_ADD_ROLE_OK;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.VAL_CREATE_USER_OK;

public class ValCreationRoleOk implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_ADD_ROLE_OK.resolveFor(actor).isVisible())
        return true;
        return false;
    }
    public static ValCreationRoleOk inPage() {
        return new ValCreationRoleOk();
    }
}
