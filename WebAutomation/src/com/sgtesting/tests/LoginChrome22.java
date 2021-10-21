package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class login11
{
	public static WebDriver driver = null;
	static void launch()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void navigate()
	{
		try
		{
			driver.get("http://localhost:82/login.do");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(4000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
			driver.findElement(By.id("loginButton")).click();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class LoginChrome22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login11.launch();
		login11.navigate();
		login11.login();
		login11.logout();
		login11.close();

	}

}
