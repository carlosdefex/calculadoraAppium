package co.com.appium.steps;

import co.com.appium.pages.CalculadoraPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CalculadoraStep {

  @Page CalculadoraPage calculadoraPage;

  @Step
  public void efectuarOperacion(String operador, int numero1, int numero2) {
    calculadoraPage.seleccionarNumero(numero1);
    calculadoraPage.seleccionarOperador(operador);
    calculadoraPage.seleccionarNumero(numero2);
    calculadoraPage.igual();
  }

  @Step
  public void obtenerResultado(double resultado) {
    MatcherAssert.assertThat(
        "Revisar el resultado", calculadoraPage.obtenerResultado() == resultado);
  }

  public void restar(int numero1, int numero2) {}

  public void multiplicar(int numero1, int numero2) {}

  public void dividir(int numero1, int numero2) {}
}
