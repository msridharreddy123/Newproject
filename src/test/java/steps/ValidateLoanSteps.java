package steps;

import java.util.List;


import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.LoanPageActions;
import utils.SeleniumDriver;


public class ValidateLoanSteps {
	
	
	LoanPageActions loanPageActions= new LoanPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of Loan Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("^I move to How much could I borrow Page$")
	public void i_move_to_How_Much_Could_I_Borrow_Page() {

	}
	

	@And("^click on \"([^\"]*)\" Singlelink$")
	public void click_on_link()  {
		loanPageActions.clickApplicationType();
	}

	@And("^select dependant as \"([^\"]*)\" from NumberOfdependants dropdown$")
	public void select_from_dropdown(String noofdependants) throws InterruptedException  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.selectNumberOfDependants(noofdependants);
	    
	}

	@And("^select \"([^\"]*)\" Home live in$")
	public void click_Home_liveIn()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.clickHometoLiveIn();
	    
	}

	@And("^enter \"([^\"]*)\" annual incomen$")
	public void enter_annual_income()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.enterAnnualIncome();
	}

	@And("^enter \"([^\"]*)\" annual other incomen$")
	public void enter_annual_other_income()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.enterOtherIncome();
	}
	@And("^enter \"([^\"]*)\" monthly living expences$")
	public void enter_monthly_living_expences()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.enterMonthlyExpences();
	}
	@And("^enter \"([^\"]*)\" homeloan repayments$")
	public void enter_homeloan_repayments()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.entercurrentLoanRepayments();
	}
	@And("^enter \"([^\"]*)\" other loan repayments$")
	public void enter_other_loan_repayments()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.enterOtherLoanRepayments();
	}
	@And("^enter \"([^\"]*)\" other commitments$")
	public void enter_other_commitments()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.enterOtherMonthlyCommitments();
	}
	@And("^enter \"([^\"]*)\" total credits$")
	public void enter_total_credits()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.enterTotalCreditlimits();
	}
	@And("^click \"([^\"]*)\" how much borrow$")
	public void click_howmuchborrow_link()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.clickOnHowmuchBorrowButton();
	}
	@And("^get \"([^\"]*)\" estimate$")
	public void get_estimate()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.verifyEstimate();
	}
	@And("^click \"([^\"]*)\" startover$")
	public void click_startover()  {
		 SeleniumDriver.waitForPageToLoad();
		 loanPageActions.clickstartOver();
	}
	@And("^the message should be \"([^\"]*)\"$")
	public void the_mesage_should_be(String expectedmessage)  {
	    
	    String Actualmessage= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+Actualmessage);
	    System.out.println("Expected page title-->"+expectedmessage);
	    Assert.assertEquals(expectedmessage, Actualmessage);
	 
	}


}
