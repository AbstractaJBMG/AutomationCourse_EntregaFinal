package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC4 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test(dataProvider = "DatosTC4", dataProviderClass = testDataProviders.DataProviderTC4.class)
  @Parameters({"Mail", "Clave", "Item"})
  
  public void testTC4(String Mail, String Clave, String Item) throws Exception {
    driver.get("https://opencart.abstracta.us/");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-email"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-email")).clear();
    driver.findElement(By.cssSelector("#input-email")).sendKeys(Mail);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-password"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-password")).clear();
    driver.findElement(By.cssSelector("#input-password")).sendKeys(Clave);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-password"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-password")).sendKeys(Keys.ENTER);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[name=\"search\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[name=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"search\"]")).sendKeys(Item);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".input-lg"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[name=\"search\"]")).sendKeys(Keys.ENTER);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".product-thumb"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertTrue(isElementPresent(By.cssSelector(".product-thumb")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".button-group > button[type=\"button\"]:nth-of-type(2)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector(".button-group > button[type=\"button\"]:nth-of-type(2)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.linkText("Cameras"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("Cameras")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/button[3]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/button[3]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div.product-layout:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(3)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("div.product-layout:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(3)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/button[2]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/button[2]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div.col-sm-3:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("div.col-sm-3:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".list-group > a[href*=\":443/index.php\"].list-group-item:nth-of-type(13)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector(".list-group > a[href*=\":443/index.php\"].list-group-item:nth-of-type(13)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a[href^=\"http://opencart.abstracta.us:80/index.php\"].btn"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("a[href^=\"http://opencart.abstracta.us:80/index.php\"].btn")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
