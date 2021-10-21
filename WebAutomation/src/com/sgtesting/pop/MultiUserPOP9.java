package com.sgtesting.pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class U
{
	public static WebDriver oBrowser = null;
	public static ActiTimePage oPage= null;
	static void launch()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage = new ActiTimePage(oBrowser);
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
			oPage.getusername().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimize()
	{
		try
		{
			oPage.getminiise().click();
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Createuser123()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("u1");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("awanti");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("awantidhanu@gmail.com");
			Thread.sleep(2000);
			oPage.getuserusernameInAdduser().sendKeys("u1");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(4000);
			
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("u2");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("awanti");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("awantidhanu@gmail.com");
			Thread.sleep(2000);
			oPage.getuserusernameInAdduser().sendKeys("u2");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(4000);
			
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("u3");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("awanti");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("awantidhanu@gmail.com");
			Thread.sleep(2000);
			oPage.getuserusernameInAdduser().sendKeys("u3");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	static void loginas1()
	{
		try
		{
			
			oPage.getusername().sendKeys("u1");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("1");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			oPage.getclickToExploreACTITIME().click();
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginas2()
	{
		try
		{
			oPage.getusername().sendKeys("u2");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("1");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			oPage.getclickToExploreACTITIME().click();
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginas3()
	{
		try
		{
			oPage.getusername().sendKeys("u3");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("1");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			oPage.getclickToExploreACTITIME().click();
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modiu1()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(3000);
			oPage.getclickToU1tomodi().click();
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("2");
			oPage.getpasswordCopyinAdduser().sendKeys("2");
			oPage.getclicksavechanges().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modiu2()
	{
		try
		{
			oPage.getclickToU2tomodi().click();
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("2");
			oPage.getpasswordCopyinAdduser().sendKeys("2");
			oPage.getclicksavechanges().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modiu3()
	{
		try
		{
			oPage.getclickToU3tomodi().click();
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("2");
			oPage.getpasswordCopyinAdduser().sendKeys("2");
			oPage.getclicksavechanges().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginas11()
	{
		try
		{
			
			oPage.getusername().sendKeys("u1");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("2");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginas22()
	{
		try
		{
			oPage.getusername().sendKeys("u2");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("2");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginas33()
	{
		try
		{
			oPage.getusername().sendKeys("u3");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("2");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// logout and login as admin 
	static void Deleteu1()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getclickToU1tomodi().click();
			Thread.sleep(2000);
			oPage.getCLICKONDELETEUSERU1().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Deleteu2()
	{
		try
		{
			oPage.getclickToU2tomodi().click();
			Thread.sleep(2000);
	
			oPage.getCLICKONDELETEUSERU1().click();
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Deleteu3()
	{
		try
		{
			oPage.getclickToU3tomodi().click();
			Thread.sleep(2000);
		
			oPage.getCLICKONDELETEUSERU1().click();
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(3000);
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
			oPage.getlogout().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
}
public class MultiUserPOP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               U.launch();
               U.navigate();
               U.login();
               U.minimize();
               U.Createuser123();
               U.logout();
               U.loginas1();
               U.logout();
               U.loginas2();
               U.logout();
               U.loginas3();
               U.logout();
               U.login();
               U.modiu1();
               U.modiu2();
               U.modiu3();
               U.logout();
               
               
               U.loginas11();
               U.logout();
               U.loginas22();
               U.logout();
               U.loginas33();
               U.logout();
               
               
               U.login();
               U.Deleteu1();
               U.Deleteu2();
               U.Deleteu3();
               
               
	}

}
