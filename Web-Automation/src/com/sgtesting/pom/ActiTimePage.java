package com.sgtesting.pom;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ActiTimePage{

		public ActiTimePage(WebDriver oBrowser)
		{
			PageFactory.initElements(oBrowser, this);
		}

		//UserName Text Field
		private WebElement username;
		public WebElement getUserName()
		{
			return username;
		}
		//Password Text Field
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}

		//Login button field
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}

		//FlyOutwindow field
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//User button Field
		@FindBy(xpath="//div[text()='USERS']")
		private WebElement Users;
		public WebElement getUser()
		{
			return Users;
		}

		//AddUser button Field
		@FindBy(xpath="//div[text()='Add User']")
		private WebElement AddUser;
		public WebElement getAdduser()
		{
			return AddUser;
		}
		
		//Firstname text field
		private WebElement firstName;
		public WebElement getFirstname()
		{
			return firstName;
		}
		
		//Lastname text Field
		private WebElement lastName;
		public WebElement getLastname()
		{
			return lastName;
		}
		
		//Email text Field
		private WebElement email;
		public WebElement getEmail()
		{
			return email;
		}
		
		//Username text Field
		private WebElement userDataLightBox_usernameField;
		public WebElement getUsername()
		{
			return userDataLightBox_usernameField;
		}
		
		//CreatePassword Text Field
		private WebElement userDataLightBox_passwordField;
		public WebElement getcreatePassword()
		{
			return userDataLightBox_passwordField;
		}
		
		//RetypePassword Text Field
		private WebElement userDataLightBox_passwordCopyField;
		public WebElement getretypePassword()
		{
			return userDataLightBox_passwordCopyField;
		}
		
		//CreateUser button Field
		@FindBy(xpath="//span[text()='Create User']")
		private WebElement CreateUser;
		public WebElement getCreateUser()
		{
			return CreateUser;
		}
		
		//User1,Demo button Field
		@FindBy(xpath="//span[text()='user1, Demo']")
		private WebElement clickUser1;
		public WebElement getclickUser1()
		{
			return clickUser1;
		}
		
		//SaveChanges button Field
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement saveChanges;
		public WebElement getsaveChanges()
		{
			return saveChanges;
		}
		
		//Task button Field
		@FindBy(xpath="//div[text()='TASKS']")
		private WebElement taskbutton;
		public WebElement getTaskbutton()
		{
			return taskbutton;
		}
		
		//AddNew button Field
		@FindBy(xpath="//div[text()='Add New']")
		private WebElement addNew;
		public WebElement getAddNew()
		{
			return addNew;
		}
		
		//NewCustomer button Field
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement newCustomer;
		public WebElement getNewCustomer()
		{
			return newCustomer;
		}
		
		//EnterCustomerName text Field
		private WebElement customerLightBox_nameField;
		public WebElement getEnterCustomerName()
		{
			return customerLightBox_nameField;
		}
		
		//CreateCustomer button Field
		@FindBy(xpath="//span[text()='Create Customer']")
		private WebElement createCustomer;
		public WebElement getCreateCustomer()
		{
			return createCustomer;
		}
		
		//DCSetting button Field
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement dccustomer;
		public WebElement getDCSetting()
		{
			return dccustomer;
		}

		//ActionDC button Field
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement actiondc;
		public WebElement getActionDC()
		{
			return actiondc;
		}
		
		//DeleteCustomer button Field
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement deleteCustomer;
		public WebElement getdeleteCustomer()
		{
			return deleteCustomer;
		}
		
		//deletePermanentlyCustomer button Field
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getdeteletpermanentlyCustomer()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}
		
		//modifyCustomername button Field
		@FindBy(xpath="//div[text()='DemoCustomer']")
		private WebElement modifyCustomer;
		public WebElement getmodifyCustomer()
		{
			return modifyCustomer;
		}
		
		//CreateNewProject button Field
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement createNewProject;
		public WebElement getCreateNewProject()
		{
			return createNewProject;
		}
		
		//EnterProjectName text Field
		private WebElement projectPopup_projectNameField;
		public WebElement getEnterProjectName()
		{
			return projectPopup_projectNameField;
		}
		
		//CreateProject button Field
		@FindBy(xpath="//span[text()='Create Project']")
		private WebElement createProjectbutton;
		public WebElement getcreateProjectbutton()
		{
			return createProjectbutton;
		}
		
		//DPSetting button Field
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement dpproject;
		public WebElement getDPSetting()
		{
			return dpproject;
		}
		
		//DPdelete button Field
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
		private WebElement dpdelete;
		public WebElement getDPDelete()
		{
			return dpdelete;
		}
		
		//ActionDP button Field
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement actiondp;
		public WebElement getActionDP()
		{
			return actiondp;
		}
		
		//DeletePermanentlyProject button Field
		private WebElement projectPanel_deleteConfirm_submitTitle;
		public WebElement getdeletePermanentlyProject()
		{
			return projectPanel_deleteConfirm_submitTitle;
		}
		
		//modifyProject text Field
		@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")
		private WebElement modifyProject;
		public WebElement getmodifyProject()
		{
			return modifyProject;
		}
		
		//AddNewTask button Field
		@FindBy(xpath="//div[text()='Add New Task']")
		private WebElement addNewTask;
		public WebElement getAddNewTask()
	    {
			return  addNewTask;
		}
		
		//CreateNewTasks button Field
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement createNewTasks;
		public WebElement getCreateNewTasks()
		{
			return  createNewTasks;
		}
		
		//EnterTaskName text Field
		@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
		private WebElement enterTaskName;
		public WebElement getEnterTaskName()
		{
			return  enterTaskName;
		}
		
		//CreateTask button Field
		@FindBy(xpath="//span[text()='Create Tasks']")
		private WebElement createTasks;
		public WebElement getCreateTasks()
		{
			return  createTasks;
		}
		
		//TaskCheckBox button Field
		@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
		private WebElement taskCheckBox;
		public WebElement getTaskCheckBox()
		{
			return  taskCheckBox;
		}

		//DeleteTask button Field
		@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]/span")
		private WebElement deleteTask;
		public WebElement getDeleteTask()
		{
			return  deleteTask;
		}
		
		//DeleteTaskPermanently button Field
		private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
		public WebElement getDeleteTaskPermanently()
		{
			return  deleteTaskPopup_deleteConfirm_submitTitle;
		}
		
		//delete button Field
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdeletebutton()
		{
			return userDataLightBox_deleteBtn;
		}
		
		//ExploreActiTime button Field
		@FindBy(xpath="//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")
		private WebElement exploreActiTime;
		public WebElement getexploreActiTime()
		{
			return  exploreActiTime;
		}
		
		//UserDemo1 button Field
		@FindBy(xpath="//span[text()='user1, Demo']")
		private WebElement userDemo1;
		public WebElement getuserDemo1()
		{
			return  userDemo1;
		}
		
		//UserDemo2 button Field
		@FindBy(xpath="//span[text()='user2, Demo']")
		private WebElement userDemo2;
		public WebElement getuserDemo2()
		{
			return  userDemo2;
		}
		
		//UserDemo3 button Field
		@FindBy(xpath="//span[text()='user3, Demo']")
		private WebElement userDemo3;
		public WebElement getuserDemo3()
		{
			return  userDemo3;
		}
		
		//ModifySaveChanges button Field
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement modifysaveChanges;
		public WebElement getmodifysaveChanges()
		{
			return  modifysaveChanges;
		}
		
		//deleteUser button Field
		@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
		private WebElement deleteUsers;
		public WebElement getdeleteUser()
		{
			return  deleteUsers;
		}
		
		//Logout Link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}

	}





