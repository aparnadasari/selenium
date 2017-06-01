import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathBank {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr79115");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jUzamus");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Saivasmitha");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10/10/1999");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("sdjfsajllksadfl");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("telangana");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("324567");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abcbh345@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oioiweurk");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String name = driver.findElement(By.xpath(".//table[@id='customer']/tbody/tr[5]/td[2]")).getText();
		if(name.equals("Vasmitha")){
			System.out.println("name matched");
		}else{
			System.out.println("name didn't match");
			
		}
		

	}
}