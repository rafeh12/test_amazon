package Amazon;

/**
 *
 */
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mystepdef {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       /* driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/

    }

    @After
    public void stop(){
       // driver.quit();
    }

    @Given("^as a user I am on Amazon\\.co\\.uk$")
    public void as_a_user_I_am_on_Amazon_co_uk() throws Throwable {
        driver.get("https://www.amazon.co.uk/");
        driver.manage() .window() .maximize();


    }

    @When("^user click Sign-in button$")
    public void user_click_Sign_in_button() throws Throwable {
        driver.findElement(By.cssSelector("#nav-link-yourAccount")).click();

    }


    @Then("^i enter username and \"password$")
    public void i_enter_username_and_password() throws Throwable {
        driver.findElement(By.name("email")).sendKeys("raf741852@gmail.com");
        driver.findElement(By.name("password")).sendKeys("rafehahmed");
    }


    @Then("^I am logged in successfully$")
    public void i_am_logged_in_successfully() throws Throwable {
        driver.findElement(By.id("signInSubmit")).click();

    }


}























