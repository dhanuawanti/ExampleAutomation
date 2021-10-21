package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Usermulti
{

	public static WebDriver oBrowser = null;
	static void launch()
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
	
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void cruser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("u1");
			oBrowser.findElement(By.name("lastName")).sendKeys("awanti");
			oBrowser.findElement(By.name("email")).sendKeys("awantidhanu@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("u1");
			oBrowser.findElement(By.name("password")).sendKeys("1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Logoutasadmin()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Loginasu1()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("u1");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Createuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath(" //*[@id='createUserDiv']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("user222");
			oBrowser.findElement(By.name("lastName")).sendKeys("awanti");
			oBrowser.findElement(By.name("email")).sendKeys("awantidhanu@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user222");
			oBrowser.findElement(By.name("password")).sendKeys("12225");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12225");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void loguoutasu1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(4000);
		}catch(Exception e )
		{
			e.printStackTrace();
		}
	}
    
	 static void loginasu2()
	 {
		 try
		 {
			 oBrowser.findElement(By.id("username")).sendKeys("user222");
				oBrowser.findElement(By.name("pwd")).sendKeys("12225");
				Thread.sleep(4000);
				oBrowser.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
				Thread.sleep(4000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void Createuser3()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("  //*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 oBrowser.findElement(By.xpath("  //*[@id='createUserDiv']/div")).click();
			 oBrowser.findElement(By.name("firstName")).sendKeys("user333");
				oBrowser.findElement(By.name("lastName")).sendKeys("awanti");
				oBrowser.findElement(By.name("email")).sendKeys("awantidhanu@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("user333");
				oBrowser.findElement(By.name("password")).sendKeys("12225");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("12225");
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(4000);
		 }catch(Exception e )
		 {
			 e.printStackTrace();
		 }
	 }
	 static void loguoutasu2()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(3000);
			}catch(Exception e )
			{
				e.printStackTrace();
			}
		}
	 static void Loginasu3()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("user333");
				oBrowser.findElement(By.name("pwd")).sendKeys("12225");
				Thread.sleep(4000);
				oBrowser.findElement(By.id("loginButton")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 static void loguoutForEveryuser()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(3000);
			}catch(Exception e )
			{
				e.printStackTrace();
			}
		}
	 
	 static void loginasu2tomodiu3()
	 {
		 try
		 {
			 oBrowser.findElement(By.id("username")).sendKeys("user222");
				oBrowser.findElement(By.name("pwd")).sendKeys("12225");
				Thread.sleep(4000);
				oBrowser.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
				Thread.sleep(4000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 static void modiu3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath(" //span[text()='awanti, user333']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("1111");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1111");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(5000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 
	 // LOGOUT FOR EVERY USER
	 
	 static void Loginu3WithmodiPass()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("user333");
				oBrowser.findElement(By.name("pwd")).sendKeys("1111");
				Thread.sleep(4000);
				oBrowser.findElement(By.id("loginButton")).click();
				Thread.sleep(4000);
			
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	 
	 static void Loginasu1ToModiu2()
		{
			try
			{

				oBrowser.findElement(By.id("username")).sendKeys("u1");
				Thread.sleep(6000);
				oBrowser.findElement(By.name("pwd")).sendKeys("1");
				Thread.sleep(4000);
				oBrowser.findElement(By.id("loginButton")).click();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 
	 static void modiu2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(3000);

				oBrowser.findElement(By.xpath("//span[text()='awanti, user222']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("1111");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1111");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 
	 // logout for every user 
	 
	 static void loginasu2Withmodifiedpass()
	 {
		 try
		 {
			 oBrowser.findElement(By.id("username")).sendKeys("user222");
				oBrowser.findElement(By.name("pwd")).sendKeys("1111");
				Thread.sleep(4000);
				oBrowser.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
				Thread.sleep(4000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 
	 
	 
	 
	

	 
}	
	
	

			

public class MultipleuserAT10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usermulti.launch();
		Usermulti.navigate();
		Usermulti.login();
		Usermulti.minimize();
		Usermulti.cruser1();
		Usermulti.Logoutasadmin();
		Usermulti.Loginasu1();
		Usermulti.Createuser2();
		Usermulti.loguoutasu1();
		
		Usermulti.loginasu2();
		Usermulti.Createuser3();
		Usermulti.loguoutasu2();
		Usermulti.Loginasu3();
		Usermulti.loguoutForEveryuser();
		
		Usermulti.loginasu2tomodiu3();
		Usermulti.modiu3();
		Usermulti.loguoutForEveryuser();
		Usermulti.Loginu3WithmodiPass();
		Usermulti.loguoutForEveryuser();
		
		Usermulti.Loginasu1ToModiu2();
		Usermulti.modiu2();
		Usermulti.loguoutForEveryuser();
		Usermulti.loginasu2Withmodifiedpass();
		Usermulti.loguoutForEveryuser();
		
		
		
		
		
		
		
		
		

	}

}
