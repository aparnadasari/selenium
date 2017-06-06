import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.globalrph.com/davescripts/popup.htm");

		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[7]/td/div/table/" + ""

				+ "tbody/tr/td[2]/div[1]/form/table/tbody/tr[4]/td[2]/p/input")).click();

		Set<String> windowIds = driver.getWindowHandles(); // get window id of

		// current window

		Iterator<String> itererator = windowIds.iterator();

		String mainWinID = null;

		if (itererator.hasNext()) {

			mainWinID = itererator.next();

		}

		String popupWinID = null;

		if (itererator.hasNext()) {

			popupWinID = itererator.next();

		}

		driver.switchTo().window(popupWinID);

		// System.out.println(driver.getTitle()); No Title for PopUps

		String coupuncode = driver.findElement(By.xpath("/html/body/h2")).getText();

		System.out.println(coupuncode);

		Thread.sleep(1000);

		driver.switchTo().window(mainWinID);

		System.out.println(driver.getTitle());

		driver.quit();
	}
}
