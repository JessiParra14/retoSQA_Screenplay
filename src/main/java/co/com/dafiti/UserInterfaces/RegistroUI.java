package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUI {

    public static final Target TXT_EMAIL = Target.the("Ingresar correo").located(By.id("RegistrationForm_email"));
    public static final Target TXT_CLAVE = Target.the("Ingresar contraseña").located(By.id("RegistrationForm_password"));
    public static final Target TXT_CONFIRMARCLAVE = Target.the("Ingresar confirmacion contraseña").located(By.id("RegistrationForm_password2"));
    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre").located(By.id("RegistrationForm_first_name"));
    public static final Target TXT_APELLIDOS = Target.the("Ingresar apellidos").located(By.id("RegistrationForm_last_name"));
    public static final Target TXT_DOCUMENTO = Target.the("Ingresar numero de documento").located(By.id("RegistrationForm_identification"));
    public static final Target LST_TIPODOCUMENTO = Target.the("Seleccionar tipo de documento").located(By.id("RegistrationForm_identification_type"));
    public static final Target TXT_DIANACIMIENTO = Target.the("Ingresar dia de nacimiento").located(By.id("RegistrationForm_day"));
    public static final Target TXT_MESNACIMIENTO = Target.the("Ingresar mes de nacimiento").located(By.id("RegistrationForm_month"));
    public static final Target LST_ANONACIMIENTO = Target.the("Seleccionar año de nacimiento").located(By.id("RegistrationForm_year"));
    public static final Target LST_SEXO = Target.the("Seleccionar sexo").located(By.id("RegistrationForm_gender"));
    public static final Target BTN_ENVIAR = Target.the("Click en enviar").located(By.id("createAccountButton"));
}
