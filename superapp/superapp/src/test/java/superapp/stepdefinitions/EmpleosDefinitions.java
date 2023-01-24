package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.home.Busqueda;
import superapp.models.home.Empleo;
import superapp.models.home.MedellinJoven;
import superapp.questions.ValidateInformationText;
import superapp.tasks.home.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static superapp.userinterfaces.home.EmpleoPage.CONTADOR;
import static superapp.userinterfaces.home.EmpleoPage.COORDINADOR_COMERCIAL;

public class EmpleosDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que '(.*)' ingresa a la aplicacion superapp para buscar un empleo$")
    public void queIsmaelIngresaALaAplicacionSuperappParaBuscarUnEmpleo(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre el boton de empleos e ingresa una palabra al buscador$")
    public void ingresaUnaPalabraAlBuscador(List<Empleo> empleos) {
        theActorInTheSpotlight().attemptsTo(EmpleosTask.empleosTask(empleos.get(0)));
    }

    @Entonces("^aparecen los empleos con esa palabra '(.*)'$")
    public void aparecenLosServiciosConEsaPalabra(String empleo) {
            theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(COORDINADOR_COMERCIAL),equalTo(empleo)));
    }

    @Dado("^que '(.*)' ingresa a la aplicacion superapp para inscribirse en Medellin Joven$")
    public void queIsmaelIngresaALaAplicacionSuperappParaInscribirseEnMedellinJoven(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre el boton de Medellin Joven y buscar por categoria y filtrar por comuna y escoger una convocatoria$")
    public void haceClicSobreElBotonDeMedellinJovenYBuscaPorCategoriaYFiltraPorComuna(List<MedellinJoven> medellinJovens) {
        theActorInTheSpotlight().attemptsTo(MedellinJovenTask.medellinJovenTask(medellinJovens.get(0)));
    }

    @Entonces("^podrá ver información de la convocatoria$")
    public void podraVerInformacionDeLaConvocatoria() {

    }
}
