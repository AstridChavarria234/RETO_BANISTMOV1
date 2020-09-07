package co.com.retotecnicobanistmo.certification.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retotecnicobanistmo.certification.reto.userinterface.PaginaPrincipalBanistmo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarA implements Task {
  private String itemMenu;

    public IngresarA(String itemMenu) {
        this.itemMenu = itemMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCTO_SERVICIO),
        Click.on(ITEM_MENU.of(itemMenu)));
    }

    public static IngresarA itemMenu(String itemMenu) {
        return instrumented(IngresarA.class,itemMenu);
    }


}
