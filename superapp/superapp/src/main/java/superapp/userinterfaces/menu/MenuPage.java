package superapp.userinterfaces.menu;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject {

    public static final Target BTN_PERFIL = Target.the("Boton Perfil").located(MobileBy.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[@class='android.view.ViewGroup']]]]]]]]]/*[@class='android.view.ViewGroup'])[13]/*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']])[2]"));


}


