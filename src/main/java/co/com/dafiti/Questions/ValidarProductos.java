package co.com.dafiti.Questions;

import co.com.dafiti.UserInterfaces.MensajeCarritoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarProductos implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        return MensajeCarritoUI.MSJ_CARRITO.resolveFor(actor).isVisible();

    }

    public static ValidarProductos validarProductos(){ return new ValidarProductos(); }
}
