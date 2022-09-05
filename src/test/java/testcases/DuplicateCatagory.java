package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class DuplicateCatagory extends TestBase {

	HomePage HomePageObj;

	@BeforeMethod
	public void setUp() {
		initDriver();
		HomePageObj = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void addingCatagory() {
		HomePageObj.createCatagory("Syed");
		String text = driver.findElement(By.tagName("body")).getText();
		String[] arr = text.split(":");
		String expectedString = arr[0].trim();
		System.out.println(expectedString);
		Assert.assertEquals("The category you want to add already exists", expectedString);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
