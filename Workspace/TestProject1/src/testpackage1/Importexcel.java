package testpackage1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Importexcel {

	public static void main(String[] args) throws Exception {
		File src = new File("E:\\Software\\demo.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("creds");
		
		System.out.println("Sheet name is : " + sh.getSheetName());//to get sheet name
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue()); //to get value of cell
		System.out.println(sh.getPhysicalNumberOfRows()); //to get total filled rows
		
		
	}
}
