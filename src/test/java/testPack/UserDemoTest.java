package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserDemoTest {

	 WebDriver driver;
	
	@Test
	public void VerifySearch() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");; // for username
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");; // for password
		driver.findElement(By.id("btnLogin")).click();; // for login
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click(); // for Admin click
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");;// FOr user search
		
		driver.findElement(By.id("searchBtn")).click();;// FOr  search button
		
		String txtSearch=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]/a")).getText();;// FOr  search button
		
		Assert.assertEquals(txtSearch, "Admin");
		
	
	
		
		//Best Practices:
		
		
		//Best Practices:
		//1. We can use framework for better management of Test Cases.
		//2. We can Use Maven POM.xml file to add dependency which helps us to avoid using the configure build path.
		     // So when we change our project to some other path, pom.xml takes care of the jars as it downloads the jar from MAven repository
		//3. We can also use Jenkins in the framework to schedule our test cases to run on time at night time in absence of resources, so that next morning 
		    // report is generated for the user.
		//4. We can use PAge Object MOdel in our framework to define Page objects and using Page Factory, we can reduce the exceptions like NoSuchElement exception,
		    // NO Element Visible Exception etc...
		//5. We can use Data Provider annotation in the framework to test multiple sets of data using apache poi library.
		//6. We can use testng in our framework to manage test cases using testng.xml and include exclude the test cases as per our requirement.
		
		//7. We can generate the report using Extent report api and generate reports after execution of test cases.
		//8. We can incorporate Test Listener, so when the test cases are failed, appropriate action can be taken.
		//9. We can use Github as a repository to work on the project and push and pull the changes from the GIt.
		//10. We can use Grid Concepts of selenium to setup hub and node, so hub will trigger the test case and and at node, tet cases gets executed.
		//11. We can apply AI in our framework to do the visual testing, so application can also be tested even when it is not stable
		//12. We can use base file also and put browser details in it so that other classes extends from it and reuse the methods and variables.
		
		//Above points sums up the framework and best practices.
		
		
		//SE Principles.
		//1. Variable always should be declared private.
		//2. Methods should be public and by calling methods by creating object of class, we can achieve
		//   Abstraction and encapsulation.
		//3. Code should be optimized. Redundancy in code should not be there.
		//4. Also Reusability of method should be followed.
		//5. Always follow naming convention on defining variable and methods.
		//6. Modularity in code should be considered so each test cases should be module wise.
		//7. Proper commenting on each line of code should be given which increases readability of code for other dev.
		
	
	
	}

}
