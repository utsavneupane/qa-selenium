package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Formdeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver; 
System.setProperty("webdriver.gecko.driver", "D:\\Utsav\\selenium\\geckodriver.exe"); 
driver = new FirefoxDriver();
driver.get("http://demo.automationtesting.in/Register.html");  
//for username 
WebElement uname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
uname.sendKeys("hello");
WebElement passwd = driver.findElement(By.cssSelector("div.form-group:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));
passwd.sendKeys("hello");
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("baneshwor,ktm");
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("9845254255");
driver.findElement(By.name("radiooptions")).click(); 
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")).click();
Select lang = new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
lang.selectByIndex(1);
Select skills = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
skills.selectByIndex(11);
Select country= new Select(driver.findElement(By.id("countries"))); 
country.selectByValue("Antarctica"); 
Select country1= new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"))); 
country1.selectByIndex(12);
Select yr= new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));  
yr.selectByIndex(5);
Select mth= new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));  
mth.selectByIndex(4); 
Select day= new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));  
day.selectByIndex(23);

driver.findElement(By.id("firstpassword")).sendKeys("hsfdk");
driver.findElement(By.id("secondpassword")).sendKeys("hsfdk"); 
driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Dream\\Desktop"); 
driver.findElement(By.id("submitbtn")).click();




	}

}
