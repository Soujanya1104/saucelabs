package Utils;

import org.testng.annotations.DataProvider;

public class Dataprovider {
    @DataProvider
   public static Object[][] Testdata(){
       return new Object[][]{{"standard_user","secret_sauce"}};

    }
    @DataProvider
    public static Object[][] AddressTestdata(){
        return new Object[][]{{"ishhan","ishaan",1234}};
    }
}
