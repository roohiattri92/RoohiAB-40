package selenium_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hoverover_amazon1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver god=new ChromeDriver();
		god.navigate().to("https://www.amazon.in/");
		god.manage().window().maximize();
		god.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement pop=god.findElement(By.id("twotabsearchtextbox"));
		pop.click();
	WebElement u=god.findElement(By.name("url"));
	u.click();
	
	  for(int i=0;i<11;i++)
	  {
		  Select k=new Select(u);
			k.selectByIndex(i);
	  }
	  pop.sendKeys("shoes");
	  god.findElement(By.xpath("(//div[@class='s-suggestion-container'])[2]")).click();
	god.findElement(By.xpath("(//img[@class='s-image'])[3]")).click();
	  Thread.sleep(10000);
	  
	WebElement j=  god.findElement(By.xpath("(//input[@type='submit'])[11]"));
	j.click();
	  Actions m=new Actions(god);
	  m.moveToElement(j).perform();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*WebElement house=god.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions j=new Actions(god);
	j.moveToElement(house).perform();
	god.findElement(By.className("nav-text")).click();*/
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
