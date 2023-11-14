package org.BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	// 1
	public static void browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	// 2
	public WebElement findElementWithId(String id) {
		WebElement element = driver.findElement(By.id(id));

		return element;

	}

	// 3
	public WebElement findElementWithName(String name) {

		WebElement element = driver.findElement(By.name(name));
		return element;

	}

	// 4
	public WebElement findElementWithClassName(String className) {

		WebElement element = driver.findElement(By.className(className));
		return element;

	}

	// 5
	public WebElement findElementsWithLinkText(String linkText) {

		WebElement element = driver.findElement(By.linkText(linkText));

		return element;

	}

	// 6
	public WebElement findElementsWithPartialLinkTest(String PartialLinkText) {

		WebElement element = driver.findElement(By.partialLinkText(PartialLinkText));
		return null;

	}

	// 7
	public WebElement findElementWithCssSelector(String cssSelector) {

		WebElement element = driver.findElement(By.cssSelector(cssSelector));

		return element;

	}

	// 8
	public WebElement findElementWithTagName(String tagName) {

		WebElement element = driver.findElement(By.tagName(tagName));
		return element;

	}

	// 9
	public static WebElement findElementWithXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}

	// 10
	public void sendValues(WebElement element, String value) {

		element.sendKeys(value);

	}

	// 11
	public void clickWebElement(WebElement element) {

		element.click();
	}

	// 12
	public void mouseOverWebElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	// 13
	public void mouseOverRightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	public void mouseOverDiubleClick(WebElement element) {

		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	// 14
	public void SelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	// 15
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 16
	public String getOptions(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();

		for (int i = 0; i <= options.size(); i++) {

			WebElement webElement = options.get(i);

			text = webElement.getText();

		}

		return text;

	}

	// 17
	public String getAllSelectedOption(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getAllSelectedOptions();

		for (int i = 0; i <= options.size(); i++) {

			WebElement webElement = options.get(i);

			text = webElement.getText();

		}

		return text;

	}

	// 18
	public void sleep(long sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	// 19
	public void okalert() {

		driver.switchTo().alert().accept();
	}

	// 20
	public void cancelAlert() {

		driver.switchTo().alert().dismiss();

	}

	// 21
	public void alertWithText(String text, String res) {

		Alert alert = driver.switchTo().alert();

		alert.sendKeys(text);
		String accept = null;

		if (res.equals(accept)) {

			alert.accept();

		} else {

			alert.dismiss();
		}

	}

	// 22
	public void javaScriptExecutor(WebElement element) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", element);

		element.click();

	}

	// 23
	public void passValuewithjsExec(WebElement element, String elementtag, String value) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(elementtag, value)", element);

	}

	// 24
	public void getAttributeJSexec(WebElement element, String value) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].getAttribute(value)", element);

	}

	// 25
	public void jsClick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	// 26
	public String getText(WebElement element) {
		String t = element.getText();

		System.out.println(t);

		return t;
	}

	// 27
	public boolean isEnabled(WebElement element) {

		boolean enabled = element.isEnabled();

		return enabled;

	}

	// 28
	public boolean isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		return displayed;

	}

	// 29
	public boolean is(WebElement element) {

		boolean selected = element.isSelected();

		return selected;

	}

	// 30
	public String getAttributeValue(WebElement element, String attributeName, String value) {

		value = element.getAttribute(attributeName);

		return value;

	}

	// 31
	private String getTitle() {

		String title = driver.getTitle();

		return title;
	}

	// 32
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	// 33
	public void navigateTo(String url) {

		driver.navigate().to(url);

	}

	// 34
	public void navigateBack() {

		driver.navigate().back();

	}

	// 35
	public void navigateForward() {
		driver.navigate().forward();
	}

	// 36
	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	// 37
	public void clear(WebElement element) {

		element.clear();

	}

	// 38
	public void quit() {
		driver.quit();

	}

	// 39
	public void screenshot(WebElement element, String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);

	}

	// 40
	public void swithframeswithIdorName(String IdorName) {
		driver.switchTo().frame(IdorName);

	}

	// 41
	public void swithframeswithWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	// 42
	public void swithframeswithIndex(int index) {
		driver.switchTo().frame(index);

	}

	// 43
	public int frameCount(String tagname, int size) {

		List<WebElement> elements = driver.findElements(By.tagName(tagname));

		size = elements.size();

		return size;

	}

	// 44
	public void windowHandleWithId(String idorUrlortitle) {

		driver.switchTo().window(idorUrlortitle);

	}

	// 45
	public String getParentWindow(String windowHandle) {

		windowHandle = driver.getWindowHandle();

		return windowHandle;

	}

	// 46
	public String getWindowHandlesInfo(String windowHandlesList) {

		Set<String> windowHandles2 = driver.getWindowHandles();

		for (String windowHandlesList1 : windowHandles2) {
			windowHandlesList = windowHandlesList1;
		}

		return windowHandlesList;

	}

	// 47
	public void dragAndDrop(WebElement source, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination);

	}
	//48
	public void explicitWait(int seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

	}

	// 49
	public void implicitWait(int sec) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}
	
	

	// 50
	public void close() {
		driver.close();
	}

}