package co.com.appium.definitions;

import co.com.appium.steps.CalculadoraStep;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CalculadoraDefinition {

  @Steps CalculadoraStep calculadoraStep;

  @Cuando("^se (suman|restan|multiplican|dividen) los siguientes numeros (.*) (.*)$")
  public void sumarNumeros(String operador, int numero1, int numero2) {
    calculadoraStep.efectuarOperacion(operador, numero1, numero2);
  }

  @Entonces("^el resultado sera (.*)$")
  public void elResultadoSera(double resultado) {
    calculadoraStep.obtenerResultado(resultado);
  }
}
