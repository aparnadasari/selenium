import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DepositWithdraw {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr79115");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("jUzamus");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("28512");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("2000");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"))
				.sendKeys(" 2k money deposit");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[9]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("28512");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("500");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"))
				.sendKeys("500 rs withdraw");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")).click();

	}
}
