package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
    private static Properties propers=new Properties();
    public void loadproperties() throws IOException {
        File file=new File("D:\\Projects\\Projects\\MobileAutomation\\Saucelabs\\src\\main\\resources\\Config.properties");
        FileInputStream fin=new FileInputStream(file);
        propers.load(fin);

    }
    public String getkey(String key){
        return propers.getProperty(key);
    }
}
