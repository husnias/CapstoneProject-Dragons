package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;
//in this class we create the action methods.
public class RetailHomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	  click(factory.retailHomePage().allOptions);
	  logger.info("User click on All sections");
	}
	

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	    
	}
		
	
	//secondscenario
	String department;    
	
	
	@When("User is on {string}")
	public void userIsOn(String department ) {
		
		switch(department) {
		case"Electronics":
			Assert.assertTrue(isElementDisplayed(factory.retailHomePage().electronics));
			 logger.info("user is on Electronics section");
	            break;
	        case "Computers":
	            Assert.assertTrue(isElementDisplayed(factory.retailHomePage().computer));
	            logger.info("user is on Computers section");
	            break;
	        case "Smart Home":
	            Assert.assertTrue(isElementDisplayed(factory.retailHomePage().smartHome));
	            logger.info("user is on Smart Home section");
	            break;
	        case "Sports":
	            Assert.assertTrue(isElementDisplayed(factory.retailHomePage().sports));
	            logger.info("user is on Sports section");
	            break;
	        case "Automotive":
	            Assert.assertTrue(isElementDisplayed(factory.retailHomePage().automative));
	            logger.info("user is on Automotive section");
	            break;
	        default:
	            throw new IllegalArgumentException("Invalid section name: " + department);
	    }
		this.department = department;
	}
		

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	   List<Map<String, String>> options = dataTable.asMaps(String.class, String.class);
	   
	   for(Map<String, String> option :options) {
		   String optionOne = option.get("optionOne");
		   String optionTwo = option.get("optionTwo");
		   
		   switch(this.department) {
		   case"Electronics":
			   String tvAndVideo = getText(factory.retailHomePage().tvAndVideo);
			   String videoGames = getText(factory.retailHomePage().videoGame);
               Assert.assertEquals(tvAndVideo, optionOne);
               Assert.assertEquals(videoGames, optionTwo);
               logger.info(optionOne + " and " + optionTwo + " options are present in " + this.department + " department");
               break;
		   case "Computer":
			   String Accessories = getText(factory.retailHomePage().accessories);
			   String Networking = getText(factory.retailHomePage().netWorking);
			   Assert.assertEquals(Accessories, optionOne);
               Assert.assertEquals(Networking, optionTwo);
               logger.info(optionOne + " and " + optionTwo + " options are present in " + this.department + " department");
               break;
		   case "Smart Home":
			   String SmartHomeLightning = getText(factory.retailHomePage().smartHomeLightning);
			   String PlugsandOutlets = getText(factory.retailHomePage().plugsAndOutlets);
			   Assert.assertEquals(SmartHomeLightning, optionOne);
               Assert.assertEquals(PlugsandOutlets, optionTwo);
               logger.info(optionOne + " and " + optionTwo + " options are present in " + this.department + " department");
               break;
		   case "Sports":
			   String AthleticClothing = getText(factory.retailHomePage().athleticClothing);
			   String ExerciseFitness = getText(factory.retailHomePage().exerciesAndFitness);
			   Assert.assertEquals(AthleticClothing, optionOne);
               Assert.assertEquals(ExerciseFitness, optionTwo);
               logger.info(optionOne + " and " + optionTwo + " options are present in " + this.department + " department");
               break;
		   case "Automotive":
			   String AutomativePartsAccessories = getText(factory.retailHomePage().automativePartAccessories);
			   String MotorCyclePowersports = getText(factory.retailHomePage().motorcyclePowersports);
			   Assert.assertEquals(AutomativePartsAccessories, optionOne);
               Assert.assertEquals(MotorCyclePowersports, optionTwo);
               logger.info(optionOne + " and " + optionTwo + " options are present in " + this.department + " department");
               break;
           default:
               throw new IllegalArgumentException("Invalid department name: " + this.department);
       }

		   
	   }


	}
}
