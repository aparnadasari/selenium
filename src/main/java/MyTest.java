
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"))
				.sendKeys("mobiles");
		driver.findElement(
				By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button"))
				.click();
		// driver.quit();

	}

}
