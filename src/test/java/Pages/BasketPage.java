package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class BasketPage extends BaseTest {

    public void countUpItem() throws InterruptedException {
        makeSleep(3);
        Select select = new Select(driver.findElement(By.cssSelector("select[class='amount']")));
        select.selectByVisibleText("2");
    }

    public void clickPaymentButton() throws InterruptedException {
        makeSleep(3);
        driver.findElement(By.cssSelector("input[class='gg-d-24 gg-ui-btn-primary gg-ui-btn-lg btn-pay']")).click();
    }

    public void addFavToCart() throws InterruptedException {
        makeSleep(3);
        driver.findElements(By.cssSelector("a[class='gg-ui-btn-default btn-add-to-basket']")).get(1).click();
    }

    public void deleteFav() throws InterruptedException {
        makeSleep(2);
        driver.findElements(By.cssSelector("a[class='btn-delete']")).get(1).click();
    }

    public void openMainPageAtNewTabMethod() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(driver.findElement(By.cssSelector("a[class='logo_gg imglink logo-small'")))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();

        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }
}
