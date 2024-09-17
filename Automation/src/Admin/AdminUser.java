package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\ICBT - BSc\\Final Project\\e-learningsystem-automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver chromeDriver = new ChromeDriver(option);
		chromeDriver.manage().window().maximize();

		String baseURL = "http://localhost:8080/e-learningsystem/admin/login.php";
		chromeDriver.get(baseURL);
		Thread.sleep(5000);

		//login
		WebElement username3 = chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username3.sendKeys("Admin");
		Thread.sleep(5000);

		WebElement password3 = chromeDriver.findElement(By.xpath("//input[@id='password']"));
		password3.sendKeys("admin");
		Thread.sleep(5000);

		WebElement login_btn3 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login_btn3.click();
		Thread.sleep(5000);

		//manage users
		WebElement manage_users = chromeDriver.findElement(By.xpath("//a[normalize-space()='Manage Users']"));
		manage_users.click();
		Thread.sleep(5000);

		//add user
		WebElement add_user = chromeDriver.findElement(By.xpath("//a[normalize-space()='New']"));
		add_user.click();
		Thread.sleep(5000);

		//account name
		WebElement account_name = chromeDriver.findElement(By.xpath("//input[@id='user_name']"));
		account_name.sendKeys("Raini");
		Thread.sleep(5000);

		//username
		WebElement username = chromeDriver.findElement(By.xpath("//input[@id='user_email']"));
		username.sendKeys("Sasheena Raini");
		Thread.sleep(5000);

		//password
		WebElement password = chromeDriver.findElement(By.xpath("//input[@id='user_pass']"));
		password.sendKeys("123456");
		Thread.sleep(5000);

		//retype password
		WebElement retype_password = chromeDriver.findElement(By.xpath("//input[@id='retype_user_pass']"));
		retype_password.sendKeys("123456");
		Thread.sleep(5000);

		//save
		WebElement save = chromeDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		Thread.sleep(5000);
		
		
	}

}
