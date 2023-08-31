
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestFullActions extends BaseTest {



    @Test
    @Order(1)

    public void Giris() {

        ProductSearch productSearch = new ProductSearch(driver);
       ProductsGet productsGet = new ProductsGet(driver);
        productSearch.setGiris("Bot");
        Assertions.assertTrue(productsGet.isProducts(),"Ürünler Bulunamadı");


    }
    @Test
    @Order(2)
    public void products_search(){
        ProductsGet productsGet = new ProductsGet(driver);
        productsGet.search(2);



    }

@Test
    @Order(3)
    public  void sepetekleme(){
        ProductAdd ProductAdd = new ProductAdd(driver);
        AssertionPage assertionPage = new AssertionPage(driver);
        ProductAdd.SepetEkle();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    Assertions.assertTrue(assertionPage.isProductCountUp(),"Ürün Sepete eklenmedi");
}

    @Test
    @Order(4)
    public  void sepet(){

        ProductToBasket ProductToBasket = new ProductToBasket(driver);
        ProductToBasket.click_sepet();


    }


}



