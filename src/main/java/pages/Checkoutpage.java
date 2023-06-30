package pages;

import org.openqa.selenium.By;

public class Checkoutpage extends BasePage {
    private final By checkOutButton= By.xpath("//a[text()='CHECKOUT']");

    public void checkout(){
        click(checkOutButton);

    }


}
