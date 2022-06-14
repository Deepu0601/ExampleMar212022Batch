package com.sgtesting.pom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Basic5 
	{
		
		public static WebDriver oBrowser=null;
		public static ActiTimePage oPage=null;

		public static void main(String[] args) {
			
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createCustomer();
			createProject();
			deleteProject();
			deleteCustomer();
			logout();
			closeApplication();
		}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oPage=new ActiTimePage(oBrowser);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void login()
		{
			try
			{
				oPage.getUserName().sendKeys("admin");
				oPage.getPassword().sendKeys("manager");
				oPage.getLogin().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void minimizeFlyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
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
				oPage.getTaskbutton().click();
				oPage.getAddNew().click();
				oPage.getNewCustomer().click();
				Thread.sleep(2000);
				oPage.getEnterCustomerName().sendKeys("DemoCustomer3");
				oPage.getCreateCustomer().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void createProject()
		{
			try
			{
			    oPage.getAddNew().click();
			    Thread.sleep(1000);
			    oPage.getCreateNewProject().click();
			    Thread.sleep(1000);
			    oPage.getEnterProjectName().sendKeys("DemoProject");
			    oPage.getcreateProjectbutton().click();
			    Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void deleteProject()
		{
			try
			{
				oPage.getDPSetting().click();
				Thread.sleep(1000);
				oPage.getActionDP().click();
				Thread.sleep(1000);
				oPage.getDPDelete().click();
				oPage.getdeletePermanentlyProject().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteCustomer()
		{
			try
			{
				oPage.getDCSetting().click();
				Thread.sleep(1000);
				oPage.getActionDC().click();
				oPage.getdeleteCustomer().click();
				Thread.sleep(1000);
				oPage.getdeteletpermanentlyCustomer().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				oPage.getLogout().click();
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


