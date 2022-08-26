package com.test.bdd.scripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {
		"com\\test\\bdd\\stepdefinations" }, monochrome = true, plugin = { "pretty",
				"html:target/HtmlReports/Report.html", "json:target/JSONReports/Report.json" }, tags = "@smoketest")
public class TestRunner {

}
