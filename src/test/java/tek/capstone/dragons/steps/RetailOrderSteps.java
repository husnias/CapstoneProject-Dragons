package tek.capstone.dragons.steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	//action methods add item
	
	@When("User click on the category dropdown option")
	public void userClickOnTheCategoryDropdownOption() {
	   click(factory.retailOrderPage().alldepartments);
	   logger.info("User click on the category dropdown");
	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		selectByVisibleText(factory.retailOrderPage().alldepartments,string);
	    logger.info("User change the category successfully" );
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
	sendText(factory.retailOrderPage().searchBar, string);
	logger.info("User serach for item successfully");
	  
	}
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrderPage().searchIcon);
		logger.info("User click on search icon successfully");	 
	}
	//add item
	@When("User click on item")
	public void userClickOnItem() throws InterruptedException {
		click(factory.retailOrderPage().productName);
		 Thread.sleep(3000);
		logger.info("user on Item successFully");
	}
	
	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
		clearTextUsingSendKeys(factory.retailOrderPage().quantityNumber);
		selectByIndex(factory.retailOrderPage().quantityNumber,  int1 );		
		logger.info("User select quantity");
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrderPage().addToCardBttn);
		logger.info("User click add to Cart button");
    
	}
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {	
		selectByIndex(factory.retailOrderPage().quantityNumber,  int1 );
		logger.info("the cart icon quantity changed");	
	}
	
	//2 action methods place Order
	
	@When("User change the category to the {string}")
	public void userChangeTheCategoryToThe(String string) {
		selectByVisibleText(factory.retailOrderPage().alldepartments,string);
	    logger.info("User change the category successfully" );
	}
	@When("User search for the item {string}")
	public void userSearchForTheItem(String string) {
		sendText(factory.retailOrderPage().searchBar, string);
		logger.info("User serach for item successfully");		
	}
	@When("User click on the Search icon")
	public void userClickOnTheSearchIcon() {
		click(factory.retailOrderPage().searchIcon2);
		logger.info("User click on search icon successfully");
	}
	
	@When("User click on the item")
	public void userClickOnTheItem() {
	    click(factory.retailOrderPage().imgApexLegends);
	    logger.info("User click on item successfully");
	}
	@When("User select the quantity ‘{int}’")
	public void userSelectTheQuantity(Integer int2) throws InterruptedException {
		clearTextUsingSendKeys(factory.retailOrderPage().quantityNumber);
		selectByIndex(factory.retailOrderPage().quantityNumber,  int2 );
		Thread.sleep(2000);
		logger.info("User select quantity");
	}
	@When("User click add item to Cart button")
	public void userClickAddItemToCartButton() {
		click(factory.retailOrderPage().addToCardBttn);
		logger.info("User click add to Cart button");
	}
	
	@Then("cart icon quantity should change to ‘{int}’")
	public void cartIconQuantityShouldChangeTo(Integer int2) {
		selectByIndex(factory.retailOrderPage().quantityNumber,  int2 );
		logger.info("the cart icon quantity changed");	
	}
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailOrderPage().cartButton);
		logger.info("User click on cart option");		
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.retailOrderPage().procedToChekout);
	    logger.info("User click on Proceed to Checkout button");
	}
	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.retailOrderPage().placeOrderBttn);
	    logger.info("User clicked on Place Your Order button");
	}
	
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.retailOrderPage().orderPlaceMessage);
	    Assert.assertEquals("Order Placed Successfully", factory.retailOrderPage().orderPlaceMessage.getText().trim());
	  logger.info("Order Placed Successfully");		
	}
	
	//3 action method cancel Order

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailOrderPage().orderLink);
		logger.info("User clicked on Orders section");
	    
}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.retailOrderPage().firstItem);
        logger.info("User clicked on first order in list");

    
}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.retailOrderPage().cancelTheOrderBtn);
		logger.info("User clicked on Cancel The Order button");
    
}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		selectByVisibleText(factory.retailOrderPage().cancelationReason, string); 
		logger.info("User selected the cancellation reason 'Bought wrong item'");
    
	}
	
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailOrderPage().cancelOrderButtn);
        logger.info("User clicked on Cancel Order button");
    
}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		String expectedMessage = "Your Order Has Been Cancelled";
        String actualMessage = getText(factory.retailOrderPage().cancelledMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
        logger.info("Cancellation message displayed correctly");   
}
	//4 action method Return Order
	
	@When("User click on first order in the list")
	public void userClickOnFirstOrderInTheList() {
		click(factory.retailOrderPage().firstItemOnTheList);
		logger.info("User click on first order in the list");
	   
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() throws InterruptedException {
	    click(factory.retailOrderPage().returnItemsButn);
	    Thread.sleep(3000);
	    logger.info("User click on Return Items button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.retailOrderPage().resonToReturnItem, string); 
		logger.info("User selected the return reason as 'Item damaged");
	   
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.retailOrderPage().returnDropOff, string); 
		logger.info("User selected the drop off service as 'FedEx'");
	    
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.retailOrderPage().ReturnOrdersubBtn);
	    logger.info("User clicked on Return Order button");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		waitTillPresence(factory.retailOrderPage().returnOrderMessage);
	    Assert.assertEquals("Return was successfull", factory.retailOrderPage().returnOrderMessage.getText().trim());
	  logger.info("Return was successfull");
	}
	
	// action method Review Order
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailOrderPage().reviewBttn);
		logger.info("User click on Review button");
	    
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
	    sendText(factory.retailOrderPage().headline, string);
	    sendText(factory.retailOrderPage().reviewText, string);
	    logger.info("User writes review headline and text");
	    
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.retailOrderPage().reviewSubmitBttn);
	    logger.info("User click Add your Review button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		waitTillPresence(factory.retailOrderPage().reviewMassege);
	    Assert.assertEquals("Your review was added successfully", factory.retailOrderPage().reviewMassege.getText().trim());
	  logger.info("review was added successfully");
	}
}
