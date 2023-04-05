package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MonthDropdownPage {
	WebDriver driver;

	public MonthDropdownPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]")
	WebElement MONTH_DROPDOWN_ELEMENT;

	public void selectMonthDropdown() {
		String actual[] = { "None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
				"Dec" };

		Select sel = new Select(MONTH_DROPDOWN_ELEMENT);
		List<WebElement> options = sel.getOptions();

		for (int i = 0; i < options.size(); i++) {
			Assert.assertEquals(options.get(i).getText(), actual[i]);
			System.out.println(options.get(i).getText());
		}

	}

}
