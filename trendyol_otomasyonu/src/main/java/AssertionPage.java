import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssertionPage extends BasePage{

    By cartCountLocator = new By.ByClassName("basket-item-count-container");


    public AssertionPage(WebDriver driver) {
        super(driver);
    }
    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }



    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }


}
