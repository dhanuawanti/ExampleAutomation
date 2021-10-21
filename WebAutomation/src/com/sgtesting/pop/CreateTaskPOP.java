package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Task
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
	
static void Createcustomer()
	
	{
		try
		{
			oPage.getclickonTaskbutton().click();
			Thread.sleep(2000);
			oPage.getclickonADDnewforCustomandProj().click();
			Thread.sleep(2000);
			oPage.getclickonNewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys("Anuska");
			Thread.sleep(2000);
			oPage.getCustomerDescription().sendKeys("Favourite customer");
			Thread.sleep(2000);
			oPage.getclickCreateCustomButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

 static void project()
 {
	try
	{
		 oPage.getclickonADDnewforCustomandProj().click();
		 Thread.sleep(2000);
		 oPage.getclickOnNewProject().click();
		 Thread.sleep(2000);
		 oPage.getNewProjectName().sendKeys("Awanti royal weddings");
		 Thread.sleep(2000);
		 oPage.getclickCreateProjToCreate().click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
   
 static void CreateTask()
 {
	try
	{
		oPage.getclickToAddNEwTASK().click();
		Thread.sleep(2000);
		oPage.getclickToCreateNewTask().click();
		Thread.sleep(2000);
		oPage.getNewNAmeOfTask().sendKeys("123");
		Thread.sleep(2000);
		oPage.getclickonCreateTaskButtonFinally().click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 
 static void DeleteTask()
 {
	try
	{
		oPage.getclickToDeleteTaskCheckBok().click();
		Thread.sleep(2000);
		oPage.getclickToDeleteTask().click();
		Thread.sleep(2000);
		oPage.getDeleTeTaskPERMA();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 
 static void deletProj()
	{
		try
		{
			oPage.getclickToEditForProj().click();
			 Thread.sleep(2000);
			oPage.getclickActionForProg().click();
			 Thread.sleep(2000);
			oPage.getclickToDeleteProj().click();
			Thread.sleep(2000);
			oPage.getClickOnDeletePermaForCustom().click();
			 Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void deleteustomer()
	{
		try
		{
			oPage.getclickToeditbuttonForCustom().click();
			Thread.sleep(2000);
			oPage.getclickOnActionForCustomer().click();
			Thread.sleep(2000);
			oPage.getclickOnDeleteForCustomer().click();
			Thread.sleep(2000);
			oPage.getClickOnDeletePermaForCustom().click();
			Thread.sleep(4000);
		}catch(Exception e)
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
public class CreateTaskPOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task.launch();
		Task.navigate();
		Task.login();
		Task.minimize();
		Task.Createcustomer();
		Task.project();
		Task.CreateTask();
	//	Task.DeleteTask();
		Task.deletProj();
		Task.deleteustomer();
	//	Task.logout();
	//	Task.close();

	}

}
