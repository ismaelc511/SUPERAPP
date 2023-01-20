package superapp.userinterfaces.medellinencifras;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SeguridadPage extends PageObject {

    public static final Target BTN_MEDELLIN_EN_CIFRAS = Target.the("Botón de medellin en cifrás").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Medellín en Cifras']]"));

    public static final Target BTN_SEGURIDAD = Target.the("Botón seguridad").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Seguridad']]"));

    public static final Target ACEPTAR_COOKIES = Target.the("Aceptar Cookies").located(MobileBy.xpath("//*[@text='Aceptar todas las cookies']"));

    public static final Target ACEPTAR_COOKIES_HOMICIDIO = Target.the("Aceptar cookies en homicidios").located(MobileBy.xpath("//*[@text='Aceptar todas las cookies']"));
    public static final Target BTN_VIOLENCIA_SEXUAL = Target.the("Botón violencia sexual").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Violencia Sexual']]"));

    public static final Target TEXTO_VIOLENCIA_SEXUAL = Target.the("Texto violencia sexual").located(MobileBy.xpath("//*[@text='Violencia Sexual']"));

    public static final Target BTN_HOMICIDIO = Target.the("Botón homicidios").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Análisis Comportamiento de l...']]"));

    public static final Target TEXTO_HOMICIDIOS = Target.the("Texto de homicidios").located(MobileBy.xpath("//*[@text='Análisis Comportamiento de los Homicidios de la Ciudad - SATMED']"));

    public static final Target TEXTO_EXPLOTACION_SEXUAL = Target.the("Texto explotacion sexual").located(MobileBy.xpath("//*[@text='Análisis Comportamiento del fenómeno de Explotación Sexual y Comercial de Niños, Niñas y Adolescentes de la Ciudad - SATMED']"));

    public static final Target BTN_EXPLOTACION = Target.the("Boton explotacion sexual").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Explotación Sexual y Comerci...']]"));

    public static final Target BTN_COVID_19 = Target.the("Boton covid 19").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='COVID 19 - Medellín']]"));

    public static final Target BTN_SALUD = Target.the("Boton salud").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Salud'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target TXT_COVID = Target.the("Texto de covid 19").located(MobileBy.xpath("//*[@text='COVID 19 - Medellín']"));

    public static final Target BTN_PESO_Y_TALLA = Target.the("Botón de peso y talla").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Análisis de peso y talla al ...']]"));

    public static final Target TXT_PESO_Y_TALLA = Target.the("Texto de peso y talla").located(MobileBy.xpath("//*[@text='Análisis de Bajo Peso al Nacer de Niños y Niñas Nacidos vivos desde el 2016']"));

    public static final Target INMUNIDAD_DE_REBANO = Target.the("Inmunidad de rebano").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Inmunidad de rebaño']]"));

    public static final Target TXT_INMUNIDAD = Target.the("Texto inmunidad de rebano").located(MobileBy.xpath("//*[@text='Inmunidad de rebaño']"));

    public static final Target TXT_VACUNACION = Target.the("Texto vacunacion").located(MobileBy.xpath("//*[@text='Vacunación COVID 19']"));

    public static final Target BTN_VACUNACION = Target.the("Botón Vacunación").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Vacunación COVID 19']]"));

    public static final Target BTN_EDUCACION_Y_CULTURA = Target.the("Botón Educación y cultura").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Educación y Cultura'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target BTN_PRUEBAS_SABER_11 = Target.the("Botón pruebas saber 11").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Pruebas Saber 11 ICFES']]"));

    public static final Target TXT_PRUEBAS_SABER = Target.the("Texto de pruebas saber").located(MobileBy.xpath("//*[@text='Pruebas Saber 11 ICFES']"));

    public static final Target BTN_INGLES_EN_MEDELLIN = Target.the("Botón ingles en Medellin").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Inglés en Medellín']]"));


    public static final Target TXT_INGLES_EN_MEDELLIN = Target.the("Texto inglés en Medellin").located(MobileBy.xpath("//*[@text='Inglés en Medellín']"));


    public static final Target BTN_GUBERNAMENTAL = Target.the("Botón gubernamental").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Gubernamental']]"));


    public static final Target BTN_BENEFICIOS = Target.the("Botón de beneficios").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Beneficios']]"));

    public static final Target TXT_BENEFICIOS = Target.the("Texto de beneficios").located(MobileBy.xpath("//*[@text='Beneficios']"));
}
