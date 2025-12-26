package Digital;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Anynomous {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shivakue\\OneDrive - AMDOCS\\D Drive\\Automation\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Home Page
		driver.navigate().to("http://illnqw2989:12050/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.cssSelector("a[aria-label^='Phones']")).click();

		// Device Gallery - view the device details and add to cart
		driver.findElement(By.xpath("(//input[@id='searchByDevice_1'])[1]"))
				.sendKeys("Apple® iPhone® SE (3rd Gen) - Midnight 64GB");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='flex-column result-box']")));
		driver.findElement(By.cssSelector("div[class='flex-column result-box']")).click();
		driver.findElement(By.cssSelector("a[aria-label^='Apple® iPhone® SE (3rd Gen) - Midnight 64GB_View_Details']"))
				.click();
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[aria-label^='ADD TO CART']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("zip-code")).sendKeys("98584");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("keep_my_device")).click();
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();

		// Allocate number
		driver.findElement(By.id("radio_allocateNewNumber_1")).click();
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();

		// Pick My Plan
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(
				By.xpath("//button[@aria-label='select this plan Unlimited Data-Even Better 3.0']"))
				.click();

		// Device Protection
		js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.cssSelector("button[aria-label^='DECLINE']")).click();
		driver.findElement(By.cssSelector("button[class^='popup-close']")).click();
		driver.findElement(By.cssSelector("button[aria-label^='DECLINE']")).click();
		Thread.sleep(8000);

		// Accessory gallery
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();
		Thread.sleep(10000);

		// Review My Cart
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("button[aria-label^='CHECKOUT']")).click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='popup-button-container ']")));
		driver.findElement(By.cssSelector("div[class='popup-button-container ']")).click();

		// Contact info
		driver.findElement(By.id("field1")).sendKeys("Deges");
		driver.findElement(By.id("field2")).sendKeys("Fbdhw");
		driver.findElement(By.id("field3")).sendKeys("9067893423");
		driver.findElement(By.id("field4")).sendKeys("Sample@abc.com");
		driver.findElement(By.id("field41_createPin")).sendKeys("2564");
		driver.findElement(By.id("field121")).sendKeys("31 Pine Street");
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();
		Thread.sleep(10000);

		// Credit Check
		driver.findElement(By.id("field31")).sendKeys("895345462");
		Thread.sleep(2000);
		driver.findElement(By.id("field32")).sendKeys("04212001");
		driver.findElement(By.id("field33")).sendKeys("9066788360034");
	//	js.executeScript("window.scrollBy(0,300)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("labelfor_select_inp_field34")));
		driver.findElement(By.cssSelector("div[class='react-select__value-container css-1hwfws3']")).click();
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("div[class='react-select__value-container
		// css-1hwfws3']")).sendKeys("WA");
		// driver.findElement(By.xpath("//div[@id='select_field34']")).sendKeys("WA");
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//div[@class='react-select__menu
		// css-26l3qy-menu']")));
		// driver.findElement(By.xpath("//div[@class='react-select__menu
		// css-26l3qy-menu']")).click();

		// "div[class='react-select_menu css-2613qy-menu']"

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//input[@id='field35']")).sendKeys("02222030");
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();

		// Contract review
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,300)");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signature']")));
		//driver.findElement(By.xpath("//input[@id='signature']")).click();
		driver.findElement(By.xpath("//a[@id='electronic_continue_electronic_signature']")).click();
		Thread.sleep(5000);

		// Payment details
		driver.findElement(By.name("cardHolderName")).sendKeys("Sample");
		driver.findElement(By.name("cardNumber")).sendKeys("4111 1111 1111 1111");
		driver.findElement(By.name("expiryDate")).sendKeys("03/30");
		driver.findElement(By.name("securityCode")).sendKeys("123");
		driver.findElement(By.cssSelector("button[aria-label^='CONTINUE']")).click();
		Thread.sleep(5000);

		// Order Summary
		js.executeScript("window.scrollBy(0,2000)");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.cssSelector("button[aria-label^='PLACE ORDER']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[@class='order-success-heading1']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@class='order-success-heading2']")).getText());

	}
	

}
