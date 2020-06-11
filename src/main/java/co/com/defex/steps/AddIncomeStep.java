package co.com.defex.steps;

import co.com.defex.pages.HomePage;
import co.com.defex.pages.IncomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class AddIncomeStep extends ScenarioSteps {

  @Page HomePage homePage;
  @Page IncomePage addIncomePage;

  @Step
  public void addIncomeForm() {
    homePage.selectStart();
    homePage.goAddIncome();
  }

  @Step
  public void addIncome(String value, String categoryOption, String description) {
    addIncomePage.typeIncomeValue(value);
    addIncomePage.selectIncomeCategory();
    addIncomePage.selectIncomeCategoryOption(categoryOption);
    addIncomePage.typeDescriptionIncome(description);
    addIncomePage.clickSaveIncome();
  }
}
