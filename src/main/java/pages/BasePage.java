package pages;

import Utils.Drivermanager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Drivermanager {
    public void sendKeys(By element,String value){
       driver.findElement(element).sendKeys(value);

    }
    public void click(By element){
        driver.findElement(element).click();
    }
    public void explictwait(By element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void gettext(By element){
        driver.findElement(element).getText();
    }

}
