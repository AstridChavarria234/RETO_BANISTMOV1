package co.com.retotecnicobanistmo.certification.reto.userinterface;

import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInformacionTarjetaCredito {

  public static final Target DESCARGAR_CONTRATO =
      Target.the("Descargar Contrato")
          .located(xpath("//div/a[contains(text(),'Descargar Contrato de Tarjeta de Crédito')]"));
}
