package com.sgtesting.pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class U1
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
	
	static void Createuser()
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// logout as admin 
	
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
	
	static void Createuser2()
	{
		try
		{
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	// logout as u1
	
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
	
	static void Createuser3()
	{
		try
		{
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
	
	
	//logout as 2
	
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
	
	
	// logout as u3
	
	//login as 2 to modi 3
	
	static void modiu3()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(3000);
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
	
	// logout as 2 after modi3
	
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
	
	// logout  as u3
	
	//login as u1 to modi u2
	
	static void modiu2()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(3000);
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
	
	//logout  
	
	// login s 
	
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
	
	//logout after modi
	
	// login as admin to modi 1
	
	static void modiu1()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(3000);
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
	
	// logout as admin  
	
	// login as u1 with modi pass 
	
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
	
	// logout   
	
	
	
	// Delete oprtations follows  remember  2 se 3  1 se 2 and admin se 1
	
	//login by 22
	static void Deleteu3()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
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
	
	//logout 
	
	//login  as 11 
	
	static void Deleteu2()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
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
	
	//logout as 11
	
	//login as admin 
	
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
	
	//logout 
	
	
	static void logout()
	{
		try
		{
			oPage.getlogout().click();
			Thread.sleep(3000);
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
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class MultiUser10POP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		U1.launch();
		U1.navigate();
		U1.login();
		U1.minimize();
		
		U1.Createuser();
		U1.logout();
		
		U1.loginas1();
		U1.Createuser2();
		U1.logout();
		
		U1.loginas2();
		U1.Createuser3();
		U1.logout();
		
		U1.loginas3();
		U1.logout();
		
		U1.loginas2();
		U1.modiu3();
		U1.logout();
		
		U1.loginas33();
		U1.logout();
		
		U1.loginas1();
		U1.modiu2();
		U1.logout();
		
		U1.loginas22();
		U1.logout();
		
		U1.login();
		U1.modiu1();
		U1.logout();
		
		U1.loginas11();
		U1.logout();
		
		U1.loginas22();
		U1.Deleteu3();
		U1.logout();
		
		U1.loginas11();
		U1.Deleteu2();
		U1.logout();
		
		U1.login();
		U1.Deleteu1();
		U1.logout();
		
		
		U1.close();
		
		
		
		
		
		

	}

}
