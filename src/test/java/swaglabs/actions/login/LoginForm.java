package swaglabs.actions.login;

import net.serenitybdd.core.pages.ResolvableElement;
import org.openqa.selenium.By;

public class LoginForm {
    public static By USERNAME = By.cssSelector("[data-test=username]");
    public static By PASSWORD = By.cssSelector("[data-test=password]");
    public static By LOGIN = By.cssSelector("[data-test=login-button]");
    public static By ERROR_MESSAGE = By.cssSelector("[data-test=error]");
}
