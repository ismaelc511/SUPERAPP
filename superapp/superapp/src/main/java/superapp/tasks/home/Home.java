package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.autenticacion.LoginPage.BTN_INICIA_SESION;
import static superapp.userinterfaces.home.HomePage.BTN_SALTAR;
import static superapp.userinterfaces.home.PerfilPage.BTN_INICIAR_SESION;
import static superapp.userinterfaces.home.PerfilPage.PERFIL;
import static superapp.userinterfaces.menu.MenuPage.BTN_PERFIL;

public class Home implements Task {


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitElement.isClickable(BTN_SALTAR),
            Click.on(BTN_SALTAR),
            WaitElement.isClickable(PERFIL),
            Click.on(PERFIL),
            WaitElement.isClickable(BTN_INICIAR_SESION),
            Click.on(BTN_INICIAR_SESION)
            );
            //WaitElement.isClickable(BTN_INICIA_SESION));
  }

  public static Performable seleccionarPerfil() {
    return instrumented(Home.class);
  }
}
