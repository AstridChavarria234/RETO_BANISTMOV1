package co.com.retotecnicobanistmo.certification.reto.interactions;

import co.com.retotecnicobanistmo.certification.reto.tasks.IngresarA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarFoco implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        for (String winHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(winHandle);
            break;
        }
    }


    public static CambiarFoco Pestana() {
        return instrumented(CambiarFoco.class);
    }

}
