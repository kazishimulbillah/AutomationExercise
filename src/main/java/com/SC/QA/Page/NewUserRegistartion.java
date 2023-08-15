package com.SC.QA.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SC.Helper.Action.ActionHelper;
import com.SC.Helper.JavaScript.JavaScriptHelper;
import com.SC.Helper.Select.DropDownHelper;
import com.SC.Helper.Wait.WaitHelper;
import com.SC.QA.Base.TestBase;

public class NewUserRegistartion extends TestBase {

	@FindBy(xpath = "//*[@class=\"btn btn-default add-to-cart\"]")
	WebElement AddToCart;

	@FindBy(linkText = "View Cart")
	WebElement ViewCart;

	@FindBy(xpath = "//*[text()=\"Proceed To Checkout\"]")
	WebElement ProceedToCheckout;

	@FindBy(linkText = "Register / Login")
	WebElement Register;

	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement Name;

	@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
	WebElement Email;

	@FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
	WebElement Signup;

	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	WebElement Title;

	@FindBy(xpath = "//input[@data-qa=\"password\"]")
	WebElement Password;

	@FindBy(xpath = "//*[@id=\"days\"]")
	WebElement Days;

	@FindBy(xpath = "//*[@id=\"months\"]")
	WebElement Months;

	@FindBy(xpath = "//*[@id=\"years\"]")
	WebElement years;

	@FindBy(xpath = "//*[@id=\"first_name\"]")
	WebElement First_name;

	@FindBy(xpath = "//*[@id=\"last_name\"]")
	WebElement Last_name;

	@FindBy(xpath = "//*[@id=\"address1\"]")
	WebElement Address;

	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement Country;

	@FindBy(xpath = "//*[@id=\"state\"]")
	WebElement State;

	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement City;

	@FindBy(xpath = "//*[@id=\"zipcode\"]")
	WebElement Zipcode;

	@FindBy(xpath = "//*[@id=\"mobile_number\"]")
	WebElement Mobile_number;

	@FindBy(xpath = "//*[@data-qa=\"create-account\"]")
	WebElement CreateAccount;

	@FindBy(xpath = "//*[@data-qa=\"continue-button\"]")
	WebElement Continuebutton;

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
	WebElement LoggedIn;

	@FindBy(xpath = "//*[text()=\" Cart\"]")
	WebElement CartButton;

	@FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
	WebElement Comment;

	@FindBy(xpath = "//*[text()=\"Place Order\"]")
	WebElement PlaceOrder;

	@FindBy(xpath = "//*[@data-qa=\"name-on-card\"]")
	WebElement NameOnCard;

	@FindBy(xpath = "//*[@data-qa=\"card-number\"]")
	WebElement CardNumber;

	@FindBy(xpath = "//*[@data-qa=\"cvc\"]")
	WebElement CVC;

	@FindBy(xpath = "//*[@data-qa=\"expiry-month\"]")
	WebElement ExpiryMonth;

	@FindBy(xpath = "//*[@data-qa=\"expiry-year\"]")
	WebElement ExpiryYear;

	@FindBy(xpath = "//*[text()=\"Pay and Confirm Order\"]")
	WebElement PayAndConfirmOrder;

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/p")
	WebElement PaymentSuccess;

	JavaScriptHelper javaScript = new JavaScriptHelper(driver);
	DropDownHelper dropDown = new DropDownHelper(driver);
	ActionHelper action = new ActionHelper(driver);
	WaitHelper wait = new WaitHelper(driver);

	public NewUserRegistartion() {
		PageFactory.initElements(driver, this);
	}

	public void RegisterANewUser(String name, String email, String password, String day, String month, String year,
			String firstname, String lastname, String address, String country, String state, String city,
			String zipcode, String mobilenumber, String cardNumber, String cvc, String expiryMonth, String expiryYear)
			throws InterruptedException {

		Thread.sleep(500);
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");

		Thread.sleep(500);
		javaScript.clickElement(AddToCart);

		String winHandleBefore = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		Thread.sleep(1000);
		javaScript.clickElement(ViewCart);

		driver.switchTo().window(winHandleBefore);

		Thread.sleep(500);
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Checkout");

		Thread.sleep(1000);
		javaScript.clickElement(ProceedToCheckout);

		Thread.sleep(1000);
		javaScript.clickElement(Register);

		Thread.sleep(1000);
		Name.sendKeys(name);

		Thread.sleep(1000);
		Email.sendKeys(email);

		Thread.sleep(1000);
		javaScript.clickElement(Signup);

		Thread.sleep(1000);
		javaScript.clickElement(Title);

		Thread.sleep(1000);
		Password.sendKeys(password);

		Thread.sleep(1000);
		dropDown.selectUsingVisibleText(Days, day);

		Thread.sleep(1000);
		dropDown.selectUsingVisibleText(Months, month);

		Thread.sleep(1000);
		dropDown.selectUsingVisibleText(years, year);

		Thread.sleep(1000);
		First_name.sendKeys(firstname);

		Thread.sleep(1000);
		Last_name.sendKeys(lastname);

		Thread.sleep(1000);
		Address.sendKeys(address);

		Thread.sleep(1000);
		dropDown.selectUsingVisibleText(Country, country);

		Thread.sleep(1000);
		State.sendKeys(state);

		Thread.sleep(1000);
		City.sendKeys(city);

		Thread.sleep(1000);
		Zipcode.sendKeys(zipcode);

		Thread.sleep(1000);
		Mobile_number.sendKeys(mobilenumber);

		Thread.sleep(1000);
		javaScript.clickElement(CreateAccount);

		Thread.sleep(500);
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Account Created");

		Thread.sleep(1000);
		javaScript.clickElement(Continuebutton);

		Thread.sleep(500);
		Assert.assertEquals(LoggedIn.getText(), "Logged in as " + name);

		Thread.sleep(1000);
		javaScript.clickElement(CartButton);

		Thread.sleep(1000);
		javaScript.clickElement(ProceedToCheckout);

		Thread.sleep(1000);
		javaScript.scrollToElement(Comment);

		Thread.sleep(1000);
		Comment.sendKeys("Order Has been Placed");

		Thread.sleep(1000);
		javaScript.clickElement(PlaceOrder);

		Thread.sleep(1000);
		NameOnCard.sendKeys(name);

		Thread.sleep(1000);
		CardNumber.sendKeys(cardNumber);

		Thread.sleep(1000);
		CVC.sendKeys(cvc);

		Thread.sleep(1000);
		ExpiryMonth.sendKeys(expiryMonth);

		Thread.sleep(1000);
		ExpiryYear.sendKeys(expiryYear);

		Thread.sleep(1000);
		javaScript.clickElement(PayAndConfirmOrder);

		Thread.sleep(500);
		Assert.assertEquals(PaymentSuccess.getText(), "Congratulations! Your order has been confirmed!");

	}
}
