package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Deletepro
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
	static void createcusomer()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("dhanraj");
		Thread.sleep(2000);
		oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("i.m not here to impress");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void project()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Awanti royal weddings");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("The best wedding company in gulbraga");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(4000);
			//oBrowser.findElement(By.linkText("Add New")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
		
			oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Delteteprojectv {
	public static void main(String[] args) {
		Deletepro.launch();
		Deletepro.navigate();
		Deletepro.login();
		Deletepro.minimize();
		Deletepro.createcusomer();
		Deletepro.project();
		Deletepro.deleteProject();
		
	}
}
