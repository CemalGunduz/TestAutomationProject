package Pages;

import Tests.BaseTest;

public class LoginPage extends BaseTest {

    public void navigateToLoginPage() throws InterruptedException {
        makeSleep(3);
        driver.navigate().to("https://www.gittigidiyor.com/uye-girisi?s=1");
    }

    public void typeMail(String mail) throws InterruptedException {
        makeSleep(2);
        mailLocator().sendKeys(mail);

    }

    public void typePassword(String password) throws InterruptedException {
        makeSleep(2);
        passwordLocator().sendKeys(password);
    }

    public void clickEnter() throws InterruptedException {
        makeSleep(3);
        loginButtonLocator().click();
    }

}
