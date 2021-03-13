package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class testConfig {
    public String SITE_URL1 = "https://postnauka.ru/";
    public String SITE_URL2 = "https://www.boredpanda.com/";
    public String SITE_URL3 = "https://www.ifitshipitshere.com/";
    public String SITE_URL4 = "https://www.kinopoisk.ru";
    public WebDriver driver;
    public WebDriverWait waitFiveSeconds;

    //данные для сайта номер 2 ,акк тестовый, так что - это безопасно
    public String Email = "test.01.01.02@mail.ru";
    public String Password = "IPMR3p1apu=x";
    //данные для сайта номер 4
    public String searchItem = "Интерстеллар";

    @BeforeEach

    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitFiveSeconds = new WebDriverWait(driver, 5);
    }

//    @AfterEach
//    public void finish(){
//        driver.close();
//        driver.quit();
//    }

}
