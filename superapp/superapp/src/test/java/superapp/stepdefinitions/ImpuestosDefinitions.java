package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.autenticacion.Credencial;
import superapp.models.impuestos.Impuesto;
import superapp.questions.ValidateInformationText;
import superapp.tasks.home.Home2;
import superapp.tasks.impuestos.BotonDePagosTask;
import superapp.tasks.impuestos.ImpuestoPredialTask;
import superapp.tasks.impuestos.ImpuestosTask;
import superapp.tasks.impuestos.IndustriaYComercioTask;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static superapp.userinterfaces.autenticacion.impuestos.ImpuestosPage.LBL_IMPUESTO;

public class ImpuestosDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa al perfil de la app para ver los impuestos")
    public void ingresarPerfilDeLaAppParaVerImpuestos(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome() );
    }

    @Cuando("^hace clic sobre el boton de impuestos e inicia sesion$")
    public void haceClicSobreElBotonDeImpuestosEIniciaSesion(List<Credencial> credenciales) {
        theActorInTheSpotlight().attemptsTo(ImpuestosTask.impuestosIngresar(credenciales.get(0)));
    }


    @Cuando("^elije el periodo y el año$")
    public void elijeElPeriodoYElAño(List<Impuesto> impuestos) {
        theActorInTheSpotlight().attemptsTo(ImpuestoPredialTask.impuestosPredialTask(impuestos.get(0)));
        //theActorInTheSpotlight().attemptsTo(IndustriaYComercioTask.industriaYComercio());
        //theActorInTheSpotlight().attemptsTo(BotonDePagosTask.botonDePagos());
    }


    @Entonces("^se muestra la página de impuestos y el texto '(.*)'$")
    public void seMuestraLaPáginaDeImpuestos(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LBL_IMPUESTO),equalTo(texto)));
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para inductria y comercio")
    public void ingresarPerfilDeLaAppParaVerIndustriaYComercio(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome() );
    }

    @Cuando("^hace clic sobre el boton de impuestos e inicia sesion para ingresar a Industria y comercio$")
    public void haceClicSobreElBotonDeImpuestosEIniciaSesionParaIngresarAIndustiaYComercio(List<Credencial> credenciales) {
        theActorInTheSpotlight().attemptsTo(ImpuestosTask.impuestosIngresar(credenciales.get(0)));
    }

    @Cuando("^ingresa a tramites ágiles e impuestos y presiona industria y comercio$")
    public void ingresaATramitesÁgilesEImpuestosYPresionaIndustriaYComercio() {
        theActorInTheSpotlight().attemptsTo(IndustriaYComercioTask.industriaYComercio());
    }


    @Entonces("^podrás ver un certificado y el texto 'Certificado'$")
    public void podrásVerUnCertificadoYElTextoCertificado() {

    }

    @Dado("^que (.*) ingresa al perfil de la app para ver botón de pagos")
    public void ingresarPerfilDeLaAppParaVerElBotonDePagos(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome() );
    }

    @Cuando("^hace clic sobre el boton de impuestos e inicia sesion para ingresar a Botón de Pagos$")
    public void haceClicSobreElBotonDeImpuestosEIniciaSesionParaIngresarABotonDePagos(List<Credencial> credenciales) {
        theActorInTheSpotlight().attemptsTo(ImpuestosTask.impuestosIngresar(credenciales.get(0)));
    }

    @Cuando("^ingresa a tramites ágiles e impuestos y presiona botón de pagos$")
    public void ingresaATramitesÁgilesEImpuestosYPresionaBotonDePagos() {
        theActorInTheSpotlight().attemptsTo(BotonDePagosTask.botonDePagos());
    }


    @Entonces("^podrás ver pago de impuestos e historial de transacciones$")
    public void podrásVerPagoDeImpuestosEHistorialDeTransacciones() {

    }



}
