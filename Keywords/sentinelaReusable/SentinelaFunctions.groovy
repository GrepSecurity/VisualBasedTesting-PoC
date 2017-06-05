package sentinelaReusable

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import br.com.saraivaugioni.sentinela.main.Sentinela

public class SentinelaFunctions {
	public static Sentinela sentinel ;
	public static WebDriver driver = DriverFactory.getWebDriver();
	
	@Keyword
	public static void verify_Page_Comparsion(String pageName) {
		 sentinel = new Sentinela(driver, "VBTImages", "VisualBasedReports\\", 1300, 800);
		 sentinel.validate(pageName);
		 
	}
	
	@Keyword
	public static void verify_WebElement_Comparsion(TestObject objectTo ,String webElementName) {
		 sentinel = new Sentinela(driver, "VBTImages", "VisualBasedReports\\", 500, 200);
		 WebElement element = WebUiCommonHelper.findWebElement(objectTo, 20);
		  sentinel.validate(element, webElementName);
	}
	
	@Keyword
	public static void GenerateReports_Sentinela()
	{
		sentinel.generateReport();
		sentinel.isDiff();
	}
}
