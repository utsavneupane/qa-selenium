package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datadrivenexcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stu 
		WebDriver driver; 
		System.setProperty("webdriver.gecko.driver", "D:\\Utsav\\selenium\\geckodriver.exe"); 
		driver = new FirefoxDriver();
		driver.get("http://parashbhandari.com.np/webapp/cinterest/");  
		FileInputStream file = new FileInputStream("C:\\Users\\Dream\\Desktop\\excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); 
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
	    for(int i=1;i<=rowCount;i++) {
	    	XSSFRow row = sheet.getRow(i);
	    	XSSFCell princopalcell = row.getCell(0);
	    	int pirc=(int)princopalcell.getNumericCellValue();
	    	XSSFCell ratecell = row.getCell(1);
	    	int rate =(int)ratecell.getNumericCellValue();
	    	XSSFCell durationcell = row.getCell(2);
	    	int duration= (int)durationcell.getNumericCellValue();

driver.findElement(By.id("principal")).sendKeys(String.valueOf(pirc));  
driver.findElement(By.id("duration")).sendKeys(String.valueOf(duration)); 
driver.findElement(By.id("rate")).sendKeys(String.valueOf(rate));
driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/button[1]")).click(); 

driver.findElement(By.id("principal")).clear();  
driver.findElement(By.id("duration")).clear(); 
driver.findElement(By.id("rate")).clear();
 Thread.sleep(2000);


	    	
	    }
		
		
	}

}
