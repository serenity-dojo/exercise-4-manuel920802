package swaglabs.actions.catalog;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;

public class ProductDetailsActions extends UIInteractionSteps {

    @Step("Add the current item to the cart")
    public void addToCart(){
        find(Button.withText("Add to cart")).click();
    }
}
