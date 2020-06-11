package co.com.appium;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/calculadora.feature",
    glue = "co.com.appium.definitions",
    snippets = SnippetType.CAMELCASE)
public class CalculadoraRunner {}
