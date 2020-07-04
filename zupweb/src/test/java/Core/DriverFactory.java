package Core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {}

	public static synchronized WebDriver getDriver() {
		if(driver == null) {

			if (Propriedades.browser.name().equals("FIREFOX")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + 
						"src" + File.separator + "main" + File.separator + "resources" + File.separator +
						"drivers" + File.separator + "geckodriver.exe");		

				driver = new FirefoxDriver();
			} else {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + 
						"src" + File.separator + "main" + File.separator + "resources" + File.separator +
						"drivers" + File.separator + "chromedriver.exe");				

				//Para executar sem chamada do navegador passar diferente de != nunll no if
				if (Propriedades.HEADLESS) {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-error");
					driver = new ChromeDriver(options);
				} else {
					driver = new ChromeDriver();
				}
			}
		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
