package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSD 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Testdata/Facebook Credentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cel = row.getCell(0);
		String username = cel.getStringCellValue();
		System.out.println(username);
		workbook.close();
		fis.close();
		
		XSSFRow row1 = sheet.getRow(2);
		XSSFCell cel1 = row1.getCell(1);
		String password = cel1.getStringCellValue();
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
