package pages;

import org.openqa.selenium.By;

public class Addreespage extends BasePage {
    private final By fristName= By.id("first-name");
    private final By lastName=By.id("last-name");
    private final By postalCode=By.id("postal-code");
    private final By countineButton=By.xpath("//input[@value='CONTINUE']");

    public void fristnameSendKeys(String name){
        sendKeys(fristName,name);
    }
    public void lastnameSendKeys(String name){
        sendKeys(lastName,name);
    }
    public void postalcodeSendKeys( int num){
        sendKeys(postalCode, String.valueOf(num));
    }
    public void  countine(){
        click(countineButton);
    }
}
