package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicatedCategoryPage {
	WebDriver driver;
	String addName;

	public DuplicatedCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement
	// WebElement
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement CATEGORY_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[span='Test']")
	WebElement Duplicated_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[1]")
	WebElement Yes_Element;

	public void insertCATEGORYELEMENT() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// addName = "Hi" + generateRandomNum(99);
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

	public void clickDuplicatedELEMENT() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Duplicated_ELEMENT.click();
	}

	public void clickYesElement() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Yes_Element.click();
	}

}
