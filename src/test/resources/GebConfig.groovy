package resources

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver


System.setProperty("webdriver.gecko.driver", new File('src/test/resources/geckoddriver.exe').getAbsolutePath() );
//System.setProperty("webdriver.gecko.driver", new File('geckoddriver.exe').getAbsolutePath() );

driver = { new FirefoxDriver() }

baseUrl = "http://localhost:8080"

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true
