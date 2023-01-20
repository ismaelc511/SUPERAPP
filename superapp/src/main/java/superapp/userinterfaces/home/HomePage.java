package superapp.userinterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class HomePage extends PageObject {

    public static final Target BTN_SALTAR = Target.the("Boton Saltar").located(MobileBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='SALTAR']]"));
    public static final Target LBL_USUARIO = Target.the("Label nombre Usuario").located(MobileBy.xpath("//*[@text='nombre_test1 apellido_test1']"));

    public static final Target LBL_USUARIO_GOOGLE = Target.the("Label usuario Google").located(MobileBy.xpath("//*[@text='ISMAEL ALEXANDER CARVAJAL GONZALEZ']"));

    public static final Target LBL_USUARIO_FACEBOOK = Target.the("Label usuario Facebook").located(MobileBy.xpath("//*[@text='Open User']"));

    public static final Target LBL_USUARIO_LINKEDIN = Target.the("Label usuario Linkedin").located(MobileBy.xpath("//*[@text='ISMAEL ALEXANDER CARVAJAL GONZALEZ']"));
}
