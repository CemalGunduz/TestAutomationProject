package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;

public class PaymentPage extends BaseTest {

    public void clickSaveButton() throws InterruptedException {
        makeSleep(3);
        driver.findElement(By.cssSelector("button[value='Kaydet']")).click();
    }

    public void clickEditCartButton() {
        driver.findElement(By.xpath("//a[@title='Sepeti Düzenle']")).click();
    }
}
