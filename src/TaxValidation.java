import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaxValidation {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://practice.automationtesting.in/shop/");

		driver.manage().window().maximize();

		driver.findElement(By.id("menu-item-40")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@class='woocommerce-LoopProduct-link'])[3]")).click();

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		Thread.sleep(4000);

		driver.navigate().back();

		driver.findElement(By.xpath("//span[@class='cartcontents']")).click();

		String subtotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[3]")).getText().replace("Subtotal "," " ).replace("₹"," " );

		String tax = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[4]")).getText().replace("Tax "," ").replace("₹"," " );

		String estimatedtotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[5]")).getText().replace("Total"," ").replace("₹"," " );

		float subtotal1 = Float.valueOf(subtotal);

		float shippingcharge1 = 0;

		float tax1 = Float.valueOf(tax);

		float estimatedtotal1 = Float.valueOf(estimatedtotal);

		System.out.println(" SUBTOTAL : "+ subtotal1);

		System.out.println(" SHIPPING : "+ shippingcharge1);

		System.out.println(" TAX : " + tax1);

		System.out.println(" TOTAL : "+ estimatedtotal1);

		//Tax rate=(tax*100)/(subtotal+shipping)

		float subshippingtotal=subtotal1+shippingcharge1;

		float taxrate = tax1*100/subshippingtotal;

		System.out.println("TaxRate :" +taxrate);

		//Tax value=([subtotal+shipping]*tax)/100

		float totaltax=(subshippingtotal)*taxrate/100;

		System.out.println("TotalTax :" +totaltax);

		if(tax1==totaltax)
		{

			System.out.println("Given Taxrate and totaltax is equal");
		}

		else {

			System.out.println("Given Taxrate and totaltax is not equal");

		}
		
		driver.quit();

	}

}