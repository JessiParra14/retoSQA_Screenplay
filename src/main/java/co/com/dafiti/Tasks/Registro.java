package co.com.dafiti.Tasks;

import co.com.dafiti.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.io.IOException;
import static co.com.dafiti.UserInterfaces.RegistroUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 0)).into(TXT_EMAIL),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 1)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 2)).into(TXT_CONFIRMARCLAVE),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 3)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 4)).into(TXT_APELLIDOS),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 5)).into(TXT_DOCUMENTO),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 6)).from(LST_TIPODOCUMENTO),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 7)).into(TXT_DIANACIMIENTO),
                    Enter.theValue(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 8)).into(TXT_MESNACIMIENTO),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 9)).from(LST_ANONACIMIENTO),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("DatosDafiti.xlsx", "Registro", 1, 10)).from(LST_SEXO),
                    Click.on(BTN_ENVIAR)
            );

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Registro informacion(){ return instrumented(Registro.class); }
}
