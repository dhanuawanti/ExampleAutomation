package com.sgtesting.objectmapdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Multiuser
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
	
	static void CreateUser123()
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
			
			
		
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("adduser")).click();
			oBrowser.findElement(objmap.getLocator("firstname")).sendKeys("u2");
			oBrowser.findElement(objmap.getLocator("lastname")).sendKeys("awanti");
			oBrowser.findElement(objmap.getLocator("email")).sendKeys("awantidhanu@gmail.com");
			oBrowser.findElement(objmap.getLocator("username")).sendKeys("u2");
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("createuser")).click();
			
			
		
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("adduser")).click();
			oBrowser.findElement(objmap.getLocator("firstname")).sendKeys("u3");
			oBrowser.findElement(objmap.getLocator("lastname")).sendKeys("awanti");
			oBrowser.findElement(objmap.getLocator("email")).sendKeys("awantidhanu@gmail.com");
			oBrowser.findElement(objmap.getLocator("username")).sendKeys("u3");
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("createuser")).click();
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginasu1()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u1");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasu2()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u2");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasu3()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u3");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void skip()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Modi123()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("clickonuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("savechanges")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(objmap.getLocator("clickonuser2")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("savechanges")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(objmap.getLocator("clickonuser3")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("savechanges")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginasu11()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u1");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("2");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasu22()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u2");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("2");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasu33()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u3");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("2");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void Delelteuser123()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("clickonuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletebuttonforu1")).click();
			Alert oalert = oBrowser.switchTo().alert();
			oalert.accept();
			Thread.sleep(3000);
			
			oBrowser.findElement(objmap.getLocator("clickonuser2")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletebuttonforu2")).click();
			Alert oalert2 = oBrowser.switchTo().alert();
			oalert2.accept();
			Thread.sleep(3000);
			
			oBrowser.findElement(objmap.getLocator("clickonuser3")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletebuttonforu3")).click();
			Alert oalert3 = oBrowser.switchTo().alert();
			oalert3.accept();
			Thread.sleep(3000);
			
			
			
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
public class MultiUserOBJMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiuser.launchBrowser();
		Multiuser.navigate();
		Multiuser.login();
		Multiuser.minimizeFlyOutWindow();
		Multiuser.CreateUser123();
		Multiuser.logout();
		Multiuser.loginasu1();
		Multiuser.skip();
		
		Multiuser.logout();
		Multiuser.loginasu2();
		Multiuser.skip();
		Multiuser.logout();
		Multiuser.loginasu3();
		Multiuser.skip();
		Multiuser.logout();
		Multiuser.login();
		Multiuser.Modi123();
		Multiuser.logout();
		Multiuser.loginasu11();
		
		Multiuser.logout();
		Multiuser.loginasu22();
	
		Multiuser.logout();
		Multiuser.loginasu33();

		Multiuser.logout();
		Multiuser.login();
		Multiuser.Delelteuser123();
		Multiuser.logout();
		Multiuser.closeApplication();

	}

}
