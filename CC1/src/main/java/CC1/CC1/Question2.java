package CC1.CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		Thread.sleep(1000);
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		a.click();
		Thread.sleep(1000);
		
		WebElement b=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
		b.click();
		
		Thread.sleep(1000);
		
		String c=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("A to Z Order's 1st Product Title: "+c);
		
		WebElement d=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
		d.click();
		Thread.sleep(1000);
		
		String e=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("Z to A Order's 1st Product Title: "+e);
		
		Thread.sleep(1000);
		
		WebElement f=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		f.click();
		
		Thread.sleep(1000);
		
		String g=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		System.out.println("Low to High Order's 1st Product Title: "+g);
		
		WebElement h=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
		h.click();
		
		Thread.sleep(1000);
		
		String i=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("High to Low Order's 1st Product Title: "+i);
		
		Thread.sleep(1000);
		
		driver.quit();
	}
}
