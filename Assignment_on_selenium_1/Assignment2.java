
//dropdown 



package Assignment_on_selenium_1;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver p1=new ChromeDriver();
		   p1.get("https://www.amazon.in/");
		   WebElement roohi= p1.findElement(By.name("field-keywords"));//inspect search option select
		   roohi.click();	
		   WebElement m= p1.findElement(By.id("searchDropdownBox"));//inspect dropdown 
		   m.click();
		Select r=new Select(m);// method  to dropdown
		 
		for(int i=0;i<11;i++)
		{
			r.selectByIndex(i);
		}
		
		
		Thread.sleep(5000);
		
		
		// index number 
		   roohi.sendKeys("world war");// then enter world war
		   roohi.sendKeys(Keys.ENTER);// then enter it.
		   
		   
		   
		  
		   }

}
