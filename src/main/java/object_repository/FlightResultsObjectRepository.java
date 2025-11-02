package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightResultsObjectRepository {


    public By airLineSection = By.id("Airlines");

    @FindBy(xpath = "//label[@data-element-value='AirAsia']")
    public WebElement checkBoxAirAsia;

    @FindBy(xpath = "//button[contains(@data-testid,'flights-quick-sort-item-Price-button')]")
    public WebElement cheapestBtn;


    @FindBy(xpath = "(//div[@data-testid='flight-infinite-scroll']//div[@class='GridItem__GridItemStyled-sc-3btv1u-0 fXrNCt'])[1]")
    public WebElement cardTicket;

    @FindBy(xpath = "//button[@data-component='flight-card-bookButton']")
    public WebElement selectButton;

    public By verifyContactDetail =By.xpath("//h3[normalize-space()='Contact details']");

    public FlightResultsObjectRepository(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
