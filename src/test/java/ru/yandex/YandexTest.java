package ru.yandex;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class YandexTest extends WebDriver {


    @Test
    public void test1() {
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        driver.findElement(By.xpath("//a[@href=\'https://market.yandex.ru/?clid=505&utm_source=face_abovesearch&utm_campaign=face_abovesearch\']")).click();
        driver.findElement(By.xpath("//a[@href=\'/catalog--elektronika/54440\']")).click();
        driver.findElement(By.xpath("//a[@href=\'/catalog--smartfony/16814639/list?glfilter=16816262%3A16816264&hid=91491\']")).click();
        driver.findElement(By.id("glpricefrom")).sendKeys("20000");
        driver.findElement(By.xpath("//span[text()='Apple']")).click();
        driver.findElement(By.xpath("//span[text()='Samsung']")).click();
        driver.findElement(By.xpath("//button[@class='button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited']")).click();
        //driver.findElement(By.xpath("//span[contains(text()), 'Показывать по 12']")).click();
        driver.findElement(By.xpath("//div[@data-id='model-175941311']"));

        String s = String.valueOf(driver.findElement(By.xpath("//a[@title='Смартфон Apple iPhone Xr 64GB']")));
        System.out.println(s.replaceFirst("//a[@title=", " "));
        WebElement lstng = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("listing")));




    }

    @Test
    public void test2() {
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        driver.findElement(By.xpath("//a[@href=\'https://market.yandex.ru/?clid=505&utm_source=face_abovesearch&utm_campaign=face_abovesearch\']")).click();
        driver.findElement(By.xpath("//a[@href=\'/catalog--elektronika/54440\']")).click();
        driver.findElement(By.xpath("//a[@href=\'/catalog--naushniki-i-bluetooth-garnitury/56179/list?catId=90555&hid=90555\']")).click();
        driver.findElement(By.id("glpricefrom")).sendKeys("5000");
        driver.findElement(By.xpath("//span[text()='Beats']")).click();
        driver.findElement(By.xpath("//button[@class='button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited']")).click();
        WebElement lstng = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-expanded='true']")));
        WebElement lstng2 = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("listing")));


    }

    @Test
    public void test3() {
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        driver.findElement(By.xpath("//a[@href=\'https://market.yandex.ru/?clid=505&utm_source=face_abovesearch&utm_campaign=face_abovesearch\']")).click();
        driver.findElement(By.xpath("//a[@href=\'/catalog--elektronika/54440\']")).click();
        driver.findElement(By.xpath("//a[@href=\'/catalog--smartfony/16814639/list?glfilter=16816262%3A16816264&hid=91491\']")).click();
        driver.findElement(By.xpath("//div[@class='n-filter-sorter i-bem n-filter-sorter_js_inited']")).click();
        //driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        WebElement lstng = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("listing")));

    }
}
