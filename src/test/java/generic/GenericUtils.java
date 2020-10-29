package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils extends BaseTest {
	public static void gSelectByIndex(WebElement element, int n) {
		Select select = new Select(element);
		select.selectByIndex(n);
	}
	public static void gSelectByValue(WebElement element, String Value) {
		Select select = new Select(element);
		select.selectByValue(Value);
	}
	public static void gSelectbyVisibleText(WebElement element, String V) {
		Select select = new Select(element);
		select.selectByVisibleText(V);
	}
	public static void hover(WebDriver driver, WebElement toElement) {
		Actions action = new Actions(driver);
		action.moveToElement(toElement).perform();

	}
}
