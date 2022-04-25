@Validate-LoanCalculator
Feature: Acceptance testing to validate loan calculator is working.
  In order to validate that 
  the Home Loans Calculator page is working
  Doing the Acceptance Testing

  @Validate-Loan-Positive
  Scenario: Validate Loan Calculator Page
    Given I am on the Home Page "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" of Loan Website
    When I move to How much could I borrow Page
    And click on "Single" link
    And select dependants as "0" from Number of dependants dropdown
    And select "Home to Live in" as Property you wouldlike to buy
    And enter annual income as "$80000" for Your annual income input textbox
    And enter annual other income as "$10000" for Your annual other income input textbox
    And enter monthly living expences as "$500" for Your monthly living income input textbox
    And enter homeloan repayments as "$0" for Your homeloan repayment income input textbox
    And enter other loan repayments as "$100" for Your other income input textbox
    And enter other commitments as "$0" for Your other commitment input textbox
    And enter total credit card limit as "$10000" for Your total credit card limit input textbox
    And click on "How much I could borrow" link
    And validate estimate
    And click on "start over" link
    And enter living expences as "$1" for Living Expences input textbox
    And click on "How much I could borrow" link
    And the message should be "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641."

    