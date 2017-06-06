import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQa {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aparna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dasari");
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@id='exp-0']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05-06-2016");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		//driver.findElement(By.xpath("//input[@id='photo']")).click();
		//driver.findElement(By.xpath("//a[@href='http://toolsqa.wpengine.com/wp-content/uploads/2014/04/OnlineStore.zip']")).click();
		//driver.switchTo().alert().accept();
		//driver.findElement(
			//	By.xpath("//a[@href='http://toolsqa.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx']"))
				//.click();
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		WebElement dropdown=driver.findElement(By.xpath(".//*[@id='continents']"));
		dropdown.findElement(By.xpath("//*[text()='Antartica']")).click();
		
		WebElement msdropdown = driver.findElement(By.xpath(".//*[@id='selenium_commands']/option[1]]"));
		msdropdown.click();
		msdropdown = driver.findElement(By.xpath(".//*[@id='selenium_commands']/option[2]]"));
		msdropdown.click();
		msdropdown = driver.findElement(By.xpath(".//*[@id='selenium_commands']/option[4]]"));
		msdropdown.click();
		
		
		//msdropdown.findElement(By.xpath("//*[text()='Browser Commands','Switch Commands']")).click();
	
		
			//	driver.findElement(By.xpath("//button[@id='submit']")).click();

	}
}
