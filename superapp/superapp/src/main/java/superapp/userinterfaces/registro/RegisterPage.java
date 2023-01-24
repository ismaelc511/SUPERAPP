package superapp.userinterfaces.registro;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;

public class RegisterPage extends PageObject {

    public static final Target BTN_REGISTRARSE = Target.the("Registrarse").located(MobileBy.xpath("//*[@text='Regístrate']"));

    public static final Target TIPO_PERSONA = Target.the("Tipo de persona").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Tipo de persona'] and ./*[@text='Seleccionar...']]"));

    public static final Target ESCOGER_TIPO_PERSONA = Target.the("Escoger tipo persona").locatedBy("//*[@class='android.view.ViewGroup' and ./*[@text='N-Persona Natural']]");
    public static final Target TXT_NOMBRE = Target.the("Nombre de la persona").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Nombres']]"));

    public static final Target TXT_APELLIDO = Target.the("Apellido de la persona").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Apellidos']]"));


    public static final Target TIPO_DOCUMENTO = Target.the("Tipo de documento").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]/*/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Seleccionar...']])[1]"));

    public static final Target TIPO_TARJETA = Target.the("Tipo tarjeta de identidad").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='T.I']]"));
    public static final Target NUMERO_DOCUMENTO = Target.the("Numero documento").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]/*/*[@text and @class='android.widget.EditText'])[3]"));

    public static final Target ESCONDER_TECLADO_PERSONAL = Target.the("Esconder teclado").located(MobileBy.xpath("//*[@contentDescription='Introducir']"));

    public static final Target ESCONDER_NUMEROS_PERSONAL = Target.the("Esconder teclado numerico").located(MobileBy.xpath("//*[@contentDescription='Realiz.']"));

    public static final Target ESCONDER_TECLADO_PERSONAL_CORREO = Target.the("Esconder teclado personal correo").located(MobileBy.xpath("//*[@contentDescription='Introducir']"));
    public static final Target SELECCIONAR_DIA = Target.the("Seleccionar dia de nacimiento").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='DD']]"));

    public static final Target ELEGIR_DIA = Target.the("Elegir día de nacimiento").located(MobileBy.xpath("//*[@text='1']"));

    public static final Target SELECCIONAR_MES = Target.the("Seleccionar campo del mes de nacimiento").located(MobileBy.xpath("//*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='MM']]"));

    public static final Target ELEGIR_MES = Target.the("Elegir mes de nacimiento").located(MobileBy.xpath("//*[@text='1' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]"));

    public static final Target SELECCIONAR_AÑO = Target.the("Seleccionar campo del AñO de nacimiento").located(MobileBy.xpath("//*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='AAAA']]"));

    public static final Target ELEGIR_AÑO = Target.the("Elegir año de nacimiento").located(MobileBy.xpath("//*[@text='2022']"));

    public static final Target CORREO = Target.the("Ingresar correo").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Correo electrónico']]"));

    public static final Target GENERO = Target.the("Elegir genero").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Género'] and ./*[@text='Seleccionar...']]"));

    public static final Target SELECCIONAR_GENERO = Target.the("Seleccionar genero").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Femenino']]"));

    public static final Target CELULAR = Target.the("Ingresar número de celular").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número celular']]"));

    public static final Target TELEFONO = Target.the("Ingresar teléfono").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número fijo - Opcional']]"));

    public static final Target SEXO = Target.the("Elegir sexo").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Sexo - Opcional'] and ./*[@text='Seleccionar...']]"));

    public static final Target SELECCIONAR_SEXO = Target.the("Seleccionar sexo").located(MobileBy.xpath("//*[@text='Mujer']"));
    public static final Target ETNIA = Target.the("Elegit etnia").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Etnia - Opcional'] and ./*[@text='Seleccionar...']]"));

    public static final Target ORIENTACION_SEXUAL = Target.the("Orientacion sexual").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación Sexual - Opcional']]"));

    public static final Target SELECCIONAR_ORIENTACION_SEXUAL = Target.the("Seleccionar orientacion sexual").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Heterosexual']]"));

    public static final Target IDENTIDAD_DE_GENERO = Target.the("Identidad de genero").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Identidad de Género - Opcional']]"));

    public static final Target SELECCIONAR_IDENTIDAD_DE_GENERO = Target.the("Seleccionar identidad de genero").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Mujer Cis']]"));

    public static final Target BTN_CONTINUAR = Target.the("Botón continuar").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]"));

    public static final Target FLECHA_TIPO_VIA = Target.the("Flecha tipo via").located(MobileBy.xpath("//*[@class='android.widget.ImageView' and (./preceding-sibling::* | ./following-sibling::*)[@text='Seleccionar...'] and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Tipo de vía']]]"));
    public static final Target BTN_DATOS_COMPLEMENTARIOS = Target.the("Botón Datos complementarios").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Datos complementarios']]"));

    public static final Target BTN_CANCELAR = Target.the("Botón Cancelar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Cancelar']]"));

    public static final Target SELECCIONAR_ETNIA = Target.the("Seleccionar etnia").located(MobileBy.xpath("//*[@text='Indígena – Originario']"));

    public static final Target SELECCIONAR_PAIS = Target.the("Seleccionar pais").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target SELECCIONAR_BUSCADOR_PAIS = Target.the("Seleccionar buscador de país").located(MobileBy.xpath("//*[@class='android.widget.EditText']"));

    public static final Target SELECCIONAR_OPCION_PAIS = Target.the("Seleccionar opcion de pais").located(MobileBy.xpath("\"//*[@text='CO-Colombia' and @class='android.widget.TextView']\""));
    public static final Target SELECCIONAR_DEPARTAMENTO = Target.the("Seleccionar departamento").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target SELECCIONAR_BUSCADOR_DEPARTAMENTO = Target.the("Seleccionar buscador departamento").located(MobileBy.xpath("//*[@text and @class='android.widget.EditText']"));

    public static final Target SELECCIONAR_OPCION_DEPARTAMENTO = Target.the("Seleccionar opción departamento").located(MobileBy.xpath("//*[@text='05-ANTIOQUIA']"));
    public static final Target SELECCIONAR_MUNICIPIO = Target.the("Seleccionar Municipio").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target SELECCIONAR_BUSCADOR_MUNICIPIO = Target.the("Seleccionar buscador municipio").located(MobileBy.xpath("//*[@text and @class='android.widget.EditText']"));

    public static final Target SELECCIONAR_OPCION_MUNICIPIO = Target.the("Seleccionar opción municipio").located(MobileBy.xpath("//*[@text='05001-MEDELLIN']"));


    public static final Target SELECCIONAR_BARRIO = Target.the("Seleccionar barrio").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target BARRIO = Target.the("Barrio").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Cabecera San Antonio de Prado\t']]"));
    public static final Target INGRESAR_DIRECCION = Target.the("Ingresar direccion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@text='Dirección - Opcional']]]"));

    public static final Target TIPO_VIA = Target.the("Escoger tipo de via").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Tipo de vía']]"));

    public static final Target NUMERO_VIA = Target.the("Número vía").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número de vía']]"));

    public static final Target APENDICE_VIA = Target.the("Ingresar apendice de la vía").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Apéndice de vía - Opcional'] and ./*[@text='Seleccionar...']]"));

    public static final Target ORIENTACION_VIA = Target.the("Orientacion de via").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación de vía - Opcional'] and ./*[@text='Seleccionar...']]"));

    public static final Target NUMERO_CRUCE = Target.the("Número del cruce").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número de cruce']]"));

    public static final Target CERRAR_TECLADO = Target.the("Cerrar el teclado").located(MobileBy.xpath("//*[@text='Realiz.']"));

    public static final Target APENDICE_CRUCE = Target.the("Apendice de cruce").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Apéndice de cruce - Opcional']]"));

    public static final Target NUMERO = Target.the("Numero").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número']]"));
    public static final Target ORIENTACION_CRUCE = Target.the("Orientación del cruce").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Orientación de cruce - Opcional']]"));

    public static final Target NUMERO_ORIENTACION_CRUCE = Target.the("Número de orientación del cruce").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número']]"));

    public static final Target COMPLEMENTO = Target.the("Complemento de la dirección").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Complemento - Opcional']]"));

    public static final Target DIRECCION_DESCRIPTIVA = Target.the("Dirección descriptiva").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Dirección descriptiva - Opcional']]"));

    public static final Target DIRECCION_INGRESADA = Target.the("Dirección ingresada").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Dirección ingresada - Opcional']]"));

    public static final Target LBL_DIRECCION = Target.the("Direccion de residencia").located(MobileBy.xpath("//*[@text='Dirección de residencia']"));

    public static final Target BTN_AGREGAR = Target.the("Botón de agregar").located(MobileBy.xpath("//*[@class='android.view.View']"));

    public static final Target BTN_REGISTRARME = Target.the("Botón Registrarme").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]"));

    public static final Target LBL_REGISTRO_EXITOSO = Target.the("Registro exitoso").located(MobileBy.xpath("//*[@text='Registro Exitoso']"));
}

