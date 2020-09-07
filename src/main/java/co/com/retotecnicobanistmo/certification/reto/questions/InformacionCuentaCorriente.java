package co.com.retotecnicobanistmo.certification.reto.questions;

import static co.com.retotecnicobanistmo.certification.reto.userinterface.PaginaInformacionDepositos.CUENTA_CORRIENTE;
import static co.com.retotecnicobanistmo.certification.reto.utils.EnumMensajesBanistmo.ADMINISTRA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class InformacionCuentaCorriente implements Question<Boolean> {

  public Boolean answeredBy(Actor actor) {

    return CUENTA_CORRIENTE.resolveFor(actor).getText().contains(ADMINISTRA.getNombre());
  }

  public static InformacionCuentaCorriente mensaje() {
    return new InformacionCuentaCorriente();
  }
}
