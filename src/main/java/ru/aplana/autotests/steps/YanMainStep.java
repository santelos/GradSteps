package ru.aplana.autotests.steps;

/**
 * Created by Петр on 15.05.2017.
 */
import net.thucydides.core.annotations.Step;
import ru.aplana.autotests.pages.*;

import static org.junit.Assert.assertTrue;
public class YanMainStep {
    YanMainPage yanMainPage;

    @Step ("Войти в Яндекс Маркет")
    public void goToMarket() {yanMainPage.market.click();}

}
