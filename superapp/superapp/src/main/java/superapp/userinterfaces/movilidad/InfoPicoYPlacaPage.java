package superapp.userinterfaces.movilidad;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.apache.tools.ant.taskdefs.Tar;

public class InfoPicoYPlacaPage extends PageObject {

    public static final Target BTN_MOVILIDAD = Target.the("Boton de Movilidad").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Movilidad']]"));

    public static final Target CAMBIAR_PAGINA = Target.the("Cambiar pagina").located(MobileBy.xpath("//*[@text='\uF061' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[./*[@class='android.view.ViewGroup']]]]]"));

    public static final Target BTN_INFO_PICO_Y_PLACA = Target.the("Botón info de pico y placa").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Info de Pico y Placa']]"));

    public static final Target DIGITAR_PLACA = Target.the("Digitar placa").located(MobileBy.xpath("//*[@class='android.widget.EditText']"));

    public static final Target BTN_CONSULTAR = Target.the("Botón consultar").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Consultar']]"));

    public static final Target BTN_ACEPTAR = Target.the("Botón aceptar").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]"));

    public static final Target BTN_CONSULTAR_PAGO_MULTAS = Target.the("Botón consulta y pago de multas").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Consulta y pago de multas'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target CEDULA = Target.the("Cedula").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.widget.EditText'])[2]"));

    public static final Target BTN_CONSULTAR_MULTAS = Target.the("Consultar").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Consultar']]"));

    public static final Target SELECCIONAR_PAGO = Target.the("Seleccionar pago").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*[@class='android.widget.CheckBox'])[1]"));

    public static final Target BTN_PAGAR_AHORA = Target.the("Boton pagar ahora").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Pagar ahora']]"));

    public static final Target BTN_CONSULTA_EXENTOS = Target.the("Boton consulta de exentos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Consulta de Exentos']]"));
}
