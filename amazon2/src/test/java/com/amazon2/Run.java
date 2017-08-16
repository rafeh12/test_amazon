package com.amazon2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by user-pc on 15/08/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".")//(format = {"pretty", "html:target/Amazon", "json:target/Amazon.json"})
public class Run {
}
