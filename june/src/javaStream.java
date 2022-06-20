import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaStream {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Arigala\\Downloads\\chromedriver\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        ArrayList <String> names = new ArrayList<String>();
        names.add("Av");
        names.add("vv");
        names.add("Aasfasv");
        names.add("Afefe");
        names.add("fvasdasd");
        
        Long c = names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);
        
        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
        
        

	}
	public void stringCollect()
	{
    List<Integer>values = Arrays.asList(1,2,2,3,4,98,5);
    values.stream().distinct().forEach(s->System.out.println(s));
		
		
		
	}

}
