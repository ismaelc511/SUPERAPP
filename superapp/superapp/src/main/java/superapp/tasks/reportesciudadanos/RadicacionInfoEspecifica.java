package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.models.reportesciudadanos.RadicacionEspecifica;
import superapp.models.reportesciudadanos.RadicacionPQRSD;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;

public class RadicacionInfoEspecifica implements Task {

    RadicacionEspecifica radicacionEspecifica;

    public RadicacionInfoEspecifica(RadicacionEspecifica radicacionEspecifica) {
        this.radicacionEspecifica = radicacionEspecifica;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(ATENCION_PREFERENCIAL),
                Click.on(ATENCION_PREFERENCIAL),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getAtencionPreferencial()),
                WaitElement.isClickable(ACEPTAR_PAIS),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(INDICATIVO_VIA2),
                Click.on(INDICATIVO_VIA2),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getIndicativoVia()),
                WaitElement.isClickable(ACEPTAR_PAIS),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(NUMERO_VIA2),
                Enter.theValue(radicacionEspecifica.getNumeroVia()).into(NUMERO_VIA2),
                WaitElement.isClickable(APENDICE3),
                Click.on(APENDICE3),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getApendice()),
                WaitElement.isClickable(ACEPTAR_PAIS),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(ORIENTACION3),
                Click.on(ORIENTACION3),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getOrientacion()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(NUMERO_CRUCE2),
                Enter.theValue(radicacionEspecifica.getNumeroCruce()).into(NUMERO_CRUCE2),
                WaitElement.isClickable(APENDICE4),
                Click.on(APENDICE4),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getApendice2()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(ORIENTACION4),
                Click.on(ORIENTACION4),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getOrientacion2()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(NUMERO_CRUCE2),
                Enter.theValue(radicacionEspecifica.getNumeroCruce()).into(NUMERO_CRUCE2),
                WaitElement.isClickable(NUMERO_PUERTA2),
                Enter.theValue(radicacionEspecifica.getNumeroPuerta()).into(NUMERO_PUERTA2),
                WaitElement.isClickable(INTERIOR2),
                Enter.theValue(radicacionEspecifica.getInterior()).into(INTERIOR2),
                WaitElement.isClickable(ASUNTO),
                Enter.theValue(radicacionEspecifica.getAsunto()).into(ASUNTO),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(DESCRIPCION),
                Enter.theValue(radicacionEspecifica.getDescripcion()).into(DESCRIPCION),
                WaitElement.isClickable(ANEXOS),
                ScrollAndClick.scrollAndClick(radicacionEspecifica.getAnexos()),
                Click.on(ACEPTAR_PAIS),
                WaitElement.isClickable(BTN_CONTINUAR2),
                Click.on(BTN_CONTINUAR2),
                WaitElement.isClickable(ACEPTAR_CONFIRMACION),
                Click.on(ACEPTAR_CONFIRMACION)
                //WaitElement.isClickable(RADICADO)
        );
    }

    public static RadicacionInfoEspecifica radicacionInfoEspecifica(RadicacionEspecifica radicacionEspecifica) {
        return instrumented(RadicacionInfoEspecifica.class, radicacionEspecifica);
    }
}
