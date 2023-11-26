package stepDefination;



import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class BasePage {
//    @Given("^User navigates to the Login page$")
//    public void user_navigates_to_the_Login_page() throws Throwable {
//        click_hamburger_menu();
//        click_signIn_link();
//    }

    @Given("User navigates to login page")
    public void userNavigatesToLoginPage() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }
//    @Given("User navigates to login page")
//public void user_navigates_to_login_page() throws InterruptedException {
//    click_hamburger_menu();
//    click_signIn_link();
//    throw new io.cucumber.java.PendingException();
//}
}
