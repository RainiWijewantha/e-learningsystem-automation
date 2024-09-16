package User;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {

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
		
		//login
		WebElement username3 = chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username3.sendKeys("RainiWijewantha");
		Thread.sleep(5000);
		
		WebElement password3 = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password3.sendKeys("123");
		Thread.sleep(5000);
		
		WebElement login_btn3 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login_btn3.click();
		Thread.sleep(5000);
		
		//lesson tab
		WebElement lesson = chromeDriver.findElement(By.xpath("//a[normalize-space()='Lesson']"));
		lesson.click();
		Thread.sleep(5000);
		
		//exercises
		WebElement exercises = chromeDriver.findElement(By.xpath("//a[normalize-space()='Exercises']"));
		exercises.click();
		Thread.sleep(5000);
		
		//download
		WebElement download = chromeDriver.findElement(By.xpath("//a[normalize-space()='Downloads']"));
		download.click();
		Thread.sleep(5000);
		
		//about us 
		WebElement about_us = chromeDriver.findElement(By.xpath("(//a[normalize-space()='About Us'])[1]"));
		about_us.click();
		Thread.sleep(5000);
		
		//contact us
		WebElement contact_us = chromeDriver.findElement(By.xpath("//a[@href='/e-learningsystem/index.php?q=contact']"));
		contact_us.click();
		Thread.sleep(5000);
		
		//logout
		WebElement logout = chromeDriver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout.click();
		Thread.sleep(5000);
		
	}

}
