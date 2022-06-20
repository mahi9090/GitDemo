import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angularPractise {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Arigala\\Downloads\\chromedriver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/angularpractice/");
	 driver.findElement(By.name("name")).sendKeys("mahesh");
	 driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input")).sendKeys("mahesh@gmail.com");
	 driver.findElement(By.id("exampleInputPassword1")).sendKeys("meedwdwsdh");
	 driver.findElement(By.id("exampleCheck1")).click();
	 WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	
	Select drop = new Select(dropdown);
	 drop.selectByVisibleText("Male");
	 driver.findElement(By.id("inlineRadio1")).click();

	 driver.findElement(By.name("bday")).sendKeys("21-09-2020");

	 driver.findElement(By.cssSelector(".btn-success")).click();

	 System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	 
	 
	 
	 

	}

}
