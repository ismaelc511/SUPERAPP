package superapp.tasks.bienestaranimal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.scroll.ScrollVertical;
import superapp.interactions.scroll.ValidarTexto;
import superapp.interactions.waits.WaitElement;
import superapp.models.autenticacion.Credencial;
import superapp.models.bienestaranimal.ReportarAnimalExtraviado;
import superapp.tasks.autentication.LoginFacebookTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static superapp.userinterfaces.autenticacion.LoginPage.*;
import static superapp.userinterfaces.autenticacion.LoginPage.BTN_ACEPTAR_CONTRASENA_INCORRECTA;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.*;

public class ReportarAnimalExtraviadoTask implements Task {

    ReportarAnimalExtraviado datosAnimalExtraviado;

    public ReportarAnimalExtraviadoTask(ReportarAnimalExtraviado datosAnimalExtraviado) {
        this.datosAnimalExtraviado = datosAnimalExtraviado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_BIENESTAR_ANIMAL),
                Click.on(BTN_BIENESTAR_ANIMAL),
                WaitElement.isClickable(REPORTAR_ANIMAL),
                Click.on(REPORTAR_ANIMAL),
                WaitElement.isClickable(NOMBRE_ANIMAL),
                Enter.theValue(datosAnimalExtraviado.getNombreAnimal()).into(NOMBRE_ANIMAL),
                WaitElement.isClickable(ESPECIE),
                Click.on(ESPECIE),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(CANINO),
                Click.on(CANINO),
                WaitElement.isClickable(RAZA),
                Click.on(RAZA),
                WaitElement.isClickable(AFGANO),
                Click.on(AFGANO),
                WaitElement.isClickable(SEXO),
                Click.on(SEXO),
                WaitElement.isClickable(MACHO),
                Click.on(MACHO),
                WaitElement.isClickable(TAMANIO),
                Click.on(TAMANIO),
                WaitElement.isClickable(GRANDE),
                Click.on(GRANDE),
                WaitElement.isClickable(MICROCHIP_SI),
                Click.on(MICROCHIP_SI),
                ScrollAndClick.scrollAndClick("Características del animal"),
                ScrollVertical.scrollVertical("Características del animal"),
                ValidarTexto.validarTexto(datosAnimalExtraviado.getTxtMicrochip()),
                WaitElement.isClickable(NUMERO_MICROCHIP),
                Enter.theValue(datosAnimalExtraviado.getNumeroMicrochip()).into(NUMERO_MICROCHIP),
                WaitElement.isClickable(CARACTERISTICAS_ANIMAL),
                Enter.theValue(datosAnimalExtraviado.getCaracteristicas()).into(CARACTERISTICAS_ANIMAL),
                WaitElement.isClickable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR)



        );

    }

    public static ReportarAnimalExtraviadoTask reportarAnimalExtraviadoTask(ReportarAnimalExtraviado datosAnimalExtraviado) {
        return instrumented(ReportarAnimalExtraviadoTask.class, datosAnimalExtraviado);
    }
}
