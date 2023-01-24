package superapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/medellinencifras.feature",
        glue = "superapp.stepdefinitions",
        //tags = {"@Gubernamental-Beneficios"},
        snippets = SnippetType.CAMELCASE)
public class MedellinEnCifrasRunner {
}
