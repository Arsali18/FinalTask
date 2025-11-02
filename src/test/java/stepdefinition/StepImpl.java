package stepdefinition;

import Page.DashboardPage;
import Page.FlightResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepImpl {

    WebDriver driver;
    WebDriverWait wait;

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.agoda.com/?site_id=1922884&tag=6da0c587-ac74-45f1-9a0a-d908d27c6f8d&gad_source=1&gad_campaignid=21045292504&gbraid=0AAAAAD-GdVkOeKroe31iEjnPGiZ3JDmUi&device=c&network=g&adid=695824194136&rand=391454384237080061&aud=kwd-2230651387&gclid=CjwKCAjwu9fHBhAWEiwAzGRC_1hCSkgsQYvIiNMZIrM8zjGg2NL8NUIf-99SqiJpsIL8Z6dokc5n0xoCn5sQAvD_BwE&pslc=1&ds=iZIjODRAsaaSgA6i");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @When("user set departure airport")
    public void user_set_departure_airport() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.searchAirportFrom("Jakarta");
        Thread.sleep(2000);
    }

    @And("user select departure airport")
    public void user_select_departure_airport() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.selectAirport("Soekarno-Hatta International Airport");
    }

    @And("user set destination airport")
    public void user_set_destination_airport() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.searchAirportArival("Singapore");
        Thread.sleep(3000);
    }

    @And("user select destination airport")
    public void user_select_destination_airport() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.selectArivalAirport("Singapore Changi Airport");
        Thread.sleep(3000);
    }

    @And("user sets departure date")
    public void user_sets_departure_date() {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.selectDate();
    }

    @And("user click button Search")
    public void user_click_button_Search() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.klikButtonSeach();
        Thread.sleep(10000);
    }

    @Then("user navigate is navigated to result page")
    public void user_navigate_is_navigated_to_result_page() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.verifyFlightLable();
    }


    @When("user selects a ticket")
    public void user_selects_a_ticket() throws InterruptedException {
        FlightResultPage flightResultPage = new FlightResultPage(driver);
        flightResultPage.pickTicket();
        Thread.sleep(3000);
    }

    @Then("user navigate is navigated to customer information page")
    public void user_navigate_is_navigated_to_customer_information_page() {
        FlightResultPage flightResultPage = new FlightResultPage(driver);
        flightResultPage.verifyContactDetails();
    }
}
