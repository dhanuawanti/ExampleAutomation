package com.sgtesting.objectmapdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Customer 
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
	
	static void CreateCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("tasksbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("addnew")).click();
			oBrowser.findElement(objmap.getLocator("createcustomer")).click();
			oBrowser.findElement(objmap.getLocator("Customername")).sendKeys("Anushka");
			oBrowser.findElement(objmap.getLocator("createcustomerbutton")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("action")).click();
			oBrowser.findElement(objmap.getLocator("deletebutton")).click();
		
			oBrowser.findElement(objmap.getLocator("deleteconfirmation")).click();
			Thread.sleep(2000);
			
			
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
public class CreateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer.launchBrowser();
		Customer.navigate();
		Customer.login();
		Customer.minimizeFlyOutWindow();
		Customer.CreateCustomer();
		Customer.DeleteCustomer();
		Customer.logout();
		Customer.closeApplication();
		

	}

}
