import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arigala\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("checkBoxOption1")).click();
	    driver.findElement(By.id("checkBoxOption1")).isSelected();
	    Thread.sleep(3000);
	    driver.findElement(By.id("checkBoxOption1")).click();
	    driver.findElement(By.id("checkBoxOption1")).isSelected();
	    System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size());
	    driver.findElements(By.cssSelector("input[value='checkbox']")).size();
	    
	}
	
	}
