package Page;

import object_repository.DashboardObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage {

    private DashboardObjectRepository dashboardObjectRepository;
    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver=driver;
        this.dashboardObjectRepository= new DashboardObjectRepository(driver);
    }

    public WebElement getAirportFrom(String airportFrom){
        List<WebElement> airports = driver.findElements(dashboardObjectRepository.airportList);
        WebElement airport = airports.stream().filter(air->
                air.getText().contains(airportFrom)).findFirst().orElse(null);
        return airport;
    }

    //public void searchTicket(String searchBox, String arrivalSearch){
    public void searchAirportFrom(String fieldInputFlyingFrom ) throws InterruptedException {
        Thread.sleep(3000);
        dashboardObjectRepository.btnFligt.click();
        Thread.sleep(3000);
        dashboardObjectRepository.fromSearchBox.click();
        Thread.sleep(3000);
        dashboardObjectRepository.fieldInputFlyingFrom.sendKeys(fieldInputFlyingFrom);
        Thread.sleep(3000);

    }

    public void selectAirport(String airportFrom) throws InterruptedException {
        Thread.sleep(3000);
        WebElement airport = getAirportFrom(airportFrom);
        airport.click();
    }

    public void searchAirportArival(String fieldInputFlyingArival){
        driver.findElement(dashboardObjectRepository.arivalSearchBox);
        dashboardObjectRepository.fieldInputFlyingArival.sendKeys(fieldInputFlyingArival);
    }

    public WebElement getAirportArival(String airportArival){
        List<WebElement> arivalAirports = driver.findElements(dashboardObjectRepository.destinationList);
        WebElement arivalAirport = arivalAirports.stream().filter(arival ->
                arival.getText().contains(airportArival)).findFirst().orElse(null);
        return arivalAirport;
    }

    public void selectArivalAirport(String airportArival){
        WebElement airport = getAirportArival(airportArival);
        airport.click();
    }

    public void selectDate(){
        dashboardObjectRepository.setDate.click();
    }

    public void klikButtonSeach(){
        dashboardObjectRepository.searchButton.click();
    }

}


