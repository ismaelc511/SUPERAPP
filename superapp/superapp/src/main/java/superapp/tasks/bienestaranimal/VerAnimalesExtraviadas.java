package superapp.tasks.bienestaranimal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import superapp.interactions.waits.WaitElement;
import superapp.models.autenticacion.Credencial;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static superapp.userinterfaces.autenticacion.LoginPage.*;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.*;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.BTN_HEMBRAS;
import static superapp.userinterfaces.home.HomePage.LBL_USUARIO;

public class VerAnimalesExtraviadas implements Task {

    Credencial credencial;

    public VerAnimalesExtraviadas(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_BIENESTAR_ANIMAL),
                Click.on(BTN_BIENESTAR_ANIMAL),
                WaitElement.isClickable(VER_ANIMALES_EXTRAVIADOS),
                Click.on(VER_ANIMALES_EXTRAVIADOS),
                WaitElement.isClickable(CREO_VER_EL_ANIMAL),
                Click.on(CREO_VER_EL_ANIMAL),
                WaitElement.isClickable(INICIAR_SESION),
                Click.on(INICIAR_SESION),
                WaitElement.isClickable(TXT_USUARIO),
                Enter.theValue(credencial.getEmail()).into(TXT_USUARIO),
                WaitElement.isClickable(TXT_PASSWORD),
                Enter.theValue(credencial.getPassword()).into(TXT_PASSWORD),
                WaitElement.isClickable(BTN_INGRESAR),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(BARRA_PROGRESO, isNotPresent()),
                WaitElement.isPresente(LBL_USUARIO),
                WaitElement.isClickable(EQUIS),
                Click.on(EQUIS),
                WaitElement.isClickable(BTN_BIENESTAR_ANIMAL),
                Click.on(BTN_BIENESTAR_ANIMAL),
                WaitElement.isClickable(VER_ANIMALES_EXTRAVIADOS),
                Click.on(VER_ANIMALES_EXTRAVIADOS),
                WaitElement.isClickable(CREO_VER_EL_ANIMAL),
                Click.on(CREO_VER_EL_ANIMAL),
                WaitElement.isClickable(TELEFONO_CONTACTO),
                Enter.theValue(credencial.getTelefono()).into(TELEFONO_CONTACTO),
                WaitElement.isClickable(NOMBRE),
                Enter.theValue(credencial.getNombre()).into(NOMBRE),
                //WaitElement.isClickable(DIRECCION),
                //Enter.theValue(credencial.getDireccion()).into(DIRECCION),
                WaitElement.isClickable(TOMAR_FOTO),
                Click.on(TOMAR_FOTO),
                WaitElement.isClickable(CAPTURA_FOTO),
                Click.on(CAPTURA_FOTO),
                WaitElement.isClickable(ACEPTAR_FOTO),
                Click.on(ACEPTAR_FOTO)


        );

    }

    public static VerAnimalesExtraviadas verAnimalesExtraviadas(Credencial credencial) {
        return instrumented(VerAnimalesExtraviadas.class, credencial);
    }
}
