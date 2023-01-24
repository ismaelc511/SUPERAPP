package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class BuscadorPage extends PageObject {

    public static final Target INPUT_BUSCADOR = Target.the("Input buscador").located(MobileBy.xpath("//*[@class='android.widget.EditText']"));

    public static final Target LUPITA = Target.the("Lupita de busqueda").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.EditText'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target NOTICIAS = Target.the("Encuentra las noticias").located(MobileBy.xpath("//*[@text='Noticias' and @class='android.widget.TextView']"));

    public static final Target EVENTOS = Target.the("Encuentra los eventos").located(MobileBy.xpath("//*[@text='Eventos y jornadas' and @class='android.widget.TextView']"));

    public static final Target EVENTOS_Y_JORNADAS = Target.the("Eventos y Jornadas").located(MobileBy.xpath("//*[@text='Eventos y jornadas' and @class='android.widget.TextView']"));

    public static final Target LBL_EVENTOS = Target.the("Label de eventos").located(MobileBy.xpath("//*[@text='Eventos animal']"));
}
                                                                                                                            //*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.EditText'] and ./*[@class='android.widget.ImageView']]