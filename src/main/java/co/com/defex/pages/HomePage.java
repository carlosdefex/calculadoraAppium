package co.com.defex.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObjectMobile {

  @FindBy(id = "mic.app.gastosdecompras:id/buttonAddIncome")
  private WebElementFacade btnAddIncome;

  @FindBy(id = "mic.app.gastosdecompras:id/buttonStart")
  private WebElementFacade btnStart;

  public HomePage() {
    super();
  }

  public void goAddIncome() {
    btnAddIncome.click();
  }

  public void selectStart() {
    btnStart.click();
  }
}
