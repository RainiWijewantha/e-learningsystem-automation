package Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminMenu {

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

		//lesson
		WebElement lesson = chromeDriver.findElement(By.xpath("(//a[@href='/e-learningsystem/admin/modules/lesson/index.php'])[1]"));
		lesson.click();
		Thread.sleep(5000);
		
		//exercises
		WebElement exercise = chromeDriver.findElement(By.xpath("(//a[@href='/e-learningsystem/admin/modules/exercises/index.php'])[1]"));
		exercise.click();
		Thread.sleep(5000);

		//gallery
		WebElement gallery = chromeDriver.findElement(By.xpath("//a[normalize-space()='Gallery']"));
		gallery.click();
		Thread.sleep(5000);

		//manage students
		WebElement manage_students = chromeDriver.findElement(By.xpath("//a[normalize-space()='Manage Students']"));
		manage_students.click();
		Thread.sleep(5000);
		
		//manage users
		WebElement manage_users = chromeDriver.findElement(By.xpath("//a[normalize-space()='Manage Users']"));
		manage_users.click();
		Thread.sleep(5000);
		
		//logout
		WebElement logout = chromeDriver.findElement(By.xpath("(//a[normalize-space()='Logout'])[2]"));
		logout.click();
		Thread.sleep(5000);

	}

}
