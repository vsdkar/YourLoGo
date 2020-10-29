package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import generic.GenericUtils;
import pom.HomePage;


public class TestScripts extends BaseTest {
	@Test(priority=1)
	public void PurchaseSmall() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage p = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		p.SignIn();
		p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
		p.SetPassword(Excel.readData("Sheet1", 1, 1));
		p.ClickSubmit();
		Thread.sleep(100);
		p.ClickTShirts();
		p.ClickSmallSize();
		p.ClickOrangeColor();
		p.ClickCotton();
		p.ClickCasual();
		p.ClickShortSleeve();
		p.InStock();
		p.Manufacturer();
		p.Condtion();
		p.fadedtshirts();
		Thread.sleep(100);
		p.AddToCart();
		Thread.sleep(10000);
		p.ProceedToCheckout();
		Thread.sleep(10000);
		p.SignOut();
		Thread.sleep(10000);
	}
		@Test(priority=2)
	public void purchasemedium() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage p = new HomePage(driver);
		//BasePage.verifyTitle("My Store");
		p.SignIn();
		p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
		p.SetPassword(Excel.readData("Sheet1", 1, 1));
		p.ClickSubmit();
		Thread.sleep(100);
		p.ClickTShirts();
		p.ClickMediumSize();;
		p.ClickOrangeColor();
		p.ClickCotton();
		p.ClickCasual();
		p.ClickShortSleeve();
		p.InStock();
		p.Manufacturer();
		p.Condtion();
		p.fadedtshirts();
		Thread.sleep(100);
		p.AddToCart();
		Thread.sleep(10000);
		p.ProceedToCheckout();
		Thread.sleep(10000);
		p.SignOut();
		Thread.sleep(10000);
	}
	@Test(priority=3)
	public void purchaselarge() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage p = new HomePage(driver);
		//BasePage.verifyTitle("My Store");
		p.SignIn();
		p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
		p.SetPassword(Excel.readData("Sheet1", 1, 1));
		p.ClickSubmit();
		Thread.sleep(100);
		p.ClickTShirts();
		p.ClickLargeSize();
		p.ClickOrangeColor();
		p.ClickCotton();
		p.ClickCasual();
		p.ClickShortSleeve();
		p.InStock();
		p.Manufacturer();
		p.Condtion();
		p.fadedtshirts();
		Thread.sleep(100);
		p.AddToCart();
		Thread.sleep(10000);
		p.ProceedToCheckout();
		Thread.sleep(10000);
		p.SignOut();
		Thread.sleep(10000);
	}
	@Test(priority=4)
	public void dresscasualdresssmallsize() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage p = new HomePage(driver);
		p.SignIn();
		p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
		p.SetPassword(Excel.readData("Sheet1", 1, 1));
		p.ClickSubmit(); 
		WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		GenericUtils.hover(driver, Dresses);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")).click();
		Thread.sleep(10000);
		p.ClickSmallSize();
		p.ClickOrangeColor();
		p.ClickCotton();
		Thread.sleep(10000);
		p.ClickStyles();
		p.ClickProperties();
		p.InStock();
		p.Manufacturer();
		p.Condtion();
		p.fadedtshirts();
		Thread.sleep(100);
		p.AddToCart();
		Thread.sleep(10000);
		p.ProceedToCheckout();
		Thread.sleep(10000);
		p.SignOut();
		Thread.sleep(10000);
	}
	  @Test(priority=5)
	  public void dresscasualdressmediumsize() throws InterruptedException, EncryptedDocumentException, IOException {
		  HomePage p = new HomePage(driver);
			p.SignIn();
			p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
			p.SetPassword(Excel.readData("Sheet1", 1, 1));
			p.ClickSubmit(); 
			WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
			GenericUtils.hover(driver, Dresses);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")).click();
			Thread.sleep(10000);
			p.ClickMediumSize();
			p.ClickOrangeColor();
			p.ClickCotton();
			Thread.sleep(10000);
			p.ClickStyles();
			p.ClickProperties();
			p.InStock();
			p.Manufacturer();
			p.Condtion();
			p.fadedtshirts();
			Thread.sleep(100);
			p.AddToCart();
			Thread.sleep(10000);
			p.ProceedToCheckout();
			Thread.sleep(10000);
			p.SignOut();
			Thread.sleep(10000); 
	  }
	 @Test(priority=6)
	  public void dresscasualdressLargesize() throws InterruptedException, EncryptedDocumentException, IOException {
		  HomePage p = new HomePage(driver);
			p.SignIn();
			p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
			p.SetPassword(Excel.readData("Sheet1", 1, 1));
			p.ClickSubmit(); 
			WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
			GenericUtils.hover(driver, Dresses);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")).click();
			Thread.sleep(2000);
			p.ClickLargeSize();
			p.ClickOrangeColor();
			p.ClickCotton();
			Thread.sleep(10000);
			p.ClickStyles();
			p.ClickProperties();
			p.InStock();
			p.Manufacturer();
			p.Condtion();
			p.fadedtshirts();
			Thread.sleep(100);
			p.AddToCart();
			Thread.sleep(10000);
			p.ProceedToCheckout();
			Thread.sleep(10000);
			p.SignOut();
			Thread.sleep(10000); 
	  }
	  @Test(priority=7)
	  public void ClickMyAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		  HomePage p = new HomePage(driver);
			p.SignIn();
			p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
			p.SetPassword(Excel.readData("Sheet1", 1, 1));
			p.ClickSubmit(); 
			p.ClickMyAddress();
			Thread.sleep(10000);
			p.SignOut();
			
	  }
	  @Test(priority=8)
	  public void ClickMyPersonalInfo() throws InterruptedException, EncryptedDocumentException, IOException {
		  HomePage p = new HomePage(driver);
			p.SignIn();
			p.SetEmailAddress(Excel.readData("Sheet1", 0, 1));
			p.SetPassword(Excel.readData("Sheet1", 1, 1));
			p.ClickSubmit(); 
			p.ClickMyPersonalInfo();
			Thread.sleep(10000);
			p.SignOut();
		  
	  }
		
	}
	
		
	

