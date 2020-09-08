package co.com.retotecnicobanistmo.certification.reto.questions;

import static co.com.retotecnicobanistmo.certification.reto.utils.EnumMensajesBanistmo.ARCHIVO_CONTRATO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class PestañaActivaContrato implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return BrowseTheWeb.as(actor)
        .getDriver()
        .getCurrentUrl()
        .contains(ARCHIVO_CONTRATO.getNombre());
  }

  public static PestañaActivaContrato banistmo() {
    return new PestañaActivaContrato();
  }
}
