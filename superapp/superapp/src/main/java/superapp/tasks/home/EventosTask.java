package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.home.Eventos;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.EventosPage.*;

public class EventosTask implements Task {

    Eventos eventos;

    public EventosTask(Eventos eventos) {
        this.eventos = eventos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_EVENTOS),
                Click.on(BTN_EVENTOS),
                WaitElement.isClickable(FILTRO_EVENTOS),
                Click.on(FILTRO_EVENTOS),
                ScrollAndClick.scrollAndClick(eventos.getFiltro()),
                Click.on(BTN_FILTRAR_EVENTOS),
                WaitFor.aTime(3000),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista(),
                Scroll.scrollUnaVista()
        );

    }

    public static Performable eventosTask(Eventos eventos) {
        return instrumented(EventosTask.class, eventos);
    }
}
