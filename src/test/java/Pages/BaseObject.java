package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseObject {
    WebDriver driver;
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tihon\\Desktop\\Новая папка\\chromedriver.exe");
        driver=new ChromeDriver();
    }
}
