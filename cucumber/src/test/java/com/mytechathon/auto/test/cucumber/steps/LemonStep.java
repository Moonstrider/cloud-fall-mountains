package com.mytechathon.auto.test.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LemonStep {

    static ChromeDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("打开百度搜索")
    public void open() throws InterruptedException {
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);

    }

    @When("输入 {string}")
    public void input(String string) {
        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys(string);
        element.submit();
    }

    @Then("显示 {string}")
    public void show(String string) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[text()='" + string + "']")));
    }

    @After()
    public void closeBrowser() throws Exception {
        Thread.sleep(1000);
        driver.quit();
    }
}
