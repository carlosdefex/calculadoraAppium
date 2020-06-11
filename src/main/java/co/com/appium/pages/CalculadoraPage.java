package co.com.appium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CalculadoraPage extends PageObjectMobile {
  @FindBy(id = "eq")
  private WebElementFacade igual;

  @FindBy(id = "op_div")
  private WebElementFacade division;

  @FindBy(id = "op_mul")
  private WebElementFacade multiplicacion;

  @FindBy(id = "op_sub")
  private WebElementFacade resta;

  @FindBy(id = "op_add")
  private WebElementFacade suma;

  @FindBy(id = "result")
  private WebElementFacade resultado;

  public CalculadoraPage() {
    super();
  }

  public void seleccionarNumero(int numero) {
    getDriver().findElement(By.id("digit_" + numero)).click();
  }

  public void sumar() {
    suma.click();
  }

  public void restar() {
    resta.click();
  }

  public void multiplicar() {
    multiplicacion.click();
  }

  public void dividir() {
    division.click();
  }

  public void igual() {
    igual.click();
  }

  public int obtenerResultado() {
    return Integer.parseInt(resultado.getText());
  }

  public void seleccionarOperador(String operador) {
    switch (operador) {
      case "suman":
        sumar();
        break;
      case "restan":
        restar();
        break;
      case "multiplican":
        multiplicar();
        break;
      case "dividen":
        dividir();
        break;
      default:
        throw new IllegalStateException("No se encontro el operador" + operador);
    }
  }
}
