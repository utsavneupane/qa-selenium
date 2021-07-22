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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exceldatadriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.gecko.driver", "D:\\Utsav\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");   
		FileInputStream file = new FileInputStream("D:\\Utsav\\qa\\guru99demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); 
		XSSFSheet sheet = workbook.getSheet("Sheet1"); 
		int rowCount =  sheet.getLastRowNum();
		for(int i = 1;i<=rowCount;i++) { 
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			
			String uname =username.getStringCellValue();
			XSSFCell password = row.getCell(1); 
			String passwd= password .getStringCellValue(); 
			
			WebElement usern = driver.findElement(By.name("uid"));
			usern.sendKeys(String.valueOf(username));
			
			WebElement passwd1 = driver.findElement(By.name("password")); 
			passwd1.sendKeys(String.valueOf(password)); 
			
			//WebElement buton = driver .findElement(By.name("btnLogin"));
			//buton .click();  
			
			usern.clear(); 
			passwd1.clear(); 
			
			driver.navigate().to("http://www.demo.guru99.com/V4/");
			
			Thread.sleep(2000);
			
		}
	}

}
