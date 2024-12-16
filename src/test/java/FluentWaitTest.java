import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utils.DriverClass;

import java.time.Duration;

public class FluentWaitTest extends DriverClass {
    @Test
    public void runFluentWait() {
    Wait<WebDriver> fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofMinutes(1))
            .pollingEvery(Duration.ofSeconds(20))
            .ignoring(NoSuchElementException.class);

        WebElement element = fluentWait.until(driver -> driver.findElement(By.id("APjFqb")));
        element.sendKeys("webdriver");
        element.submit();
    }
}
