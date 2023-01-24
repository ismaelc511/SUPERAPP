package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.autenticacion.Credencial;
import superapp.models.bienestaranimal.ReportarAnimalExtraviado;
import superapp.tasks.autentication.LoginTask;
import superapp.tasks.bienestaranimal.*;
import superapp.tasks.home.Home;
import superapp.tasks.home.Home2;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BienestarAnimalDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para reportar un animal extraviado$")
    public void queIsmaelIngresaALaAplicacionSuperappParaReportarUnAnimalExtraviado(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre el boton de reportar animales extraviados e ingresa los datos$")
    public void haceClicSobreElBotonDeReportarAnimalesExtraviadosEIngresaLosDatos(List<ReportarAnimalExtraviado> reporteAnimal) {
        theActorInTheSpotlight().attemptsTo(ReportarAnimalExtraviadoTask.reportarAnimalExtraviadoTask(reporteAnimal.get(0)));
    }

    @Cuando("^ingresa ubicacion y contacto$")
    public void ingresaUbicacionYContacto(List<ReportarAnimalExtraviado> reporteAnimal) {
        theActorInTheSpotlight().attemptsTo(IngresarUbicacionYContactoTask.ingresarUbicacionYContactoTask(reporteAnimal.get(0)));
    }

    @ Entonces("^aparece un pop-up con la confirmacion$")
    public void apareceUnPopUpConLaConfirmacion() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para adoptar un animal$")
    public void queIsmaelIngresaALaAplicacionSuperappParaAdoptarUnAnimal(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre el boton de filtrar animales de compania$")
    public void haceClicSobreElBotonDeFiltrarAnimalesDeCompania() {
        theActorInTheSpotlight().attemptsTo(AdopcionAnimalesTask.adopcionAnimalesTask());
    }

    @Entonces("^aparecen los animales filtrados$")
    public void aparecenLosAnimalesFiltrados() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para ver jornadas de adopcion$")
    public void queIsmaelIngresaALaAplicacionSuperappParaVerJornadasDeAdopcion(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic en el boton de eventos y jornadas$")
    public void haceClicEnElBotonDeEventosYJornadas() {
        theActorInTheSpotlight().attemptsTo(EventosAnimalTask.eventosAnimalTask());
    }

    @Entonces("^prodrá ver los diferentes eventos que estan programados$")
    public void prodráVerLosDiferentesEventosQueEstanProgramados() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para ver animales extraviados$")
    public void queIsmaelIngresaALaAplicacionSuperappParaVerAnimalesExtraviados(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic en el boton de ver animales extraviados$")
    public void haceClicEnElBotonDeVerAnimalesExtraviados(List<Credencial> credencial) {
        theActorInTheSpotlight().attemptsTo(VerAnimalesExtraviadas.verAnimalesExtraviadas(credencial.get(0)));
    }

    @Entonces("^prodrá ver los animales extraviados$")
    public void prodráVerLosAnimalesExtraviados() {

    }
}
