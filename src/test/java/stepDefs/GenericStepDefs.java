package stepDefs;


import PageFactory.HomePage;
import PageFactory.PracticePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.en.*
        ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericStepDefs {
    WebDriver driver;
    PracticePage practicePage;
    HomePage homePage;

    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HT Electronics\\NA_Bootcamp_Test\\geckodriver.exe" );
        driver =new FirefoxDriver();
        practicePage = new PracticePage(driver);
        homePage=new HomePage(driver);
    }

    @Given("^I navigate to \"([^\"]*)\" url$")
    public void i_navigate_to_url(String string) throws InterruptedException {

        driver.get(string);
        System.out.println("Window Title:"  + driver.getTitle());
        Thread.sleep(2000);
    }

    @When("^I click on Practice$")
    public void i_click_on_Practice() throws InterruptedException {

    homePage.clickPractice();
        Thread.sleep(5000);

    }

    @Then("^I select BMW radio button$")
    public void i_select_BMW_radio_button() throws InterruptedException {

       practicePage.selectRadio();
        Thread.sleep(5000);


    }

    @Then("^I select (\\w+) from cars dropdown$")
    public void i_select_Honda_from_cars_dropdown(String carType) throws InterruptedException {
        practicePage.selectDropDn(carType);
        Thread.sleep(5000);

    }
    @Then("^I validate enrollNow is displayed")
     public void i_validate_enroll(){
        homePage.isEnrollnowDisplayed();
}

      @And("^I validate home image source is \"([^\"]*)\"$")
      public void i_validate_homeimg_src(String expectedSrc){
        homePage.validateHomeSrc(expectedSrc);
}

    @After
    public void tearDown(){

        driver.quit();
    }



}
