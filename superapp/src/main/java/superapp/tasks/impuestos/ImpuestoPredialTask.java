package superapp.tasks.impuestos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.models.impuestos.Impuesto;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.autenticacion.impuestos.ImpuestosPage.*;

public class
ImpuestoPredialTask implements Task {

    Impuesto dataImpuesto;

    public ImpuestoPredialTask(Impuesto dataImpuesto) {
        this.dataImpuesto = dataImpuesto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_IMPUESTO_PREDIAL),
                Click.on(BTN_IMPUESTO_PREDIAL),
                WaitElement.isClickable(CONSULTAR),
                Click.on(CONSULTAR),
                WaitElement.isClickable(ELIGE_PERIODO),
                Click.on(ELIGE_PERIODO),
                ScrollAndClick.scrollAndClick(dataImpuesto.getElegirPeriodo()),
                WaitElement.isClickable(AÑO),
                Click.on(AÑO),
                ScrollAndClick.scrollAndClick(dataImpuesto.getAnualidad()),
                WaitElement.isClickable(CONSULTAR_IMPUESTO_PREDIAL),
                Click.on(CONSULTAR_IMPUESTO_PREDIAL),
                WaitElement.isClickable(ACEPTAR_WARNING),
                Click.on(ACEPTAR_WARNING),
                WaitElement.isClickable(CERTIFICADO),
                Click.on(CERTIFICADO),
                WaitElement.isClickable(ACEPTAR_ERROR_CERTIFICADO),
                Click.on(ACEPTAR_ERROR_CERTIFICADO),
                WaitElement.isClickable(LBL_IMPUESTO),
                Click.on(LBL_IMPUESTO),
                WaitElement.isClickable(DEVOLVER)

        );

    }

    public static ImpuestoPredialTask impuestosPredialTask(Impuesto dataImpuesto) {
        return instrumented(ImpuestoPredialTask.class, dataImpuesto);
    }
}
