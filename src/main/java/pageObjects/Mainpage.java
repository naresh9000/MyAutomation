package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {
	
	public WebDriver driver;
	
	public Mainpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,Mainpage.class);
		
	}
	
	@FindBy(xpath = "//img[@id='logo']")
	@CacheLookup
	public WebElement logo;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	public WebElement emailtextBox;
	
	@FindBy(xpath="//img[@id='enterimg']")
	@CacheLookup
	public WebElement submitButton;
	
	@FindBy(xpath = "//button[@id='btn1']")
	@CacheLookup
	public WebElement signInButton;
	
	@FindBy(xpath="//button[@id='btn2']")
	@CacheLookup
	public WebElement SkipsignInButton;
	
	

	public WebElement getLogo() {
		return logo;
	}

	public void setLogo(WebElement logo) {
		this.logo = logo;
	}

	public WebElement getEmailtextBox() {
		return emailtextBox;
	}

	public void setEmailtextBox(WebElement emailtextBox) {
		this.emailtextBox = emailtextBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public void setSignInButton(WebElement signInButton) {
		this.signInButton = signInButton;
	}

	public WebElement getSkipsignInButton() {
		return SkipsignInButton;
	}

	public void setSkipsignInButton(WebElement skipsignInButton) {
		SkipsignInButton = skipsignInButton;
	}
	
	
	
}
