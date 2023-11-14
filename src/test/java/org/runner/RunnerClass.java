package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmReports.JvmReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\TC_4_BookAHotel.feature",
glue="org.stepDef",
stepNotifications =true,

monochrome=true,
plugin= {"pretty","json:C:\\Users\\racha\\eclipse-workspace\\org.AdactInHotels\\src\\test\\resources\\Reports\\Report3.json"}

)

public class RunnerClass {
	
	@AfterClass
	
	public static void reportGeneration() {
		
		JvmReporting.JVMReport("C:\\Users\\racha\\eclipse-workspace\\org.AdactInHotels\\src\\test\\resources\\Reports\\Report3.json");

	}
	
	

}
