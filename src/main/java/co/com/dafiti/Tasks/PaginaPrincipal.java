package co.com.dafiti.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.dafiti.UserInterfaces.PaginaPrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class PaginaPrincipal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REGISTRAR)
        );
    }

    public static PaginaPrincipal click(){ return instrumented(PaginaPrincipal.class); }
}
