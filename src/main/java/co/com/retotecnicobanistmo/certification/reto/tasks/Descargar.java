package co.com.retotecnicobanistmo.certification.reto.tasks;

import static co.com.retotecnicobanistmo.certification.reto.userinterface.PaginaInformacionTarjetaCredito.DESCARGAR_CONTRATO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.retotecnicobanistmo.certification.reto.interactions.CambiarFoco;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Descargar implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(WaitUntil.the(DESCARGAR_CONTRATO, isVisible()), Click.on(DESCARGAR_CONTRATO));
    actor.attemptsTo(CambiarFoco.Pestana());
  }

  public static Descargar contrato() {
    return instrumented(Descargar.class);
  }
}
