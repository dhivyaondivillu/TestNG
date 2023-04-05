package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CategoryPage;
import util.BrowserFactory;

public class CategoryTest {
	WebDriver driver;

	@Test
	public void ValidateCategoryTest() {

		driver = BrowserFactory.init();
		CategoryPage categoryPage = PageFactory.initElements(driver, CategoryPage.class);
		categoryPage.insertCATEGORYELEMENT();
		categoryPage.clickSUBMITELEMENT();
		categoryPage.validateCategoryElement();

	}
}