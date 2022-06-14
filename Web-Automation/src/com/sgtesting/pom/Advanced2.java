package com.sgtesting.pom;
	import org.openqa.selenium.Alert;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class Advanced2 {

		public static WebDriver oBrowser=null;
		public static ActiTimePage oPage=null;

		public static void main(String[] args) {

			launchBrowser();
			navigate();
			loginasAdmin();
			minimizeFlyOutWindow();
			createUser1();
			logout();
			loginasUser1();
			createUser2();
			logout();
			loginasUser2();
			createUser3();
			logout();
			loginasUser3();
			logout();
			loginasUser2();
			modifyPasswordforUser3();
			logout();
			loginAsUser3();
			logout();
			loginasUser1();
			modifyPasswordforUser2();
			logout();
			loginAsUser2();
			logout();
			loginasAdmin();
			modifyPasswordforUser1();
			logout();
			loginAsUser1();
			logout();
			loginAsUser2();
			deleteUser3();
			logout();
			loginAsUser1();
			deleteUser2();
			logout();
			loginasAdmin();
			deleteUser1();
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

		private static void loginasAdmin()
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

		private static void createUser1()
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasUser1()
		{
			try
			{
				oPage.getUserName().sendKeys("DemoUser1");
				oPage.getPassword().sendKeys("Welcome123");
				oPage.getLogin().click();
				Thread.sleep(2000);
				oPage.getexploreActiTime().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void createUser2()
		{
			try
			{
				oPage.getUser().click();
				oPage.getAdduser().click();
				Thread.sleep(1000);
				oPage.getFirstname().sendKeys("Demo");
				oPage.getLastname().sendKeys("user2");
				oPage.getEmail().sendKeys("demouser2@gmail.com");
				oPage.getUsername().sendKeys("DemoUser2");
				oPage.getcreatePassword().sendKeys("Welcome234");
				oPage.getretypePassword().sendKeys("Welcome234");
				oPage.getCreateUser().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasUser2()
		{
			try
			{
				oPage.getUserName().sendKeys("DemoUser2");
				oPage.getPassword().sendKeys("Welcome234");
				oPage.getLogin().click();
				Thread.sleep(2000);
				oPage.getexploreActiTime().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void createUser3()
		{
			try
			{
				oPage.getUser().click();
				oPage.getAdduser().click();
				Thread.sleep(1000);
				oPage.getFirstname().sendKeys("Demo");
				oPage.getLastname().sendKeys("user3");
				oPage.getEmail().sendKeys("demouser3@gmail.com");
				oPage.getUsername().sendKeys("DemoUser3");
				oPage.getcreatePassword().sendKeys("Welcome345");
				oPage.getretypePassword().sendKeys("Welcome345");
				oPage.getCreateUser().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasUser3()
		{
			try
			{
				oPage.getUserName().sendKeys("DemoUser3");
				oPage.getPassword().sendKeys("Welcome345");
				oPage.getLogin().click();
				Thread.sleep(2000);
				oPage.getexploreActiTime().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void modifyPasswordforUser3()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(1000);
				oPage.getuserDemo3().click();
				Thread.sleep(1000);
				oPage.getcreatePassword().sendKeys("demouser3");
				oPage.getretypePassword().sendKeys("demouser3");
				Thread.sleep(2000);
				oPage.getmodifysaveChanges().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void modifyPasswordforUser2()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(1000);
				oPage.getuserDemo2().click();
				Thread.sleep(1000);
				oPage.getcreatePassword().sendKeys("demouser2");
				oPage.getretypePassword().sendKeys("demouser2");
				Thread.sleep(2000);
				oPage.getmodifysaveChanges().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void modifyPasswordforUser1()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(1000);
				oPage.getuserDemo1().click();
				Thread.sleep(1000);
				oPage.getcreatePassword().sendKeys("demouser1");
				oPage.getretypePassword().sendKeys("demouser1");
				Thread.sleep(4000);
				oPage.getmodifysaveChanges().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void loginAsUser1()
		{
			try
			{
				oPage.getUserName().sendKeys("DemoUser1");
				oPage.getPassword().sendKeys("demouser1");
				oPage.getLogin().click();
				Thread.sleep(2000);
				oPage.getexploreActiTime().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginAsUser2()
		{
			try
			{
				oPage.getUserName().sendKeys("DemoUser2");
				oPage.getPassword().sendKeys("demouser2");
				oPage.getLogin().click();
				Thread.sleep(2000);
				oPage.getexploreActiTime().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginAsUser3()
		{
			try
			{
				oPage.getUserName().sendKeys("DemoUser3");
				oPage.getPassword().sendKeys("demouser3");
				oPage.getLogin().click();
				Thread.sleep(2000);
				oPage.getexploreActiTime().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteUser3()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(1000);
				oPage.getuserDemo3().click();
				Thread.sleep(1000);
				oPage.getdeletebutton().click();
				Alert oAlert3=oBrowser.switchTo().alert();
				String content3=oAlert3.getText();
				System.out.println(content3);
				oAlert3.accept();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteUser2()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(1000);
				oPage.getuserDemo2().click();
				Thread.sleep(1000);
				oPage.getdeletebutton().click();
				Alert oAlert2=oBrowser.switchTo().alert();
				String content2=oAlert2.getText();
				System.out.println(content2);
				oAlert2.accept();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteUser1()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(1000);
				oPage.getuserDemo1().click();
				Thread.sleep(1000);
				oPage.getdeletebutton().click();
				Alert oAlert1=oBrowser.switchTo().alert();
				String content1=oAlert1.getText();
				System.out.println(content1);
				oAlert1.accept();
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


