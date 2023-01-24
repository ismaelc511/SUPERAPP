package superapp.tasks.movilidad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import superapp.interactions.waits.WaitElement;
import superapp.models.autenticacion.Credencial;
import superapp.models.movilidad.InfoPicoYPlaca;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static superapp.userinterfaces.autenticacion.LoginPage.*;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.EQUIS;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.INICIAR_SESION;
import static superapp.userinterfaces.home.HomePage.LBL_USUARIO;
import static superapp.userinterfaces.movilidad.InfoPicoYPlacaPage.*;
import static superapp.userinterfaces.movilidad.InfoPicoYPlacaPage.BTN_ACEPTAR;

public class ConsultaYPagoDeMultasTask implements Task {

    InfoPicoYPlaca placa;

    Credencial credencial;

    public ConsultaYPagoDeMultasTask(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitElement.isEnable(CAMBIAR_PAGINA),
                //Click.on(CAMBIAR_PAGINA),
                WaitElement.isClickable(BTN_MOVILIDAD),
                Click.on(BTN_MOVILIDAD),
                WaitElement.isEnable(BTN_CONSULTAR_PAGO_MULTAS),
                Click.on(BTN_CONSULTAR_PAGO_MULTAS),
                WaitElement.isClickable(INICIAR_SESION),
                Click.on(INICIAR_SESION),
                WaitElement.isClickable(TXT_USUARIO),
                Enter.theValue(credencial.getEmail()).into(TXT_USUARIO),
                WaitElement.isClickable(TXT_PASSWORD),
                Enter.theValue(credencial.getPassword()).into(TXT_PASSWORD),
                WaitElement.isClickable(BTN_INGRESAR),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(LBL_USUARIO),
                WaitElement.isClickable(EQUIS),
                Click.on(EQUIS),
                WaitElement.isClickable(BTN_MOVILIDAD),
                Click.on(BTN_MOVILIDAD),
                WaitElement.isEnable(BTN_CONSULTAR_PAGO_MULTAS),
                Click.on(BTN_CONSULTAR_PAGO_MULTAS),
                WaitElement.isClickable(CEDULA),
                Enter.theValue(credencial.getCedula()).into(CEDULA),
                WaitElement.isClickable(BTN_CONSULTAR_MULTAS),
                Click.on(BTN_CONSULTAR_MULTAS),
                WaitElement.isClickable(SELECCIONAR_PAGO),
                Click.on(SELECCIONAR_PAGO),
                WaitElement.isClickable(BTN_PAGAR_AHORA),
                Click.on(BTN_PAGAR_AHORA)


        );

    }

    public static ConsultaYPagoDeMultasTask consultaYPagoDeMultasTask(Credencial credencial) {
        return instrumented(ConsultaYPagoDeMultasTask.class, credencial);
    }
}
