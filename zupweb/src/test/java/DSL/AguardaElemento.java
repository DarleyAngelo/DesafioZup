package DSL;
import static Core.DriverFactory.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AguardaElemento {
	
	static WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	
	public static void aguardaElemento(WebElement ... element) {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));	
		
	}
	
	public static boolean verificaSeElementoEVisivel(WebElement elemento){	
	    try {	    	
	    	elemento.isDisplayed();
	       return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	
	
	
}