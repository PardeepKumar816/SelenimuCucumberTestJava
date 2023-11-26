package stepDefination;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {

//    @When("^User successfully enters the log in details$")
//    public void user_logsin_to_login_page(){
//        sendkeys_username();
//        sendkeys_password();
//        click_login_btn();
//    }

    @When("User successfully enter the log in details")
    public void userSuccessfullyEnterTheLogInDetails() {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }
}
