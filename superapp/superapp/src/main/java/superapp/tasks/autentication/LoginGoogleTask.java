package superapp.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static superapp.userinterfaces.autenticacion.LoginPage.*;
import static superapp.userinterfaces.home.HomePage.LBL_USUARIO_GOOGLE;
import static superapp.userinterfaces.home.PerfilPage.BTN_INICIAR_SESION;

public class LoginGoogleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitElement.isClickable(BTN_INICIAR_SESION),
                //Click.on(BTN_INICIAR_SESION),
                //Scroll.scrollUnaVista(),
                WaitElement.isPresente(BTN_GOOGLE),
                Click.on(BTN_GOOGLE),
                WaitElement.isClickable(CUENTA_GOOGLE),
                Click.on(CUENTA_GOOGLE),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(LBL_USUARIO_GOOGLE)
        );

    }

    public static LoginGoogleTask iniciarSesionConGoogle() {
        return instrumented(LoginGoogleTask.class);
    }
}
