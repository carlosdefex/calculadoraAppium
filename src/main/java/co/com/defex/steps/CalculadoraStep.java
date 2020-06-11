package co.com.defex.steps;

import co.com.defex.pages.CalculadoraPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CalculadoraStep {

  @Page CalculadoraPage calculadoraPage;

  @Step
  public void sumar(int numero1, int numero2) {
    calculadoraPage.seleccionarNumero(numero1);
    calculadoraPage.seleccionarNumero(numero2);
  }
}
