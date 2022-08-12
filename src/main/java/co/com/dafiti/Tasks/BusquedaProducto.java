package co.com.dafiti.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dafiti.UserInterfaces.BusquedaProductoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_TALLA, isClickable()),
                    Click.on(BTN_TALLA),
                    Click.on(LST_TALLA),
                    WaitUntil.the(BTN_AGREGAR, isClickable()),
                    Click.on(BTN_AGREGAR),
                    WaitUntil.the(BTN_CARRITO, isClickable()),
                    Click.on(BTN_CARRITO)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static BusquedaProducto informacion(){ return instrumented(BusquedaProducto.class); }

}
