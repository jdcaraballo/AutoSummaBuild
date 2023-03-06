package co.com.tcs.certificacion.questions.benefits.menu_roles_users_q;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.VAL_CREATE_USER_FAILED;
import static co.com.tcs.certificacion.userinterfaces.benefits.menu_role_user.SecurityMenuUser.VAL_CREATE_USER_OK;

public class ValCreationUserFailed implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_CREATE_USER_FAILED.resolveFor(actor).isVisible())
            return false;
        return true;
    }
    public static ValCreationUserFailed inPage() {
        return new ValCreationUserFailed();
    }
}