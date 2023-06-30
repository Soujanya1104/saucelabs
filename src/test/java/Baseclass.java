import Utils.Drivermanager;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Baseclass {
    @BeforeTest
    public void driverinti() throws IOException {
        Drivermanager drivermanager=new Drivermanager();
        drivermanager.driverlaunch();

    }
}
