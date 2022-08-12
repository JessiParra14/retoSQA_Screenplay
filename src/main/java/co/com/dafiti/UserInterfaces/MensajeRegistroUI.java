package co.com.dafiti.UserInterfaces;

import co.com.dafiti.Utils.Datos;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeRegistroUI {

    Datos datos = new Datos();

    public static final Target MSJ_REGISTRO = Target.the("Registro exitoso")
            .located(By.xpath("//span[text()='Hola, Jessica']"));

}
