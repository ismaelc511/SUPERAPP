package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import superapp.interactions.scroll.ValidarTexto;
import superapp.models.home.Busqueda;
import superapp.questions.ValidateInformationText;
import superapp.tasks.home.Home2;
import superapp.tasks.home.IngresarBusqueda;
import superapp.tasks.home.SeleccionarEvento;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static superapp.userinterfaces.home.BuscadorPage.*;

public class BuscadorDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion de superapp$")
    public void ingresarPerfil(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^ingresa una palabra al buscador$")
    public void ingresaUnaPalabraAlBuscador(List<Busqueda> busqueda) {
        theActorInTheSpotlight().attemptsTo(new IngresarBusqueda(busqueda.get(0)));
    }

    @Entonces("^aparecen los servicios con esa palabra '(.*)'$")
    public void aparecenLosServiciosConEsaPalabra(String servicio) {
        theActorInTheSpotlight().attemptsTo(ValidarTexto.validarTexto(servicio));
    }
}
