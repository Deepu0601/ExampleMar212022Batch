package com.sgtesting.Testing;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class dvancedDemo2 {
		public static WebDriver obrowser = null;

		public static void main(String[] args) {
			launchbrowser();
			navigate();
			Login();
			createuser1(); logout1();
			Loginuser1(); createuser2(); logout1();
			Loginuser2(); createuser3(); logout1();
			Loginuser3(); logout1();
			Loginuser22(); modifyuser3(); logout1();
			Loginuser33(); logout1();
			Loginuser11(); modifyuser2(); logout1();
			Loginuser222();  logout1();
			Login(); modifyuser1(); logout1();
			Loginuser111();  logout1();
			Loginuser111(); Deleteuser2();  Deleteuser3(); logout1();
			Login(); Deleteuser1(); logout1();
			closeapp();
			

		}
		private static void launchbrowser() {
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				obrowser = new ChromeDriver();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void navigate() {
			try {
				obrowser.get("http://localhost:81/login.do");
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
		private static void Login() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("admin");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void createuser1() 
		{
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.name("firstName")).sendKeys("demo");
				Thread.sleep(1000);
				obrowser.findElement(By.name("lastName")).sendKeys("user10");
				Thread.sleep(1000);
				obrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
				Thread.sleep(1000);
				obrowser.findElement(By.name("username")).sendKeys("DemoUser10");
				Thread.sleep(1000);
				obrowser.findElement(By.name("password")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void logout1() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Loginuser1() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void createuser2() 
		{
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.name("firstName")).sendKeys("demo");
				Thread.sleep(1000);
				obrowser.findElement(By.name("lastName")).sendKeys("user20");
				Thread.sleep(1000);
				obrowser.findElement(By.name("email")).sendKeys("demouser2@gmail.com");
				Thread.sleep(1000);
				obrowser.findElement(By.name("username")).sendKeys("DemoUser20");
				Thread.sleep(1000);
				obrowser.findElement(By.name("password")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Loginuser2() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void createuser3() 
		{
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.name("firstName")).sendKeys("demo");
				Thread.sleep(1000);
				obrowser.findElement(By.name("lastName")).sendKeys("user30");
				Thread.sleep(1000);
				obrowser.findElement(By.name("email")).sendKeys("demouser3@gmail.com");
				Thread.sleep(1000);
				obrowser.findElement(By.name("username")).sendKeys("DemoUser30");
				Thread.sleep(1000);
				obrowser.findElement(By.name("password")).sendKeys("DemoUser3");
				Thread.sleep(1000);
				obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser3");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Loginuser3() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("DemoUser3");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void Loginuser22() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void modifyuser3() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.name("password")).sendKeys("Demouser33");
				Thread.sleep(1000);
				obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser33");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Loginuser33() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("Demouser33");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void Loginuser11() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void modifyuser2() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.name("password")).sendKeys("Demouser22");
				Thread.sleep(1000);
				obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser22");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Loginuser222() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("Demouser22");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void modifyuser1() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.name("password")).sendKeys("Demouser11");
				Thread.sleep(1000);
				obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser11");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Loginuser111() {
			try {
				obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
				Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("Demouser11");
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void Deleteuser2() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//span[text()='user2, demo']")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				Thread.sleep(1000);
				Alert xalert = obrowser.switchTo().alert();
				String content = xalert.getText();
				System.out.println(content);
				xalert.accept();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Deleteuser3() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//span[text()='user3, demo']")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				Thread.sleep(1000);
				Alert xalert = obrowser.switchTo().alert();
				String content = xalert.getText();
				System.out.println(content);
				xalert.accept();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void Deleteuser1() {
			try {
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				Thread.sleep(1000);
				Alert xalert = obrowser.switchTo().alert();
				String content = xalert.getText();
				System.out.println(content);
				xalert.accept();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} private static void closeapp() {
			try {
				obrowser.quit();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}


