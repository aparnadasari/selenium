import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInterface {
public static void main(String[] args) {
Rbi a=new SeleniumBank("aparna",1234,"abcdv",500);
double x = a.getBalance();
a.withdraw(500);
x = a.getBalance();
System.out.println(x);
WebDriver wd=new FirefoxDriver();

}
}
