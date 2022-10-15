package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium 
{
	@Test
	private void SeleJenkins()
	{
	String baseurl = "https://www.springboards.in/";
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(baseurl);
	driver.findElement(By.xpath("//*[@id='main-toolbar']/div/div/app-horizontal-menu/a[4]")).click();
	driver.findElement(By.xpath("//*[@id='mat-menu-panel-3']/div/app-horizontal-menu/a[1]")).click();
	
	driver.findElement(By.id("mat-input-3")).sendKeys("Vijay");
	driver.findElement(By.xpath("//*[@id='mat-input-4']")).sendKeys("devaki1906@gmail.com");
	driver.findElement(By.id("mat-input-5")).sendKeys("9587463021");
	driver.findElement(By.xpath("//*[@id='mat-select-0']")).sendKeys("Unemployed");
	
	driver.findElement(By.xpath("/html/body/app-root/div/app-pages/mat-sidenav-container/mat-sidenav-content/main/app-student-temporary/div/div/div/mat-card/form/mat-form-field[5]/div/div[1]/div[4]/input")).sendKeys("Automation Testing");
	driver.findElement(By.xpath("//*[@id='mat-input-6']")).sendKeys("Pass3o6d");
	driver.findElement(By.xpath("//*[@id='mat-input-7']")).sendKeys("Pass30des");
	System.out.println("Password do not match");
	driver.findElement(By.xpath("//*[@id='mat-input-7']")).sendKeys("Pass3o6d");
	
	}
	
	
}

