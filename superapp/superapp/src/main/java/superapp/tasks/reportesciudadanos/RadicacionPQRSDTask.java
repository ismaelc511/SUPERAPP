package superapp.tasks.reportesciudadanos;

import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.models.reportesciudadanos.RadicacionPQRSD;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.BTN_CONSULTAR_RADICADO;

public class RadicacionPQRSDTask implements Task {

    RadicacionPQRSD radicacionPQRSD;

    public RadicacionPQRSDTask(RadicacionPQRSD radicacionPQRSD) {
        this.radicacionPQRSD = radicacionPQRSD;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(BTN_REALIZAR_O_CONSULTAR),
                Click.on(BTN_REALIZAR_O_CONSULTAR),
                WaitElement.isClickable(BTN_ACEPTAR_RESPETADO_CIUDADANO),
                Click.on(BTN_ACEPTAR_RESPETADO_CIUDADANO),
                WaitElement.isClickable(REALIZAR_UNA_PQRSD),
                Click.on(REALIZAR_UNA_PQRSD),
                WaitElement.isClickable(TIPO_PERSONA),
                Click.on(TIPO_PERSONA),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getTipoPersona()),
                WaitElement.isClickable(ACEPTAR_TIPO_PERSONA),
                Click.on(ACEPTAR_TIPO_PERSONA),
                WaitElement.isClickable(TIPO_DOCUMENTO),
                Click.on(TIPO_DOCUMENTO),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getTipoDocumento()),
                WaitElement.isClickable(ACEPTAR_TIPO_DOCUMENTO),
                Click.on(ACEPTAR_TIPO_DOCUMENTO),
                WaitElement.isClickable(INPUT_NUMERO_DOC_IDENTIDAD),
                Enter.theValue(radicacionPQRSD.getNumeroDocumento()).into(INPUT_NUMERO_DOC_IDENTIDAD),
                WaitElement.isClickable(NOMBRE),
                Enter.theValue(radicacionPQRSD.getNombres()).into(NOMBRE),
                WaitElement.isClickable(APELLIDO),
                Enter.theValue(radicacionPQRSD.getApellidos()).into(APELLIDO),
                Click.on(GENERO),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getGenero()),
                WaitElement.isClickable(ACEPTAR_GENERO),
                Click.on(ACEPTAR_GENERO),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(PAIS),
                Click.on(PAIS),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getPais()),
                WaitElement.isClickable(ACEPTAR_PAIS),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(DEPARTAMENTO),
                Click.on(DEPARTAMENTO),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getDepartamento()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(CIUDAD),
                Click.on(CIUDAD),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getCiudad()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(INDICATIVO_VIA),
                Click.on(INDICATIVO_VIA),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getIndicativoVia()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(NUMERO_VIA),
                Enter.theValue(radicacionPQRSD.getNumeroVia()).into(NUMERO_VIA),
                WaitElement.isClickable(APENDICE),
                Click.on(APENDICE),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getApendice()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(ORIENTACION),
                Click.on(ORIENTACION),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getOrientacion()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(NUMERO_CRUCE),
                Enter.theValue(radicacionPQRSD.getNumeroCruce()).into(NUMERO_CRUCE),
                WaitElement.isClickable(APENDICE2),
                Click.on(APENDICE2),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getApendice2()),
                Click.on(ACEPTAR_APENDICE2),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(ORIENTACION2),
                Click.on(ORIENTACION2),
                WaitElement.isClickable(TXT_ELIGE_ORIENTACION),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getOrientacion2()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(NUMERO_PUERTA),
                Enter.theValue(radicacionPQRSD.getNumeroPuerta()).into(NUMERO_PUERTA),
                WaitElement.isClickable(INTERIOR),
                Enter.theValue(radicacionPQRSD.getInterior()).into(INTERIOR),
                WaitElement.isClickable(EMAIL),
                Enter.theValue(radicacionPQRSD.getEmail()).into(EMAIL),
                WaitElement.isClickable(TELEFONO),
                Enter.theValue(radicacionPQRSD.getTelefono()).into(TELEFONO),
                WaitElement.isClickable(SOLICITUD_INFORMACION),
                Click.on(SOLICITUD_INFORMACION),
                ScrollAndClick.scrollAndClick(radicacionPQRSD.getSolicitudInformacion()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(CONTINUAR_RADICACION),
                Click.on(CONTINUAR_RADICACION),
                WaitElement.isClickable(ATENCION_PREFERENCIAL)

        );
    }

    public static RadicacionPQRSDTask radicacionPQRSD(RadicacionPQRSD radicacionPQRSD) {
        return instrumented(RadicacionPQRSDTask.class, radicacionPQRSD);
    }


}
