package com.sgtesting.objectmapdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Cu
{
	public static String filename="D:\\SeliniumAutomation\\Automation\\WebAutomation\\ObjectMap\\objectmap.properties";
	public static ObjectMap objmap=new ObjectMap(filename);
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","D:\\SeliniumAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
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
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void CreateUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("adduser")).click();
			oBrowser.findElement(objmap.getLocator("firstname")).sendKeys("u1");
			oBrowser.findElement(objmap.getLocator("lastname")).sendKeys("awanti");
			oBrowser.findElement(objmap.getLocator("email")).sendKeys("awantidhanu@gmail.com");
			oBrowser.findElement(objmap.getLocator("username")).sendKeys("u1");
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("createuser")).click();
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void Delelteuser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("clickonuser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletebutton")).click();
			Alert oalert = oBrowser.switchTo().alert();
			oalert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class CreateUserObJMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cu.launchBrowser();
		Cu.navigate();
		Cu.login();
		Cu.minimizeFlyOutWindow();
		Cu.CreateUser();
	    Cu.Delelteuser();
	    Cu.logout();
	    Cu.closeApplication();

	}

}
