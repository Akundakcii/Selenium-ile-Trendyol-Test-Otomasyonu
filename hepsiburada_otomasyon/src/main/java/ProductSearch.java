import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearch extends BasePage{


    private final By girisFramework = By.id("Combined-Shape");
    private final By cookies = By.id("onetrust-accept-btn-handler");
    private final By searchClick = new By.ByClassName("cyrzo7gC");
    private final By searchBarLocator =new By.ByClassName("V8wbcUhU");



    public ProductSearch(WebDriver driver) {
        super(driver);
     // driver.get("https://www.hepsiburada.com/");
    }




public void setGiris(String search){

  click(girisFramework);
  click(cookies);
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    write(search, searchBarLocator);
    click(searchClick);

}



}
