package javaproject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium jars\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
					
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		String title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(title.equals(exp_title)) {
			System.out.println("Test passed");
			
		}
		else
		{
			System.out.println("Test failed");
		}
		
		driver.quit();
		
	}

}
