package co.com.defex.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalculadoraPage extends PageObjectMobile {

  String numero = "com.android.calculator2:id/digit_9";

  @FindBy(id = "com.android.calculator2:id/eq")
  private WebElementFacade igual;

  @FindBy(id = "com.android.calculator2:id/op_div")
  private WebElementFacade division;

  @FindBy(id = "com.android.calculator2:id/op_mul")
  private WebElementFacade multiplicacion;

  @FindBy(id = "com.android.calculator2:id/op_sub")
  private WebElementFacade resta;

  @FindBy(id = "com.android.calculator2:id/op_add")
  private WebElementFacade suma;

  public CalculadoraPage() {
    super();
  }

  public void seleccionarNumero(int numero) {
    $("com.android.calculator2:id/digit_replace".replace("replace", Integer.toString(numero)))
        .click();
  }
}
