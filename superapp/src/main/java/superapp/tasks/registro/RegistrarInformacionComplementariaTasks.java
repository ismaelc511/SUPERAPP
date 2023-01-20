package superapp.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.registro.DatosComplementarios;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.registro.RegisterPage.*;

public class RegistrarInformacionComplementariaTasks implements Task {

    DatosComplementarios datosComplementarios;

    public RegistrarInformacionComplementariaTasks(DatosComplementarios datosComplementarios) {
        this.datosComplementarios = datosComplementarios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(SELECCIONAR_PAIS),
                Click.on(SELECCIONAR_PAIS),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                ScrollAndClick.scrollAndClick(datosComplementarios.getPaisDeResidencia()),
                WaitElement.isClickable(SELECCIONAR_DEPARTAMENTO),
                Click.on(SELECCIONAR_DEPARTAMENTO),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                ScrollAndClick.scrollAndClick(datosComplementarios.getDepartamento()),
                WaitElement.isClickable(SELECCIONAR_MUNICIPIO),
                Click.on(SELECCIONAR_MUNICIPIO),
                ScrollAndClick.scrollAndClick(datosComplementarios.getMunicipio()),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(SELECCIONAR_BARRIO),
                Click.on(SELECCIONAR_BARRIO),
                WaitElement.isClickable(BARRIO),
                Click.on(BARRIO),
                //ScrollAndClick.scrollAndClick(datosComplementarios.getBarrio()),
                WaitElement.isClickable(INGRESAR_DIRECCION),
                Click.on(INGRESAR_DIRECCION),
                WaitFor.aTime(5000),
                //Enter.theValue(RandomStringUtils.randomAlphabetic(3)).into(INGRESAR_DIRECCION),
                WaitElement.isClickable(LBL_DIRECCION)
                );

    }

    public static RegistrarInformacionComplementariaTasks registrarUsuarioConInfoComplementaria(DatosComplementarios datosComplementarios) {
        return instrumented(RegistrarInformacionComplementariaTasks.class, datosComplementarios);
    }
}
