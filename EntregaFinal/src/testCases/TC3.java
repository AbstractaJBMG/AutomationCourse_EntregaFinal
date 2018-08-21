package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC3 {
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
  public void testTC3(String Mail, String Clave, String NuevoNombre, String NuevoApellido, String NuevoMail,
		  String NuevoNumTel, String NuevoFax, String NuevaClave, String NuevaDireccion,
		  String NuevaOtraDireccion, String NuevaCiudad, String NuevoCodPostal) throws Exception {
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
    	try { if (isElementPresent(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-firstname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-firstname")).clear();
    driver.findElement(By.cssSelector("#input-firstname")).sendKeys(NuevoNombre);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-lastname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-lastname")).clear();
    driver.findElement(By.cssSelector("#input-lastname")).sendKeys(NuevoApellido);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-email"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-email")).clear();
    driver.findElement(By.cssSelector("#input-email")).sendKeys(Mail);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-telephone"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-telephone")).clear();
    driver.findElement(By.cssSelector("#input-telephone")).sendKeys(NuevoNumTel);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-fax"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-fax")).clear();
    driver.findElement(By.cssSelector("#input-fax")).sendKeys(NuevoFax);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//*[@id=\"input-firstname\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-lastname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("css=#input-lastname", driver.findElement(By.cssSelector("#input-lastname")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-email"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertTrue(driver.findElement(By.cssSelector("#input-email")).getText().matches("^[\\s\\S]*@[\\s\\S]*$"));
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//*[@id=\"input-telephone\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[type=\"submit\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/div[2]/div/div/ul[1]/li[2]/a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("/html/body/div[2]/div/div/ul[1]/li[2]/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-password"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-password")).clear();
    driver.findElement(By.cssSelector("#input-password")).sendKeys(NuevaClave);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-confirm"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-confirm")).clear();
    driver.findElement(By.cssSelector("#input-confirm")).sendKeys("${NuevaClave}");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-password"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.cssSelector("#input-password")).getText(), "${NuevaClave}");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-confirm"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.cssSelector("#input-confirm")).getText(), "${NuevaClave}");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[type=\"submit\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".btn-info"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector(".btn-info")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-address-1"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-address-1")).clear();
    driver.findElement(By.cssSelector("#input-address-1")).sendKeys(NuevaDireccion);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-address-2"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-address-2")).clear();
    driver.findElement(By.cssSelector("#input-address-2")).sendKeys(NuevaOtraDireccion);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-city"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-city")).clear();
    driver.findElement(By.cssSelector("#input-city")).sendKeys(NuevaCiudad);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-postcode"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-postcode")).clear();
    driver.findElement(By.cssSelector("#input-postcode")).sendKeys(NuevoCodPostal);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-firstname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.cssSelector("#input-firstname")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-lastname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.cssSelector("#input-lastname")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-address-1"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.cssSelector("#input-address-1")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-city"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.cssSelector("#input-city")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-postcode"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertNotEquals("", driver.findElement(By.cssSelector("#input-postcode")).getText());
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[type=\"submit\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
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
