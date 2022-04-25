package pages.actions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import pages.locators.LoanPageLocators;
import utils.SeleniumDriver;

public class LoanPageActions {
	
	//WebDriver driver=null;
	
	LoanPageLocators LoanPageLocators=null;
	public  LoanPageActions()
	{
		//this.driver=driver;
		this.LoanPageLocators= new LoanPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), LoanPageLocators);
	}

	public void clickApplicationType()
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='application_type_single']")).click();
		
		
	}
	
	public void selectNumberOfDependants(String noofdependants)
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//select[@title='Number of dependants']")).click();
		Select noOfDependants=new Select(LoanPageLocators.noOfdependents);
		noOfDependants.selectByVisibleText(noofdependants);
	}
	public void clickHometoLiveIn()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//label[@for='borrow_type_home']")).click();
		
	}
	public void enterAnnualIncome()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("$80000");
		
	}
	public void enterOtherIncome()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("$10000");
		
	}
	public void enterMonthlyExpences()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("$500");
		
	}
	public void entercurrentLoanRepayments()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys("$0");
		
	}
	public void enterOtherLoanRepayments()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("$100");
		
	}
	public void enterOtherMonthlyCommitments()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("$0");
		
	}
	public void enterTotalCreditlimits()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("$10000");
		
	}
	
	public void clickOnHowmuchBorrowButton()
	{
		SeleniumDriver.getDriver().findElement(By.xpath("//button[@id='btnBorrowCalculater']")).click();
		
	}
	public void verifyEstimate()
	{
	String value=	SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='backtotop anz-component']']")).getText();
		if(value.equals("")) {
			System.out.println("Pass");
		}
		
	}
	
	public void clickstartOver() {
		SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='borrow__result__action']//button[@aria-label='Start over']")).getText();
		
		
	}
	
	
	
}
