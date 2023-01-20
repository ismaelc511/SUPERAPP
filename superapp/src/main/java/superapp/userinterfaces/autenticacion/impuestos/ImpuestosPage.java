package superapp.userinterfaces.autenticacion.impuestos;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;

public class ImpuestosPage extends PageObject {

    public static final Target BTN_IMPUESTOS = Target.the("Botón de impuestos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Trámites e Impuestos']]"));
    public static final Target CONTINUAR = Target.the("Continuar advertencia").located(MobileBy.xpath("//*[@class='android.view.View']"));

    public static final Target INICIA_SESION = Target.the("Inicia sesión").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='\uF007']]"));

    public static final Target CERRAR = Target.the("Cerrar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Cerrar sesión']]"));

    public static final Target BTN_IMPUESTO_PREDIAL = Target.the("Botón impuesto predial").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Impuesto Predial']]"));

    public static final Target CONSULTAR = Target.the("Botón de consultar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Consultar']]"));

    public static final Target ELIGE_PERIODO = Target.the("Elegir periodo").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Consultar el impuesto predial']]/*[./*[@text='Seleccionar...']])[1]"));


    public static final Target TRAMITES_AGILES = Target.the("Trámites agiles e impuestos").located(MobileBy.xpath("//*[@text='Trámites ágiles e impuestos']"));

    public static final Target ACEPTAR_PERIODO = Target.the("Aceptar periodo").located(MobileBy.xpath("//*[@text='Aceptar']"));

    public static final Target AÑO = Target.the("Año de consulta de impuesto predial").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target ACEPTAR_AÑO = Target.the("Aceptar año").located(MobileBy.xpath("//*[@text='Aceptar']"));


    public static final Target CONSULTAR_IMPUESTO_PREDIAL = Target.the("Consultar impuesto predial").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Consultar']]"));


    public static final Target ACEPTAR_WARNING = Target.the("Aceptar Warning").located(MobileBy.xpath("//*[@class='android.view.View']"));


    public static final Target CERTIFICADO = Target.the("Certificado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Certificado'] and ./*[@class='android.widget.ImageView']]"));


    public static final Target ACEPTAR_ERROR_CERTIFICADO = Target.the("Aceptar Warning de certificado").located(MobileBy.xpath("//*[@class='android.view.View']"));


    public static final Target LBL_IMPUESTO = Target.the("Etiqueta de impuesto").located(MobileBy.xpath("//*[@text='Impuesto Predial']"));


    public static final Target BTN_INDUSTRIA_Y_COMERCIO = Target.the("Botón de industria y comercio").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Industria y Comercio']]"));

    public static final Target BTN_INSCRITO_NO_INSCRITO = Target.the("Botón de Inscrito/No inscrito").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Inscrito/No Inscrito']]"));
    public static final Target DEVOLVER = Target.the("Devolver").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']])[2]"));


    public static final Target VER_CERTIFICADO = Target.the("Ver certificado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Inscrito/No Inscrito'] and ./*[@text='Ver certificado']]"));


    public static final Target DESCARGAR_DOCUMENTO = Target.the("Descargar documento").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Descargar Documento']]"));


    public static final Target ACEPTAR_ALERTA_DESCARGA = Target.the("Aceptar alerta").located(MobileBy.xpath("//*[@class='android.view.View']"));

    public static final Target ACEPTAR_ALERTA_ERROR = Target.the("Aceptar error").located(MobileBy.xpath("//*[@class='android.view.View']"));
    public static final Target ACEPTAR_DESCARGA = Target.the("Aceptar descarga").located(MobileBy.xpath("//*[@class='android.view.View']"));
    public static final Target CANCELACION = Target.the("Botón cancelación").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Cancelación']]"));

    public static final Target ACTIVO_E_INACTIVO = Target.the("Botón activo e inactivo").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Activo e Inactivo']]"));

    public static final Target ERROR_ACTIVO_E_INACTIVO = Target.the("Botón Error en activo e inactivo").located(MobileBy.xpath("//*[@class='android.view.View']"));

    public static final Target BTN_ESTAR_AL_DIA = Target.the("Botón estar al día").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Estar al día']]"));

    public static final Target ERROR_ESTAR_AL_DIA = Target.the("Error estar al día").located(MobileBy.xpath("//*[@class='android.view.View']"));
    public static final Target BTN_DEVOLVER = Target.the("Botón devolver").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']])[2]"));


    public static final Target  BTN_DE_PAGOS = Target.the("Botón de pagos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Botón de Pagos']]"));

    public static final Target BTN_PAGO_IMPUESTOS = Target.the("Botón pago de impuestos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Pago de Impuestos']]"));

    public static final Target ERROR_PAGO_IMPUESTOS = Target.the("Botón aceptar error de pago de impuestos").located(MobileBy.xpath("//*[@class='android.view.View']"));
    public static final Target ACEPTAR_ERROR = Target.the("Aceptar error de pago de impuesto").located(MobileBy.xpath("//*[@text='ACEPTAR']"));

    public static final Target HISTORIAL_TRANSACCIONES = Target.the("Historial de transacciones").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Historial de Transacciones']]"));

    public static final Target ACEPTAR_ERROR_HISTORIAL = Target.the("Aceptar error historial").located(MobileBy.xpath("//*[@class='android.view.View']"));

    public static final Target DEVOLVERSE_A_BOTON_DE_PAGOS = Target.the("Devolverse a botón de pagos").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']])[2]"));




}
