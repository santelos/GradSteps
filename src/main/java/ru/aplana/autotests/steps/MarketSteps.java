package ru.aplana.autotests.steps;

/**
 * Created by Петр on 15.05.2017.
 */

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import ru.aplana.autotests.StoriesRunner;
import ru.aplana.autotests.pages.*;

import static org.junit.Assert.assertTrue;

public class MarketSteps {
    MarketPage marketPage;

    @Step ("Выбрать электрониту")
    public void selectElectro() {marketPage.electonicBut.click();}

    @Step ("Выбрать {0}")
    public void selectTV(String value) {
        String regEx="^"+value;
        StoriesRunner.getWebDriver().findElement(By.xpath("//div[@class='catalog-menu__list']/a[text(),'" + value + "']')]"));
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!    "+marketPage.tvElement.getText());
        if (value.matches(regEx)) {
            marketPage.tvElement.click();
        } else {
            if (value.matches(regEx)) {
                marketPage.earsElement.click();
            }
        }
    }
}
