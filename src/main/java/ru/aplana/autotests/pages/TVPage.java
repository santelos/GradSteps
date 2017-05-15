package ru.aplana.autotests.pages;

/**
 * Created by Петр on 15.05.2017.
 */

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TVPage extends BasePageObject {
    @FindBy (xpath = "//*[@id='glf-pricefrom-var']")
    public WebElement priseFrom;

    @FindBy (xpath = "//*[@id='glf-priceto-var']")
    public WebElement priseTo;

    @FindBy (xpath = "//*[text()='Производитель']/../../..")
    public WebElement producer;

    @FindBy (xpath = "//div[@class='n-filter-panel-aside__apply']")
    public WebElement applyBut;

    @FindBy (xpath = "//div[@class='filter-applied-results metrika i-bem filter-applied-results_js_inited']")
    public WebElement elementList;

    @FindBy (xpath = "//*[@id='header-search']")
    public WebElement search;

    @FindBy (xpath = "//span[@class='search2__button']/button")
    public WebElement searchBut;


    public void selectProducer(String _name) {
        producer.findElement(By.xpath(".//span[contains(text(),'"+_name+"')]")).click();
    }

    public void setPrise(String _value){
        fillField(priseFrom,_value);
        fillField(priseTo,_value);
    }

    public void setSearch(String _value) {
        fillField(search,_value);
    }

    public String getProductName(WebElement _element){
        return _element.findElement(By.xpath("//span[@class='snippet-card__header-text']")).getText();
    }

    public List<WebElement> getElements(){
        return elementList.findElements(By.xpath(".//div[@class='n-snippet-card snippet-card clearfix i-bem snippet-card_js_inited n-snippet-card_js_inited']"));
    }
}
