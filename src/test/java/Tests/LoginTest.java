package Tests;

import Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void goToLoginPage() throws InterruptedException {
        loginPage.navigateToLoginPage();
    }

    @Test
    public void setLoginAccount() throws InterruptedException {
        String email = "damlimekku@vusra.com";
        String password = "123456asd";

        loginPage.typeMail(email);
        Assertions.assertEquals("damlimekku@vusra.com", email, "Expected mail doesn't match!");
        loginPage.typePassword(password);
        loginPage.clickEnter();
    }


}
