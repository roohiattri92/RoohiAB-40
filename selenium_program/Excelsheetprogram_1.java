
//which exception comes when we fetch the value from an empty cell?

package selenium_program;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheetprogram_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
    FileInputStream h=new FileInputStream("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\excelfile\\Untitled spreadsheet (1).xlsx");
    Workbook wb=WorkbookFactory.create(h);
    String un=wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
    String pswd= wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();    
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/signup");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(un);
    driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys(pswd);

   
   
	

}
}
