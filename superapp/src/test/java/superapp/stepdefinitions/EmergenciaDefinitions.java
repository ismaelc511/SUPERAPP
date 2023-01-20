package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.tasks.home.Emergencias;
import superapp.tasks.home.Home;
import superapp.tasks.home.Home2;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmergenciaDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp$")
    public void queIsmaelIngresaALaAplicacionSuperapp(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^selecciona el boton de emergencias$")
    public void seleccionaElBotonDeEmergencias() {
        theActorInTheSpotlight().attemptsTo(Emergencias.emergencias());
    }

    @Cuando("^selecciona el boton de llama ya$")
    public void seleccionaElBotonDeLlamaYa() {

    }

    @Entonces("^se redirige al teclado del telefono$")
    public void seRedirigeAlTecladoDelTelefono() {

    }
}
