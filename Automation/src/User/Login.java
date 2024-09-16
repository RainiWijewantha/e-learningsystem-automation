package User;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

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
		
		//no data
		WebElement login_btn = chromeDriver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login_btn.click();
		Thread.sleep(5000);
		
		//Wrong Username and password
		WebElement username = chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("Sashee");
		Thread.sleep(5000);
		
		WebElement password = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("123");
		Thread.sleep(5000);
		
		login_btn.click();
		Thread.sleep(5000);
		
		//Wrong username and correct password
		WebElement username1 = chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username1.sendKeys("Sashee");
		Thread.sleep(5000);
		
		WebElement password1 = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys("1234");
		Thread.sleep(5000);
		
		WebElement login_btn1 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login_btn1.click();
		Thread.sleep(5000);
		
		//Correct username and Wrong password
		WebElement username2 = chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username2.sendKeys("RainiWijewantha");
		Thread.sleep(5000);
		
		WebElement password2 = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password2.sendKeys("12");
		Thread.sleep(5000);
		
		WebElement login_btn2 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login_btn2.click();
		Thread.sleep(5000);
		
		//Correct username and password
		WebElement username3 = chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username3.sendKeys("RainiWijewantha");
		Thread.sleep(5000);
		
		WebElement password3 = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password3.sendKeys("123");
		Thread.sleep(5000);
		
		WebElement login_btn3 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login_btn3.click();
		Thread.sleep(5000);
	}

}
