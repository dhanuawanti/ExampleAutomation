package com.sgtesting.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class ChromeBrowserTest
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "D:\\SeliniumAutomation\\Automation\\WebAutomation\\Library\\Drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://google.com");
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
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBrowserTest.launchBrowser();
		ChromeBrowserTest.navigate();
		ChromeBrowserTest.closeApplication();

	}

}
