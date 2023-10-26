package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.LoginPage;

public class LogOutSteps {
    LoginPage lp;
    DashBoardPage dp;
    public LogOutSteps(){
        lp = new LoginPage();
        dp=new DashBoardPage();
    }
    @Given("^I am logged into my Orange HRM account$")
    public void i_am_logged_into_my_Orange_HRM_account() throws Throwable {
    lp.openChromeBrowser();
    lp.enter_valid_username_and_password();
    lp.click_the_Login_buatton();

    }

    @When("^I click the Logout link$")
    public void i_click_the_Logout_link() throws Throwable {
    dp.click_on_the_dropdown();
    dp.click_on_the_logout();
    }

    @Then("^I should be redirected to the login page$")
    public void i_should_be_redirected_to_the_login_page() throws Throwable {


    }
}
