package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC5 {
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

  @Test
  public void testTC5(String Mail, String Clave) throws Exception {
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
    	try { if (isElementPresent(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/div[2]/div/div/div[1]/table/tbody/tr[1]/td[6]/button"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/table/tbody/tr[1]/td[6]/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".alert > a:nth-child(3)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector(".alert > a:nth-child(3)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a.btn-primary"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-payment-address"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-shipping-address"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#button-shipping-method"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[name=\"agree\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[name=\"agree\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

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

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a[href*=\":80/index.php\"].btn"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".list-unstyled > li:nth-of-type(1) > a[href^=\"https://opencart.abstracta.us:443/index.php\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

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
