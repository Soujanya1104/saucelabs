package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    private final By Logintextfeild=By.id("user-name");
    private final By passwordtextfeild=By.id("password");
    private final By loginbutton=By.id("login-button");

    public void sendkeyslogintextfield(String value){
        explictwait(Logintextfeild);
        sendKeys(Logintextfeild,value);
    }
    public void sendkeyspasswordfeild(String value){
        sendKeys(passwordtextfeild,value);
    }
    public void loginbuttonclick(){

        click(loginbutton);
    }




    }


