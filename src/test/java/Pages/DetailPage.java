package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;

public class DetailPage extends BaseTest {

    public void clickAddBasket() throws InterruptedException {
        makeSleep(3);
        driver.findElement(By.id("add-to-basket")).click();
    }

    public void goToBasketPage() throws InterruptedException {
        makeSleep(4);
        driver.navigate().to("https://www.gittigidiyor.com/sepetim");
    }


}
