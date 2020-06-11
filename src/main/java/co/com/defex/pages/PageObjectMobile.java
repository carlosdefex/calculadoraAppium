package co.com.defex.pages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import io.appium.java_client.MobileDriver;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectMobile extends PageObject {

  protected MobileDriver mobileDriver;

  public PageObjectMobile() {
    mobileDriver = getProxiedDriver();
  }
}
