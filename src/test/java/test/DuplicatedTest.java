package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DuplicatedCategoryPage;
import util.BrowserFactory;

public class DuplicatedTest {
	WebDriver driver;

	@Test
	public void ValidateDuplicatedTest() {

		driver = BrowserFactory.init();

		DuplicatedCategoryPage duplicatedPage = PageFactory.initElements(driver, DuplicatedCategoryPage.class);
		duplicatedPage.insertCATEGORYELEMENT();
		duplicatedPage.clickSUBMITELEMENT();
		duplicatedPage.clickDuplicatedELEMENT();
		duplicatedPage.clickYesElement();

	}
}
