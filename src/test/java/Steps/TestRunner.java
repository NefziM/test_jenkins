package Steps;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"Steps"},monochrome= true
, plugin = {"pretty" , "junit:target/Reports/report.xml",
		"json:target/Reports/report.json",
		"html:target/Reports/report.html"},
tags="@dispolivre")
public class TestRunner {
	
	
	

}
