package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EventosPage extends PageObject {

    public static final Target BTN_EVENTOS = Target.the("Boton Noticias").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Eventos']]"));

    public static final Target FILTRO_EVENTOS = Target.the("Opción de filtrado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Filtrar']]]"));

    public static final Target OPCION_FILTRO = Target.the("Opcion Filtro").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@text='DAGRD']]]"));

    public static final Target BTN_FILTRAR_EVENTOS = Target.the("Botón filtrar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Filtrar']]"));
}