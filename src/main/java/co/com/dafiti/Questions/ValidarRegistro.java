package co.com.dafiti.Questions;

import co.com.dafiti.UserInterfaces.MensajeRegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarRegistro implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return MensajeRegistroUI.MSJ_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){ return new ValidarRegistro(); }
}
