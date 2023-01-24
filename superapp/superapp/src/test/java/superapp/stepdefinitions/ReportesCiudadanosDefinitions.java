package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.registro.DatosPersonales;
import superapp.models.reportesciudadanos.*;
import superapp.tasks.home.Home;
import superapp.tasks.home.Home2;
import superapp.tasks.reportesciudadanos.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReportesCiudadanosDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para hacer un reporte$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnReporte(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^hace clic sobre reporte ciudadanos y realiza una PQRSD$")
    public void haceClicSobreReporteCiudadanosYRealizaUnaPQRSD(List<RadicacionPQRSD> radicacionPQRSDS) {
        theActorInTheSpotlight().attemptsTo(RadicacionPQRSDTask.radicacionPQRSD(radicacionPQRSDS.get(0)));
    }

    @Y("^hace clic en continuar e ingresa la siguiente informacion$")
    public void haceClicEnContinuarEIngresaLaSiguienteInformacion(List<RadicacionEspecifica> radicacionEspecificas) {
        theActorInTheSpotlight().attemptsTo(RadicacionInfoEspecifica.radicacionInfoEspecifica(radicacionEspecificas.get(0)));
    }

    @Entonces("^aparece el mensaje de confirmación con el texto '(.*)'$")
    public void apareceElMensajeDeConfirmaciónConElTexto(String arg1) {

    }


    @Dado("^que (.*) ingresa a la aplicacion superapp para consultar una PQRSD$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnaConsulta(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre reporte ciudadanos y realiza una consulta de PQRSD$")
    public void haceClicSobreReporteCiudadanosYRealizaUnaConsultaDePQRSD(List<ConsultarPQRSD> consultarPQRSDS) {
        theActorInTheSpotlight().attemptsTo(ConsultarPQRS.consultarPQRS(consultarPQRSDS.get(0)));
    }

    @Entonces("^aparece la informacion sobre la PQRSD$")
    public void apareceLaInformacionSobreLaPQRSD() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para saber qué son PQRSD$")
    public void queIsmaelIngresaALaAplicacionSuperappParaSaberQuéSonPQRSD(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^hace clic sobre reporte ciudadanos y quiere entender que es una PQRSD$")
    public void haceClicSobreReporteCiudadanosYQuiereEntenderQueEsUnaPQRSD() {
        theActorInTheSpotlight().attemptsTo(QuieroEntenderQueSonPQRS.quieroEntenderQueSonPQRS());
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para hacer un reporte de puntos criticos$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnReporteDePuntosCriticos(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }

    @Cuando("^ingresa esta informacion$")
    public void ingresaEstaInformacion(List<DatosPuntosCriticos> datosPuntosCriticos) {
        theActorInTheSpotlight().attemptsTo(PuntosCriticosDeBasura.puntosCriticosDeBasura(datosPuntosCriticos.get(0)));
    }

    @Entonces("^aparece una confirmacion$")
    public void apareceUnaConfirmacion() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para hacer un reporte de huecos y baches$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnReporteDeHuecosYBaches(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^ingresa la informacion necesaria$")
    public void ingresaLaInformacionNecesaria(List<DatosHuecosYBaches> datosHuecosYBaches) {
        theActorInTheSpotlight().attemptsTo(HuecosYBachesTask.huecosYBachesTask(datosHuecosYBaches.get(0)));
    }

    @Entonces("^aparece una confirmacion de la solicitud$")
    public void apareceUnaConfirmacionDeLaSolicitud() {

    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para hacer un reporte de nido de abejas$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnReporteDeNidoDeAbejas(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^ingresa la informacion relacionada$")
    public void ingresaLaInformacionRelacionada(List<NidoAbejas> datosNidoAbejas) {
        theActorInTheSpotlight().attemptsTo(NidoAbejasTask.nidoAbejasTask(datosNidoAbejas.get(0)));
    }

    @Entonces("^aparece una confirmacion de la solicitud realizada$")
    public void apareceUnaConfirmacionDeLaSolicitudRealizada() {

    }


    @Dado("^que (.*) ingresa a la aplicacion superapp para hacer un reporte de alumbrado publico$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnReporteDeAlumbradoPublico(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^ingresa la informacion para el reporte$")
    public void ingresaLaInformacionParaElReporte(List<DatosAlumbradoPublico> datosAlumbradoPublico) {
        theActorInTheSpotlight().attemptsTo(AlumbradoPublicoTask.alumbradoPublicoTask(datosAlumbradoPublico.get(0)));
    }

    @Dado("^que (.*) ingresa a la aplicacion superapp para hacer un reporte de contenedores de basura$")
    public void queIsmaelIngresaALaAplicacionSuperappParaHacerUnReporteDeContenedoresDeBasura(String actor) {
        theActorCalled(actor).attemptsTo(Home2.entrarAlHome());
    }


    @Cuando("^ingresa la informacion para hacer el reporte$")
    public void ingresaLaInformacionParaHacerElReporte(List<DatosContenedoresDeBasura> datosContenedoresDeBasuras) {
        theActorInTheSpotlight().attemptsTo(ContenedoresDeBasuraTask.contenedoresDeBasuraTask(datosContenedoresDeBasuras.get(0)));
    }

    @Entonces("^aparece una confirmacion de la solicitud de contenedores de basura$")
    public void apareceUnaConfirmacionDeLaSolicitudDeContenedoresDeBasura() {

    }


}
