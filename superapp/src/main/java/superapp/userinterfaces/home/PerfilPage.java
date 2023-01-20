package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PerfilPage extends PageObject {

    public static final Target PERFIL = Target.the("Ingresar al perfil").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup'] and ./*[@class='android.widget.ImageView'] and ./parent::*[./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]"));

    public static final Target TXT_TELEFONO = Target.the("Texto Telefono").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Teléfono fijo']]]"));


    public static final Target BTN_INICIAR_SESION = Target.the("Botón iniciar sesion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Inicia sesión']]"));
}
