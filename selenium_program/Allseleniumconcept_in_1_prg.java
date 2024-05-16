package selenium_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Allseleniumconcept_in_1_prg {

	public static void main(String[] args) 
	{
		WebDriver god=new ChromeDriver();
		god.navigate().to("https://www.amazon.in/");
		god.manage().window().maximize();
		god.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement y=god.findElement(By.id("twotabsearchtextbox"));
		y.click();
		WebElement g=god.findElement(By.name("url"));
		g.click();
		for(int i=0;i<11;i++)
		{
        Select s1=new Select(g);
        s1.selectByIndex(i);
        }
		g.sendKeys("product");
		y.sendKeys(Keys.ENTER);
		god.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		god.findElement(By.xpath("nav-link-accountList-nav-line-1")).click();
		WebElement f=god.findElement(By.className("nav-line-2"));
		Actions m=new Actions(god);
		m.moveToElement(f).perform();
		
		
}

}
