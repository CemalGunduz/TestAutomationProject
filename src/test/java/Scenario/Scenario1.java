package Scenario;

import Pages.*;
import Tests.BaseTest;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Scenario1 extends BaseTest {

    public String text;
    PaymentPage paymentPage = new PaymentPage();
    BasketPage basketPage = new BasketPage();
    LoginPage loginPage = new LoginPage();
    DetailPage detailPage = new DetailPage();
    SearchPage searchPage = new SearchPage();

    @Order(0)
    @Test
    public void goToLoginPage() throws InterruptedException {
        loginPage.navigateToLoginPage();

    }

    @Order(1)
    @Test
    public void setLoginAccount() throws InterruptedException {
        String email = "damlimekku@vusra.com";
        String password = "123456asd";

        loginPage.typeMail(email);
        Assertions.assertEquals("damlimekku@vusra.com", email, "Expected mail doesn't match!");
        loginPage.typePassword(password);
        loginPage.clickEnter();
    }

    @Order(2)
    @Test
    public void makeSearchAndScrollDown() throws InterruptedException {
        searchPage.makeSearch("gergedan");
        scrollDownEndOfThePage();
    }

    @Order(3)
    @Test
    public void findAndFav() throws InterruptedException {
        searchPage.findElementAndAddFav();
    }

    @Order(4)
    @Test
    public void backToMainPage() throws InterruptedException {
        searchPage.clickMainPage();
    }

    @Order(5)
    @Test
    public void searchBagAddToCart() throws InterruptedException {
        searchPage.makeSearch("çanta");
        searchPage.clickSeventhItem();
    }

    @Order(6)
    @Test
    public void addToBasket() throws InterruptedException {
        searchPage.scrollDownFiveHundred();
        detailPage.clickAddBasket();
    }

    @Order(7)
    @Test
    public void goToBasket() throws InterruptedException {
        detailPage.goToBasketPage();
    }

    @Order(8)
    @Test
    public void countUp() throws InterruptedException {
        basketPage.countUpItem();
    }

    @Order(9)
    @Test
    public void goToPaymentPage() throws InterruptedException {
        basketPage.clickPaymentButton();
    }

    @Order(10)
    @Test
    public void clickingSaveButton() throws InterruptedException {
        paymentPage.clickSaveButton();
    }

    @Order(11)
    @Test
    public void scrollDownAndEditCart() throws InterruptedException {
        makeSleep(3);
        scrollDownEndOfThePage();
        paymentPage.clickEditCartButton();
    }

    @Order(12)
    @Test
    public void addFavsToCartAndDeleteFav() throws InterruptedException {
        basketPage.addFavToCart();
        basketPage.deleteFav();
    }

    @Order(13)
    @Test
    public void openMainPageAtNewTab() throws InterruptedException {
        makeSleep(3);
        basketPage.openMainPageAtNewTabMethod();
    }


}
