import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("aparnakaranki1206@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("hjgfhjgdgfsfd");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	}
}
