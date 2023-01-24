package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.autenticacion.Credencial;
import superapp.questions.ValidateInformationText;
import superapp.tasks.autentication.*;
import superapp.tasks.home.Home;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static superapp.userinterfaces.home.HomePage.*;

public class AutenticacionDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa al perfil de la app para loguearse$")
    public void queIsmaelIngresaAlPerfilDeLaAppParaLoguearse(String actor) {
        theActorCalled(actor).attemptsTo(Home.seleccionarPerfil());
    }

    @Cuando("^ingresa sus credenciales de la app")
    public void ingresarSusCredencialesDeLaApp(List<Credencial> credencial) {
        theActorInTheSpotlight().attemptsTo(LoginTask.iniciarSesion(credencial.get(0)));
    }
    @Entonces("^el valida que el usuario autenticado es (.*)$")
    public void elValidaQueElUsuarioAutenticadoEs(String usuario){
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LBL_USUARIO),equalTo(usuario)));
    }

    @Y("^cierra sesion de superapp$")
    public void cierraSesionDeSuperapp(){
        theActorInTheSpotlight().attemptsTo(SingOffTask.cerrarSesion());
    }

    @Dado("^que (.*) ingresa al perfil de la app$")
    public void queIsmaelIngresaAlPerfilDeLaApp(String actor) {
        theActorCalled(actor).attemptsTo(Home.seleccionarPerfil());
    }
    @Cuando("^selecciona el boton de facebook e ingresa sus credenciales de facebook$")
    public void seleccionaElBotonDeFacebookEingresaSusCredencialesDeFacebook(List<Credencial> credencial) {
        theActorInTheSpotlight().attemptsTo(LoginFacebookTask.iniciarSesionConFacebook(credencial.get(0)));
    }

    @Entonces("^el valida el usuario autenticado con facebook es (.*)$")
    public void elValidaElUsuarioAutenticadoConFacebookEsOpenUser(String usuario) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LBL_USUARIO_FACEBOOK),equalTo(usuario)));
    }

    @Y("^cierra sesion de superapp desde facebook$")
    public void cierraSesionDeSuperappDesdeFacebook(){
        theActorInTheSpotlight().attemptsTo(SingOffTask.cerrarSesion());
    }

    @Dado("^que (.*) ingresa al perfil de la app para loguearse a traves de Google")
    public void ingresarPerfil2(String actor) {
        theActorCalled(actor).attemptsTo(Home.seleccionarPerfil());
    }

    @Cuando("^selecciona el botón de Cuenta de Google")
    public void seleccionaElbotondeCuentDeGoogle() {
        theActorInTheSpotlight().attemptsTo(LoginGoogleTask.iniciarSesionConGoogle());
    }

    @Entonces("^el valida que el usuario autenticado con Google es (.*)$")
    public void ElValidaQueElUsuarioAutenticadoConGoogleEs(String usuario){
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LBL_USUARIO_GOOGLE),equalTo(usuario)));
    }

    @Y("^cierra sesion de Google$")
    public void cierraSesionDeGoogle(){
        theActorInTheSpotlight().attemptsTo(SignOffGoogleTask.cerrarSesionGoogle());
    }

    @Dado("^que (.*) ingresa al perfil de la app para loguearse a traves de Linkedin")
    public void ingresaAlPerfilDeLaAppParaLoguearseATravesDeLinkedin(String actor) {
        theActorCalled(actor).attemptsTo(Home.seleccionarPerfil());
    }
    @Cuando("^selecciona el boton de linkedin e ingresa sus credenciales de linkedin$")
    public void seleccionaElBotonDeLinkedinEIngresaSusCredencialesDeLinkedin(List<Credencial> credencial) {
        theActorInTheSpotlight().attemptsTo(LoginLinkedinTask.iniciarSesionConLinkedin(credencial.get(0)));
    }

    @Entonces("^el valida que el nombre del usuario autenticado con linkedin es (.*)$")
    public void elValidaQueElUsuarioAutenticadoConLinkedinEs(String usuario) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LBL_USUARIO_LINKEDIN),equalTo(usuario)));
    }

    @Y("^cierra sesion de superapp desde linkedin$")
    public void cierraSesionDeSuperappDesdeLinkedin(){
        theActorInTheSpotlight().attemptsTo(SingOffTask.cerrarSesion());
    }


}
