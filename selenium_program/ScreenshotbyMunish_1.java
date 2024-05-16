package selenium_program;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotbyMunish_1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		WebElement search=	driver.findElement(By.name("q"));
		search.sendKeys("bangalore");
		Thread.sleep(4000);
		List<WebElement> a1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));//select all autosugestion at once
		
		int count=	a1.size();
		System.out.println(count);
		
		a1.get(count-4).click();
		/*ScreenshotbyMunish_1 t1= driver;
		File source= t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\MKTProject\\Selenium_program\\src\\Batch40\\"+new Google_AutoSuggestion().getClass()   +Math.random() +".png");
		FileHandler.copy(source, destination);*/
}

	
	}
	
		
	
		