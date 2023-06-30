import Utils.Dataprovider;
import Utils.Drivermanager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class Logintest  extends Baseclass{

    @Test(dataProvider= "Testdata",dataProviderClass = Dataprovider.class)
    public void logintest(String username,String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.sendkeyslogintextfield(username);
        loginPage.sendkeyspasswordfeild(password);
        loginPage.loginbuttonclick();
    }
    @Test(dataProvider = "AddressTestdata",dataProviderClass = Dataprovider.class)
    public void Addtocarttest(String name,String lastname,int postalcode) {
        ProductsPage productsPage=new ProductsPage();
        productsPage.productpage();
        Addtocartpage addtocartpage=new Addtocartpage();
        addtocartpage.addtocart();
        addtocartpage.cart();
        Checkoutpage checkoutpage=new Checkoutpage();
        checkoutpage.checkout();
        Addreespage addreespage=new Addreespage();
        addreespage.fristnameSendKeys(name);
        addreespage.lastnameSendKeys(lastname);
        addreespage.postalcodeSendKeys(postalcode);
        addreespage.countine();
        OverviewPage overviewPage=new OverviewPage();
        overviewPage.finish();
        overviewPage.orderconfirmation();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER","overviewPage.orderconfirmation()");

    }
    @Test
    public void backToProductsPage(){
        ProductsPage productsPage=new ProductsPage();
        productsPage.productpage();
        Addtocartpage addtocartpage=new Addtocartpage();
        addtocartpage.back();
        Assert.assertEquals("Products","productsPage.getText()");




    }

    }

