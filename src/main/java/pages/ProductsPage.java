package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    private final By clickProduct= By.xpath("//a[@id='item_1_title_link']");
    private final By pageTitle=By.xpath("//div[text()='Products']");

    public void productpage(){
        explictwait(clickProduct);
        click(clickProduct);
    }
    public void getText(){
        gettext(pageTitle);
    }
}
