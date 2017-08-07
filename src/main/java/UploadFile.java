import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UploadFile {
	String URL = "http://toolsqa.com/automation-practice-form/";
	 @Test
	 public void testUpload() throws InterruptedException
	 {
	  WebDriver  driver = new FirefoxDriver();
	  WebDriverWait wd=new WebDriverWait(driver,20);
	  
	  driver.get(URL);
	  //WebElement element = driver.findElement(By.xpath(".//*[@id='photo']"));
	  wd.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='photo']"))).sendKeys("C:/SampleXLSFile_19kb.xls");
	  //element.sendKeys("C:/SampleXLSFile_19kb.xls");
	 }
}
