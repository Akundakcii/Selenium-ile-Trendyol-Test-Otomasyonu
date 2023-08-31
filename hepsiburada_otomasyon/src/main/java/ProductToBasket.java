import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProductToBasket extends BasePage{

    private final By sepetim = new By.ByClassName("i-bagg-orange");

    public ProductToBasket(WebDriver driver) {
        super(driver);
    }
public void click_sepet(){

        click(sepetim);
}



}
