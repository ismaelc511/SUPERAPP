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
import superapp.models.reportesciudadanos.MalParqueo;

import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.CONTINUAR_ABEJAS;

public class MalParqueoTask implements Task {


    MalParqueo malParqueo;

    public MalParqueoTask(MalParqueo malParqueo){this.malParqueo = malParqueo;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(MAL_PARQUEO),
                Click.on(MAL_PARQUEO),
                WaitElement.isClickable(DIRECCION_DAÑO),
                Enter.theValue(malParqueo.getDireccion()).into(DIRECCION_DAÑO),
                WaitFor.aTime(2000),
                WaitElement.isClickable(DIRECCION_ELEGIDA),
                Click.on(DIRECCION_ELEGIDA),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(malParqueo.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(FOTO),
                Click.on(FOTO),
                WaitElement.isClickable(CAPTURAR_FOTO),
                Click.on(CAPTURAR_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO),
                WaitElement.isClickable(CONTINUAR_OPCION),
                Click.on(CONTINUAR_OPCION),
                WaitElement.isClickable(CORREO_ABEJAS),
                Enter.theValue(malParqueo.getCorreoContacto()).into(CORREO_ABEJAS),
                WaitElement.isClickable(CONTINUAR_ABEJAS),
                Click.on(CONTINUAR_ABEJAS)
        );
    }

    public static MalParqueoTask malParqueoTask(MalParqueo malParqueo){
        return Tasks.instrumented(MalParqueoTask.class , malParqueo);
    }
}
