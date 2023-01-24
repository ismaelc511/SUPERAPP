package superapp.userinterfaces.autenticacion;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target TXT_USUARIO = Target.the("Ingresar Usuario").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='\uF225']]]"));

    public static final Target INPUT_USUARIO = Target.the("Input usuario").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.EditText'] and ./*[./*[@text='\uF225']]]"));
    public static final Target TXT_PASSWORD = Target.the("Ingresar Password").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='\uF2B7']]]"));
    public static final Target BTN_INICIA_SESION = Target.the("Boton Inicia Sesion").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]]]/*[@class='android.view.ViewGroup' and ./*[@text]])[1]"));
    public static final Target BTN_INGRESAR = Target.the("Boton Ingresar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Ingresar ahora']] "));

    public static final Target BTN_INGRESAR_IMPUESTOS = Target.the("Botón de ingresar impuestos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Ingresar']]"));
    public static final Target BARRA_PROGRESO = Target.the("Barra de progreso").located(MobileBy.xpath("//*[@class='android.widget.ProgressBar']"));

    public static final Target BTN_GOOGLE = Target.the("Boton inicia con Google").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup' and ./*[@text] and ./*[@class='android.widget.ImageView']])[3]"));

    public static final Target BTN_EQUIS = Target.the("Botón equis").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]]]]]]]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[1]"));
    public static final Target BTN_FACEBOOK = Target.the("Botón inicia con Facebook").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Con tu red social Facebook'] and ./*[@class='android.widget.ImageView']]"));
    public static final Target CUENTA_GOOGLE = Target.the("Escoger Cuenta de Google").located(MobileBy.xpath("//*[@id='container' and @class='android.widget.LinearLayout' and ./*[./*[@text='ismaelc@unicauca.edu.co']] and ./*[@id='account_particle_disc']]"));

    public static final Target BTN_LINKEDIN = Target.the("Botón inicia con lINKEDIN").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Con tu cuenta de Linkedin']]"));

    public static final Target CAMPO_EMAIL = Target.the("Campo para ingresar email").located(MobileBy.xpath("//*[@id='username']"));

    public static final Target CAMPO_PASSWORD = Target.the("Campo para ingresar contraseña").located(MobileBy.xpath("//*[@id='password']"));

    public static final Target BTN_INICIA_SESION_CON_LINKEDIN = Target.the("Boton Inicia Sesion con Linkedin").located(MobileBy.xpath("//*[@text='Iniciar sesión']"));

    public static final Target EMAIL_FACEBOOK = Target.the("Campo email de facebook").located(MobileBy.xpath("//*[@contentDescription='Nombre de usuario']"));

    public static final Target PASSWORD_FACEBOOK = Target.the("Campo contraseña de facebook").located(MobileBy.xpath("//*[@contentDescription='Contraseña']"));

    public static final Target BTN_INICIA_SESION_FACEBOOK = Target.the("Inicia sesion con facebook").located(MobileBy.xpath("//*[@contentDescription='Iniciar sesión']"));

    public static final Target BTN_ACEPTAR_CONTRASENA_INCORRECTA = Target.the("Aceptar contraseña incorrecta").located(MobileBy.xpath("//*[@text='ACEPTAR']"));

    public static final Target LBL_USUARIO_LINKEDIN = Target.the("Label de usuario de linkedin").located(MobileBy.xpath("//*[@text='ISMAEL ALEXANDER CARVAJAL GONZALEZ']"));

}
