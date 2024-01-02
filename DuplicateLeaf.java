package WEEK2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("demosalesmanager");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		WebElement Login = driver.findElement(By.className("decorativeSubmit"));
		Login.click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("value");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("asset");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("valueone");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("valueone");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testing");
		driver.findElement(By.name("primaryEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.name("submitButton")).click();  
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			
			System.out.println("Lead verified");
			
		}
		else {
			System.out.println("not verified");
		}
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("one");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("two");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		

		

	}

}
