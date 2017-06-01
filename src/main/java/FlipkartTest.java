import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTest {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		driver.findElement(By.xpath("//input[@class='_2zrpKAtqH0O2AkjJPXnqu9']"))
				.sendKeys("8884779779");
		driver.findElement(By.xpath("//input[@class='_2zrpKAtqH0O2AkjJPXnqu9 _3v41xvBrgAilgmA1Pn_ONR']"))
				.sendKeys("fdgfjhgh");
		driver.findElement(By.xpath("//button[@class='_2AkmmACqEoGpO0Lb0CP5qw _1LctnI5odiL0RXoz8QG7f- _7UHT_c6I0rNPYxrgQM_qC']")).click();
		

	}

}
