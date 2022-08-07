import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.formats.html.markup.Script;

public class GoogleSearch {

	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.opencart.com/");
		//driver.get("https://www.opencart.com/index.php?route=account/login/");
		//driver.get("https://www.opencart.com/index.php?route=account/register");
		//driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
	}
	
	
	
//Requerimiento 1,2,3
	@Test
	public void testSinRegistro() {
		
	}
	
	/*
//Requerimiento 4,5,7
	@Test
	public void testLogin() {

		WebElement searchbox = driver.findElement(By.name("email"));
		searchbox.clear();
		searchbox.sendKeys("jeiderbarber@gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals("OpenCart - Account Login", driver.getTitle());

		WebElement textbox = driver.findElement(By.name("password"));
		textbox.clear();
		textbox.sendKeys("12345");
		textbox.submit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals("Account PIN", driver.getTitle());		
			
		
	}
	*/
//Requerimiento 6
	/*
	@Test
	public void testRegistro() {
		
		WebElement tetbox = driver.findElement(By.name("password"));
		tetbox.clear();
		tetbox.sendKeys("12345");
		tetbox.submit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals("Account PIN", driver.getTitle());		
		
		
	}*/
	//Requerimiento 8
		/*@Test
		public void testBuscar() {
			
	        WebElement button = driver.findElement(By.className("collapse"));
	        button.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        assertEquals("500 - INTERNAL ERROR", driver.getTitle());
		}*/
		
	//Requerimiento 9
		/*@Test
		public void testHome() {
			
	        WebElement button = driver.findElement(By.className("breadcrumb-item"));
	        button.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        assertEquals("500 - INTERNAL ERROR", driver.getTitle());
		}
		
	//Requerimiento 10
		@Test
		public void testLista() {
			
	        WebElement button = driver.findElement(By.className("dropdown"));
	        button.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        assertEquals("500 - INTERNAL ERROR", driver.getTitle());
		}*/
		
	
	
	
	 //@After
	//public void tearDown() {
	///driver.quit();
	

//}