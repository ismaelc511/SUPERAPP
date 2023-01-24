package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.turismo.LugarTuristico;
import superapp.tasks.home.Home2;
import superapp.tasks.tacitadeplata.TacitaDePlataTask;
import superapp.tasks.turismo.BuscarLugarTuristicoTask;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TurismoDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para ver lugares de turismo$")
    public void queIsmaelIngresaALaAplicacionSuperappParaVerLugaresDeTurismo(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre el boton de turismo e ingresa el lugar al que quiere ir$")
    public void haceClicSobreElBotonDeTurismoEIngresaElLugarAlQueQuiereIr(List<LugarTuristico> lugarTuristico) {
        theActorInTheSpotlight().attemptsTo(BuscarLugarTuristicoTask.buscarLugarTuristicoTask(lugarTuristico.get(0)));
    }

    @Entonces("^me muestra informacion sobre el lugar ingresado$")
    public void meMuestraInformacionSobreElLugarIngresado() {

    }


}
