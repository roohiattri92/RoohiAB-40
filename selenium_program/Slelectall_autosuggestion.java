package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slelectall_autosuggestion {

	public static void main(String[] args) {
   ChromeDriver house=new ChromeDriver();
   house.get("https://www.google.com");
   
   
   WebElement yes=house.findElement(By.className("gLFyf"));
   yes.sendKeys("Bangalore");
  WebElement hh= house.findElement(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
   



	}

}
