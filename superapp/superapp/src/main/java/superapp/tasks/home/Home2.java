package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.HomePage.BTN_SALTAR;
import static superapp.userinterfaces.menu.MenuPage.BTN_PERFIL;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.BTN_REPORTES_CIUDADANOS;

public class Home2 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_SALTAR),
                Click.on(BTN_SALTAR)
                //WaitElement.isClickable(BTN_REPORTES_CIUDADANOS)
    );

    }

    public static Performable entrarAlHome() {
        return instrumented(Home2.class);
    }

}
