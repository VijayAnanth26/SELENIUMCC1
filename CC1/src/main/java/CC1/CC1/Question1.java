package CC1.CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question1 {
	public static void main( String[] args ) throws InterruptedException
    {   
        ChromeOptions co = new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
        
        driver.get("https://www.saucedemo.com");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Random");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("User");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("600018");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
}
