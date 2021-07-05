package StepDefinitions;

import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinition {
    LoginPage loginPage = new LoginPage();
    @Given("^initiate the browser$")
    public void initiate_the_browser() throws Exception {
        loginPage.initiateTheBrowser();
    }
    @Given("^instagram login page$")
    public void instagram_login_page(){
        loginPage.goToPage();
    }
    @When("^input username$")
    public void input_username(){
        loginPage.inputUsername();
    }
    @When("^input password$")
    public void input_password(){
        loginPage.inputPassword();
    }
    @When("^click Log In$")
    public void click_Log_In(){
        loginPage.clickLogin();
    }
    @When("^input username with \"([^\"]*)\"$")
    public void input_username_with(String uname){
        loginPage.inputUsername(uname);
    }
    @When("^input password with \"([^\"]*)\"$")
    public void input_password_with(String pwd){
        loginPage.inputPassword(pwd);
    }
    @When("^click Profile$")
    public void click_Profile(){
        loginPage.clickProfile();
    }@When("^click Log Out$")
    public void click_Log_Out(){
        loginPage.clickLogOut();
    }
    @Then("^Save Your Login Info label displayed$")
    public void Save_Your_Login_Info_label_displayed(){
        loginPage.SaveYourLoginInfoLabelDisplayed();

    }
    @Then("^Logging Out label displayed$")
    public void Logging_Out_label_displayed(){
        loginPage.LoggingOutLabelDisplayed();

    }
    @Then("^back to Login Page$")
    public void back_to_Login_Page(){
        loginPage.backToLoginPage();

    }

}
