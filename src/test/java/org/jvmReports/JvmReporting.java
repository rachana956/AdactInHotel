package org.jvmReports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReporting {

	public static void JVMReport(String jsonFile) {

		File file = new File("C:\\Users\\racha\\eclipse-workspace\\org.AdactInHotels\\src\\test\\resources\\Reports");

		Configuration configuration = new Configuration(file, "Adactin login validation");

		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "118");
		configuration.addClassifications("Test No", "1");
		configuration.addClassifications("Sprint No", "1");

		List<String> jsonFiles = new ArrayList<String>();

		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();

	}

}
