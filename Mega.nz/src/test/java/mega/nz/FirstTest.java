package mega.nz;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	public static WebDriver driver;
	String path = "C:\\Users\\marko\\Downloads\\myscreenShot.png";

	@Test

    void download() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.cssSelector("div > a:nth-of-type(5)")).click();
        Thread.sleep(1000);
        
        File file = new File(path);
        if(file.exists()) {
        	System.out.print("Postoji");
        }

    }
	// Selenium-Webdriver-Java-TestNG-Maven
	// mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
	// mvn archetype:generate -DgroupId=mega.nz -DartifactId=Mega.nz -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
	@Test
    void upload(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");
    }
	
	@Test
	void login () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
        
	}
	
	@Test
    void placeholder(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.findElement(By.cssSelector("input#target")).sendKeys("F");
        driver.findElement(By.cssSelector("p#result"));
        if(driver.getPageSource().contains("F")) {
        	System.out.println("text Valid");
        	
        }
        
        
    }
	
	@Test
	void click () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.cssSelector("div#content  a[target='_blank']")).click();
        driver.get("https://the-internet.herokuapp.com/windows/new");
        if(driver.getPageSource().contains("New Window")) {
        	System.out.println("Postoji");
        }
        
	}
	
	@Test
	void assertFunction () throws InterruptedException, IOException {
        
		WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	        WebDriver driver = new ChromeDriver();
	        String url = "https://www.lambdatest.com/";
	        driver.get(url);
	        driver.manage().window().maximize();
	        
	 
	 
	        WebElement login = driver.findElement(By.linkText("Login"));
	        System.out.println("Clicking on the login element in the main page");
	        login.click();
	 
	        
	 
	        WebElement email = driver.findElement(By.id("email"));
	        WebElement password = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("login-button"));
	        
	        
	        
	 
	        email.clear();
	        System.out.println("Entering the email");
	        email.sendKeys("your_email");
	 
	        password.clear();
	        System.out.println("entering the password");
	        password.sendKeys("your_password");
	 
	        System.out.println("Clicking login button");
	        loginButton.click();
	        Thread.sleep(3000);
	        
	        
	        if(driver.getPageSource().contains("Invalid email address")) {
	        	System.out.println("pogresan meil");
	        	driver.quit();
	        	
	        }else {
	        	System.out.println("ne postoji");
	        	driver.quit();
	        }
	 
	  
        
	}
	
	
}
