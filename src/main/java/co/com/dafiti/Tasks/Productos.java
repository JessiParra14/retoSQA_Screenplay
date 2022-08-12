package co.com.dafiti.Tasks;

import co.com.dafiti.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.dafiti.UserInterfaces.ProductosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Productos implements Task {

    MoveMouseToTarget moveMouseToTarget = new MoveMouseToTarget(BTN_PRODUCTO);
    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Scroll.to(BTN_PRODUCTO),
                    Click.on(BTN_PRODUCTO)
                    );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Productos productos(){ return instrumented(Productos.class); }
}
