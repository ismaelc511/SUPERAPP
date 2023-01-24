package superapp.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import superapp.models.autenticacion.Credencial;
import superapp.models.registro.DatosComplementarios;
import superapp.models.registro.DatosDireccion;
import superapp.models.registro.DatosPersonales;
import superapp.questions.ValidateInformationText;
import superapp.tasks.autentication.LoginTask;
import superapp.tasks.home.Home;
import superapp.tasks.registro.RegistrarInformacionComplementariaTasks;
import superapp.tasks.registro.RegistrarInformacionDeDireccionTask;
import superapp.tasks.registro.RegistrarInformacionPersonalTask;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.TXT_BENEFICIOS;
import static superapp.userinterfaces.registro.RegisterPage.LBL_REGISTRO_EXITOSO;

public class RegistroDefinitions {

    @Before
    public void initScenario(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa para registrarse en al perfil de la app")
    public void ingresarPerfil(String actor) {
        theActorCalled(actor).attemptsTo(Home.seleccionarPerfil());
    }

    @Cuando("^selecciona el boton de registro e ingresa su informacion personal$")
    public void seleccionaElBotonDeRegistroEIngresaSuInformacionPersonal(List<DatosPersonales> datosPersonales) {

        theActorInTheSpotlight().attemptsTo(new RegistrarInformacionPersonalTask(datosPersonales.get(0)));
    }


    @Cuando("^ingresa su informacion complementaria$")
    public void ingresaSuInformacionComplementaria(List<DatosComplementarios> datosComplementarios) {
        theActorInTheSpotlight().attemptsTo(new RegistrarInformacionComplementariaTasks(datosComplementarios.get(0)));
    }

    @Cuando("^ingresa su direccion$")
    public void ingresaSuDireccion(List<DatosDireccion> datosDireccion) {
        theActorInTheSpotlight().attemptsTo(new RegistrarInformacionDeDireccionTask(datosDireccion.get(0)));
    }

    @Entonces("^el recibe una notificacion de que se envio la contraseña al correo con el texto '(.*)'$")
    public void elRecibeUnaNotificacionDeQueSeEnvioLaContraseñaAlCorreo(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LBL_REGISTRO_EXITOSO),equalTo(texto)));
    }
}
