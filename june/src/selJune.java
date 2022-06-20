import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selJune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arigala\\Downloads\\chromedriver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://rahulshettyacademy.com");
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
 
	}

}
