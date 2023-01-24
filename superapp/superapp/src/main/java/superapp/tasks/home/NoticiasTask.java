package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.scroll.ScrollVertical;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.home.Noticias;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.NoticiasPage.*;

public class NoticiasTask implements Task {

    superapp.models.home.Noticias noticias;

    public NoticiasTask(superapp.models.home.Noticias noticias) {
        this.noticias = noticias;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_NOTICIAS),
                Click.on(BTN_NOTICIAS),
                WaitElement.isClickable(FILTRO),
                Click.on(FILTRO),
                ScrollAndClick.scrollAndClick(noticias.getFiltro()),
                Click.on(BTN_FILTRAR),
                WaitFor.aTime(3000),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista()
                );

    }

    public static Performable noticiasTask(Noticias noticias) {
        return instrumented(NoticiasTask.class, noticias);
    }
}
