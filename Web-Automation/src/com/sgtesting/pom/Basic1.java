package com.sgtesting.pom;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Basic1 {

		public static WebDriver oBrowser=null;
		public static ActiTimePage oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			CreateUser();
		    deleteUser();
			logout();
			closeApplication();
		}
		
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oPage=new ActiTimePage( oBrowser );
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
		private static void CreateUser()
		{
			try
			{
				oPage.getUser().click();
				oPage.getAdduser().click();
				Thread.sleep(1000);
				oPage.getFirstname().sendKeys("Demo");
				oPage.getLastname().sendKeys("user1");
				oPage.getEmail().sendKeys("demouser1@gmail.com");
				oPage.getUsername().sendKeys("DemoUser1");
				oPage.getcreatePassword().sendKeys("Welcome123");
				oPage.getretypePassword().sendKeys("Welcome123");
				oPage.getCreateUser().click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			
			private static void deleteUser()
			{
				try
				{
					oPage.getclickUser1().click();
					Thread.sleep(1000);
					oPage.getdeletebutton().click();
					Alert oAlert=oBrowser.switchTo().alert();
					String content=oAlert.getText();
					System.out.println(content);
					oAlert.accept();
					Thread.sleep(1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
			
			
	}
		





