package co.com.retotecnicobanistmo.certification.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retotecnicobanistmo.certification.reto.userinterface.PaginaInformacionDepositos.CUENTA_CORRIENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarOpcionDeposito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CUENTA_CORRIENTE));
    }


    public static IngresarOpcionDeposito cuentaCorriente() {
        return instrumented(IngresarOpcionDeposito.class);
    }
}
