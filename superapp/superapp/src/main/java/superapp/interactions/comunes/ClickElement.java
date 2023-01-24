package superapp.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickElement implements Interaction{
	
	Target element;
	
	public ClickElement(Target element) {
	    this.element = element;
	  }
	
	@Override
	  public <T extends Actor> void performAs(T actor) {

	    actor.attemptsTo(
	    		WaitElement.isClickable(element),
	    		Click.on(element)
	    		);

	}

	public static ClickElement clickElement(Target element) {
        return instrumented(ClickElement.class,element);
    }
}
