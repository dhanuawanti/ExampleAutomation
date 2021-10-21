package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Log
{
	public static WebDriver driver = null;
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SeliniumAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Navigate()
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
			driver.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
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
			
			driver.findElement(By.id("logoutLink")).click();
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
public class LoginPracticeChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.launch();
		Log.Navigate();
		Log.login();
		Log.logout();
		Log.close();

	}

}
