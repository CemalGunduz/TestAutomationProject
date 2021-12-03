package Tests;

import Pages.SearchPage;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SearchTest extends BaseTest {

    SearchPage searchPage = new SearchPage();

    @Order(1)
    @Test
    public void makeSearchAndScrollDown() throws InterruptedException {
        searchPage.makeSearch("gergedan");
        scrollDownEndOfThePage();
    }

    @Order(2)
    @Test
    public void findAndFav() throws InterruptedException {
        searchPage.findElementAndAddFav();
    }

    @Order(3)
    @Test
    public void backToMainPage() throws InterruptedException {
        searchPage.clickMainPage();
    }


}
