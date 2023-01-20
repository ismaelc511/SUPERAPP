package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.home.Empleo;
import superapp.models.home.MedellinJoven;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.EmpleoPage.*;
import static superapp.userinterfaces.home.EmpleoPage.BTN_APLICAR_VACANTE;

public class MedellinJovenTask implements Task {

    MedellinJoven medellinJoven;

    public MedellinJovenTask(MedellinJoven medellinJoven) {
        this.medellinJoven = medellinJoven;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_EMPLEO),
                Click.on(BTN_EMPLEO),
                WaitElement.isClickable(BTN_MEDELLIN_JOVEN),
                Click.on(BTN_MEDELLIN_JOVEN),
                WaitElement.isClickable(DESPLEGABLE_CATEGORIA),
                Click.on(DESPLEGABLE_CATEGORIA),
                WaitElement.isClickable(CATEGORIA),
                Click.on(CATEGORIA),
                //ScrollAndClick.scrollAndClick(medellinJoven.getCategoria()),
                WaitElement.isClickable(DESPLEGABLE_COMUNA),
                Click.on(DESPLEGABLE_COMUNA),
                ScrollAndClick.scrollAndClick(medellinJoven.getComuna()),
                WaitElement.isClickable(CONVOCATORIA),
                Click.on(CONVOCATORIA),
                WaitElement.isClickable(INSCRIBETE_AQUI),
                Click.on(INSCRIBETE_AQUI),
                WaitElement.isClickable(ACEPTAR_VER_OFERTAS),
                Click.on(ACEPTAR_VER_OFERTAS)
        );

    }

    public static Performable medellinJovenTask(MedellinJoven medellinJoven) {
        return instrumented(MedellinJovenTask.class, medellinJoven);
    }
}
