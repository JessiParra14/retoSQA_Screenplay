package co.com.dafiti.Interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CerrarVentana implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().alert();
    }

    public Performable andDismiss() {
        return Task.where("{0} dismisses the alert dialog",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss()
        );
    }
    public Performable andAccept() {
        return Task.where("{0} accepts the alert dialog",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept()
        );


    }
    public static  CerrarVentana cerrar (){
        return new CerrarVentana();
    }

}
