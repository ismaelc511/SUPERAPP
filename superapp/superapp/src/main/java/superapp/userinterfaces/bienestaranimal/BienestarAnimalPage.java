package superapp.userinterfaces.bienestaranimal;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.apache.tools.ant.taskdefs.Tar;

public class BienestarAnimalPage extends PageObject {

    public static final Target BTN_BIENESTAR_ANIMAL = Target.the("Botón bienestar animal").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']] and ./*[@text='Bienestar Animal']]"));
    public static final Target NOMBRE_ANIMAL = Target.the("Nombre del animal").located(MobileBy.xpath("//*[@text and @class='android.widget.EditText']"));

    public static final Target REPORTAR_ANIMAL = Target.the("Botón reportar animal").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Reportar animal extraviado'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target ESPECIE = Target.the("Especie").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[./*[@text='Seleccionar...']])[1]"));

    public static final Target CANINO = Target.the("Opción canino").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Canino'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target RAZA = Target.the("Opcion Raza").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[./*[@text='Seleccionar...']])[1]"));

    public static final Target AFGANO = Target.the("Afgano").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Afgano'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target SEXO = Target.the("Sexo").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[./*[@text='Seleccionar...']])[1]"));

    public static final Target MACHO = Target.the("Macho").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Macho'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target TAMANIO = Target.the("Tamaño").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target GRANDE = Target.the("Grande").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Grande'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target MICROCHIP_SI = Target.the("Si microchip").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup' and ./*[@text='Nombre del animal']] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target TXT_MICROCHIP = Target.the("Txt_microchip").located(MobileBy.xpath("//*[@text='Número del microchip']"));
    public static final Target NUMERO_MICROCHIP = Target.the("Numero microchip").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número del microchip']]"));

    public static final Target CARACTERISTICAS_ANIMAL = Target.the("Características del animal").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Características del animal']]"));

    public static final Target BTN_CONTINUAR = Target.the("Btn continuar").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Continuar']]"));

    public static final Target PUNTO_REFERENCIA = Target.the("Punto de referencia").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Punto de referencia de la dirección']]"));

    public static final Target COMUNA = Target.the("Seleccionar comuna").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[./*[@text='Seleccionar...']])[1]"));

    public static final Target COMUNA_CASTILLA = Target.the("Seleccionar comuna").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Comuna 5 - Castilla'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target DIRECCION_EXTRAVIO = Target.the("Direccion donde se extravió el animal").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Dirección donde se extravió el animal']]"));
    public static final Target BARRIO = Target.the("Seleccionar barrio").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Seleccionar...']]"));

    public static final Target FLORENCIA = Target.the("Seleccionar Florencia").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Florencia'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target NOMBRE_PROPIETARIO = Target.the("Nombre del propietario").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Nombre del propietario']]"));

    public static final Target NUMERO_CONTACTO = Target.the("Numero de contacto").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Número de contacto']]"));


    public static final Target CORREO = Target.the("Correo contacto").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Correo electrónico']]"));

    public static final Target BTN_CONTINUAR2 = Target.the("Botón continuar 2").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Continuar']]"));

    public static final Target BTN_REPORTAR = Target.the("Botón de reportar").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Reportar']]"));

    public static final Target BTN_ADOPCION = Target.the("Botón adopcion de animales").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Adopción de animales'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target FILTRAR = Target.the("Botón de filtrar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Filtrar']]]"));

    public static final Target ESPECIE_ANIMAL = Target.the("Especie de animal").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]/*[./*[@text='Seleccionar...']])[1]"));

    public static final Target ESPECIE_ANIMAL_CANINO = Target.the("Especie animal canico").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Canino']]"));

    public static final Target CANINO_ESPECIE = Target.the("Especie canino").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Canino'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target BTN_BUSCAR_AHORA = Target.the("Botón de buscar ahora").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]"));

    public static final Target BTN_TAMANIO = Target.the("Boton tamaño").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]/*[./*[@text='Seleccionar...']])[2]"));
    public static final Target BTN_MACHOS = Target.the("Opcion Machos").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='Machos']]]"));

    public static final Target BTN_HEMBRAS = Target.the("Opción Hembras").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='Hembras']]]"));

    public static final Target FELINO_ESPECIE = Target.the("Especie felino").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Felino'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target FELINO_ESPECIE_ACTIVADO = Target.the("Felino especie activado").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Felino'] and ./*[@class='android.view.ViewGroup']]"));
    public static final Target EDAD = Target.the("Edad de la mascota").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]/*[./*[@text='Seleccionar...']])[2]"));

    public static final Target CACHORRO = Target.the("Cachorro").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]/*[./*[@text='Seleccionar...']])[2]"));


    public static final Target FELINO_GRANDE = Target.the("Grande").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Grande'] and ./*[@class='android.view.ViewGroup']]"));

    public static final Target BTN_EVENTOS_Y_JORNADAS = Target.the("Eventos y jornadas").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Eventos y jornadas'] and ./*[@class='android.widget.ImageView']]"));

    public static final Target ELECCION_EVENTOS = Target.the("Elegir eventos").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Jornada de adopción de animales de compañía en Cristo Rey']]"));

    public static final Target BTN_AGENDAR = Target.the("Agendar en calendario").located(MobileBy.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]"));

    public static final Target BTN_GUARDAR = Target.the("Botón guardar").located(MobileBy.xpath("//*[@id='add_app_bar_menu_done']"));

    public static final Target BAJAR_TECLADO = Target.the("Bajar teclado").located(MobileBy.xpath("//*[@id='back']"));

    public static final Target VER_ANIMALES_EXTRAVIADOS = Target.the("Ver animales extraviados").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Ver animales extraviadas']]"));

    public static final Target CREO_VER_EL_ANIMAL = Target.the("Creo ver el animal").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Creo ver el animal'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Dónde Se Extravío:  El Estadio']]]]"));

    public static final Target INICIAR_SESION = Target.the("Boton iniciar sesion").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Inicia sesión']]"));

    public static final Target EQUIS = Target.the("Equis").located(MobileBy.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]]]]]]]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[1]"));

    public static final Target TELEFONO_CONTACTO = Target.the("Telefono de contacto").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Teléfono de contacto de quién vio el animal']]"));

    public static final Target NOMBRE = Target.the("Nombre").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Nombre completo']]"));

    public static final Target DIRECCION = Target.the("Direccion").located(MobileBy.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Dirección donde vio el animal']]"));

    public static final Target TOMAR_FOTO = Target.the("Tomar foto").located(MobileBy.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup'])[2]/*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView']])[1]"));

    public static final Target CAPTURA_FOTO = Target.the("Captura foto").located(MobileBy.xpath("//*[@id='normal_center_button']"));

    public static final Target ACEPTAR_FOTO = Target.the("Aceptar foto").located(MobileBy.xpath("//*[@text='Aceptar']"));


}
