package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminExercises {

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

		//exercises
		WebElement exercise = chromeDriver.findElement(By.xpath("(//a[@href='/e-learningsystem/admin/modules/exercises/index.php'])[1]"));
		exercise.click();
		Thread.sleep(5000);

		//add exercise
		WebElement add_exe = chromeDriver.findElement(By.xpath("//a[normalize-space()='New']"));
		add_exe.click();
		Thread.sleep(5000);

		//lesson
		WebElement lesson = chromeDriver.findElement(By.xpath("//select[@name='Lesson']"));
		lesson.sendKeys("HTML");
		Thread.sleep(5000);

		//question
		WebElement question = chromeDriver.findElement(By.xpath("//textarea[@id='Question']"));
		question.sendKeys("What is meaning of HTML?");
		Thread.sleep(5000);

		//choice A
		WebElement a = chromeDriver.findElement(By.xpath("//input[@id='ChoiceA']"));
		a.sendKeys("Hypertext Markup Language");
		Thread.sleep(5000);

		//choice B
		WebElement b = chromeDriver.findElement(By.xpath("//input[@id='ChoiceB']"));
		b.sendKeys("Hypotext Markup Language");
		Thread.sleep(5000);

		//choice C
		WebElement c = chromeDriver.findElement(By.xpath("//input[@id='ChoiceC']"));
		c.sendKeys("Hypotext Markup Language");
		Thread.sleep(5000);

		//choice D
		WebElement d = chromeDriver.findElement(By.xpath("//input[@id='ChoiceD']"));
		d.sendKeys("Hypotext Markup Language");
		Thread.sleep(5000);
		
		//answer
		WebElement answer = chromeDriver.findElement(By.xpath("//input[@id='Answer']"));
		answer.sendKeys("Hypertext Markup Language");
		Thread.sleep(5000);
		
		//save
		WebElement save = chromeDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		Thread.sleep(5000);
		
		//edit
		WebElement edit = chromeDriver.findElement(By.xpath("(//a[@title='Edit'][normalize-space()='Edit'])[1]"));
		edit.click();
		Thread.sleep(5000);
		
		//edit answer
		WebElement edit_ans = chromeDriver.findElement(By.xpath("//input[@id='Answer']"));
		edit_ans.sendKeys("Hypotext Markup Language");
		Thread.sleep(5000);
		
		//update
		WebElement save1 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save1.click();
		Thread.sleep(5000);
		
		//delete
		WebElement delete = chromeDriver.findElement(By.xpath("//a[normalize-space()='Delete']"));
		delete.click();
		Thread.sleep(5000);
	}

}
