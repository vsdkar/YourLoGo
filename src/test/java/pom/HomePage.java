package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage{

		public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='login']")
	private WebElement SignLink;
	@FindBy(id="email")
	private WebElement EmailAddressTxtBox;
	@FindBy(id="passwd")
	private WebElement PasswordTxtBox;
	@FindBy(id="SubmitLogin")
	private WebElement Submitbtn;
	@FindBy(xpath="(//a[@title=\"Dresses\"])[2]")
	private WebElement Dresses;
	@FindBy(xpath="//a[@title=\"Casual Dresses\"]")
	private WebElement CasualDresses;
	@FindBy(xpath="(//a[@Title='T-shirts'])[2]")
	private WebElement TShirtsLink; 
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement SmallSizeCheckbox;
	@FindBy(id="layered_id_attribute_group_2")
	private WebElement MediumSizeCheckbox;
	@FindBy(id="layered_id_attribute_group_3")
	private WebElement LargeCheckbox;
	@FindBy(id="layered_id_attribute_group_13")
	private WebElement Orangecolorcheckkbox;
	@FindBy(id="layered_id_feature_5")
	private WebElement Compcottoncheckbox;
	@FindBy(id="layered_id_feature_13")
	private WebElement Styles;
	@FindBy(id="layered_id_feature_18")
	private WebElement properties;
	@FindBy(id="layered_id_feature_11")
	private WebElement Casualcheckbox;
	@FindBy(id="layered_id_feature_17")
	private WebElement ShortSleevecheckbox;
	@FindBy(id="layered_quantity_1")
	private WebElement InStock;
	@FindBy(id="layered_manufacturer_1")
	private WebElement Manufacturer;
	@FindBy(id="layered_condition_new")
	private WebElement Condtion;
	@FindBy(xpath="//a[@Class=\"product-name\"]")
	private WebElement FadedShortTShirtsLink;
	@FindBy(id="add_to_cart")
	private WebElement AddToCart;
	@FindBy(xpath="//a[@Title=\"Proceed to checkout\"]")
	private WebElement ProceedToCheckout;
	@FindBy(xpath="//a[@title='Addresses']")
	private WebElement MyAddress;
	@FindBy(xpath="//a[@title='Information']")
	private WebElement MyPersonalInfo;
	@FindBy(xpath="//a[@Title=\"Log me out\"]")
	private WebElement SignOut;
	
	
	public void SignIn() {
		SignLink.click();
	}
	public void SetEmailAddress(String EmailAdress) {
		EmailAddressTxtBox.sendKeys(EmailAdress);
	}
	public void SetPassword(String Password) {
		PasswordTxtBox.sendKeys(Password);
	}
	public void ClickSubmit() {
		Submitbtn.click();
	}
	public void ClickDresses() {
		Dresses.click();
	}
	public void ClickCasualDresses() {
		CasualDresses.click();
	}
	public void ClickTShirts() {
		TShirtsLink.click();
	}
	public void ClickSmallSize() {
		SmallSizeCheckbox.click();
	}
	public void ClickMediumSize() {
		MediumSizeCheckbox.click();
	}
	public void ClickLargeSize() {
		LargeCheckbox.click();
	}
	public void ClickOrangeColor() {
		Orangecolorcheckkbox.click();
	}
	public void ClickCotton() {
		Compcottoncheckbox.click();
	}
	public void ClickStyles() {
		Styles.click();
	}
	public void ClickProperties() {
		properties.click();
	}
	public void ClickCasual() {
		Casualcheckbox.click();
	}
	public void ClickShortSleeve() {
		ShortSleevecheckbox.click();
	}
	public void InStock() {
		InStock.click();
	}
	public void Manufacturer() {
		Manufacturer.click();
	}
	public void Condtion() {
		Condtion.click();
	}
	public void fadedtshirts() {
		FadedShortTShirtsLink.click();
	}
	public void AddToCart() {
		AddToCart.click();
	}
	public void ProceedToCheckout() {
		ProceedToCheckout.click();
	}
	public void ClickMyAddress() {
		MyAddress.click();
	}
	public void ClickMyPersonalInfo() {
		MyPersonalInfo.click();
	}
	public void SignOut() {
		SignOut.click();
	}
}
