package superapp.tasks.bienestaranimal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.scroll.ScrollVertical;
import superapp.interactions.scroll.ValidarTexto;
import superapp.interactions.waits.WaitElement;
import superapp.models.bienestaranimal.ReportarAnimalExtraviado;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.*;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.BTN_CONTINUAR;

public class IngresarUbicacionYContactoTask implements Task {

    ReportarAnimalExtraviado datosAnimalExtraviado;

    public IngresarUbicacionYContactoTask(ReportarAnimalExtraviado datosAnimalExtraviado) {
        this.datosAnimalExtraviado = datosAnimalExtraviado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(DIRECCION_EXTRAVIO),
                Enter.theValue(datosAnimalExtraviado.getDireccionExtravio()).into(DIRECCION_EXTRAVIO),
                WaitElement.isClickable(PUNTO_REFERENCIA),
                Enter.theValue(datosAnimalExtraviado.getPuntoReferencia()).into(PUNTO_REFERENCIA),
                WaitElement.isClickable(COMUNA),
                Click.on(COMUNA),
                WaitElement.isClickable(COMUNA_CASTILLA),
                Click.on(COMUNA_CASTILLA),
                WaitElement.isClickable(BARRIO),
                Click.on(BARRIO),
                WaitElement.isClickable(FLORENCIA),
                Click.on(FLORENCIA),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(NOMBRE_PROPIETARIO),
                Enter.theValue(datosAnimalExtraviado.getNombrePropietario()).into(NOMBRE_PROPIETARIO),
                WaitElement.isClickable(NUMERO_CONTACTO),
                Enter.theValue(datosAnimalExtraviado.getNumeroContacto()).into(NUMERO_CONTACTO),
                WaitElement.isClickable(CORREO),
                Enter.theValue(datosAnimalExtraviado.getCorreo()).into(CORREO),
                WaitElement.isClickable(BTN_CONTINUAR2),
                Click.on(BTN_CONTINUAR2),
                WaitElement.isClickable(BTN_REPORTAR),
                Click.on(BTN_REPORTAR)

        );

    }

    public static IngresarUbicacionYContactoTask ingresarUbicacionYContactoTask(ReportarAnimalExtraviado datosAnimalExtraviado) {
        return instrumented(IngresarUbicacionYContactoTask.class, datosAnimalExtraviado);
    }
}
