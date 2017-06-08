import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99Bank {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
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
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea"))
				.sendKeys("hbr");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"))
				.sendKeys("Delhi");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input"))
				.sendKeys("Delhi");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("560034");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input"))
				.sendKeys("8197765346");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input"))
				.sendKeys("abc12test@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("1231232");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
		String name = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[5]/td[2]")).getText();
		if (name.equals("xyzdb")) {
			System.out.println("name matched");
		} else {
			System.out.println("name doesn't match");
		}
		String address = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[8]/td[2]")).getText();
		if (address.equals("hbrlayout")) {
			System.out.println("address matched");
		} else {
			System.out.println("address didn't match");
		}
		String city = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[9]/td[2]")).getText();
		if (city.equals("hyd")) {
			System.out.println("city matched");
		} else {
			System.out.println("city didn't match");
		}
		String state = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[10]/td[2]")).getText();
		if (state.equals("Delhi")) {
			System.out.println("state matcher");
		} else {
			System.out.println("state didn't match");
		}
		String pin = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[11]/td[2]")).getText();
		if (pin.equals("560034")) {
			System.out.println("pin matched");
		} else {
			System.out.println("pin didn't match");
		}
		String mobileNo = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[12]/td[2]")).getText();
		if (mobileNo.equals("8197765345")) {
			System.out.println("mobile number matched");
		} else {
			System.out.println("mobile number didn't matched");
		}
		String emailId = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[13]/td[2]")).getText();
		if (emailId.equals("abctest@gmail.com")) {
			System.out.println("email Id matched");
		} else {
			System.out.println("email Id didn't matched");
		}

	}

}
