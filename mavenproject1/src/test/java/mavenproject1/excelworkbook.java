package mavenproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelworkbook {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

FileInputStream fis =new FileInputStream("C:\\Users\\DELL\\Desktop\\New folder\\newddttest.xlsx");
XSSFWorkbook w=new XSSFWorkbook(fis);
int sheetcount=w.getNumberOfSheets();
for (int i=0;i<sheetcount;i++) {
	String a=w.getSheetName(i);
	System.out.println(a);		
}
XSSFSheet s1=w.getSheet("Sheet2");
System.out.println(s1.getLastRowNum());
Row a=s1.getRow(1);
Cell c=a.getCell(2);
System.out.println(c.getStringCellValue());





	}

}
