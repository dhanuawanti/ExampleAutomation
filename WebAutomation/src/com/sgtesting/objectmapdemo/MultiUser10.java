package com.sgtesting.objectmapdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Uu
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
	
	static void CreateUser1()
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
	
	static void loginasu1()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("u1");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateUser2()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("adduser")).click();
			oBrowser.findElement(objmap.getLocator("firstname")).sendKeys("u2");
			oBrowser.findElement(objmap.getLocator("lastname")).sendKeys("awanti");
			oBrowser.findElement(objmap.getLocator("email")).sendKeys("awantidhanu@gmail.com");
			oBrowser.findElement(objmap.getLocator("username")).sendKeys("u2");
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("1");
			oBrowser.findElement(objmap.getLocator("retypepass")).sendKeys("1");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("createuser")).click();
			Thread.sleep(2000);
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
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateUser3()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
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
	
	static void Modi3()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
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
	
	static void Modi2()
	{
		try
		{
			
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("clickonuser2")).click();
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
	
	static void Modi1()
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
			oBrowser.findElement(objmap.getLocator("StartExploring")).click();
			Thread.sleep(2000);
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
public class MultiUser10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Uu.launchBrowser();
       Uu.navigate();
       Uu.login();
       Uu.minimizeFlyOutWindow();
       Uu.CreateUser1();
       Uu.logout();
       Uu.loginasu1();
       Uu.CreateUser2();
       Uu.logout();
       Uu.loginasu2();
       Uu.CreateUser3();
       Uu.logout();
       Uu.loginasu2();
       Uu.Modi3();
       Uu.logout();
       Uu.loginasu33();
       Uu.logout();
       Uu.loginasu11();
       Uu.Modi2();
       Uu.logout();
       Uu.loginasu22();
       Uu.logout();
       Uu.login();
       Uu.Modi1();
       Uu.logout();
       Uu.loginasu11();
       Uu.logout();
       
	}

}
