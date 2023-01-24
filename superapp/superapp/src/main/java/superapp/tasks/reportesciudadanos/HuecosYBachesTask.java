package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.DatosHuecosYBaches;
import superapp.models.reportesciudadanos.DatosPuntosCriticos;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_OPCION;

public class HuecosYBachesTask implements Task {

    DatosHuecosYBaches datosHuecosYBaches;

    public HuecosYBachesTask(DatosHuecosYBaches datosHuecosYBaches) {
        this.datosHuecosYBaches = datosHuecosYBaches;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(HUECOS_Y_BACHES),
                Click.on(HUECOS_Y_BACHES),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(datosHuecosYBaches.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(datosHuecosYBaches.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(CORREO_HUECOS),
                Enter.theValue(datosHuecosYBaches.getCorreo()).into(CORREO_HUECOS),
                WaitElement.isClickable(BTN_CONTINUAR_HUECOS),
                Click.on(BTN_CONTINUAR_HUECOS)
        );

    }

    public static HuecosYBachesTask huecosYBachesTask( DatosHuecosYBaches datosHuecosYBaches) {
        return instrumented(HuecosYBachesTask.class, datosHuecosYBaches);
    }
}
