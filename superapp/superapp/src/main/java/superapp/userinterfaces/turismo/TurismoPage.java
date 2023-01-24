package superapp.userinterfaces.turismo;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TurismoPage extends PageObject {

    public static final Target BTN_TURISMO = Target.the("Boton de Turismo").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Turismo']]"));

    public static final Target SITIOS_TURISTICOS = Target.the("Sitios turisticos").located(MobileBy.xpath("//*[@text='Sitios turísticos más visitados…']"));

    public static final Target ELEGIR_SITIO = Target.the("Elegir sitio turistico").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Palacio de la Cultura Rafael Uribe Uribe']]"));



}
