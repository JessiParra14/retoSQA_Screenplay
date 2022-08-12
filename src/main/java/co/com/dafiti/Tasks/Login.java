package co.com.dafiti.Tasks;

import co.com.dafiti.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import static co.com.dafiti.UserInterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Login", 1, 0)).into(TXT_EMAIL),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Login", 1, 1)).into(TXT_CLAVE),
                    Click.on(BTN_INGRESAR)
            );
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Login datos(){ return instrumented(Login.class); }
}
