package superapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reportesciudadanos.feature",
        glue = "superapp.stepdefinitions",
        tags = {"@ReportesCiudadanos-Contenedores-De-Basura"},
        snippets = SnippetType.CAMELCASE)
public class ReportesCiudadanosRunner {
}
