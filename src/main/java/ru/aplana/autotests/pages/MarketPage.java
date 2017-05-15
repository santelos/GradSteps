package ru.aplana.autotests.pages;

/**
 * Created by Петр on 15.05.2017.
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import ru.aplana.autotests.StoriesRunner;

public class MarketPage extends BasePageObject {
    @FindBy(xpath = "//li/a[contains(text(),'Электроника')]")
    public WebElement electonicBut;

    @FindBy(xpath = "//div[@class='catalog-menu__list']/a[text(),'Телевизоры']')]")
    public WebElement tvElement;

    @FindBy(xpath = "//div[@class='catalog-menu__list']/a[text(),'Наушники']')]")
    public WebElement earsElement;

}
