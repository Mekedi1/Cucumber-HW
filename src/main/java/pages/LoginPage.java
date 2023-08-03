package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase {
 
	WebDriver driver;
	
	//String accountTitle = "Cucumber";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	    // Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[10]/a/span[1]")WebElement BankCash;
	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[10]/ul/li[1]/a")WebElement newAccount;	 
	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement AccoutTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")WebElement Discription;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//div[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")WebElement Submit;
			
	   // Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickBankCash() {
		BankCash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void newAccount() {
		newAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterAccoutTitle(String accoutTitle) {
		AccoutTitle.sendKeys(accoutTitle + randomNumGenerator(999));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterDescription(String description) {
		Discription.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber + randomNumGenerator(999));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterPhone(String phone) {
		Phone.sendKeys(phone + randomNumGenerator(999));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterInternetBankingURL(String internetBankingURL) {
		InternetBankingURL.sendKeys(internetBankingURL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSubmit() {
		Submit.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}


}

