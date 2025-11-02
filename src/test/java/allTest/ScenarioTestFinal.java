package allTest;

import Page.DashboardPage;
import Page.FlightResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScenarioTestFinal {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.agoda.com/?site_id=1922884&tag=6da0c587-ac74-45f1-9a0a-d908d27c6f8d&gad_source=1&gad_campaignid=21045292504&gbraid=0AAAAAD-GdVkOeKroe31iEjnPGiZ3JDmUi&device=c&network=g&adid=695824194136&rand=391454384237080061&aud=kwd-2230651387&gclid=CjwKCAjwu9fHBhAWEiwAzGRC_1hCSkgsQYvIiNMZIrM8zjGg2NL8NUIf-99SqiJpsIL8Z6dokc5n0xoCn5sQAvD_BwE&pslc=1&ds=iZIjODRAsaaSgA6i");
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }
    }
    @Test
    public void scenarioBookingTicket() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage(driver);
        FlightResultPage flightResultPage = new FlightResultPage(driver);
        dashboardPage.searchAirportFrom("Jakarta");

        dashboardPage.selectAirport("Soekarno-Hatta International Airport");
        dashboardPage.searchAirportArival("Singapore");
        Thread.sleep(3000);
        dashboardPage.selectArivalAirport("Singapore Changi Airport");
        Thread.sleep(3000);
        dashboardPage.selectDate();
        dashboardPage.klikButtonSeach();
        Thread.sleep(10000);

        flightResultPage.pickTicket();
        Thread.sleep(3000);

    }



    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
