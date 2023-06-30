package pages;

import org.openqa.selenium.By;

public class OverviewPage extends BasePage {
    private final By finishButton= By.xpath("//a[text()='FINISH']");
    private final By orderConfirmationPage=By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public void finish(){
        click(finishButton);
    }
    public void orderconfirmation(){

        gettext(orderConfirmationPage);
    }

}
