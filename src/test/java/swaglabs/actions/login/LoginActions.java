package swaglabs.actions.login;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {
    @Step("Open the SwagLabs login page")
    public void openTheLoginPage() {
        openUrl("https://www.saucedemo.com/");
    }

    @Step("Login with valid credentials")
    public void withValidCredentials() {
        $(LoginForm.USERNAME).sendKeys("standard_user");
        $(LoginForm.PASSWORD).sendKeys("secret_sauce");
        $(LoginForm.LOGIN).click();
    }

    @Step("Login with the following credentials:")
    public void withCredentials(String username, String password) {
        $(LoginForm.USERNAME).sendKeys(username);
        $(LoginForm.PASSWORD).sendKeys(password);
        $(LoginForm.LOGIN).click();
    }

    public String errorMessage() {
        return $(LoginForm.ERROR_MESSAGE).getText();
    }
}
