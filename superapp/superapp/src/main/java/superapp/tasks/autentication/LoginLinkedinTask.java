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

public class LoginLinkedinTask implements Task {

    Credencial credencial;

    public LoginLinkedinTask(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitElement.isClickable(BTN_INICIAR_SESION),
                //Click.on(BTN_INICIAR_SESION),
                //Scroll.scrollUnaVista(),
                WaitElement.isClickable(BTN_LINKEDIN),
                Click.on(BTN_LINKEDIN),
                WaitElement.isClickable(CAMPO_EMAIL),
                //Click.on(CAMPO_EMAIL),
                Enter.theValue(credencial.getEmail()).into(CAMPO_EMAIL),
                //Click.on(CAMPO_PASSWORD),
                Enter.theValue(credencial.getPassword()).into(CAMPO_PASSWORD),
                Click.on(BTN_INICIA_SESION_CON_LINKEDIN),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(LBL_USUARIO_LINKEDIN)
        );

    }

    public static LoginLinkedinTask iniciarSesionConLinkedin(Credencial credencial) {
        return instrumented(LoginLinkedinTask.class, credencial);
    }
}
