package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocartpage extends BasePage{
    private final By addToCartButton= By.xpath("//button[text()='ADD TO CART']");

    private final By clickOnCart=By.xpath("//*[@data-icon='shopping-cart']");
    private final By backButton=By.xpath("//button[text()='<- Back']");

    public void addtocart(){
        click(addToCartButton);
    }
    public void cart(){
        click(clickOnCart);
    }

    public void back(){
        click(backButton);

    }
}
