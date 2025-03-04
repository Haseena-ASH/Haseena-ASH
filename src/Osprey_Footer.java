import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Osprey_Footer {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.osprey.com/gb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.findElement(By.xpath("//button[@class=\"truste-button truste-accpt-btn\"]")).click();
		driver.findElement(By.xpath("(//span[@class='icon-modal__close a-icon-text-btn__icon'])[2]")).click();
		
		
		
//		  List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class=\"c-footer__container-content c-footer__container-content-desktop c-footer__container-row u-col--xs-12 u-col--lg-7\"]"));
//
//	        for (int i = 0; i < footerLinks.size(); i++) {
//	            WebElement link = footerLinks.get(i);
//	            String linkText = link.getText();
//	            String linkHref = link.getAttribute("a");
//
//	            System.out.println("Link Text: " + linkText + " | Link Href: " + linkHref);
//	            
		
		
		driver.findElement(By.xpath("//button[@class='needsclick klaviyo-close-form go2855587515 kl-private-reset-css-Xuajs1']")).click();
		driver.findElement(By.xpath("(//ul[@class=\"m-footer-links__list\"]/li)[1]")).click();
		driver.findElement(By.xpath("(//a[@class=\"footer-links footer-footerPrimaryTextColor\"])[1]"));
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[4]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[5]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[6]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[7]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[8]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[9]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[10]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[11]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[12]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[13]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[14]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[15]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[16]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[17]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[18]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[19]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[20]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[21]")).click();
		driver.findElement(By.xpath("(//li[@class=\"m-footer-links__item\"])[22]")).click();
		driver.quit();
		//driver.findElement(By.cssSelector("a[class='level-top ui-corner-all']"));
		//		driver.findElement(By.className("ui-corner-all")).click();
		//		driver.findElement(By.xpath("(//a[@class=\"ui-corner-all\"])[14]")).click();
		//		driver.findElement(By.xpath("//a[@id=\"ui-id-29\"]")).click();
		//		driver.findElement(By.xpath("//img[@src=\"https://www.osprey.com/gb/media/catalog/product/cache/3a707f81200369c8cbf7d15002b55eef/a/r/arcanesmallday_f24_side_porcelainorangeheather.jpg\"]")).click();
		//		
		//		driver.findElement(By.xpath("//span[@class='js-add-to-cart-text u-hidden--sm-down']")).click();
		//		driver.findElement(By.xpath("//a[@class='a-btn a-btn--text a-btn__view-card']")).click();
		//		
		//	//order summary
		//		WebElement G=driver.findElement(By.xpath("//div[@id=\"cart-totals\"]"));
		//		String H= G.getText();
		//		System.out.println(H);
		//		
		//		//comparision
		//		WebElement X= driver.findElement(By.xpath("//tr[@class=\"totals sub\"]"));
		//		String elementText=X.getText();
		//		System.out.println( ""+elementText);
		//		WebElement Y= driver.findElement(By.xpath("//tr[@class=\"grand totals\"]"));
		//		String element=Y.getText();
		//		System.out.println(""+element);
		//		driver.close();
		//		if(X==Y) {
		//			System.out.println("Is Equal");
		//		}
		//		else
		//		{
		//			System.out.println("Not Equal");
		//		}
		//	
		
	}
}

