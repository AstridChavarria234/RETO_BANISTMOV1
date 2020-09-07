package co.com.retotecnicobanistmo.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class InformacionCuentaCorriente {

    public static final Target ADMINISTRA_FINANZAS =
            Target.the("Administra Finanzas")
                    .located(xpath("//div/p[contains(text(),'Administra tus finanzas y organiza tu presupuesto con nuestras cuentas corrientes.')]"));
}
