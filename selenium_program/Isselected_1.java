
//is selected


package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_1 {

	public static void main(String[] args) 
	{
ChromeDriver kk=new ChromeDriver();
kk.get("file:///C:/Users/roohi/Downloads/learningHTML1.html");
WebElement got=kk.findElement(By.name("password"));
boolean g=got.isDisplayed();
boolean g1=got.isEnabled();
if(g&&g1)
{
	got.sendKeys("roohi");
}
System.out.println(g);
System.out.println(g1);

WebElement pop=kk.findElement(By.name("name2"));
boolean look=got.isSelected();
if(g==true)
{
	pop.click();
}

	}

}
