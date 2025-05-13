package FireFox;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purecode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver ash=new ChromeDriver();
		ash.get("https://www.100percentpure.com");
		ash.manage().window().maximize();
		ash.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		ash.findElement(By.id("onetrust-accept-btn-handler")).click();
		try {

			ash.findElement(By.xpath("//button[@class=\"needsclick klaviyo-close-form go1982198487 kl-private-reset-css-Xuajs1\"]")).click();
		}
		catch(Exception e) {
		}


		//create account


		ash.findElement(By.xpath("//li[@class=\"header-account\"]")).click();
		ash.findElement(By.xpath("//div[@class=\"account-create-account\"]")).click();
		ash.findElement(By.xpath("//input[@name=\"customer[first_name]\"]")).sendKeys("haseena");
		ash.findElement(By.xpath("//input[@name='customer[last_namee]']")).sendKeys("MD");
		ash.findElement(By.xpath("//input[@name='customer[email]']")).sendKeys("Ash@gmail.com");
		ash.findElement(By.xpath("//input[@name='customer[password]']")).sendKeys("267842");
		ash.findElement(By.xpath("//button[@class=\"button hover-animation leader\"]")).click();

		// register
		ash.findElement(By.xpath("//li[@class=\"header-account\"]")).click();
		ash.findElement(By.xpath("//input[@name=\"customer[email]\"]")).sendKeys("Ash@gmail.com");
		ash.findElement(By.xpath("//input[@name=\"customer[password]\"]")).sendKeys("267842");
		ash.findElement(By.xpath("//button[@class=\"button hover-animation leader\"]")).click();


		//		//log
		WebElement H=	ash.findElement(By.xpath("//div[@class=\"header-logo\"]"));

		if (H.isDisplayed()) {
			System.out.println("Homepage log element is present.");
		} else {
			System.out.println("Homepage log element is not present.");
		}


		//search button present or not
		WebElement ash1=ash.findElement(By.xpath("//li[@id=\"desktopSearch\"]"));
		boolean isButtonEnabled = ash1.isEnabled();
		if(isButtonEnabled)
		{
			System.out.println("Search button is present");
		}else {
			System.out.println("Search button is  not present");
		}



		//search product and add to cartt

		ash.findElement(By.xpath("//button[@class=\"header-search-submit header-search-submit--minimal\"]")).click();
		ash.findElement(By.xpath("(//input[@data-search-types=\"product,article,\"])[1]")).sendKeys("Multi-Vitamin");
		ash.findElement(By.xpath("//img[@src=\"https://www.100percentpure.com/cdn/shop/files/1FMVPMT_Multi_Vitamin_Cream_Primary_300x300.jpg?v=1696452642\"]")).click();
		WebElement cart=ash.findElement(By.xpath("//span[@class=\"button-text add to carttt\"]"));
		cart.click();

		boolean isButtonclicked = cart.isEnabled();
		if(isButtonclicked)
		{
			System.out.println("Search button is clicked");

		}else {
			System.out.println("Search button is  not clicked");
		}

		ash.findElement(By.xpath("//div[@class=\"cart-close-icon-wrapper\"]")).click();

		JavascriptExecutor js=(JavascriptExecutor)ash;
		for(int i=0;i<500;i +=10)
		{
			js.executeScript("window.scrollBy(0, 40)");

		}

		//2nd product
		ash.findElement(By.xpath("//img[@src='https://www.100percentpure.com/cdn/shop/products/1FBOCB_Blood_Orange_Cleansing_Balm_Primary_1024x.jpg?v=1696526483']")).click();
		ash.findElement(By.xpath("//span[@class='button-text add to carttt']")).click();
		ash.findElement(By.xpath("//div[@class=\"cart-close-icon-wrapper\"]")).click();


		ash.findElement(By.xpath("//img[@src=\"https://www.100percentpure.com/cdn/shop/products/1HCBCBO_Blood_Orange_Hand_Buttercream_Primary_8415eeb5-558d-4462-a955-dd7550b05582_1024x.jpg?v=1650483245\"]")).click();
		ash.findElement(By.xpath("//span[@class='button-text add to carttt']")).click();
		ash.findElement(By.xpath("//div[@class=\"cart-close-icon-wrapper\"]")).click();

		ash.findElement(By.xpath("//img[@src=\"https://www.100percentpure.com/cdn/shop/files/1CBBP_Bamboo_Blur_Powder_Original_Primary_1024x.jpg?v=1695870773\"]")).click();
		ash.findElement(By.xpath("//span[@class='button-text add to carttt']")).click();
		ash.findElement(By.xpath("//div[@class=\"cart-close-icon-wrapper\"]")).click();

		ash.findElement(By.xpath("//button[@class=\"header-search-submit header-search-submit--minimal\"]")).click();
		ash.findElement(By.xpath("(//input[@data-search-types=\"product,article,\"])[1]")).sendKeys("Fruit Pigmented® Pomegranate Oil Moisturizing Lipstick");
		ash.findElement(By.xpath("//img[@src=\"https://cdn.shopify.com/s/files/1/0648/1955/products/1CPLPE_Fruit_Pigmented_C2_AE_Pomegranate_Oil_Anti_Aging_Lipstick__Peony_Primary.png?v=1705338324\"]")).click();


		ash.findElement(By.xpath("//button[@class=\"button button-secondary test\"]")).click();
		ash.findElement(By.xpath("//div[@class=\"cart-close-icon-wrapper\"]")).click();


		//view cart
		ash.findElement(By.xpath("//li[@class='header-cart']")).click();
		List<WebElement> cartItems = ash.findElements(By.xpath("//span[@class=\"header-cart-count\"]")); 

		if (cartItems.isEmpty()) {
			System.out.println("The cart is empty.");
		} else {
			System.out.println("The cart is  not empty");
			for (WebElement item : cartItems) {
				String productSize = item.findElement(By.xpath("//span[@class=\"header-cart-count\"]")).getText();
				System.out.println("Size: " + productSize);
			}

		}

		//forget Password

		ash.findElement(By.xpath("//li[@class=\"header-account\"]")).click();

		WebElement Forgot=ash.findElement(By.xpath("//button[@aria-label=\"Forgot your password?\"]"));
		Forgot.click();


		boolean isButtonPresent = Forgot.isEnabled();
		if( isButtonPresent)
		{
			System.out.println("FogotPassword button is Present");

		}else {
			System.out.println("FogotPassword button is  not Present");
		}
		ash.findElement(By.xpath("//input[@id=\"recover-email\"]")).sendKeys("Ash@gmail.com");
		ash.findElement(By.xpath("(//span[@class=\"button-text\"])[3]")).click();


		//Header 

		WebElement header = ash.findElement(By.xpath("//a[@data-navigation-dropdown='shop']"));

		header.click();

		System.out.println("Header text: " + header.getText());

		List<WebElement> sublinks = ash.findElements(By.xpath("//*[@id=\"navigation-super-0\"]")); 

		for (WebElement sublink : sublinks) {
			sublink.click();
			System.out.println("Clicking sublink: " + sublink.getText());

			ash.navigate().back();

		}


		//order
		ash.findElement(By.xpath("//button[@class='btn hover-animation cart-button-checkout']")).click();
		WebElement checkout=ash.findElement(By.xpath("//div[@class=\"nfgb6p1 nfgb6p0 _1fragem2s nfgb6p3\"]"));
		System.out.println("Amount: "
				+ checkout.getText());
	}
}

