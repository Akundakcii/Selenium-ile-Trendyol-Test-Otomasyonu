
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
   protected WebDriver driver;
@BeforeAll
public void setUp(){
    System.setProperty("webdriver.chorome.driver","drivers/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://www.trendyol.com/");
driver.manage().window().maximize();
    System.out.println("Test Basladı");
}

}
