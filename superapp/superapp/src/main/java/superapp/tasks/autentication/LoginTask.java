package superapp.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import superapp.interactions.waits.WaitElement;
import superapp.models.autenticacion.Credencial;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static superapp.userinterfaces.autenticacion.LoginPage.*;
import static superapp.userinterfaces.home.HomePage.LBL_USUARIO;
import static superapp.userinterfaces.home.PerfilPage.BTN_INICIAR_SESION;

public class LoginTask implements Task {

    Credencial credencial;

    public LoginTask(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitElement.isClickable(BTN_INICIAR_SESION),
                //Click.on(BTN_INICIAR_SESION),
                WaitElement.isClickable(TXT_USUARIO),
                Enter.theValue(credencial.getEmail()).into(TXT_USUARIO),
                WaitElement.isClickable(TXT_PASSWORD),
                Enter.theValue(credencial.getPassword()).into(TXT_PASSWORD),
                WaitElement.isClickable(BTN_INGRESAR),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(LBL_USUARIO)
                );

    }

    public static LoginTask iniciarSesion(Credencial credencial) {
        return instrumented(LoginTask.class, credencial);
    }
}
