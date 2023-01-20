package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

public class EmpleoPage extends PageObject {

    public static final Target BTN_EMPLEO = Target.the("Botón Empleo").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Empleo y Oportunidades']]"));

    public static final Target BTN_BUSQUEDA_VACANTES = Target.the("Boton busqueda de vacantes").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Búsqueda de Vacantes'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target BUSCADOR = Target.the("Buscador de empleo").located(MobileBy.xpath("//*[@class='android.widget.EditText']"));

    public static final Target LBL_COORDINADOR_COMERCIAL = Target.the("Etiqueta de coordinador comercial").located(MobileBy.xpath("//*[@text='Coordinador Comercial' and @class='android.widget.TextView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]"));
    public static final Target CONTADOR = Target.the("Etiqueta contador").located(MobileBy.xpath("//*[@text='Contador' and @class='android.widget.TextView' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]"));

    public static final Target COORDINADOR_COMERCIAL = Target.the("Etiqueta Coordinador comercial").located(MobileBy.xpath("//*[@text='Coordinador Comercial']"));

    public static final Target BTN_BUSCAR = Target.the("Botón de buscar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.EditText'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target ESCONDER_TECLADO_EMPLEO = Target.the("Esconder teclado").located(MobileBy.xpath("//*[@contentDescription='Sig.']"));

    public static final Target ELECTRONICA = Target.the("Seleccionar empleo").located(MobileBy.xpath("//*[@text='Electrónica']"));

    public static final Target BTN_APLICAR_VACANTE = Target.the("Botón Aplicar Vacante").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]"));

    public static final Target BTN_MEDELLIN_JOVEN = Target.the("Botón Medellín Joven").located(MobileBy.xpath("//*[@text='Medellín Joven']"));

    public static final Target DESPLEGABLE_CATEGORIA = Target.the("Desplegable de categoria").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[./*[@text='Seleccionar...']])[1]"));

    public static final Target DESPLEGABLE_COMUNA = Target.the("Desplegable de comuna").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target CATEGORIA = Target.the("Seleccionar categoria").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@text='Artes, Cultura Y Humanidades']]]"));
    public static final Target CONVOCATORIA = Target.the("Elegir convocatoria").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[./*[@text='30']] and ./*[@class='android.widget.ImageView']]]]"));

    public static final Target INSCRIBETE_AQUI = Target.the("Botón Inscribete").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='INSCRÍBETE AQUÍ']]"));

    public static final Target ACEPTAR_VER_OFERTAS = Target.the("Aceptar ver ofertas").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));
}
