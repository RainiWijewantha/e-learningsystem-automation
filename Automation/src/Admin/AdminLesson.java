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

		//lesson
		WebElement lesson = chromeDriver.findElement(By.xpath("(//a[@href='/e-learningsystem/admin/modules/lesson/index.php'])[1]"));
		lesson.click();
		Thread.sleep(5000);
		
		//add lesson
		WebElement new_btn = chromeDriver.findElement(By.xpath("//a[normalize-space()='New']"));
		new_btn.click();
		Thread.sleep(5000);
		
		//chapter
		WebElement chapter = chromeDriver.findElement(By.xpath("//input[@id='LessonChapter']"));
		chapter.sendKeys("Chapter 2");
		Thread.sleep(5000);
		
		//title
		WebElement title = chromeDriver.findElement(By.xpath("//input[@id='LessonTitle']"));
		title.sendKeys("CSS");
		Thread.sleep(5000);
		
		//category
		WebElement category = chromeDriver.findElement(By.xpath("(//select[@id='Category'])[1]"));
		category.sendKeys("Docs");
		Thread.sleep(5000);
		
		//file
		WebElement file = chromeDriver.findElement(By.xpath("(//input[@name='file'])[1]"));
		String filePath = "E:\\ICBT - BSc\\Final Project\\Chapter 10.docx";
		file.sendKeys(filePath);
		Thread.sleep(5000);
		
		//save
		WebElement save = chromeDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		Thread.sleep(5000);
		
		//edit lesson details
		WebElement edit = chromeDriver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(4) a:nth-child(1)"));
		edit.click();
		Thread.sleep(5000);
		
		//edit chapter
		WebElement chapter_edit = chromeDriver.findElement(By.xpath("(//input[@id='LessonChapter'])[1]"));
		chapter_edit.clear();
		chapter_edit.sendKeys("Chapter 1");
		Thread.sleep(5000);
		
		//save changes
		WebElement save_changes = chromeDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save_changes.click();
		Thread.sleep(5000);
		
		//edit file
		WebElement edit_file = chromeDriver.findElement(By.xpath("(//a[contains(@title,'Change File')][normalize-space()='Change File'])[1]"));
		edit_file.click();
		Thread.sleep(5000);

		WebElement file1 = chromeDriver.findElement(By.xpath("(//input[@name='file'])[1]"));
		filePath = "E:\\ICBT - BSc\\Final Project\\Chapter 11.docx";
		file1.sendKeys(filePath);
		Thread.sleep(5000);
		
		WebElement save1 = chromeDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save1.click();
		Thread.sleep(5000);
		
		//view
		WebElement view = chromeDriver.findElement(By.xpath("(//a[@title='View Files'][normalize-space()='View'])[1]"));
		view.click();
		Thread.sleep(5000);
		
		//lesson
		WebElement lesson1 = chromeDriver.findElement(By.xpath("(//a[@href='/e-learningsystem/admin/modules/lesson/index.php'])[1]"));
		lesson1.click();
		Thread.sleep(5000);
		
		//delete 
		WebElement delete = chromeDriver.findElement(By.xpath("(//a[@title='Delete'][normalize-space()='Delete'])[1]"));
		delete.click();
		Thread.sleep(5000);
	}

}
