package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleData 
{
	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fis=new FileInputStream("./Testdata/Facebook Credentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(3);
		XSSFCell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		System.out.println(username);
		workbook.close();
		fis.close();
		
		XSSFRow row1= sheet.getRow(3);
		XSSFCell cell1 = row1.getCell(1);
		String password= cell1.getStringCellValue();
		System.out.println(password);
		workbook.close();
		fis.close();	
		
		
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.facebook.com/");
		  WebElement fb = driver.findElement(By.id("email"));
		  fb.sendKeys(username);
		  
		  WebElement psw = driver.findElement(By.id("pass"));
		  psw.sendKeys(password);
		
	}

}
