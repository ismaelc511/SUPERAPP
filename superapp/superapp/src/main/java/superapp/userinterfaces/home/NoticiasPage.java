package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NoticiasPage extends PageObject {

    public static final Target BTN_NOTICIAS = Target.the("Boton Noticias").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Noticias']]"));

    public static final Target FILTRO = Target.the("Opción de filtrado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Filtrar']]]"));

    public static final Target OPCION_FILTRO = Target.the("Opcion Filtro").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@text='DAGRD']]]"));

    public static final Target BTN_FILTRAR = Target.the("Botón filtrar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Filtrar']]"));
}
