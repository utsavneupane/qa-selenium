package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		WebDriver driver; 
		System.setProperty("webdriver.gecko.driver", "D:\\Utsav\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");  
		 String a= driver.getTitle(); 
		WebElement usern = driver.findElement(By.name("uid"));
		usern.sendKeys("mngr341868");
		WebElement passwd = driver.findElement(By.name("password"));
		passwd.sendKeys("ygUqanU");
		WebElement buton = driver .findElement(By.name("btnLogin"));
		buton .click();  
		Thread.sleep(3000);
		System.out.println("login successful");
	String b =	  driver.getTitle(); 
		driver.findElement(By.linkText("New Customer")).click();
		
		if(a!=b)
		{System.out.println("passed");
			
			
		} 
		else {
			System.out.println("failed");

	} 
		// new customer details 
driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("utsav");
driver.findElement(By.name("rad1")).click(); 

driver.findElement(By.name("addr")).sendKeys("baneshwor");
driver.findElement(By.name("city")).sendKeys("ktm");
driver.findElement(By.name("state")).sendKeys("baneshwor");
driver.findElement(By.name("pinno")).sendKeys("4042"); 
driver.findElement(By.name("telephoneno")).sendKeys("014587809");
driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");  
driver.findElement(By.name("password")).sendKeys("asdf"); 
driver.findElement(By.name("sub")).click();







	}}
