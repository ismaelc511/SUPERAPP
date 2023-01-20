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

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.EmpleoPage.*;

public class EmpleosTask implements Task {

    Empleo empleo;

    public EmpleosTask(Empleo empleo) {
        this.empleo = empleo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_EMPLEO),
                Click.on(BTN_EMPLEO),
                WaitElement.isClickable(BTN_BUSQUEDA_VACANTES),
                Click.on(BTN_BUSQUEDA_VACANTES),
                WaitElement.isClickable(BUSCADOR),
                Enter.theValue(empleo.getEmpleo()).into(BUSCADOR),
                WaitElement.isClickable(LBL_COORDINADOR_COMERCIAL),
                Click.on(LBL_COORDINADOR_COMERCIAL),
                ScrollAndClick.scrollAndClick(empleo.getEmpleo())

        );

    }

    public static Performable empleosTask(Empleo empleo) {
        return instrumented(EmpleosTask.class, empleo);
    }
}
