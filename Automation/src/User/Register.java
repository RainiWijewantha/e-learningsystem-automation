package User;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\ICBT - BSc\\Final Project\\e-learningsystem-automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver chromeDriver = new ChromeDriver(option);
		chromeDriver.manage().window().maximize();

		String baseURL = "http://localhost:8080/e-learningsystem/login.php";
		chromeDriver.get(baseURL);
		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(2000));

		WebElement register_link = chromeDriver.findElement(By.xpath("//a[normalize-space()='SIGN UP']"));
		register_link.click();
		Thread.sleep(5000);

		//no data
		WebElement register_btn = chromeDriver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		register_btn.click();
		Thread.sleep(5000);
				
		//Fill valid data
		WebElement fname = chromeDriver.findElement(By.xpath("(//input[@id='name'])[1]"));
		fname.sendKeys("Raini");
		Thread.sleep(5000);
		
		WebElement lname = chromeDriver.findElement(By.xpath("(//input[@id='name'])[2]"));
		lname.sendKeys("Wijewantha");
		Thread.sleep(5000);
		
		WebElement address = chromeDriver.findElement(By.xpath("(//input[@id='name'])[3]"));
		address.sendKeys("Matara");
		Thread.sleep(5000);
		
		WebElement phone = chromeDriver.findElement(By.xpath("(//input[@id='name'])[4]"));
		phone.sendKeys("0774568923");
		Thread.sleep(5000);
		
		WebElement username = chromeDriver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("W.W.raini");
		Thread.sleep(5000);
		
		WebElement password = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("12345");
		Thread.sleep(5000);
		
		WebElement register_btn1 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		register_btn1.click();
		Thread.sleep(5000);				
	}

}
