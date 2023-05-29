package swaglabs.stepdefinitions;

import io.cucumber.java.en.When;
import swaglabs.actions.catalog.InventoryActions;
import swaglabs.actions.navigation.NavigateActions;

public class CatalogStepDefinitions {

    NavigateActions navigate;

    InventoryActions inventoryActions;

    @When("Colin/he is browsing the product catalog")
    public void browsingTheCatalog() {
        navigate.toInventoryPage();
    }

    @When("Colin/he has opened the product details for {string}")
    public void opensProductDetails(String productName) {
       inventoryActions.viewDetailsFor(productName);
    }
}
