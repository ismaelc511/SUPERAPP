package superapp.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.apache.commons.lang3.RandomStringUtils;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.scroll.ScrollVertical;
import superapp.interactions.waits.WaitElement;
import superapp.models.registro.DatosPersonales;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.registro.RegisterPage.*;

public class RegistrarInformacionPersonalTask implements Task {

    DatosPersonales datosPersonales;

    public  RegistrarInformacionPersonalTask(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REGISTRARSE),
                Click.on(BTN_REGISTRARSE),
                WaitElement.isClickable(TIPO_PERSONA),
                Click.on(TIPO_PERSONA),
                ScrollAndClick.scrollAndClick(datosPersonales.getTipoPersona()),
                WaitElement.isClickable(TXT_NOMBRE),
                Enter.theValue(RandomStringUtils.randomAlphabetic(5)).into(TXT_NOMBRE),
                WaitElement.isClickable(TXT_APELLIDO),
                Enter.theValue(datosPersonales.getApellidos()).into(TXT_APELLIDO),
                WaitElement.isClickable(TIPO_DOCUMENTO),
                Click.on(TIPO_DOCUMENTO),
                WaitElement.isClickable(TIPO_TARJETA),
                Click.on(TIPO_TARJETA),
                WaitElement.isClickable(NUMERO_DOCUMENTO),
                Enter.theValue(RandomStringUtils.randomNumeric(10)).into(NUMERO_DOCUMENTO),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(SELECCIONAR_DIA),
                Click.on(SELECCIONAR_DIA),
                ScrollAndClick.scrollAndClick(datosPersonales.getDiaNacimiento()),
                WaitElement.isClickable(SELECCIONAR_MES),
                Click.on(SELECCIONAR_MES),
                ScrollAndClick.scrollAndClick(datosPersonales.getMesNacimiento()),
                WaitElement.isClickable(SELECCIONAR_AÑO),
                Click.on(SELECCIONAR_AÑO),
                ScrollAndClick.scrollAndClick(datosPersonales.getAñoNacimiento()),
                WaitElement.isClickable(CORREO),
                Enter.theValue(RandomStringUtils.randomAlphabetic(5) + "@yopmail.com").into(CORREO),
                WaitElement.isClickable(GENERO),
                Click.on(GENERO),
                ScrollAndClick.scrollAndClick(datosPersonales.getGenero()),
                WaitElement.isClickable(CELULAR),
                Enter.theValue(RandomStringUtils.randomNumeric(10)).into(CELULAR),
                WaitElement.isClickable(TELEFONO),
                Enter.theValue(RandomStringUtils.randomNumeric(8)).into(TELEFONO),
                WaitElement.isClickable(SEXO),
                Click.on(SEXO),
                ScrollAndClick.scrollAndClick(datosPersonales.getSexo()),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(ETNIA),
                Click.on(ETNIA),
                ScrollAndClick.scrollAndClick(datosPersonales.getEtnia()),
                WaitElement.isClickable(ORIENTACION_SEXUAL),
                Click.on(ORIENTACION_SEXUAL),
                ScrollAndClick.scrollAndClick(datosPersonales.getOrientacionSexual()),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(IDENTIDAD_DE_GENERO),
                Click.on(IDENTIDAD_DE_GENERO),
                Scroll.scrollUnaVista(),
                ScrollAndClick.scrollAndClick(datosPersonales.getIdentidadDeGenero()),
                WaitElement.isClickable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR)

                //Enter.keyValues(datosPersonales.getDiaNacimiento()).into(ELEGIR_DIA)
                //WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                //WaitElement.isPresente(LBL_USUARIO)
        );

    }

    public static RegistrarInformacionPersonalTask registrarUsuario(DatosPersonales datosPersonales) {
        return instrumented(RegistrarInformacionPersonalTask.class, datosPersonales);
    }
}
