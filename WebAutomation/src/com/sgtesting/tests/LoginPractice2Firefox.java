package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class login
{
	public static WebDriver driver=null;
	static void launch()
	{
		try
		{
		System.setProperty("webdriver.gecko.driver","D:\\SeliniumAutomation\\Automation\\WebAutomation\\Library\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}catch(Exception e)
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
	static void login1()
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
			Thread.sleep(4000);
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
public class LoginPractice2Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login.launch();
		login.navigate();
		login.login1();
		login.logout();
		login.close();

	}

}
