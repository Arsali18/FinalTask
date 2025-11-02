package Page;

import object_repository.FlightResultsObjectRepository;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;

public class FlightResultPage {
    private FlightResultsObjectRepository flightResultsObjectRepository;
    WebDriver driver;

    public FlightResultPage(WebDriver driver){
        this.driver=driver;
        this.flightResultsObjectRepository=new FlightResultsObjectRepository(driver);
    }

    public void pickTicket() throws InterruptedException {
        driver.findElement(flightResultsObjectRepository.airLineSection);
        Thread.sleep(5000);
        System.out.println(flightResultsObjectRepository.checkBoxAirAsia.getText());
        flightResultsObjectRepository.checkBoxAirAsia.click();
        flightResultsObjectRepository.cheapestBtn.click();
        Thread.sleep(1000);
        flightResultsObjectRepository.cardTicket.click();
        Thread.sleep(2000);
        flightResultsObjectRepository.selectButton.click();
    }

    public void verifyContactDetails(){
        driver.findElement(flightResultsObjectRepository.verifyContactDetail);
    }
}
