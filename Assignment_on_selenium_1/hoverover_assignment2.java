package Assignment_on_selenium_1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverover_assignment2 {

	public static void main(String[] args) {
		ChromeDriver p1=new ChromeDriver();
		   p1.get("https://www.amazon.in/");
		 /*  WebElement jyoti=   p1.findElement(By.className("nav-line-2"));
		   Actions a1=new Actions(p1);
		   a1.moveToElement(jyoti).perform();
		   WebElement roohi=p1.findElement(By.linkText("Create a Wish List"));
		   roohi.click();	  */
		   
	 WebElement jyoti=p1.findElement(By.linkText("Amazon miniTV"));
	 jyoti.click();	 
	 WebElement roohi =p1.findElement(By.tagName("button"));
	 roohi.click();

	
	}

}
