package pages;

import common.Page_BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Page_GoogleHomepage extends Page_BasePage {

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","/app/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		System.setProperty("webdriver.chrome.args", "--disable-logging");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("window-size=1024,768"); // Bypass OS security model
<<<<<<< HEAD
=======
		options.addArguments("dom.ipc.processCount", "1");
		options.addArguments("security.sandbox.content.level", "5");
		System.setProperty("security.sandbox.content.level", "5");
>>>>>>> 3c3ca54 (SeleniumWithDocker)
		driver = new ChromeDriver(options);
	}

	public void launchBrowserWithFirefox(){
<<<<<<< HEAD
		FirefoxOptions firefoxDockerOptions = new FirefoxOptions();
		System.setProperty("webdriver.gecko.driver","/bin/geckodriver");
=======
		System.setProperty("webdriver.gecko.driver","/app/bin/geckodriver");
		FirefoxOptions firefoxDockerOptions = new FirefoxOptions();
>>>>>>> 3c3ca54 (SeleniumWithDocker)
		firefoxDockerOptions.addArguments("--headless");
		firefoxDockerOptions.addArguments("--no-sandbox");
		System.setProperty("webdriver.gecko.args", "--disable-logging");
		System.setProperty("webdriver.gecko.silentOutput", "true");
		firefoxDockerOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		firefoxDockerOptions.addArguments("disable-infobars"); // disabling infobars
		firefoxDockerOptions.addArguments("--disable-extensions"); // disabling extensions
		firefoxDockerOptions.addArguments("--disable-gpu"); // applicable to windows os only
		firefoxDockerOptions.addArguments("--width=1920"); // Bypass OS security model
		firefoxDockerOptions.addArguments("--height=1080");
<<<<<<< HEAD
=======
		firefoxDockerOptions.addPreference("dom.ipc.processCount", 1);
		firefoxDockerOptions.addPreference("security.sandbox.content.level", 5);
		System.setProperty("security.sandbox.content.level", "5");
>>>>>>> 3c3ca54 (SeleniumWithDocker)
		driver = new FirefoxDriver(firefoxDockerOptions);
	}
	
	public void openGoogleURL() {
		driver.get("http://www.google.com");
	}
		
	public void checkSearchBoxIsDisplayed() {
		if(driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}
<<<<<<< HEAD
	
	public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value=\"Google'da Ara\"]")).isDisplayed()) {
=======
	public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).isDisplayed()) {
>>>>>>> 3c3ca54 (SeleniumWithDocker)
			System.out.println("Google'da Ara button is displayed");
		} else {
			System.out.println("Google'da Ara button is NOT displayed");
		}
	}
<<<<<<< HEAD
	
	public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Kendimi Şanslı Hissediyorum']")).isDisplayed()) {
			System.out.println("I'm Kendimi Şanslı Hissediyorum button is displayed");
		} else {
			System.out.println("I'm Kendimi Şanslı Hissediyorum button is NOT displayed");
=======

	public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]")).isDisplayed()) {
			System.out.println("Kendimi Sansli Hissediyorum button is displayed");
		} else {
			System.out.println("Kendimi Şanslı Hissediyorum button is NOT displayed");
>>>>>>> 3c3ca54 (SeleniumWithDocker)
		}
	}
}
