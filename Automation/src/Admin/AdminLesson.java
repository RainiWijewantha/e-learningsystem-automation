package Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminLesson {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "E:\\ICBT - BSc\\Final Project\\e-learningsystem-automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");

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
		
		//

	}

}
