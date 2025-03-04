import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aaa {
	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ulta.com/");
		driver.manage().window().maximize();


	


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//div[@class=\"FavoritesUtilityLink\"]")).click();
		driver.findElement(By.xpath("(//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default\"])[2]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("ASH");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("MD");
		driver.findElement(By.xpath("//input[@name=\"emailAddress\"]")).sendKeys("ASH26@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Gh@427826");
		driver.findElement(By.xpath("//input[@name=\"dateOfBirth\"]")).sendKeys("02/04");
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name=\"state\"]"));
		Select dropdown = new Select(dropdownElement);
		String visibleText = "NJ - New Jersey"; 
		driver.findElement(By.xpath("//input[@name=\"loyaltyOptIn\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--unstyled pal-c-Button--default OverlayFlyoutHeader__close\"]")).click();



		driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[1]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.ulta.com/shop/makeup/lips/lipstick\"]")).click();
		driver.findElement(By.xpath("//a[@href='https://www.ulta.com/p/macximal-silky-matte-lipstick-pimprod2043558?sku=2621406']")).click();

	driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default AddToBagButton__AddToBag\"]")).click();




		//WebElement addToCartButton = driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[10]"));


//		driver.findElement(By.xpath("(//span[@class=\"Swatch__image\"])[7]")).click();
//		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]"));
		WebElement ViewBag = driver.findElement(By.xpath("(//div[@class=\"ActionGroup__link\"])[1]"));
		ViewBag.click();


		WebElement checkoutButton = driver.findElement(By.linkText("Checkout"));
		checkoutButton.click();
		WebElement checkoutAsGuest = driver.findElement(By.linkText("CHECKOUT AS GUEST"));
		checkoutAsGuest.click();

		//		WebElement FirstName= driver.findElement(By.name("firstName"));
		//		WebElement LastName = driver.findElement(By.name("lastName"));
		//		WebElement AddressField = driver.findElement(By.name("address1"));
		//		WebElement City = driver.findElement(By.name("city"));
		//
		//		FirstName.sendKeys("Haseena");
		//		LastName.sendKeys("Md");
		//		AddressField.sendKeys("Madikonda");
		//		City.sendKeys("HYD");


}
}
