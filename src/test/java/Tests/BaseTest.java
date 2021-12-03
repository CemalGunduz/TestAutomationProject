package Tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver96.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--suppress-message-center-popups");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.get("https://gittigidiyor.com");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    public WebElement mailLocator() {
        return driver.findElement(By.xpath("//input[@id='L-UserNameField']"));
    }

    public WebElement passwordLocator() {
        return driver.findElement(By.id("L-PasswordField"));
    }

    public WebElement loginButtonLocator() {
        return driver.findElement(By.id("gg-login-enter"));
    }

    public void makeSleep(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public void scrollDownEndOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

}
