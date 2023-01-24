package superapp.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.models.registro.DatosDireccion;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.registro.RegisterPage.*;

public class RegistrarInformacionDeDireccionTask implements Task {

    DatosDireccion datosDireccion;

    public RegistrarInformacionDeDireccionTask(DatosDireccion datosDireccion) {
        this.datosDireccion = datosDireccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(LBL_DIRECCION),
                WaitElement.isClickable(TIPO_VIA),
                Click.on(TIPO_VIA),
                ScrollAndClick.scrollAndClick(datosDireccion.getTipoVia()),
                WaitElement.isClickable(NUMERO_VIA),
                Click.on(NUMERO_VIA),
                Enter.theValue(datosDireccion.getNumeroVia()).into(NUMERO_VIA),
                WaitElement.isClickable(CERRAR_TECLADO),
                Click.on(CERRAR_TECLADO),
                WaitElement.isClickable(APENDICE_VIA),
                Click.on(APENDICE_VIA),
                ScrollAndClick.scrollAndClick(datosDireccion.getApendiceVia()),
                //Click.on(APENDICE_VIA),
                WaitElement.isClickable(ORIENTACION_VIA),
                Click.on(ORIENTACION_VIA),
                ScrollAndClick.scrollAndClick(datosDireccion.getOrientacionVia()),
                WaitElement.isClickable(NUMERO_CRUCE),
                Click.on(NUMERO_CRUCE),
                Enter.theValue(datosDireccion.getNumeroCruce()).into(NUMERO_CRUCE),
                WaitElement.isClickable(CERRAR_TECLADO),
                Click.on(CERRAR_TECLADO),
                //Enter.theValue(datosDireccion.getNumeroCruce()).into(NUMERO_CRUCE),
                //Click.on(NUMERO_CRUCE),
                //WaitElement.isClickable(CERRAR_TECLADO),
                //Click.on(CERRAR_TECLADO),
                WaitElement.isClickable(APENDICE_CRUCE),
                Click.on(APENDICE_CRUCE),
                ScrollAndClick.scrollAndClick(datosDireccion.getApendiceCruce()),
                //Click.on(APENDICE_CRUCE),
                WaitElement.isClickable(ORIENTACION_CRUCE),
                Click.on(ORIENTACION_CRUCE),
                ScrollAndClick.scrollAndClick(datosDireccion.getOrientacionCruce()),
                WaitElement.isClickable(NUMERO),
                Click.on(NUMERO),
                Enter.theValue(datosDireccion.getNumero()).into(NUMERO),
                WaitElement.isClickable(CERRAR_TECLADO),
                Click.on(CERRAR_TECLADO),
                WaitElement.isClickable(COMPLEMENTO),
                Click.on(COMPLEMENTO),
                WaitElement.isClickable(CERRAR_TECLADO),
                Click.on(CERRAR_TECLADO),
                Enter.theValue(datosDireccion.getComplemento()).into(COMPLEMENTO),
                WaitElement.isClickable(DIRECCION_DESCRIPTIVA),
                Click.on(DIRECCION_DESCRIPTIVA),
                Enter.theValue(datosDireccion.getDireccionDescriptiva()).into(DIRECCION_DESCRIPTIVA),
                WaitElement.isClickable(CERRAR_TECLADO),
                Click.on(CERRAR_TECLADO),
                //WaitElement.isClickable(DIRECCION_INGRESADA),
                //Click.on(DIRECCION_INGRESADA),
                //Enter.theValue(datosDireccion.getDireccionIngresada()).into(DIRECCION_INGRESADA),
                //WaitElement.isClickable(CERRAR_TECLADO),
                //Click.on(CERRAR_TECLADO),
                WaitElement.isClickable(BTN_AGREGAR),
                Click.on(BTN_AGREGAR),
                WaitElement.isClickable(BTN_REGISTRARME),
                Click.on(BTN_REGISTRARME)
        );

    }

    public static RegistrarInformacionDeDireccionTask registrarInformacionDeDireccionTask(DatosDireccion datosDireccion) {
        return instrumented(RegistrarInformacionDeDireccionTask.class, datosDireccion);
    }
}
