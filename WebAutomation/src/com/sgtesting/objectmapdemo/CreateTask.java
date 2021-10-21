package com.sgtesting.objectmapdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Task
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
			Thread.sleep(3000);
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
	
	static void CreateProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("tasksbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("addnew")).click();
			oBrowser.findElement(objmap.getLocator("NewProject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("ProjectName")).sendKeys("Awanti royal weddings");
			oBrowser.findElement(objmap.getLocator("CreateProject")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void CreateTask()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("AddnewTask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("CreateNewTask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("namefortask")).sendKeys("Awanti");
			oBrowser.findElement(objmap.getLocator("CreateTaskButton")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteTask()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("CHECKBUTTONTODELETETASK")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("DeleteButtonForTask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("DeletePermForTask")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbuttonforPrpject")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("actionbuttonforproject")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("deletebuttonforproject")).click();
			Thread.sleep(3000);
		
			oBrowser.findElement(objmap.getLocator("deletePeramProject")).click();
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
public class CreateTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task.launchBrowser();
		Task.navigate();
		Task.login();
		Task.minimizeFlyOutWindow();
		Task.CreateCustomer();
		Task.CreateProject();
		Task.CreateTask();
		Task.DeleteTask();
	//	Task.DeleteProject();
	//	Task.DeleteCustomer();
		

	}

}
