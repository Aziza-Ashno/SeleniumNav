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

public class DropDown {
public WebDriver driver;
	
	@BeforeMethod // this method will run before every test method
	public void set_up() { // we create this method set_up() to prepare the environment
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aziza\\eclipse-workspace\\SeleniumNaveen\\src\\test\\resources\\chromedriver83.exe");
		driver = new ChromeDriver();// the purpose of this is to open (launch) Chrome browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// this is maximum to wait
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);//same. these can be only here
		driver.manage().window().maximize();//this maximize browser window
	}
	@AfterMethod //this method will run before every test method 
	public void tearDown() { 
		driver.close(); // closing the browser
		if(driver != null) { //  quit the browser object
			driver.quit();
		}
	}
	@Test
	public void homeDepart() throws Exception {
		driver.get("https://www.walmart.com/");
		Thread.sleep(5 * 1000);			
		WebElement searchDepart = driver.findElement(By.id("global-search-category-label"));
		searchDepart.click();
		Thread.sleep(5 * 1000);
		
		WebElement home = driver.findElement(By.cssSelector("#SearchDropdown-list > div.e_a.a3_f.e_t > div:nth-child(2) > button:nth-child(3)"));
		home.click();
		Thread.sleep(5 * 1000);
		
		WebElement input = driver.findElement(By.cssSelector("#global-search-input"));
		input.sendKeys("microwave");
		Thread.sleep(5 * 1000);
		
		WebElement microHom = driver.findElement(By.xpath("//*[@id=\"typeahead-row-microwavesonsale-Home\"]/div"));
		microHom.click();
		Thread.sleep(5 * 1000);
		
		WebElement microLink = driver.findElement(By.cssSelector("#searchProductResult > ul > li:nth-child(3) > div > div.search-result-gridview-item.clearfix.arrange-fill > div:nth-child(2) > a > div > img"));
		microLink.click();
		Thread.sleep(5 * 1000);
		
		WebElement micrColor = driver.findElement(By.cssSelector("#variants-section > div > div.variants__list > label:nth-child(2) > div.var__overlay.swatch__overlay"));
		micrColor.click();
		Thread.sleep(12 * 1000);
		
		WebElement addToCart = driver.findElement(By.cssSelector("body > div.js-content > div > div > div.js-body-content > div > div.atf-content > div > div:nth-child(1) > div > div > div > div > div.Grid > div.product-atf > div > div:nth-child(3) > div > div:nth-child(4) > div:nth-child(3) > section > div.valign-middle.display-inline-block.prod-product-primary-cta.primaryProductCTA-marker > div.prod-product-cta-add-to-cart.display-inline-block > button > span > span > span"));
		addToCart.click();
		Thread.sleep(5 * 1000);
		
		// go back and do more shopping in the same department
		// go backward
		/*
		 * driver.navigate().back(); Thread.sleep(12 * 1000);
		 * 
		 * driver.navigate().back(); Thread.sleep(12 * 1000);
		 * 
		 * //another department WebElement electro = driver.findElement(By.
		 * cssSelector("#SearchDropdown-list > div.e_a.a3_f.e_t > div:nth-child(1) > button:nth-child(8)"
		 * )); electro.click(); Thread.sleep(5 * 1000);
		 */

		
		
		
		
		
		
		

	}
}
