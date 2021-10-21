package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class POPUP
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
	
	
	static void ActiTimeLink()
	{
		try
		{
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void HandelPOPUP()
	{
		try
		{
			oBrowser.findElement(By.linkText("Start Using actiTIME")).click();
			
		}catch(Exception e )
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
public class POPUPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POPUP.launch();
		POPUP.navigate();
		POPUP.ActiTimeLink();
		POPUP.HandelPOPUP();

	}

}
