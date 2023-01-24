package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.autenticacion.Credencial;
import superapp.models.movilidad.InfoPicoYPlaca;
import superapp.tasks.home.Home2;
import superapp.tasks.home.NoticiasTask;
import superapp.tasks.movilidad.ConsultaDeExentos;
import superapp.tasks.movilidad.ConsultaYPagoDeMultasTask;
import superapp.tasks.movilidad.InfoPicoYPlacaTask;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MovilidadDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion de superapp para ver el pico y plata$")
    public void ingresarALaAplicacionDeSuperAppParaVerElPicoYPlaca(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre el boton de info de Pico y Placa y digita la placa$")
    public void haceClicSobreElBotonDeInfoDePicoYPlacaYDigitaLaPlaca(List<InfoPicoYPlaca> placa) {
        theActorInTheSpotlight().attemptsTo(InfoPicoYPlacaTask.infoPicoYPlacaTask(placa.get(0)));

    }


    @Entonces("^me muestra informacion sobre Pico y Placa$")
    public void meMuestraInformacionSobrePicoYPlaca() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para consultar y pagar multas$")
    public void queIsmaelIngresaALaAplicacionSuperappParaConsultarYPagarMultas(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre el boton de Consulta y pago de multas$")
    public void haceClicSobreElBotonDeConsultaYPagoDeMultas(List<Credencial> credenciales) {
        theActorInTheSpotlight().attemptsTo(ConsultaYPagoDeMultasTask.consultaYPagoDeMultasTask(credenciales.get(0)));

    }

    @Entonces("^me muestra informacion sobre multas$")
    public void meMuestraInformacionSobreMultas() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para consultar exentos de multas$")
    public void queIsmaelIngresaALaAplicacionSuperappParaConsultarExentosDeMultas(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre el boton de consultar de exentos$")
    public void haceClicSobreElBotonDeConsultarDeExentos(List<InfoPicoYPlaca> placa) {
        theActorInTheSpotlight().attemptsTo(ConsultaDeExentos.consultaDeExentos(placa.get(0)));

    }

    @Entonces("^me muestra informacion sobre Exentos$")
    public void meMuestraInformacionSobreExentos() {

    }


}
