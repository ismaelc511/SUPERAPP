package superapp.userinterfaces.reportesciudadanos;

import io.appium.java_client.MobileBy;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.omg.CORBA.TRANSACTION_MODE;

public class ReportesPage extends PageObject {

    public static final Target BTN_REPORTES_CIUDADANOS = Target.the("Botón reportes ciudadanos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Reportes Ciudadanos']]"));

    public static final Target BTN_REALIZAR_O_CONSULTAR = Target.the("Botón realizar o consultar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Realizar o consultar una PQR...'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target BTN_ACEPTAR_RESPETADO_CIUDADANO = Target.the("Botón de aceptar facilitar datos").located(MobileBy.xpath("//*[@class='android.view.View']"));

    public static final Target BTN_CONSULTAR_ESTADO = Target.the("Botón consultar estado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text=' Consultar el estado de una ...'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target REALIZAR_UNA_PQRSD = Target.the("Realizar una PQRSD").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Realizar una PQRSD']]"));
    public static final Target INPUT_CONULTA_RADICADO = Target.the("Input de consulta radicado").located(MobileBy.xpath("//*[@class='android.widget.EditText']"));

    public static final Target BTN_CONSULTAR_RADICADO = Target.the("Boton para consultar radicado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Consultar']]"));

    public static final Target TIPO_PERSONA = Target.the("Campo tipo persona").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Tipo de Persona']]"));

    public static final Target ACEPTAR_TIPO_PERSONA = Target.the("Aceptar tipo persona").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target TIPO_DOCUMENTO = Target.the("Tipo de documento de identidad").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Tipo de Documento']]"));

    public static final Target ACEPTAR_TIPO_DOCUMENTO = Target.the("Aceptar tipo documento").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target INPUT_NUMERO_DOC_IDENTIDAD = Target.the("Input documento de identidad").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Documento de Identidad']]]"));

    public static final Target NOMBRE = Target.the("Input de nombre").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Nombres']]]"));

    public static final Target APELLIDO = Target.the("Input de apellido").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Apellidos']]]"));

    public static final Target GENERO = Target.the("Campo de genero").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Género']]"));


    public static final Target ACEPTAR_GENERO = Target.the("Aceptar genero").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target PAIS = Target.the("Input de pais").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='\uF213'] and ./*[@text='País']]"));

    public static final Target ACEPTAR_PAIS = Target.the("Aceptar pais").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target DEPARTAMENTO = Target.the("Input departamento").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Departamento']]"));

    public static final Target CIUDAD = Target.the("Input de ciudad").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Ciudad']]"));

    public static final Target INDICATIVO_VIA = Target.the("Indicativo vía").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Dirección']] and ./*[@text='Indicativo vía']]"));

    public static final Target NUMERO_VIA = Target.the("Numero vía").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Dirección']]]"));

    public static final Target APENDICE = Target.the("Apendice").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Dirección']] and ./*[@text='Apéndice']]"));

    public static final Target ORIENTACION = Target.the("Orientacion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Orientación'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Número cruce'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación']]]"));

    public static final Target NUMERO_CRUCE = Target.the("Numero cruce").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Número cruce'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación']]]"));

    public static final Target APENDICE2 = Target.the("Apendice2").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Apéndice'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Orientación']]]"));

    public static final Target TXT_ELIGE_ORIENTACION = Target.the("Elige una orientacion").located(MobileBy.xpath("//*[@text='Elige una orientación']"));

    public static final Target ACEPTAR_APENDICE2 = Target.the("Aceptar Apendice 2").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));
    public static final Target ORIENTACION2 = Target.the("Orientacion 2").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Número puerta'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación']] and ./*[@text='Orientación']]"));

    public static final Target NUMERO_PUERTA = Target.the("Número de puerta").located(MobileBy.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[3]/*/*[@class='android.widget.EditText'])[1]"));

    public static final Target INTERIOR = Target.the("Interior").located(MobileBy.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[3]/*/*[@class='android.widget.EditText'])[2]"));

    public static final Target EMAIL = Target.the("Email").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Correo electrónico']] and (./preceding-sibling::* | ./following-sibling::*)[@text='\uF225']]"));

    public static final Target TELEFONO = Target.the("Teléfono").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='\uF225'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Teléfono']]]"));

    public static final Target SOLICITUD_INFORMACION = Target.the("Solicitud informacion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Solicitud de información']]"));

    public static final Target CONTINUAR_RADICACION = Target.the("Continuar radicacion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target ATENCION_PREFERENCIAL = Target.the("Atención preferencial").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='No']]"));

    public static final Target INDICATIVO_VIA2 = Target.the("Indicativo via").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Indicativo vía'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Dirección del hecho']]]"));

    public static final Target NUMERO_VIA2 = Target.the("Numero via 2").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Dirección del hecho']]]"));

    public static final Target APENDICE3 = Target.the("Apendice 3").located(MobileBy.xpath("//*[@text='Apéndice' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Dirección del hecho']]]]"));


    public static final Target ORIENTACION3 = Target.the("Orientacion 3").located(MobileBy.xpath("//*[@text='Orientacion' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Número cruce']]]]"));

    public static final Target NUMERO_CRUCE2 = Target.the("Número cruce").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Este']]] and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación']]]"));

    public static final Target APENDICE4 = Target.the("Apendice 3").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Apéndice'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Orientación']]]"));

    public static final Target ORIENTACION4 = Target.the("Orientacion 4").located(MobileBy.xpath("//*[@text='Orientacion']"));

    public static final Target NUMERO_PUERTA2 = Target.the("Numero puerta 2").located(MobileBy.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Radicación PQRSD']]/*[@class='android.view.ViewGroup'])[4]/*/*[@class='android.widget.EditText'])[1]"));

    public static final Target INTERIOR2 = Target.the("Interior2").located(MobileBy.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[4]/*/*[@class='android.widget.EditText'])[2]"));

    public static final Target ASUNTO = Target.the("Asunto").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='\uF225'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Asunto']]]"));

    public static final Target DESCRIPCION = Target.the("Descripcion").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='\uF225'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Descripción:']]]"));

    public static final Target DESCRIPCION_PUNTOS_CRITICOS = Target.the("Descripcion puntos criticos").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Descripción']]"));

    public static final Target ANEXOS = Target.the("Anexos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='No']]"));

    public static final Target BTN_CONTINUAR2 = Target.the("Boton de continuar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target ACEPTAR_CONFIRMACION = Target.the("Aceptar confirmacion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target RADICADO = Target.the("Radicado de la solicitud").located(MobileBy.xpath("//*[@text='202250000235']"));

    public static final Target BTN_QUIERO_ENTENDER = Target.the("Boton quiero entender").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Quiero entender qué son las ...']]"));

    public static final Target ATRAS = Target.the("Botón de atras").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]"));

    public static final Target PUNTOS_CRITICOS_BASURAS  = Target.the("Botón puntos Criticos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Puntos Críticos de Basuras']]"));

    public static final Target DIRECCION_DAÑO = Target.the("Direccion daño").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]"));

    public static final Target DIRECCION_ELEGIDA = Target.the("Direccion elegida").located(MobileBy.xpath("//*[@text='CL 44E 7A-17']"));

    public static final Target REALIZADO = Target.the("Btn_Realizado").located(MobileBy.xpath("//*[@contentDescription='Realiz.']"));
    public static final Target PUNTO_REFERENCIA = Target.the("Punto de referencia").located(MobileBy.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Punto de referencia de la dirección']]]"));

    public  static final Target PUNTO_ROJO = Target.the("Punto rojo").located(MobileBy.xpath("(//*[@class='android.view.View' and ./parent::*[@id='mapid']]/*/*[@class='android.widget.Image'])[2]"));

    public static final Target FOTO = Target.the("Foto").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='\uF1BA']]"));

    public static final Target CAPTURAR_FOTO = Target.the("Capturar foto").located(MobileBy.xpath("//*[@id='normal_center_button']"));

    public static final Target ACEPTAR_FOTO = Target.the("Aceptar foto").located(MobileBy.xpath("//*[@text='Aceptar']"));

    public static final Target CONTINUAR_OPCION = Target.the("Boton continuar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target HUECOS_Y_BACHES = Target.the("Botón Huecos y Baches").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Huecos y Baches'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target ALUMBRADO_PUBLICO = Target.the("Alumbrado publico").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Alumbrado Público']]"));


    public static final Target NIDO_ABEJAS = Target.the("Nido abejas").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Nido de abejas']]"));

    public static final Target TIPO_DAÑO = Target.the("Tipo de daño").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Tipo de daño']]"));

    public static final Target ACEPTAR_TIPO_DAÑO = Target.the("Aceptar tipo daño").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target DESCRIPCION_DAÑO = Target.the("Descripcion de daño").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Describa el daño presentado']]"));

    public static final Target DESCRIPCION_CONTENEDORES = Target.the("Descripcion contenedores").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Descripción']]"));
    public static final Target NOMBRE_QUE_REPORTA = Target.the("Nombre de quien reporta").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Nombre de quién reporta - Opcional']]"));

    public static final Target NUMERO_CONTACTO = Target.the("Numero de quien reporta").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número de contacto de quién reporta']]"));

    public static final Target CORREO_CONTACTO = Target.the("Correo contacto").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Correo electrónico de contacto']]"));

    public static final Target CORREO_CONTENEDORES = Target.the("Correo contenedores").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Ingresa el correo electrónico de quién reporta']]"));

    public static final Target BTN_CONTINUAR_DAÑO = Target.the("Boton continuar daño").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target BTN_CONTINUAR_CONTENEDORES = Target.the("Botón continuar contenedores").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));
    public static final Target CORREO_CIUDADANO = Target.the("Correo del ciudadano").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Correo electrónico del ciudadano']]"));

    public static final Target BTN_CONTINUAR= Target.the("Botón continuar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target CORREO_HUECOS = Target.the("Correo huecos y baches").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Ingresa el correo electrónico de quién reporta']]"));

    public static final Target BTN_CONTINUAR_HUECOS = Target.the("Botón continuar huecos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target HACE_CUANTO = Target.the("Hace cuanto ves el nido").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Tipo de daño']]"));

    public static final Target CORREO_ABEJAS = Target.the("Correo").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Ingresa el correo electrónico de quien reporta']]"));
    public static final Target ACEPTAR_TIPO_DAÑO_ABEJAS = Target.the("Aceptar tipo daño").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Aceptar']]"));

    public static final Target CONTINUAR_ABEJAS = Target.the("Continuar abejas").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Continuar']]"));

    public static final Target CONTENEDORES_BASURA = Target.the("Contenedores de basura").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Contenedores de basura']]"));

    public static final Target ENTORNO_FISICO = Target.the("Entorno Fisico").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Entornos físicos'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target CORREO_ENTORNO = Target.the("Correo Entorno Fisico").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Ingresa el correo electrónico de quién reporta']]"));

    public static final Target DESCRIPCION_ENTORNO = Target.the("Descripcion Entorno Fisico").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Descripción']]"));

    public static final Target OCUPACION_IRREGULAR = Target.the("Ocupacion Irregular").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Ocupación Irregular'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target SEMAFORO = Target.the("Semaforo").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Semáforos']]"));

    public static final Target CORREO_SEMAFORO = Target.the("Correo Semaforo").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Ingresa el correo electrónico de quién reporta']]"));


    public static final Target MAL_PARQUEO = Target.the("Mal Parqueo").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Mal Parqueo']]"));

    public static final Target MAL_PARQUEO_CORREO = Target.the("Mal Parqueo Correo").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Correo electrónico de contacto']]"));

    public static final Target MAL_PARQUEO_OBSERVACION  = Target.the("Mal Parqueo Observacion").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Observación - Opcional']]"));

    public static final Target CICLORUTAS = Target.the("Reporte de ciclorutas").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Reporte de ciclo rutas']]"));

    public static final Target CICLORUTA_NOMBRE_REPORTA = Target.the("Nombre de quien reporta").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Nombre de quién reporta']]"));

    public static final Target CICLORUTA_NUMERO_CONTACTO  = Target.the("Numero de quien reporta").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número de contacto de quién reporta']]"));

    public static final Target CICLORUTA_OBSERVACION  = Target.the("Ciclorutas Observacion").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Observación - Opcional']]"));

    public static final Target ACEPTAR_TECLADO  = Target.the("Aceptar Teclado").located(MobileBy.xpath("//*[@contentDescription='Realiz.']"));

    public static final Target OBSERVACION_SEMAFORO  = Target.the("Obvsercacion semaforo").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Observación - Opcional']]"));

}
