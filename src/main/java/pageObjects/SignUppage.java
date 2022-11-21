package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUppage {
	
	public WebDriver driver;
	
	public SignUppage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='Register']")
	@CacheLookup
	public WebElement Register;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	@CacheLookup
	public WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	@CacheLookup
	public WebElement lastname;
	
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	@CacheLookup
	public WebElement adress;
	
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	public WebElement emailAddress;
	
	@FindBy(xpath="//input[@type='tel']")
	@CacheLookup
	public WebElement phone;
	
	@FindBy(xpath="//input[@value='Male']")
	@CacheLookup
	public WebElement genderMale;
	
	@FindBy(xpath="//input[@value='FeMale']")
	@CacheLookup
	public WebElement genderFemale;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	@CacheLookup
	public WebElement Hobbies_cricket;
	
	@FindBy(xpath="//input[@id='checkbox3']")
	@CacheLookup
	public WebElement Hobbies_Hockey;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	@CacheLookup
	public WebElement Hobbies_Movies;
	
	@FindBy(xpath = "//div[@id='msdd']")
	@CacheLookup
	public List<WebElement> languages;
	
	
	@FindBy(xpath = "//select[@id='Skills']")
	@CacheLookup
	public List<WebElement> skills;
	
	
	@FindBy(xpath="//span[@role='combobox']")
	@CacheLookup
	public List<WebElement> selectCountry;
	
	
	@FindBy(xpath = "//select[@id='yearbox']")
	@CacheLookup
	public List<WebElement> DOB_Year;
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	@CacheLookup
	public List<WebElement> DOB_Month;
	
	@FindBy(xpath = "//select[@id='daybox']")
	@CacheLookup
	public List<WebElement> DOB_Day;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	@CacheLookup
	public WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	@CacheLookup
	public WebElement confirmPassword;
	
	@FindBy(xpath="//button[@id='submitbtn']")
	@CacheLookup
	public WebElement submitbtnSignupPage;
	
	@FindBy(xpath="//button[@id='Button1']")
	@CacheLookup
	public WebElement RefreshBtnSignUpPage;
	
	@FindBy(xpath="//input[@id='imagesrc']")
	@CacheLookup
	public WebElement chooseFile;

	public WebElement getRegister() {
		return Register;
	}

	public void setRegister(WebElement register) {
		Register = register;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public void setAdress(WebElement adress) {
		this.adress = adress;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(WebElement emailAddress) {
		this.emailAddress = emailAddress;
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(WebElement phone) {
		this.phone = phone;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public void setGenderMale(WebElement genderMale) {
		this.genderMale = genderMale;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public void setGenderFemale(WebElement genderFemale) {
		this.genderFemale = genderFemale;
	}

	public WebElement getHobbies_cricket() {
		return Hobbies_cricket;
	}

	public void setHobbies_cricket(WebElement hobbies_cricket) {
		Hobbies_cricket = hobbies_cricket;
	}

	public WebElement getHobbies_Hockey() {
		return Hobbies_Hockey;
	}

	public void setHobbies_Hockey(WebElement hobbies_Hockey) {
		Hobbies_Hockey = hobbies_Hockey;
	}

	public WebElement getHobbies_Movies() {
		return Hobbies_Movies;
	}

	public void setHobbies_Movies(WebElement hobbies_Movies) {
		Hobbies_Movies = hobbies_Movies;
	}

	public List<WebElement> getLanguages() {
		return languages;
	}

	public void setLanguages(List<WebElement> languages) {
		this.languages = languages;
	}

	public List<WebElement> getSkills() {
		return skills;
	}

	public void setSkills(List<WebElement> skills) {
		this.skills = skills;
	}

	public List<WebElement> getSelectCountry() {
		return selectCountry;
	}

	public void setSelectCountry(List<WebElement> selectCountry) {
		this.selectCountry = selectCountry;
	}

	public List<WebElement> getDOB_Year() {
		return DOB_Year;
	}

	public void setDOB_Year(List<WebElement> dOB_Year) {
		DOB_Year = dOB_Year;
	}

	public List<WebElement> getDOB_Month() {
		return DOB_Month;
	}

	public void setDOB_Month(List<WebElement> dOB_Month) {
		DOB_Month = dOB_Month;
	}

	public List<WebElement> getDOB_Day() {
		return DOB_Day;
	}

	public void setDOB_Day(List<WebElement> dOB_Day) {
		DOB_Day = dOB_Day;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public WebElement getSubmitbtnSignupPage() {
		return submitbtnSignupPage;
	}

	public void setSubmitbtnSignupPage(WebElement submitbtnSignupPage) {
		this.submitbtnSignupPage = submitbtnSignupPage;
	}

	public WebElement getRefreshBtnSignUpPage() {
		return RefreshBtnSignUpPage;
	}

	public void setRefreshBtnSignUpPage(WebElement refreshBtnSignUpPage) {
		RefreshBtnSignUpPage = refreshBtnSignUpPage;
	}

	public WebElement getChooseFile() {
		return chooseFile;
	}

	public void setChooseFile(WebElement chooseFile) {
		this.chooseFile = chooseFile;
	}
	
	
	
	

	

}
