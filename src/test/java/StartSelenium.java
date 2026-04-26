import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class StartSelenium {

    WebDriver wd;

    @Test
    public void Test(){
        wd = new ChromeDriver();
        //wd.get("https://www.bybit.com/trade/usdt/BTCUSDT"); // without history
        wd.navigate().to("https://www.bybit.com/trade/usdt/BTCUSDT");// with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close(); //only one tab if tab only one & close browser
        wd.quit(); //  all tabs and close browser
    }
}
