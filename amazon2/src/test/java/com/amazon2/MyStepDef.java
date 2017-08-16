package com.amazon2;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.amazon2.DriverManager.driver;

/**
 * Created by user-pc on 15/08/2017.
 */
public class MyStepDef {
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

    @Then("^i enter In  valid username and In valid password$")
    public void i_enter_In_valid_username_and_In_valid_password() throws Throwable {
        driver.findElement(By.name("email")).sendKeys("raf741852@gmail.com");
        driver.findElement(By.name("password")).sendKeys("rafehahmed");

    }

    @Then("^I am logged in unsuccessfully$")
    public void i_am_logged_in_unsuccessfully() throws Throwable {
        driver.findElement(By.id("signInSubmit")).click();

    }

}
