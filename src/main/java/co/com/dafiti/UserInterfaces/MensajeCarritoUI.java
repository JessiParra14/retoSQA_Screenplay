package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeCarritoUI {

    public static final Target MSJ_CARRITO = Target.the("Productos añadidos").located(By.xpath("//p[text()='2 productos']"));

}
