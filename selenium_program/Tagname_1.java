//tagname locator



package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_1 {

	public static void main(String[] args) {
    ChromeDriver k=new ChromeDriver();
     k.get("https://www.facebook.com/login");
    /* k.findElement(By.tagName("button")).click()*/
    /* ChromeDriver k=new ChromeDriver();

     k.get("file:///C:/Users/roohi/Downloads/learningHTML1.html");
     k.findElement(By.tagName("a")).click();*/
WebElement yes=k.findElement(By.tagName("button"));	
boolean t=	yes.isDisplayed();
boolean y=yes.isEnabled();

if(t&&y)
{
	yes.click();
}
	
	}

}
