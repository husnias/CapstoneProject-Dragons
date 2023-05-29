package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;


public class RetailHomePage extends BaseSetup {

	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);		
	}
	// to finds elemnts we need @FindBy annotaion from Selenuim 
	//we write our locators here 
	
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;
	
	@FindBy(id= "signinLink")
	public WebElement signinBttn;
	
	@FindBy(xpath= "//span[text()='All']")
	public WebElement allOptions;
	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronics;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement computer;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sports;
			
    @FindBy(xpath="//span[text()='Automative']")
    public WebElement automative;
    
  //senario2
    
    @FindBy(xpath="//span[text()='TV & Video']")
    public WebElement tvAndVideo;
    
    @FindBy(xpath="//span[text()='Video Games']")
    public WebElement videoGame;
    
    @FindBy(xpath="//span[text()='Accessories']")
    public WebElement accessories;
    
    @FindBy(xpath="//span[text()='Networking']")
    public WebElement netWorking;
    
    @FindBy(xpath="//span[text()='Smart Home Lightning']")
    public WebElement smartHomeLightning;
    
    @FindBy(xpath="//span[text()='Plugs and Outlets']")
    public WebElement plugsAndOutlets;
    
    @FindBy(xpath="Athletic Clothing")
    public WebElement athleticClothing;
    
    @FindBy(xpath= "Exercise & Fitness")
    public WebElement exerciesAndFitness;
    
    @FindBy(xpath= "//span[text()='Automative Parts & Accessories']")
    public WebElement automativePartAccessories;
    
    @FindBy(xpath= "MotorCycle & Powersports")
    public WebElement motorcyclePowersports;
    
    
}
