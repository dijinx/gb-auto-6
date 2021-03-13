package ru.geekbrains;

import config.testConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Site3test extends testConfig {
    //проверка того что по нажатию пункта "digital art" происходит переход на адрес "https://www.ifitshipitshere.com/category/art/digital-art/"
    @Test
    public void site3() {
        //зайти на сайт
        driver.get(SITE_URL3);
        //кликнуть по выпадающему меню
        WebElement dropDownMenu= waitFiveSeconds.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cat"))));
        dropDownMenu.click();
        //в выпадающем меню открыть категорию "digital art"
        WebElement digitalArt = waitFiveSeconds.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@value=\"690\"]"))));
        digitalArt.click();
        //проверяем адрес текущей страницы
        String url = driver.getCurrentUrl();
        Assertions.assertEquals(url,"https://www.ifitshipitshere.com/category/art/digital-art/");
    }
}
