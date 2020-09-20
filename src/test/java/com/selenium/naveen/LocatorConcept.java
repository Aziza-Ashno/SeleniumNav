package com.selenium.naveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatorConcept {
		
public WebDriver driver;
	
	@BeforeMethod // this method will run before every test method
	public void set_up() { // we create a second method set_up() to prepare the environment and we copy the 4lines
		// from the firstTest method
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aziza\\eclipse-workspace\\MyFirstAutomation\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();// the purpose of this is to open (launch) Chrome browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// this is maximum to wait
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);//same. these can be only here
		driver.manage().window().maximize();//this maximize browser window
	}
	@AfterMethod //this method will run before every test method 
	public void tearDown() { // we create this method to 
		driver.close(); // closing the browser
		if(driver != null) { //  quit the browser object
			driver.quit();
		}
	}
	@Test(enabled = false)
	public void findAllLinks() {
		driver.get("https://www.walmart.com/");
		//HomePage-contentZone11-FeaturedCategoriesCollapsible-tileLink-1
		List<WebElement> home = driver.findElements(By.tagName("a"));
		int totalNumber = home.size();
		System.out.println("Total Number of links: " + totalNumber);
	}
	@Test(enabled = false)
	public void homeDepart() throws Exception {
		driver.get("https://www.walmart.com/");
		Thread.sleep(5 * 1000);			
		WebElement accountButton = driver.findElement(By.xpath("//*[@id=\"header-account-toggle\"]/span/span/span[2]"));
		accountButton.click();
		Thread.sleep(5 * 1000);
		
		WebElement signIn = driver.findElement(By.xpath("//*[@id=\"signed-out\"]/a[1]/div/span/div")) ;
		signIn.click();
		Thread.sleep(5 * 1000);
		
		WebElement creatAcct = driver.findElement(By.cssSelector("#sign-in-form > button.button.ghost.text-capitalize"));
		creatAcct.click();
		Thread.sleep(5 * 1000);
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("aziza");
		Thread.sleep(5 * 1000);
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Ashnoune");
		Thread.sleep(3 * 1000);
		
		WebElement email = driver.findElement(By.cssSelector("#email-su"));
		email.sendKeys("aziza.ssami@gmail.com");
		Thread.sleep(3 * 1000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password-su\"]"));
		password.sendKeys("Aziza2019");
		Thread.sleep(3 * 1000);
		
		
		WebElement createButton = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button[1]")) ;
		createButton.click();
		Thread.sleep(5 * 1000);
		
	}
		@Test
		public void checkDepar() throws Exception {
			driver.get("https://www.walmart.com/");
			Thread.sleep(5 * 1000);			
			
		
		
		  WebElement home = driver.findElement(By.xpath("//*[@id=\"HomePage-contentZone11-FeaturedCategoriesCollapsible-tileLink-0\"]")) ; 
		  home.click(); 
		  Thread.sleep(10 * 1000);
		  
		  WebElement firstName = driver.findElement(By.name("firstName"));
		  firstName.sendKeys("aziza");
		  Thread.sleep(5 * 1000);
		 
			
		
		
		/*
		 * WebElement home = driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div/div[2]/div/div/section[2]/div[2]/div[2]/div[3]/a")
		 * ); home.click(); Thread.sleep(10 * 1000);
		 */
		  
		  driver.navigate().back(); // navigate to previous page or site
		 		  
		  WebElement women = driver.findElement(By.xpath(
		  "/html/body/div[1]/div/div/div[2]/div/div/section[2]/div[2]/div[2]/div[7]/a")); 
		  women.click(); 
		  Thread.sleep(10 * 1000);
		 
			
		
		
		/*
		 * WebElement women = driver.findElement(By.xpath(
		 * "//*[@id=\"HomePage-contentZone11-FeaturedCategoriesCollapsible-tileLink-6\"]"
		 * )); women.click(); Thread.sleep(10 * 1000);
		 */
		
		}
		
	/*
	 * @Test public void dropDownList() { driver.get("https://www.walmart.com/");
	 * //Thread.sleep(5 * 1000); }
	 */

		/*
		 * WebElement furniture = driver.findElement(By.cssSelector(
		 * "#categorypage-FeaturedCategoriesCollapsible-tileLink-4"));
		 * furniture.click(); Thread.sleep(10 * 1000);
		 */
		
		
		/*
		 * WebElement coupon = driver.findElement(By.tagName("a")); coupon.click();
		 * Thread.sleep(10 * 1000);
		 */

}