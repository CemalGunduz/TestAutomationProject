package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;

public class SearchPage extends BaseTest {


    public void makeSearch(String input) throws InterruptedException {
        makeSleep(2);
        driver.findElement(By.name("k")).sendKeys(input, Keys.ENTER);
    }

    public void findElementAndAddFav() throws InterruptedException {
        makeSleep(5);
        List<WebElement> webElementList = driver.findElements(By.cssSelector("div[class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui']"));
        int count = webElementList.size();
        System.out.println("Count size: " + count);
        int min = 0;
        int max = count;
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 5; i++) {
            int random_int = secureRandom.nextInt(count);
            webElementList.get(random_int).click();
        }
    }

    public void clickMainPage() throws InterruptedException {
        makeSleep(4);
        driver.findElement(By.cssSelector("img[alt='GittiGidiyor']")).click();
    }

    public void clickSeventhItem() throws InterruptedException {
        makeSleep(2);
        driver.findElements(By.cssSelector("div[class='sc-533kbx-0 sc-1v2q8t1-0 iCRwxx ixSZpI sc-1n49x8z-12 bhlHZl']")).get(6).click();
    }

    public void scrollDownFiveHundred() throws InterruptedException {
        makeSleep(3);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

}
