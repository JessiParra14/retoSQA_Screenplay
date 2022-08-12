package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CategoriaUI {

    public static final Target BTN_MUJER = Target.the("Seleccionar categoria").located(By.xpath("(//a[@class='segment nav-superior'])[1]"));
    public static final Target BTN_RELOJES = Target.the("Seleccionar relojes").located(By.xpath("//a[@href='https://www.dafiti.com.co/femenino/accesorios/relojes-accesorios-femenino/']"));
}
