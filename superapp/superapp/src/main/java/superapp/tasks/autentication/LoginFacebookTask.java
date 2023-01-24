package superapp.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.waits.WaitElement;
import superapp.models.autenticacion.Credencial;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static superapp.userinterfaces.autenticacion.LoginPage.*;
import static superapp.userinterfaces.home.PerfilPage.BTN_INICIAR_SESION;

public class  LoginFacebookTask implements Task {

    Credencial credencial;

    public LoginFacebookTask(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_FACEBOOK),
                Click.on(BTN_FACEBOOK),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(EMAIL_FACEBOOK),
                //Click.on(EMAIL_FACEBOOK),
                Enter.theValue(credencial.getEmail()).into(EMAIL_FACEBOOK),
                //Click.on(PASSWORD_FACEBOOK),
                Enter.theValue(credencial.getPassword()).into(PASSWORD_FACEBOOK),
                Click.on(BTN_INICIA_SESION_FACEBOOK),
                WaitElement.isPresente(BTN_ACEPTAR_CONTRASENA_INCORRECTA),
                Click.on(BTN_ACEPTAR_CONTRASENA_INCORRECTA)

        );

    }

    public static LoginFacebookTask iniciarSesionConFacebook(Credencial credencial) {
        return instrumented(LoginFacebookTask.class, credencial);
    }
}
