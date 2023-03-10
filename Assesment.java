package Seleniumtest;
import org.openqa.selenium.*;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assesment {


        WebDriver driver;
        WebDriverWait myWait;
        TakesScreenshot ss;

        @BeforeClass
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64 (4)/chromedriver");
            ChromeOptions ops = new ChromeOptions();


            ops.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(ops);
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");


        }

        @AfterClass
        public void teardown() {
            driver.quit();
        }

        @Test(priority = 1)
        public void searchItem() throws IOException {
            myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
            WebElement ele1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            ele1.sendKeys("Iphone 13");
            WebElement ele2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
            ele2.click();
        }

        @Test(priority = 2)
        public void viewPhone() throws InterruptedException {
            myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Apple iPhone 12 (128GB) - White']")));
            WebElement ele3 = driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 12 (128GB) - White']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true)", ele3);
            ele3.click();
            Set<String> s = driver.getWindowHandles();
            Iterator<String> it = s.iterator();
            String parentId = it.next();
            String childId = it.next();
            driver.switchTo().window(childId);
        }

        @Test(priority = 3)
        public void addCart() throws InterruptedException {
            myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));
            WebElement ele4 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
            ele4.click();
            Thread.sleep(3000);
            WebElement ele5 = driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']"));
            Thread.sleep(3000);
            ele5.click();

            WebElement price=driver.findElement(By.xpath(" (//span[@class='a-size-base-plus a-color-base sc-product-title sc-grid-item-product-title'])[1]"));
            String tot=price.getText();
            System.out.println(tot);

            Assert.assertEquals("Apple iPhone 12 (128GB) - White",tot);

        }
    }

