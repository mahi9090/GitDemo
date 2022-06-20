import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arigala\\Downloads\\chromedriver\\new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https//www.amazon.com/");
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.id("nav-link-accountList"));
        a.moveToElement(driver.findElement(By.className("nav-searchbar nav-progressive-attribute nav-active"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
        a.moveToElement(move).build().perform();
        

}
}