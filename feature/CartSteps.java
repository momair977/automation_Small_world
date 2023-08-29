package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ProductsPage;
import utils.DriverFactory;

public class CartSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private ProductsPage productsPage = new ProductsPage(driver);

    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
        // Navigate to the products page
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    @When("I add product number {int} to the cart")
    public void iAddProductToTheCart(int productIndex) {
        productsPage.clickAddToCart(productIndex);
    }

    @And("I open the cart")
    public void iOpenTheCart() {
        productsPage.clickCartIcon();
    }

    @Then("I should see {int} item(s) in the cart")
    public void iShouldSeeItemsInTheCart(int expectedItemCount) {
        int actualItemCount = productsPage.getCartBadgeCount();
        Assert.assertEquals(actualItemCount, expectedItemCount);
    }

    @And("I remove all items from the cart")
    public void iRemoveAllItemsFromTheCart() {
        // Implement the logic to remove items from the cart
    }

    @Then("The cart should be empty")
    public void theCartShouldBeEmpty() {
        int actualItemCount = productsPage.getCartBadgeCount();
        Assert.assertEquals(actualItemCount, 0);
    }
}
