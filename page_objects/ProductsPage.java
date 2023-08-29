package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    private By addToCartButtons = By.cssSelector(".btn_inventory");
    private By cartIcon = By.className("shopping_cart_badge");
    private By cartBadge = By.className("shopping_cart_badge");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart(int productIndex) {
        driver.findElements(addToCartButtons).get(productIndex).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public int getCartBadgeCount() {
        return Integer.parseInt(driver.findElement(cartBadge).getText());
    }
}
