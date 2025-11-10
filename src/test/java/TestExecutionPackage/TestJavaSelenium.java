package TestExecutionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestJavaSelenium {
    @Test
    public void testMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("mgadigii@yahoo.co.in");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void dropdownPractise() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        WebElement we = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(we);
        System.out.println("to demonstrate select by index");
        selectByIndex(dropdown, 2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        System.out.println("to demonstrate select by value");
        selectByValue(dropdown, "INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        System.out.println("to demonstrate select by visible text");
        selectByVisibleText(dropdown, "AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        driver.quit();
    }

    public static void selectByIndex(Select dropdown, int i) {
        dropdown.selectByIndex(i);
    }

    public static void selectByValue(Select dropdown, String value) {
        dropdown.selectByValue(value);
    }

    public static void selectByVisibleText(Select dropdown, String value) {
        dropdown.selectByVisibleText(value);
    }

    @Test
    public void AddPassenger_dropdown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // to check the passenders multiple time we use while loop / for loop
        driver.findElement(By.cssSelector(".paxinfo")).click();
        int i = 1;
        while (i < 5) {
            {
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
                i++;
            }



        }
        driver.quit();
    }
}

