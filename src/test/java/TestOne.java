import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverClass;

public class TestOne extends DriverClass {



    @Test
    @SneakyThrows
    public void getTestOne(){
    //    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.get("https://www.google.com/");

        driver.findElement(By.tagName("textarea")).sendKeys("........");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/span"));
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();



        driver.quit();
    }





}
