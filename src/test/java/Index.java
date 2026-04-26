import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Pavlova/Downloads/21.index%201.html");
    }

    @Test
    public void tableTest(){
        // Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators(){
        // by tagName
     WebElement el = wd.findElement(By.tagName("Button"));
     WebElement button1 = wd.findElement(By.cssSelector("Button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        // by class
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));
        List<WebElement> navList = wd.findElements(By.className("nav-item"));
        List<WebElement> navList2 = wd.findElements(By.cssSelector(".nav-item"));

        // by id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        // by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        // By start
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));
        // By end
        WebElement inputEmail2= wd.findElement(By.cssSelector("[placeholder $='name']"));
        // contains
        WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder *='your']"));

        WebElement a3 = wd.findElement(By.cssSelector("[href='#item3']"));
        //by name

        WebElement inputS = wd.findElement(By.cssSelector("[name]"));
        WebElement inputS1 = wd.findElement(By.name("surename"));

        // By.linkText && By.partialLinkText

    }
}
