package superapp.tasks.impuestos;

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
import static superapp.userinterfaces.autenticacion.impuestos.ImpuestosPage.*;

public class ImpuestosTask implements Task {

    Credencial credencial;


    public ImpuestosTask(Credencial credencial) {
        this.credencial = credencial;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_IMPUESTOS),
                Click.on(BTN_IMPUESTOS),
                WaitElement.isClickable(CONTINUAR),
                Click.on(CONTINUAR),
                //WaitElement.isClickable(BTN_INICIA_SESION),
                //Click.on(BTN_INICIA_SESION),
                WaitElement.isClickable(TXT_USUARIO),
                Enter.theValue(credencial.getEmail()).into(TXT_USUARIO),
                WaitElement.isClickable(TXT_PASSWORD),
                Enter.theValue(credencial.getPassword()).into(TXT_PASSWORD),
                WaitElement.isClickable(BTN_INGRESAR_IMPUESTOS),
                Click.on(BTN_INGRESAR_IMPUESTOS),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(LBL_USUARIO),
                WaitElement.isClickable(BTN_EQUIS),
                Click.on(BTN_EQUIS),
                WaitElement.isClickable(BTN_IMPUESTOS),
                Click.on(BTN_IMPUESTOS)
        );

    }

    public static ImpuestosTask impuestosIngresar(Credencial credencial) {
        return instrumented(ImpuestosTask.class, credencial);
    }
}
