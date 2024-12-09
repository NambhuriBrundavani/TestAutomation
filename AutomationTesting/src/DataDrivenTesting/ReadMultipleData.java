package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData 
{
	public static void main(String[] args) throws IOException 
	{
	FileInputStream fis=new FileInputStream("./Testdata/Facebook Credentials.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	XSSFSheet sheet=book.getSheet("Sheet1");
	int lr = sheet.getLastRowNum();
	for(int i=0;i<=lr;i++)
	{
		XSSFRow row = sheet.getRow(i);
		XSSFCell cel1 = row.getCell(0);
		String c1val1 = cel1.getStringCellValue();
		XSSFCell cel2 = row.getCell(1);
		String c2val2 = cel2.getStringCellValue();
		System.out.println(c1val1+" "+" "+c2val2);
	}
	book.close();
	fis.close();
	}

}
