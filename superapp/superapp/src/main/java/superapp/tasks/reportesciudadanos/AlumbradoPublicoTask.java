package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.DatosAlumbradoPublico;
import superapp.models.reportesciudadanos.DatosHuecosYBaches;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_OPCION;

public class AlumbradoPublicoTask implements Task {

    DatosAlumbradoPublico datosAlumbradoPublico;

    public AlumbradoPublicoTask(DatosAlumbradoPublico datosAlumbradoPublico) {
        this.datosAlumbradoPublico = datosAlumbradoPublico;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(ALUMBRADO_PUBLICO),
                Click.on(ALUMBRADO_PUBLICO),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(datosAlumbradoPublico.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(datosAlumbradoPublico.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(TIPO_DAÑO),
                Click.on(TIPO_DAÑO),
                ScrollAndClick.scrollAndClick(datosAlumbradoPublico.getTipoDaño()),
                WaitElement.isClickable(ACEPTAR_TIPO_DAÑO),
                Click.on(ACEPTAR_TIPO_DAÑO),
                WaitElement.isClickable(DESCRIPCION_DAÑO),
                Enter.theValue(datosAlumbradoPublico.getDescripcionDaño()).into(DESCRIPCION_DAÑO),
                WaitElement.isClickable(NOMBRE_QUE_REPORTA),
                Enter.theValue(datosAlumbradoPublico.getNombreReporta()).into(NOMBRE_QUE_REPORTA),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(NUMERO_CONTACTO),
                Enter.theValue(datosAlumbradoPublico.getNumeroReporta()).into(NUMERO_CONTACTO),
                WaitElement.isClickable(CORREO_CONTACTO),
                Enter.theValue(datosAlumbradoPublico.getCorreoContacto()).into(CORREO_CONTACTO),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(BTN_CONTINUAR_DAÑO),
                Click.on(BTN_CONTINUAR_DAÑO)
        );

    }

    public static AlumbradoPublicoTask alumbradoPublicoTask(DatosAlumbradoPublico datosAlumbradoPublico) {
        return instrumented(AlumbradoPublicoTask.class, datosAlumbradoPublico);
    }
}
