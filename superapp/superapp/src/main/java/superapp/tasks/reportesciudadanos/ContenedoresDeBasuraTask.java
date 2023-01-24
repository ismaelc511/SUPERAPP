package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.DatosContenedoresDeBasura;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.BTN_CONTINUAR_DAÑO;

public class ContenedoresDeBasuraTask implements Task {

    DatosContenedoresDeBasura datosContenedoresDeBasura;

    public ContenedoresDeBasuraTask(DatosContenedoresDeBasura datosContenedoresDeBasura) {
        this.datosContenedoresDeBasura = datosContenedoresDeBasura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(CONTENEDORES_BASURA),
                Click.on(CONTENEDORES_BASURA),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(datosContenedoresDeBasura.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(datosContenedoresDeBasura.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(DESCRIPCION_CONTENEDORES),
                Enter.theValue(datosContenedoresDeBasura.getDescripcion()).into(DESCRIPCION_CONTENEDORES),
                WaitElement.isClickable(CORREO_CONTENEDORES),
                Enter.theValue(datosContenedoresDeBasura.getCorreoContacto()).into(CORREO_CONTENEDORES),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(BTN_CONTINUAR_CONTENEDORES),
                Click.on(BTN_CONTINUAR_CONTENEDORES)
        );

    }

    public static ContenedoresDeBasuraTask contenedoresDeBasuraTask(DatosContenedoresDeBasura datosContenedoresDeBasura) {
        return instrumented(ContenedoresDeBasuraTask.class, datosContenedoresDeBasura);
    }
}
