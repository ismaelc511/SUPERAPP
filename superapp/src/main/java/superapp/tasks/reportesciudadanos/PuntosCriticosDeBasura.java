package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.DatosPuntosCriticos;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;

public class PuntosCriticosDeBasura implements Task{

    DatosPuntosCriticos datosPuntosCriticos;

    public PuntosCriticosDeBasura(DatosPuntosCriticos datosPuntosCriticos) {
        this.datosPuntosCriticos = datosPuntosCriticos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(PUNTOS_CRITICOS_BASURAS),
                Click.on(PUNTOS_CRITICOS_BASURAS),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(datosPuntosCriticos.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(datosPuntosCriticos.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(DESCRIPCION_PUNTOS_CRITICOS),
                Enter.theValue(datosPuntosCriticos.getDescripcion()).into(DESCRIPCION_PUNTOS_CRITICOS),
                WaitElement.isClickable(CORREO_CIUDADANO),
                Enter.theValue(datosPuntosCriticos.getCorreo()).into(CORREO_CIUDADANO),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR)
        );

    }

    public static PuntosCriticosDeBasura puntosCriticosDeBasura(DatosPuntosCriticos datosPuntosCriticos) {
        return instrumented(PuntosCriticosDeBasura.class, datosPuntosCriticos);
    }
}
