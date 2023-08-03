package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepsDefinition extends TestBase {

	LoginPage loginpage;

	@Before
	public void Setup() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("http://www.techfios.com/billing/?ng=login");
		takeScreenshot(driver);
	}

	@When("User enters username as {string}")
	public void User_enters_username_as(String username) {
		loginpage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void User_enters_password_as(String password) {
		loginpage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void User_clicks_on_sign_in_button() {
		loginpage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void User_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		takeScreenshot(driver);
	}
	
	 @And ("User clicks on bankCash")
	 public void User_clicks_on_bankCash() {
		loginpage.clickBankCash();
	}
	 
	 @And ("User clicks on newAccount")
	 public void User_clicks_on_newAccount(){
		loginpage.newAccount();
	 }
	 
	 @And ("User should land on accounts page")
		public void User_should_land_on_accounts_page() {
			String expectedTitle = "Accounts- iBilling";
			String actualTitle = loginpage.getPageTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
	 }
	
	 @And ("User enters accoutTitle as {string}")
	 public void User_enters_accoutTitle_as(String accountTitle){
	  loginpage.enterAccoutTitle(accountTitle);
	 }
	 
	 @And ("User enters discription as {string}")
	 public void User_enters_discription_as(String description) {
		 loginpage.enterDescription(description);
	 }
	 
	 @And ("User enters initialBalance as {string}")
	 public void User_enters_initialBalance_as (String initialBalance) {
		 loginpage.enterInitialBalance(initialBalance);
	 }
	 
	 @And ("User enters accountNumber as {string}")
	 public void User_enters_accountNumber_as (String accountNumber) {
		 loginpage.enterAccountNumber(accountNumber);
	 }
	 
	 @And ("User enters contactPerson as {string}")
	 public void User_enters_contactPerson_as (String contactPerson) {
		 loginpage.enterContactPerson(contactPerson);
	 }
	 
	 @And ("User enters phone as {string}")
	 public void User_enters_phone_as (String phone) {
		 loginpage.enterPhone(phone);
	 }
	 
	 @And ("User enters internetBankingURL as {string}")
	 public void User_enters_internetBankingURL_as (String internetBankingURL) {
		 loginpage.enterInternetBankingURL(internetBankingURL);
	 }
	 
	 @And ("User clicks on submit")
	 public void User_clicks_on_submit() {
		 loginpage.clickSubmit();
	 }
	 
	 
	 
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
