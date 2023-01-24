package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.NidoAbejas;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_OPCION;

public class NidoAbejasTask implements Task {

    NidoAbejas datosNidoAbejas;

    public NidoAbejasTask(NidoAbejas datosNidoAbejas) {
        this.datosNidoAbejas = datosNidoAbejas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(NIDO_ABEJAS),
                Click.on(NIDO_ABEJAS),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(datosNidoAbejas.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(datosNidoAbejas.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(HACE_CUANTO),
                Click.on(HACE_CUANTO),
                ScrollAndClick.scrollAndClick(datosNidoAbejas.getTipoDaño()),
                Click.on(ACEPTAR_TIPO_DAÑO_ABEJAS),
                WaitElement.isClickable(CORREO_ABEJAS),
                Enter.theValue(datosNidoAbejas.getCorreo()).into(CORREO_ABEJAS),
                WaitElement.isClickable(CONTINUAR_ABEJAS),
                Click.on(CONTINUAR_ABEJAS)
        );

    }

    public static NidoAbejasTask nidoAbejasTask(NidoAbejas datosNidoAbejas) {
        return instrumented(NidoAbejasTask.class, datosNidoAbejas);
    }
}
