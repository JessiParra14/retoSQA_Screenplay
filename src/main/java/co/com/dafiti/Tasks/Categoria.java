package co.com.dafiti.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dafiti.UserInterfaces.CategoriaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Categoria implements Task {

    MoveMouseToTarget moveMouseToTarget = new MoveMouseToTarget(BTN_MUJER);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    moveMouseToTarget,
                    WaitUntil.the(BTN_RELOJES, isVisible()),
                    Click.on(BTN_RELOJES)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Categoria producto(){ return instrumented(Categoria.class); }
}
