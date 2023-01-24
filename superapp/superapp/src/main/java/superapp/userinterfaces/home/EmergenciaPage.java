package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class EmergenciaPage extends PageObject {

    public static final Target BTN_EMERGENCIAS = Target.the("Boton Emergencias").located(MobileBy.xpath("//*[@class='android.widget.Button' and ./*[@text='Emergencias']]"));

    public static final Target BTN_AYUDA_123 = Target.the("Boton Ayuda 123").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Ayuda en 1 2 3']]"));
}
