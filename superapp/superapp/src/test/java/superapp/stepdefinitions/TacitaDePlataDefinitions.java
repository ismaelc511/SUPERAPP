package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.tacitadeplata.DatosTacitaDePlata;
import superapp.tasks.home.Home2;
import superapp.tasks.reportesciudadanos.RadicacionPQRSDTask;
import superapp.tasks.tacitadeplata.TacitaDePlataTask;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TacitaDePlataDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para conocer los horarios de recoleccion de basura$")
    public void queIsmaelIngresaALaAplicacionSuperappParaConocerLosHorariosDeRecoleccionDeBasura(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre reporte tacita de plata y selecciona un barrio$")
    public void haceClicSobreReporteTacitaDePlataYSeleccionaUnBarrio(List<DatosTacitaDePlata>datosTacitaDePlata) {
        theActorInTheSpotlight().attemptsTo(TacitaDePlataTask.tacitaDePlataTask(datosTacitaDePlata.get(0)));
    }

    @Cuando("^elige la ruta deseada$")
    public void eligeLaRutaDeseada() {

    }

    @Entonces("^aparece un pop-up con el horario$")
    public void apareceUnPopUpConElHorario() {

    }
}
