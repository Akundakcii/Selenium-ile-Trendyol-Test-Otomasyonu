
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver=driver;
    }
public WebElement find(By Locator){
        return driver.findElement(Locator);
}
public void click(By Locator){
        find(Locator).click();
}
public  void write(String text,By Locator){
        find(Locator).sendKeys(text);

}
    public List<WebElement> findAll(By Locator){

        return driver.findElements(Locator);
    }
    public Boolean isDisplay(By Locator){

        return find(Locator).isDisplayed();
    }
}
