package co.com.defex.definitions;

import co.com.defex.steps.CalculadoraStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CalculadoraDefinition {

  @Steps CalculadoraStep calculadoraStep;

  @Cuando("^sumo los siguientes numeros (.*) (.*)$")
  public void sumoLosNumero(int numero1, int numero2) {
    calculadoraStep.sumar(numero1, numero2);
  }

  @Entonces("^el resultado sera (.*)$")
  public void elResultadoSera(int arg1) {}
}
