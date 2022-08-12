package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaProductoUI {

    public static final Target BTN_TALLA = Target.the("Seleccionar color").located(By.xpath("(//span[@class='rfloat icon icon-arrow-down'])[1]"));
    public static final Target LST_TALLA = Target.the("Seleccionar color").located(By.xpath("(//span[text()='negro'])[1]"));
    public static final Target BTN_AGREGAR = Target.the("Click agregar al carrito").located(By.id("AddToCart"));
    public static final Target BTN_CARRITO = Target.the("Click carrito").located(By.id("cart-head"));
}
