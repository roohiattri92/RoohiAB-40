package selenium_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay_isenable {

	public static void main(String[] args) 
	{
    ChromeDriver y=new ChromeDriver();
    y.get("file:///C:/Users/roohi/Downloads/learningHTML1.html");
    y.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement o=y.findElement(By.id("3"));
    boolean j= o.isDisplayed();
    boolean k=o.isEnabled();
    if(!(j||k))
    {
    	o.sendKeys("roohi");
    }
    
	}

}
