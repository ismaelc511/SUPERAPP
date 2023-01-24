package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.CicloRutas;

import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_ABEJAS;

public class CicloRutasTask implements Task {

    CicloRutas cicloRutas;

    public CicloRutasTask(CicloRutas cicloRutas){this.cicloRutas = cicloRutas;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(CICLORUTAS),
                Click.on(CICLORUTAS),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(cicloRutas.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(cicloRutas.getPuntoReferencia()).into(PUNTO_REFERENCIA),
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
                ScrollAndClick.scrollAndClick(cicloRutas.getTipoDano()),
                Click.on(ACEPTAR_TIPO_DAÑO_ABEJAS),
                WaitElement.isClickable(CICLORUTA_NOMBRE_REPORTA),
                Enter.theValue(cicloRutas.getNombreReporta()).into(CICLORUTA_NOMBRE_REPORTA),
                WaitElement.isClickable(CICLORUTA_NUMERO_CONTACTO),
                Enter.theValue(cicloRutas.getNumeroReporta()).into(CICLORUTA_NUMERO_CONTACTO),
                WaitElement.isClickable(CORREO_ABEJAS),
                Enter.theValue(cicloRutas.getCorreoContacto()).into(CORREO_ABEJAS),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(CICLORUTA_OBSERVACION),
                Enter.theValue(cicloRutas.getObservacion()).into(CICLORUTA_OBSERVACION),
                WaitElement.isClickable(CONTINUAR_ABEJAS),
                Click.on(CONTINUAR_ABEJAS)
        );
    }

    public static CicloRutasTask cicloRutasTask(CicloRutas cicloRutas){
        return Tasks.instrumented(CicloRutasTask.class , cicloRutas);
    }
}
