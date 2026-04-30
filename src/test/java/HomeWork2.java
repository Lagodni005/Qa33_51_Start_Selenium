import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork2 {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void Xpath(){
        // by tag name
        WebElement elm1 = wd.findElement(By.xpath("//div"));
        WebElement elm2 = wd.findElement(By.xpath("//input"));
        WebElement elm3 = wd.findElement(By.xpath("//h1"));
        WebElement elm4 = wd.findElement(By.xpath("//a"));
        WebElement elm5 = wd.findElement(By.xpath("//button"));
        WebElement elm6 = wd.findElement(By.xpath("//br"));

        // by class
        WebElement elm7 = wd.findElement(By.xpath("//div[@class='container']"));
        WebElement elm8 = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));
        WebElement elm9 = wd.findElement(By.xpath("//a[@class='active']"));
        WebElement elm10 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        // by id
         WebElement elm11 = wd.findElement(By.xpath("//*[@id='root']"));
         WebElement elm12 = wd.findElement(By.cssSelector("#root"));


         // by attribute
        WebElement elm13 = wd.findElement(By.xpath("//a[@href='/home']"));
        WebElement elm14 = wd.findElement(By.xpath("//a[@href='/about']"));
        WebElement elm15 = wd.findElement(By.xpath("//a[@href='/login']"));
        WebElement elm16 = wd.findElement(By.xpath("//input[@name='email']"));
        WebElement elm17 = wd.findElement(By.xpath("//input[@name='password']"));
        WebElement elm18 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement elm19 = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement elm20 = wd.findElement(By.xpath("//button[@name='login']"));
        WebElement elm21 = wd.findElement(By.xpath("//button[@name='registration']"));

        // one of elements find by attribute ==> start & end & contains value
        WebElement el19 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));
        WebElement el21 = wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));
        WebElement el20 = wd.findElement(By.xpath("//input[contains(@placeholder,'a')]"));
    }
}
