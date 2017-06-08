import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		WebElement searchbox = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		searchbox.sendKeys("selenium");
		WebElement button = driver.findElement(By.xpath(".//*[@id='_fZl']"));
		button.click();
		// driver.quit();
		
	}
}
