package co.com.dafiti.Tasks;

import co.com.dafiti.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dafiti.UserInterfaces.SeleccionarProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProducto implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_AGREGAR, isVisible()),
                    Click.on(BTN_AGREGAR),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Producto", 1, 0)).into(TXT_BUSCAR),
                    WaitUntil.the(BTN_PRODUCTO, isClickable()),
                    Click.on(BTN_PRODUCTO)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SeleccionarProducto agregar(){ return instrumented(SeleccionarProducto.class); }
}
