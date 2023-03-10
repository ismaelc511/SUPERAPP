package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.questions.ValidateInformationText;
import superapp.tasks.home.Home2;
import superapp.tasks.medellinencifras.educacionycultura.InglesEnMedellinTask;
import superapp.tasks.medellinencifras.educacionycultura.PruebasSaber11Task;
import superapp.tasks.medellinencifras.gubernamental.BeneficiosTask;
import superapp.tasks.medellinencifras.salud.Covid19Task;
import superapp.tasks.medellinencifras.salud.InmunidadDeRebaĂ±oTask;
import superapp.tasks.medellinencifras.salud.PesoYTallaTask;
import superapp.tasks.medellinencifras.salud.VacunacionTask;
import superapp.tasks.medellinencifras.seguridad.ExplotacionTask;
import superapp.tasks.medellinencifras.seguridad.HomicidiosTask;
import superapp.tasks.medellinencifras.seguridad.ViolenciaTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.*;

public class MedellinEnCifrasDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion de superapp para ver las cifras de Medellin$")
    public void ingresarALaAplicacionParaVerLasCifrasDeMedellin(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en seguridad y despuĂ©s violencia sexual$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSeguridadYDespuĂ©sViolenciaSexual() {
        theActorInTheSpotlight().attemptsTo(ViolenciaTask.seguridadTask());
    }


    @Entonces("^podrĂ© ver estadĂ­sticas sobre violencia sexual en Medellin y el texto '(.*)'$")
    public void podrĂ©VerEstadĂ­sticasSobreViolenciaSexualEnMedellin(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TEXTO_VIOLENCIA_SEXUAL),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion de superapp para ver las cifras de homicidio de Medellin$")
    public void ingresarALaAplicacionParaVerLasCifrasDeHomicidioDeMedellin(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en seguridad y despues analisis de los homicidios$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSeguridadYDespuesAnalisisHomicidios() {
        theActorInTheSpotlight().attemptsTo(HomicidiosTask.homicidiosTask());
    }

    @Entonces("^podrĂ© ver estadisticas sobre los anĂˇlisis del comportamiento de los homicidios y el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLosAnĂˇlisisDelComportamientoDeLosHomicidiosYElTexto(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TEXTO_HOMICIDIOS),equalTo(texto)));
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en seguridad y despues explotacion sexual$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSeguridadYDespuesExplotacionSexual() {
        theActorInTheSpotlight().attemptsTo(ExplotacionTask.explotacionTask());
    }

    @Entonces("^podrĂ© ver estadisticas sobre los anĂˇlisis del comportamiento de explotacion sexual y el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLosAnĂˇlisisDelComportamientoDeExplotacionSexualYElTexto(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TEXTO_EXPLOTACION_SEXUAL),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver las cifras del covid de Medellin$")
    public void ingresarALaAplicacionParaVerLasCifrasDeCovid19DeMedellin(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en salud y despues en covid$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSaludYDespuesEnCovid() {
        theActorInTheSpotlight().attemptsTo(Covid19Task.covid19Task());
    }


    @Entonces("^podrĂ© ver estadisticas sobre los anĂˇlisis del covid en Medellin con el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLosAnĂˇlisisDelCovidEnMedellin(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_COVID),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver los analisis de peso y talla al nacer$")
    public void ingresarALaAplicacionSuperappParaVerLosAnalisisDePesoYTallaAlNacer(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en salud y despues en peso y talla$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSaludYDespuesEnPesoYTalla() {
        theActorInTheSpotlight().attemptsTo(PesoYTallaTask.pesoYTallaTask());
    }


    @Entonces("^podrĂ© ver estadisticas sobre los anĂˇlisis del peso y talla al nacer con el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLosAnĂˇlisisDelPesoYTallaAlNacer(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_PESO_Y_TALLA),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver los analisis de inmunidad de rebaĂ±o$")
    public void ingresarALaAplicacionSuperappParaVerLosAnalisisDeInmunidadDeRebaĂ±o(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en salud y despues en inmunidad de rebaĂ±o$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSaludYDespuesEnInmunidadDeRebaĂ±o() {
        theActorInTheSpotlight().attemptsTo(InmunidadDeRebaĂ±oTask.inmunidadDeRebaĂ±oTask());
    }


    @Entonces("^podrĂ© ver estadisticas sobre la inmunidad de rebaĂ±o y ver el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLaInmunidadDeRebaĂ±o(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_INMUNIDAD),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver los analisis de la vacunacion covid 19$")
    public void ingresarALaAplicacionSuperappParaVerLosAnalisisDeLaVacunacionCovid19(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en salud y despues en vacunacion covid$")
    public void haceClicSobreMedellinEnCifrasLuegoEnSaludYDespuesEnVacunacionCovid() {
        theActorInTheSpotlight().attemptsTo(VacunacionTask.vacunacionTask());
    }

    @Entonces("^podrĂ© ver estadisticas sobre la vacunacion covid y ver el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLaVacunacionCovidYVerElTexto(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_VACUNACION),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver los analisis de las pruebas saber 11$")
    public void ingresarALaAplicacionSuperappParaVerLosAnalisisDeLasPruebasSaber11(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en educacion y cultura y despues en pruebas saber$")
    public void haceClicSobreMedellinEnCifrasLuegoEnEducacionYCulturaYDespuesEnPruebasSaber() {
        theActorInTheSpotlight().attemptsTo(PruebasSaber11Task.pruebasSaber11Task());
    }


    @Entonces("^podrĂ© ver estadisticas sobre las pruebas saber y ver el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreLasPruebasSaberYVerElTextoPruebasSaberICFES(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_PRUEBAS_SABER),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver los analisis del inglĂ©s en Medellin$")
    public void ingresarALaAplicacionSuperappParaVerLosAnalisisDelInglesEnMedellin(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en educacion y cultura y despues en ingles en medellin$")
    public void haceClicSobreMedellinEnCifrasLuegoEnEducacionYCulturaYDespuesEnInglesEnMedellin() {
        theActorInTheSpotlight().attemptsTo(InglesEnMedellinTask.inglesEnMedellinTask());
    }


    @Entonces("^podrĂ© ver estadisticas sobre el ingles en medellin y ver el texto '(.*)'$")
    public void podrĂ©VerEstadisticasSobreElInglesEnMedellinYVerElTextoInglĂ©sEnMedellĂ­n(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_INGLES_EN_MEDELLIN),equalTo(texto)));
    }

    @Dado("^ que '(.*)' ingresa a la aplicacion superapp para ver un informe de los beneficios de Medellin$")
    public void ingresarALaAplicacionSuperappParaVerUnInformeDeLosBeneficiosDeMedellin(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre Medellin en cifras, luego en gubernamental y despues en beneficios$")
    public void haceClicSobreMedellinEnCifrasLuegoEnGubernamentalYDespuesEnBeneficios() {
        theActorInTheSpotlight().attemptsTo(BeneficiosTask.beneficiosTask());
    }

    @Entonces("^podrĂ© ver un informe de los beneficios y ver el texto '(.*)'$")
    public void podrĂ©VerUnInformeDeLosBeneficiosYVerElTextoBeneficios(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(TXT_BENEFICIOS),equalTo(texto)));
    }

}
