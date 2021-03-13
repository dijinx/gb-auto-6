package ru.geekbrains;

import config.testConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Site2test extends testConfig {
    //проверка отображаемого имени пользователя на странице профиля
    @Test
    public void site2() {
        //заходим на сайт
        driver.get(SITE_URL2);
        //нажать кнопку "Login/Register"
        WebElement clickLoginRegisterButton = waitFiveSeconds
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class=\"login-url visible-downto-xs\"]"))));
        clickLoginRegisterButton.click();
        //ввести почту
        WebElement enterUserMail = waitFiveSeconds
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-bind=\"value: email, css:{ elementErrorMode: email().length < 1 && $parent.fieldErrors }\"]"))));
        enterUserMail.clear();
        enterUserMail.sendKeys(Email);
        //ввести пароль
        WebElement enterUserPassword = waitFiveSeconds
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div/div/div/div[2]/form/input[2]"))));
        enterUserPassword.clear();
        enterUserPassword.sendKeys(Password);
        //нажать кнопку "Log in"
        WebElement clickLogInButton = waitFiveSeconds
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div/div/div/div[2]/form/div/button"))));
        clickLogInButton.click();
        //открыть меню пользователя
        WebElement clickUserMenu = waitFiveSeconds
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class=\"user-menu\"]"))));
        clickUserMenu.click();
        //нажать пункт меню "My Profile"
        WebElement clickMyProfile = waitFiveSeconds
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"header-variation-new\"]/nav[2]/ul/li[4]/nav/ul/li[2]/a"))));
        clickMyProfile.click();
        //проверка правильно ли отображается имя пользователя
        waitFiveSeconds.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/main/div[1]/div/div[2]/h2")), "orangeviyAvokado"));
    }
}
