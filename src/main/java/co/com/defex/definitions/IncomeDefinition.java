package co.com.defex.definitions;

import co.com.defex.steps.AddIncomeStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class IncomeDefinition {
  @Steps AddIncomeStep addIncomeStep;

  @Dado("^que estoy el formulario de adicionar ingresos$")
  public void addIncomeForm() {
    addIncomeStep.addIncomeForm();
  }

  @Cuando("^adiciono un ingreso con valor de (.*), categoría (.*) y descripción (.*)$")
  public void adicionar_ingresos(String value, String categoryOption, String description) {
    addIncomeStep.addIncome(value, categoryOption, description);
  }
}
