package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProductoUI {

    public static final Target BTN_AGREGAR = Target.the("Click agregar al carrito").located(By.id("AddToCart"));
    public static final Target TXT_BUSCAR = Target.the("Buscar producto").located(By.id("searchInput"));
    public static final Target BTN_PRODUCTO = Target.the("Seleccionar producto").located(By.xpath("//p[text()='Face2Face']"));

}
