package ru.geekbrains;

import config.testConfig;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Site4test extends testConfig {

    @Test
    public void site4(){
        //заходим на сайт
        driver.get(SITE_URL4);
        //забираем в переменную поле поиска
        WebElement search = driver.findElement(By.xpath("//*[@name = \"kp_query\"]"));
        //вбиваем в поиске Интерстеллар
        search.sendKeys(searchItem);
        //забираем в переменную кнопку поиска
        WebElement searchButton = driver.findElement(By.xpath("//*[@class = \"_2k4Wh6C4VbCSwM4zwFJOWa _3p61ht_a0h1BAaDpHKIJE0\"]"));
        //нажимаем кнопку поиска
        searchButton.click();
        //забираем в переменную ссылку
        WebElement filmLink = driver.findElement(By.cssSelector("#block_left_pad > div > div:nth-child(3) > div > div.info > p > a"));
        //нажимаем на ссылку
        filmLink.click();
        //забираем в переменную ссылку Награды (не смог зацепиться меньшим путём)
        WebElement awardsLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/a"));
        //нажимаем на ссылку
        awardsLink.click();
        //проверяем видимость элемента
        waitFiveSeconds.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@src = \"https://st.kp.yandex.net/images/award-oscar-small.jpg\"]"))));
        System.out.println("Элемент найден!");
        //закрываем браузер и завершаем работу драйвера
        driver.quit();
    }
}
