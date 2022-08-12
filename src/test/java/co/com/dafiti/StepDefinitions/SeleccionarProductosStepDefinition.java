package co.com.dafiti.StepDefinitions;

import co.com.dafiti.Interactions.CerrarVentana;
import co.com.dafiti.Interactions.Esperar;
import co.com.dafiti.Questions.ValidarProductos;
import co.com.dafiti.Tasks.*;
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

public class SeleccionarProductosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor jessica = Actor.named("jessica");

    private PaginaPrincipalUI paginaPrincipalUI = new PaginaPrincipalUI();

    @Before
    public void configuracion(){
        jessica.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario se encuentra en la pagina web")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        jessica.wasAbleTo(Open.browserOn(paginaPrincipalUI));
    }

    @Cuando("inicie sesion y seleccione los productos")
    public void inicieSesionYSeleccioneLosProductos() {
        jessica.attemptsTo(PaginaPrincipal.click(),
                Login.datos(), Categoria.producto(), Productos.productos(),
                SeleccionarProducto.agregar(), BusquedaProducto.informacion());
    }

    @Entonces("el visualizara los productos en el carrito")
    public void elVisualizaraLosProductosEnElCarrito() {
        jessica.should(seeThat("El actor puede ver", ValidarProductos.validarProductos(), Matchers.equalTo(true)));
    }

}
