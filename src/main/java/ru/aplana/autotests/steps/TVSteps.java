package ru.aplana.autotests.steps;

/**
 * Created by Петр on 15.05.2017.
 */
import net.thucydides.core.annotations.Step;
import org.yecht.Data;
import ru.aplana.autotests.pages.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TVSteps {
    TVPage tvPage;
    public String elementVal;

    @Step ("Выбрать цену {0}")
    public void setPrice(String _value) {tvPage.setPrise(_value);}

    @Step ("Выбрать производителя {0}")
    public void selectProducer(String _value) {tvPage.selectProducer(_value);}

    @Step ("Выполено нажате на кнопку Применить")
    public void getSearchResults() {tvPage.searchBut.click();}

    @Step("Количество элементов = {0}")
    public void checkNumberOfElements(String _value) {
        assertTrue("Количество элементов не равно ["+_value+"]",
                _value.equals(String.valueOf(tvPage.getElements().size())));
    }

    @Step("Запомнить название элемента {0}")
    public void saveElementName(String _value) {
        elementVal=tvPage.getProductName(tvPage.getElements().get(Integer.parseInt(_value)-1));
    }

    @Step("Выполнить Поиск \"{0}\"")
    public void search(String _value) {
        tvPage.setSearch(_value);
        tvPage.searchBut.click();
    }

    @Step("Заголовок страницы равен \"{0}\"")
    public void checkTitle(String _value) {
        assertTrue("Заголовок равен ["+elementVal+"] ожидалось ["+_value+"]",
                _value.equals(elementVal));
    }

}
