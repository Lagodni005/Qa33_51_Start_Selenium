import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork1 {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    @Test
    public void cssLocators(){
        //by tagName
        WebElement PHONEBOOK = wd.findElement(By.tagName("h1"));
        WebElement HOME = wd.findElement(By.tagName("a"));
        WebElement Email = wd.findElement(By.tagName("input"));
        WebElement LogReg = wd.findElement(By.tagName("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));

        //by class
        WebElement container = wd.findElement(By.className("container"));
        WebElement DivNavbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement active = wd.findElement(By.className("active"));

        //by id
        WebElement root = wd.findElement(By.id("root"));

        //by attribute
        WebElement InputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement InputPassword = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement InputLogin = wd.findElement(By.cssSelector("[name='login']"));
        WebElement InputRegistration = wd.findElement(By.cssSelector("[name='registration']"));


        // one of elements find by attribute ==> start & end & contains value

        // By start
        WebElement password2 = wd.findElement(By.cssSelector("[placeholder^='Pass']"));
        // By end
        WebElement password3 = wd.findElement(By.cssSelector("[placeholder $='word']"));
        // by contains
        WebElement password4 = wd.findElement(By.cssSelector("[placeholder *='swor']"));
    }
}
