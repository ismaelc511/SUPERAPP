package superapp.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/tacitadeplata.feature",
        glue = "superapp.stepdefinitions",
        tags = {"@Tacita-De-Plata"},
        snippets = SnippetType.CAMELCASE)
public class TacitaDePlataRunner {
}
