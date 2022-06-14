package com.sgtesting.objectmap;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BasicObjectMap4 {

		public static WebDriver oBrowser=null;
		public static ObjectMap objectmap=null;
		public static String filename=null;

		public static void main(String[] args) {

			launchBrowser();
			navigate();
			login();
			createCustomer();
			modifyCustomer();
			deleteCustomer();
			logout();
			closeApplication();

		}
		private static void launchBrowser()
		{
			try
			{
				filename="C:\\SeleniumAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\objectmap";
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				objectmap=new ObjectMap(filename);

			}catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
		private static void navigate()
		{
			try
			{
				oBrowser.manage().window().maximize();
				oBrowser.get("http://localhost:81/login.do");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void createCustomer()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("taskbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("taskaddnew")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("tasknewcustomer")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("entercustomername")).sendKeys("DemoCustomer");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("createcustomer")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void modifyCustomer()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("customersetting")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("clickoncustomer")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("entermodifycustomer")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("entermodifycustomer")).sendKeys("Modified Customer");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("customersetting")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteCustomer()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("customersetting")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("customeraction")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("customerdelete")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("customerdeletepermently")).click();
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeApplication()
		{
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

