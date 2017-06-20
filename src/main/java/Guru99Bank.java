import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99Bank {
	FirefoxDriver driver;

	@BeforeTest(groups={"positive","functional","createCustomer","name","address","city","state","pin","mobileNo","emailid"})
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr79115");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("jUzamus");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("xyzdb");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("01-06-2001");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("hbr");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("hyd");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("Delhi");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("560034");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input"))
				.sendKeys("8197765346");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input"))
				.sendKeys("abcd3464test@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("1231232");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	}

	@Test(groups = { "positive", "functional", "createCustomer","name" },priority=1,invocationCount=5)
	public void testCustomerName() {

		String name = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[5]/td[2]")).getText();
		Assert.assertEquals(name, "xyzdbp");
	}

	@Test(groups = { "positive", "functional", "createCustomer","address" },enabled=false)
	public void testCustomerAddress() {
		String address = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[8]/td[2]")).getText();
		Assert.assertEquals(address, "hbr");
	}

	@Test(groups = { "positive", "functional", "createCustomer","city"},priority=2)
	public void testCustomerCity() {
		String city = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[9]/td[2]")).getText();
		Assert.assertEquals(city, "hyd");
	}

	@Test(groups = { "positive", "functional", "createCustomer" ,"state"},priority=4)
	public void testCustomerState() {
		String state = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[10]/td[2]")).getText();
		Assert.assertEquals(state, "Bng");
	}

	@Test(groups = { "positive", "functional", "createCustomer","pin" },priority=3)
	public void testCustomerPin() {
		String pin = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[11]/td[2]")).getText();
		Assert.assertEquals(pin, "560034");
	}

	@Test(groups = { "positive", "functional", "createCustomer","mobileNo"},priority=5)
	public void testCustomerMobileNo() {
		String mobileNo = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[12]/td[2]")).getText();
		Assert.assertEquals(mobileNo, "8197775346");
	}

	@Test(groups = { "positive", "functional", "createCustomer","emailid" },priority=6)
	public void testCustomerEmailId() {
		String emailId = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[13]/td[2]")).getText();
		Assert.assertEquals(emailId, "abcd34644test@gmail.com");
	}
//
//	@Before Test
//	public void createAccount() {
//		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("61275");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")).sendKeys("savings");
//		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("1000");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[a5]/td[2]/input[1]")).click();
//	}
//	@Test(groups = { "positive", "functional", "createAccount" })
//}
}