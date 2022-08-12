package co.com.dafiti.StepDefinitions;

import co.com.dafiti.Questions.ValidarRegistro;
import co.com.dafiti.Tasks.PaginaPrincipal;
import co.com.dafiti.Tasks.Registro;
import co.com.dafiti.UserInterfaces.PaginaPrincipalUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor jessica = Actor.named("jessica");

    private PaginaPrincipalUI paginaPrincipalUI = new PaginaPrincipalUI();

    @Before
    public void configuracion(){
        jessica.can(BrowseTheWeb.with(navegador));
    }

    @Dado("el usuario se encuentre en la pagina web")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        jessica.wasAbleTo(Open.browserOn(paginaPrincipalUI));
    }

    @Cuando("el ingrese los datos de registro")
    public void elIngreseLosDatosDeRegistro() {
        jessica.attemptsTo(
                PaginaPrincipal.click(),
                Registro.informacion()
        );
    }

    @Entonces("el visualizara su cuenta")
    public void elVisualizaraSuCuenta() {
        jessica.should(seeThat("El actor puede ver", ValidarRegistro.validarMensaje(), Matchers.equalTo(true)));
    }

}
