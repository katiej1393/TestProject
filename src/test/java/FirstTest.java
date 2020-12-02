import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void renewPassword(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgot Password")).click();
        WebElement changeEmail = driver.findElement(By.id("email"));
        changeEmail.sendKeys("testemail@gmail.com");
        driver.findElement(By.id("form_submit")).click();
        driver.close();
    }

}
