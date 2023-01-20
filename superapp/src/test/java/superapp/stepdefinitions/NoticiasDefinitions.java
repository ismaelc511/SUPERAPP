package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.home.Noticias;
import superapp.tasks.home.Home2;
import superapp.tasks.home.NoticiasTask;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NoticiasDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion de superapp para ver las noticias$")
    public void ingresarALaAplicacionParaVerLasNoticias(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre el boton de notcias y filtra por una categoria o más categorias$")
    public void filtroPorUnaCategoriaOMásCategorias(List<Noticias> noticias2) {
        theActorInTheSpotlight().attemptsTo(NoticiasTask.noticiasTask(noticias2.get(0)));
    }

    @Entonces("^me muestra las noticias de esa categoria$")
    public void meMuestraLasNoticiasDeEsaCategoria() {

    }
}
