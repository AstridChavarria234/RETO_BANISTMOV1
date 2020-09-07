package co.com.retotecnicobanistmo.certification.reto.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.retotecnicobanistmo.certification.reto.questions.InformacionCuentaCorriente;
import co.com.retotecnicobanistmo.certification.reto.tasks.IngresarA;
import co.com.retotecnicobanistmo.certification.reto.tasks.IngresarOpcionDeposito;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

public class TiposDepositos {

  @Dado("que un usuario quiere visualizar el {string} de cuentas corrientes")
  public void ingresarItemDepositos(String itemMenu) {
    theActorInTheSpotlight().attemptsTo(IngresarA.itemMenu(itemMenu));
  }

  @Cuando("seleccione la opcion de cuentas corrientes")
  public void seleccionarOpcionDepositos() {
    theActorInTheSpotlight().attemptsTo(IngresarOpcionDeposito.cuentaCorriente());
  }

  @Entonces("deberia visualizar  la informacion del deposito")
  public void deberiaVisualizarLosDiferentesTiposDepósitos() {

    theActorInTheSpotlight().should(GivenWhenThen.seeThat(InformacionCuentaCorriente.mensaje()));
  }
}
