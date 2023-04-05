package page;

import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoryPage {

	WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;

	}

	// WebElement
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement CATEGORY_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[span='Test']")
	WebElement validate_Category_Element;

	public void insertCATEGORYELEMENT() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CATEGORY_ELEMENT.sendKeys("Test");
	}

	public void clickSUBMITELEMENT() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SUBMIT_ELEMENT.click();
	}

	public void validateCategoryElement() {

		Assert.assertEquals(validate_Category_Element.getText(), "Test");
		System.out.println(validate_Category_Element.getText());

	}
}
