package co.com.retotecnicobanistmo.certification.reto.stepdefinitions;

import co.com.retotecnicobanistmo.certification.reto.questions.PestañaActivaContrato;
import co.com.retotecnicobanistmo.certification.reto.tasks.Descargar;
import co.com.retotecnicobanistmo.certification.reto.tasks.IngresarA;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ContratoTarjetaStepDefinition {

  @Dado("que un usuario quiere descargar el contrato de {string}")
  public void ingresarItemTarjetaCredito(String itemMenu) {
    theActorInTheSpotlight().attemptsTo(IngresarA.itemMenu(itemMenu));
  }

  @Cuando("descargue el contrato")
  public void descargarContratoTarjetaCredito() {
    theActorInTheSpotlight().attemptsTo(Descargar.contrato());

  }

  @Entonces("deberia visualizar el archivo de contrato")
  public void deberiaVisualizarElMensaje() {

    theActorInTheSpotlight()
            .should(
                    GivenWhenThen.seeThat(
                            PestañaActivaContrato.banistmo()));

  }
}
