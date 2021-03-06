package co.com.retotecnicobanistmo.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaPrincipalBanistmo {

  public static final Target PRODUCTO_SERVICIO =
      Target.the("Productos Servicios")
          .locatedBy("//li/a[contains(text(),'Productos & Servicios')]");

  public static final Target ITEM_MENU =
      Target.the("Item").locatedBy("//div/a[contains(text(),'{0}')]");
}
