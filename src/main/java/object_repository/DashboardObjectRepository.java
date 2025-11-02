package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DashboardObjectRepository {



    @FindBy(id = "tab-flight-tab")
    public WebElement btnFligt;

    @FindBy(xpath = "//div[@id='flight-origin-text-search']")
    public WebElement fromSearchBox;

    @FindBy(xpath = "//input[contains(@class,'SearchBoxTextEditor')]")
    public WebElement fieldInputFlyingFrom;

    @FindBy(xpath = "//div[@id='autocompleteSearch-origin']//li[contains(@class,'Suggestion')]")
    public WebElement sugetion;

    public By airportList = By.xpath ( "//div[@id='autocompleteSearch-origin']//li[contains(@class,'Suggestion')]");


    public By arivalSearchBox = By.className("Box-sc-kv6pi1-0");


    @FindBy(css = "input[placeholder='Flying to']")
    public WebElement fieldInputFlyingArival;

    public By destinationList = By.xpath("//div[@class='Popup AutocompleteSearch__Popup']//li");

    @FindBy(xpath = "//span[@data-selenium-date='2025-11-02']")
    public WebElement setDate;

    @FindBy(css = "button[data-test='SearchButtonBox")
    public WebElement searchButton;



    public DashboardObjectRepository(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
