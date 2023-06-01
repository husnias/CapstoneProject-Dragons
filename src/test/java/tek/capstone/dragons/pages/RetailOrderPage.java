package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
		
	//1.scenario  loctaors add item
	
	@FindBy(xpath= "//select[@id='search']")
	public WebElement alldepartments;
	
	@FindBy(xpath="//option[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath= "//input[@id='searchInput']")
	public WebElement searchBar;
	
	@FindBy(xpath= "//button[@id='searchBtn']")
	public WebElement searchIcon;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement itemImage;
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement productName;
	
	@FindBy(css= "select[class='product__select']")
	public WebElement quantityNumber;
	
	 @FindBy(xpath="//span[@id='cartQuantity']")
	 public WebElement cartQuantity;
	
	@FindBy(xpath= "//button[@id='addToCartBtn']")
	public WebElement addToCardBttn;
	
	@FindBy(xpath="//p[@class='product__cart-exists']")
	public WebElement productExists;
	
	
	
	
	//locators for place Order
	
	@FindBy(xpath= "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement imgApexLegends;
	
	@FindBy(xpath= "//button[@id='searchBtn']")
	public WebElement searchIcon2;
	
	@FindBy(xpath="//div[@id='cartBtn']")
	public WebElement cartButton;
	
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement procedToChekout;
	
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath="//div[text()='Order Placed Successfully']")
	public WebElement orderPlaceMessage;
	
	// locators for cancel order
	
	@FindBy(id ="orderLink")
	public WebElement orderLink;
	
	@FindBy(xpath= "//p[text()='Show Details']")
	public WebElement firstItem;
	
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement  cancelTheOrderBtn;
	
	@FindBy(xpath= "//select[@id='reasonInput']")
	public WebElement cancelationReason;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement cancelOrderButtn;
	
	@FindBy(xpath=("//p[text()='Your Order Has Been Cancelled']"))
	public WebElement cancelledMessage;
	
	// locators for return order
	
	@FindBy(xpath= "//p[text()='Show Details']")
	public WebElement firstItemOnTheList;
	
	@FindBy(xpath= "//button[@id='returnBtn']")
	public WebElement returnItemsButn;
	 
	@FindBy(xpath= "//select[@id='reasonInput']")
	public WebElement resonToReturnItem;
	
	@FindBy(xpath= "//select[@id='dropOffInput']")
	public WebElement returnDropOff;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement ReturnOrdersubBtn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnOrderMessage;
	
	// locators for review order
	
	@FindBy(xpath= "//button[@id='reviewBtn']")
	public WebElement reviewBttn;
	
	@FindBy(xpath= "//input[@id='headlineInput']")
	public WebElement headline;
	
	@FindBy(xpath= "//textarea[@id='descriptionInput']")
	public WebElement reviewText;
	
	@FindBy(xpath= "//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitBttn;
	
	@FindBy(xpath= "//div[text()='Your review was added successfully']")
	public WebElement reviewMassege;
	
	
	
	
}
	
