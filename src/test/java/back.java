import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class back {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa.retailservices.audi.de/ccsrdpsmt-int/frontend/v1/?token=11231123-2231-1231-1232-233123312332");
        driver.findElement(By.xpath("//h4[text()='Orders']")).click();
        WebElement hidebox=driver.findElement(By.xpath("//button[text()='Hide filter bar']"));
        hidebox.click();
        Thread.sleep(1000);
        WebElement menubar=driver.findElement(By.xpath("//tr[@data-testid='orders-table-head']"));
        menubar.click();
        System.out.println("search boxes should be disable:"+menubar.isEnabled());
        driver.findElement(By.xpath("//button[@data-testid='export-menu']")).click();
        driver.findElement(By.xpath("//span[text()='Export all orders']")).click();
        WebElement popup=driver.findElement(By.xpath("//section[@data-testid='export-modal_modal-body']"));
       System.out.println(popup.isDisplayed());
       System.out.println(popup.getText());
       WebElement button=driver.findElement(By.xpath("//button[@aria-label='close']"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        WebElement text=driver.findElement(By.xpath("//h2[text()='Requests and orders']"));
        System.out.println(text);
        Assert.assertEquals("Requests and orders",text);






    }

}
