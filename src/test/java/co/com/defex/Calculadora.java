package co.com.defex;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/calculadora.feature",
    glue = "co.com.defex.definitions",
    snippets = SnippetType.CAMELCASE)
public class Calculadora {}
