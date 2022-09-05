package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class MonthDropDown extends TestBase {

	HomePage HomePageObj;

	@BeforeMethod
	public void setUp() {
		initDriver();
		HomePageObj = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void validatingMonthDropDown() {
		WebElement monthList = driver.findElement(By.name("due_month"));

		Select sel = new Select(monthList);
		List<WebElement> allMonth = sel.getOptions();

		for (WebElement monthName : allMonth) {
			System.out.println(monthName.getText());

		}

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
