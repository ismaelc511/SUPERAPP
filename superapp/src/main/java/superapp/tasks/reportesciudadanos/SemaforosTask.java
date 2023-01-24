package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.Semaforo;

import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_ABEJAS;

public class SemaforosTask implements Task {

    Semaforo semaforo;

    public SemaforosTask(Semaforo semaforo){ this.semaforo = semaforo;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(SEMAFORO),
                Click.on(SEMAFORO),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(semaforo.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(semaforo.getPuntoReferencia()).into(PUNTO_REFERENCIA),
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
                ScrollAndClick.scrollAndClick(semaforo.getTipoDano()),
                Click.on(ACEPTAR_TIPO_DAÑO_ABEJAS),
                WaitElement.isClickable(CORREO_SEMAFORO),

                Enter.theValue(semaforo.getCorreoContacto()).into(CORREO_SEMAFORO),
                WaitElement.isClickable(OBSERVACION_SEMAFORO),
                Enter.theValue(semaforo.getDescripcion()).into(OBSERVACION_SEMAFORO),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(CONTINUAR_ABEJAS),
                Click.on(CONTINUAR_ABEJAS)
        );
    }

    public static SemaforosTask semaforosTask(Semaforo semaforo){
        return Tasks.instrumented(SemaforosTask.class , semaforo);
    }
}
