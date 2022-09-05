package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class AddCatagory extends TestBase {

	HomePage HomePageObj;

	@BeforeMethod
	public void setUp() {
		initDriver();
		HomePageObj = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void addingCatagory() {
		HomePageObj.createCatagory("Syed");
		boolean status = driver.findElement(By.xpath("//span[contains(text(),'Syed')]")).isDisplayed();
		Assert.assertTrue(status);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
