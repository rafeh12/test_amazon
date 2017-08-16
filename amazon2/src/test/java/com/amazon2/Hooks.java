package com.amazon2;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user-pc on 15/08/2017.
 */
public class Hooks {
    public static WebDriver driver;
    @Before
    public void setup(){
        new DriverManager().openBrowser();
        System.setProperty("web.chrome.driver","C:\\Users\\user-pc\\IdeaProjects\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("");
        driver.manage() .timeouts() .implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        new DriverManager() .closeBrowser();
    }

}
