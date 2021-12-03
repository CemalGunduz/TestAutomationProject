package Tests;

import Pages.BasketPage;
import Pages.DetailPage;
import Pages.SearchPage;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HandbagTest extends BaseTest {

    SearchPage searchPage = new SearchPage();
    DetailPage detailPage = new DetailPage();
    BasketPage basketPage = new BasketPage();

    @Order(0)
    @Test
    public void searchBagAddToCart() throws InterruptedException {
        searchPage.makeSearch("çanta");
        searchPage.clickSeventhItem();
    }

    @Order(1)
    @Test
    public void addToBasket() throws InterruptedException {
        searchPage.scrollDown500();
        detailPage.clickAddBasket();
    }

    @Order(2)
    @Test
    public void goToBasket() throws InterruptedException {
        detailPage.goToBasketPage();
    }

    @Order(3)
    @Test
    public void countUp() throws InterruptedException {
        basketPage.countUpItem();
    }

    @Order(4)
    @Test
    public void goToPaymentPage() throws InterruptedException {
        basketPage.clickPaymentButton();
    }

}
