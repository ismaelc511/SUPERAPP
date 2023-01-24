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
import superapp.models.reportesciudadanos.EntornoFisico;

import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_ABEJAS;

public class EntornoFisicoTask implements Task {

    EntornoFisico entornoFisico;

    public EntornoFisicoTask (EntornoFisico entornoFisico){ this.entornoFisico = entornoFisico;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(ENTORNO_FISICO),
                Click.on(ENTORNO_FISICO),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(entornoFisico.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(entornoFisico.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(DESCRIPCION_ENTORNO),
                Enter.theValue(entornoFisico.getDescripcion()).into(DESCRIPCION_ENTORNO),
                WaitElement.isClickable(CORREO_ENTORNO),
                Enter.theValue(entornoFisico.getCorreoContacto()).into(CORREO_ENTORNO),
                WaitElement.isClickable(CONTINUAR_ABEJAS),
                Click.on(CONTINUAR_ABEJAS)
        );
    }

    public static EntornoFisicoTask entornoFisicoTask(EntornoFisico entornoFisico){
        return Tasks.instrumented(EntornoFisicoTask.class , entornoFisico);
    }
}
