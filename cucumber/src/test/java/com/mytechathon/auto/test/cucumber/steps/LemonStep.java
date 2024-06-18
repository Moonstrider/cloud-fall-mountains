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
//        driver.get("https://volvoid.cn.volvocars.com/VolvoLogin/login?resumePath=2TkMveP6TV&client_id=t5zg8ue_11");
//        Thread.sleep(1000);
    }

    @When("输入 {string}")
    public void input(String string) {
        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys(string);
        element.submit();

//        WebElement username = driver.findElement(By.id("loginField"));
//        username.sendKeys("+8616621036574");
//        username.submit();

//        WebElement password = driver.findElement(By.id("pwdField"));
//        password.sendKeys("123QWEasd_++");
//        password.submit();

    }

    @Then("显示 {string}")
    public void show(String string) {
//        string = "很抱歉";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.visibilityOfElementLocated(
//                        By.className("//[test()='"+string+"']")
                        By.xpath("//a[text()='" + string + "']")
                ));
    }

    @After()
    public void closeBrowser() throws Exception {
        Thread.sleep(1000);
        driver.quit();
    }
}
