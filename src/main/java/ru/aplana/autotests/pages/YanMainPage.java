package ru.aplana.autotests.pages;

/**
 * Created by Петр on 15.05.2017.
 */

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class YanMainPage extends BasePageObject {
    @FindBy (xpath = "//div/*[contains(text(),'Маркет')]")
    public WebElement market;

}
