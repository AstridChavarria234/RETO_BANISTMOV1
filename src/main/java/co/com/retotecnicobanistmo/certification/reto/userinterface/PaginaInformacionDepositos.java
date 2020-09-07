package co.com.retotecnicobanistmo.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class PaginaInformacionDepositos {

    public static final Target CUENTA_CORRIENTE =
            Target.the("Cuenta Corriente")
                    .located(xpath("//div/a[@title='Cuentas Corrientes']"));
}

