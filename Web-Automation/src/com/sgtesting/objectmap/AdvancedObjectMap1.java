package com.sgtesting.objectmap;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AdvancedObjectMap1 {

		public static WebDriver oBrowser=null;
		public static String filename=null;
		public static ObjectMap objectmap=null;

		public static void main(String[] args) {
			launchBrowser();
			navigate();
			loginasAdmin();
			createUsers();
			logout();
			loginasuser1();
			logout();
			loginasuser2();
			logout();
			loginasuser3();
			logout();
			loginasAdmin();
			modifyPasswords();
			logout();
			loginasUser1();
			logout();
			loginasUser2();
			logout();
			loginasUser3();
			logout();
			loginasAdmin();
			deleteUsers();
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
		private static void loginasAdmin()
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

		private static void createUsers()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("userbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("adduserbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userfirstname")).sendKeys("demo");
				oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("User1");
				oBrowser.findElement(objectmap.getLocator("useremailid")).sendKeys("demouser1@gmail.com");
				oBrowser.findElement(objectmap.getLocator("userusername")).sendKeys("demoUser1");
				oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("Welcome123");
				oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("Welcome123");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("createuserbutton")).click();
				Thread.sleep(2000);

				oBrowser.findElement(objectmap.getLocator("adduserbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userfirstname")).sendKeys("demo");
				oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("User2");
				oBrowser.findElement(objectmap.getLocator("useremailid")).sendKeys("demouser2@gmail.com");
				oBrowser.findElement(objectmap.getLocator("userusername")).sendKeys("demoUser2");
				oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("Welcome234");
				oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("Welcome234");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("createuserbutton")).click();
				Thread.sleep(2000);

				oBrowser.findElement(objectmap.getLocator("adduserbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userfirstname")).sendKeys("demo");
				oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("User3");
				oBrowser.findElement(objectmap.getLocator("useremailid")).sendKeys("demouser3@gmail.com");
				oBrowser.findElement(objectmap.getLocator("userusername")).sendKeys("demoUser3");
				oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("Welcome345");
				oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("Welcome345");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("createuserbutton")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasuser1()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demoUser1");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("Welcome123");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("startexploringactitime")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasuser2()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demoUser2");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("Welcome234");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("startexploringactitime")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasuser3()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demoUser3");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("Welcome345");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("startexploringactitime")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifyPasswords()
		{
			try
			{ 
				oBrowser.findElement(objectmap.getLocator("userbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("clickdemouser1")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("demouser1");
				oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("demouser1");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("usersavebutton")).click();
				Thread.sleep(1000);

				oBrowser.findElement(objectmap.getLocator("clickdemouser2")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("demouser2");
				oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("demouser2");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("usersavebutton")).click();
				Thread.sleep(1000);

				oBrowser.findElement(objectmap.getLocator("clickdemouser3")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("demouser3");
				oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("demouser3");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("usersavebutton")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasUser1()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demoUser1");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("demouser1");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasUser2()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demoUser2");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("demouser2");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginasUser3()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demoUser3");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("demouser3");
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteUsers()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("userbutton")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("deletedemouser1")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userdeletenutton")).click();
				Thread.sleep(1000);
				Alert oAlert1=oBrowser.switchTo().alert();
				String content1=oAlert1.getText();
				System.out.println(content1);
				oAlert1.accept();
				Thread.sleep(2000);

				oBrowser.findElement(objectmap.getLocator("deletedemouser2")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userdeletenutton")).click();
				Thread.sleep(1000);
				Alert oAlert2=oBrowser.switchTo().alert();
				String content2=oAlert2.getText();
				System.out.println(content2);
				oAlert2.accept();
				Thread.sleep(2000);

				oBrowser.findElement(objectmap.getLocator("deletedemouser3")).click();
				Thread.sleep(1000);
				oBrowser.findElement(objectmap.getLocator("userdeletenutton")).click();
				Thread.sleep(1000);
				Alert oAlert3=oBrowser.switchTo().alert();
				String content3=oAlert3.getText();
				System.out.println(content3);
				oAlert3.accept();
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

