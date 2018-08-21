package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test(dataProvider = "DatosTC2", dataProviderClass = testDataProviders.DataProviderTC2.class)
  @Parameters({"Mail", "Clave", "Item"})
  
  public void testTC2(String Mail, String Clave, String Item) throws Exception {
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
    	try { if (isElementPresent(By.cssSelector("input[type=\"submit\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[name=\"search\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[name=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"search\"]")).sendKeys(Item);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[name=\"search\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[name=\"search\"]")).sendKeys(Keys.ENTER);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div.product-layout:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("div.product-layout:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("li.dropdown:nth-child(1) > a:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("li.dropdown:nth-child(1) > a:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".caption > h4:nth-child(1) > a:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector(".caption > h4:nth-child(1) > a:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//*[@id=\"button-cart\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".alert > a:nth-child(2)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector(".alert > a:nth-child(2)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a.btn-primary"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("a.btn-primary")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-payment-address"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#button-payment-address")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-shipping-address"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#button-shipping-address")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-shipping-method"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#button-shipping-method")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div.buttons:nth-child(5) > div:nth-child(1) > input:nth-child(2)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    
    driver.findElement(By.cssSelector("div.buttons:nth-child(5) > div:nth-child(1) > input:nth-child(2)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-payment-method"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#button-payment-method")).click();
    try {
      assertTrue(driver.findElement(By.cssSelector("input[name=\"agree\"]")).getText().matches("^[\\s\\S]*1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-payment-method"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-confirm"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#button-confirm")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a[href*=\":80/index.php\"].btn"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("a[href*=\":80/index.php\"].btn")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/div[2]/div/aside/div/a[13]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[13]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a.btn"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    driver.findElement(By.cssSelector("a.btn")).click();    
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
