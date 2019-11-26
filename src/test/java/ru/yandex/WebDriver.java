package ru.yandex;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {

    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/Files//chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void quit() {
        driver.quit();
    }
}
