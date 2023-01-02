package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumLogIn {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://https://www.amazon.com");
       // Thread.sleep(3000);
        WebElement userName=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement clickBtn=driver.findElement(By.xpath("//input[@class='button']"));

        userName.sendKeys("aaaaaa");
        password.sendKeys("aaaaaa");
        clickBtn.click();    //tagName[@attribute='value']

        WebElement errorMes= driver.findElement(By.className("error"));
        String expectedErrorMsg= errorMes.getText();
        System.out.println("expected error mes: "+ expectedErrorMsg );

        if(expectedErrorMsg.equals("An internal error has occurred and has been logged.")){
            System.out.println("Pass");
        }
    //    driver.navigate().back();
    //    driver.navigate().forward();
    //    driver.navigate().refresh();

    }
}
