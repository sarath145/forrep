package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
WebElement gmail = driver.findElement(By.id("identifierId"));
gmail.sendKeys("sendtosarath98@gmail.com");
WebElement nextbtn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
nextbtn.click();
WebElement passwors = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
passwors.sendKeys("Sarath123@");
WebElement next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));

	driver.get("www.google.com");
}
}
