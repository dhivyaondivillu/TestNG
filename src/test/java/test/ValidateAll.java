package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CategoryPage;
import page.DuplicatedCategoryPage;
import page.MonthDropdownPage;
import util.BrowserFactory;

public class ValidateAll {
	public class validateAll {
		WebDriver driver;

		@Test
		public void ValidateAllTest() {

			driver = BrowserFactory.init();
			CategoryPage categoryPage = PageFactory.initElements(driver, CategoryPage.class);
			categoryPage.insertCATEGORYELEMENT();
			categoryPage.clickSUBMITELEMENT();
			categoryPage.validateCategoryElement();

			DuplicatedCategoryPage duplicatedPage = PageFactory.initElements(driver, DuplicatedCategoryPage.class);
			duplicatedPage.clickDuplicatedELEMENT();
			duplicatedPage.clickYesElement();

			MonthDropdownPage monthDropdownPage = PageFactory.initElements(driver, MonthDropdownPage.class);
			monthDropdownPage.selectMonthDropdown();

			
			BrowserFactory.tearDown();
		}

	}
}
