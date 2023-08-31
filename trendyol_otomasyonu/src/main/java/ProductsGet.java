import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsGet extends BasePage{

    private final By productsList = new By.ByClassName("prdct-desc-cntnr-name");
    private final By isAhave = new By.ByClassName("sponsor-info-text");



    public ProductsGet(WebDriver driver) {
        super(driver);


    }

    public void search(int i) {

getAllProducts().get(i).click();


    }
private List<WebElement>getAllProducts(){
        return findAll(productsList);
}


public Boolean isProducts (){

        return isDisplay(isAhave);

    }
}

