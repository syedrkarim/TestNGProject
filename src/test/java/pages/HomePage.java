package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//input[@name='categorydata']")
	WebElement catagoryTextBox;
	
	@FindBy(xpath = "//input[@name='submit' and @value='Add category']")
	WebElement addCatagoryButton;
	
	
	
	
	public void createCatagory(String catagoryName) {
		catagoryTextBox.sendKeys(catagoryName);
		addCatagoryButton.click();
	}
	
	
}
