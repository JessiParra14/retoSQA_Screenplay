package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target TXT_EMAIL = Target.the("Ingresar correo").located(By.id("LoginForm_email"));
    public static final Target TXT_CLAVE = Target.the("Ingresar contraseña").located(By.id("LoginForm_password"));
    public static final Target BTN_INGRESAR = Target.the("Click ingresar").located(By.id("loginButton"));

}
