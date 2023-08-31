import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;


public class ProductAdd extends BasePage{
    private final By buttonLoginLocator = new By.ByCssSelector("button[component-id='1']");


    public ProductAdd(WebDriver driver) {
        super(driver);
    }


    public void SepetEkle(){

       Set<String> windowAllWindows = driver.getWindowHandles();

       for(String window : windowAllWindows){
           driver.switchTo().window(window);
       }
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        try {
            Thread.sleep(1900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
  click(buttonLoginLocator);

    }


}
