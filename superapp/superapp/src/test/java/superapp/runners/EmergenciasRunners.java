package superapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/emergencias.feature",
        glue = "superapp.stepdefinitions",
        //tags = {"@emergencias"},
        snippets = SnippetType.CAMELCASE)
public class EmergenciasRunners {
}
