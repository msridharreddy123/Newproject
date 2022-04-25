package pages.locators;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoanPageLocators {
	
	
	@FindBy(how=How.XPATH,using=".//input[@id='application_type_single']")
	public WebElement applicationType;
	
	@FindBy(how=How.XPATH,using=".//select[@title='Number of dependants']")
	public WebElement noOfdependents;
	
	@FindBy(how=How.XPATH,using="//label[@for='borrow_type_home']']")
	public WebElement homeTolivein;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q2q1']")
	public WebElement annualIncome;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q2q1']")
	public WebElement annualOtherIncome;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q3q1']")
	public WebElement monthlyLivingexpences;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q3q2']")
	public WebElement monthlyRepayments;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q3q3']")
	public WebElement otherLoanRepayments;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q3q4']")
	public WebElement monthlyCommitments;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='q3q5']")
	public WebElement totalCredditLimits;
	
	@FindBy(how=How.XPATH,using="//button[@id='btnBorrowCalculater']")
	public WebElement howmuchborrow;
	
	@FindBy(how=How.XPATH,using="//div[@class='backtotop anz-component']']")
	public WebElement esimate;
	
	@FindBy(how=How.XPATH,using="//div[@class='borrow__result__action']//button[@aria-label='Start over']")
	public WebElement startOver;
	
	@FindBy(how=How.XPATH,using=".//select[@title='Number of dependants']")
	public WebElement warnMessage;
	
	
}
