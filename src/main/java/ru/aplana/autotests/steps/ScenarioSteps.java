package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

/**
 * Created by Maria on 01.05.2017.
 */
public class ScenarioSteps {

    @Steps
    MarketSteps marketSteps;

    @Steps
    TVSteps tvSteps;

    @Steps
    YanMainStep yanMainStep;

//
    @When("Выбран маркет")
    public void selectMarket() {
        yanMainStep.goToMarket();
    }

    @When("Выбрана электроника")
    public void selectElectro() {
        marketSteps.selectElectro();
    }

    @When("Выбран раздел [$value]")
    public void selectTV(String value) {
        marketSteps.selectTV(value);
    }

    @When("Задана стоимость \"$value\"")
    public void setPrice(String value) {
        tvSteps.setPrice(value);
    }

    @When("Выбрать происзодителя \"$value\"")
    public void selectProducer (String value) {
        tvSteps.selectProducer(value);
    }

    @When("Нажата кнопка 'Применить'")
    public void pressAgreeBut() {
        tvSteps.getSearchResults();
    }

    @Then("Элементов на странице \"$value\"")
    public void checkNumberOfElements(String value) {
        tvSteps.checkNumberOfElements(value);
    }

    @When("Запомнить название [$value] элемента")
    public void saveName(String value) {
        tvSteps.saveElementName(value);
    }

    @When("Выполнен поиск сохраненного элемента")
    public void searchForElement() {
        tvSteps.search(tvSteps.elementVal);
    }

    @Then("Титул найденного товара равен запомненному значению")
    public void checkSearchResults() {
        tvSteps.checkTitle(tvSteps.elementVal);
    }


}
