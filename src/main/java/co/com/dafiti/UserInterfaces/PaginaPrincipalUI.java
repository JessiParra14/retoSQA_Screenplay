package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.dafiti.com.co/")
public class PaginaPrincipalUI extends PageObject {

    public static final Target BTN_REGISTRAR = Target.the("Click registrarse").located(By.xpath("//span[@class='text']"));

}
