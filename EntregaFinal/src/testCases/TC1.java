package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1 {
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

  @Test(dataProvider = "DatosTC1", dataProviderClass = testDataProviders.DataProviderTC1.class)
  @Parameters({"Nombres", "Apellidos", "Mail", "NumTel", "NumFax", "Empresa", "Direccion1", "Direccion2", "Ciudad", "CodPostal", "NumPais", "NumZona", "Clave"})
   
  public void testTC1(String Nombres, String Apellidos, String Mail, String NumTel, String NumFax,
		  String Empresa, String Direccion1, String Direccion2, String Ciudad, String CodPostal,
		  String NumPais, String NumZona, String Clave) throws Exception {
    driver.get("https://opencart.abstracta.us/");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    //

    driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a.btn"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("a.btn")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-firstname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-firstname")).clear();
    driver.findElement(By.cssSelector("#input-firstname")).sendKeys(Nombres);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-lastname"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-lastname")).clear();
    driver.findElement(By.cssSelector("#input-lastname")).sendKeys(Apellidos);
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
    driver.findElement(By.cssSelector("#input-telephone")).sendKeys(NumTel);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-fax"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-fax")).clear();
    driver.findElement(By.cssSelector("#input-fax")).sendKeys(NumFax);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-company"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-company")).clear();
    driver.findElement(By.cssSelector("#input-company")).sendKeys(Empresa);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-address-1"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-address-1")).clear();
    driver.findElement(By.cssSelector("#input-address-1")).sendKeys(Direccion1);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-address-2"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-address-2")).clear();
    driver.findElement(By.cssSelector("#input-address-2")).sendKeys(Direccion2);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-city"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-city")).clear();
    driver.findElement(By.cssSelector("#input-city")).sendKeys(Ciudad);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-postcode"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-postcode")).clear();
    driver.findElement(By.cssSelector("#input-postcode")).sendKeys(CodPostal);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-country"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    Select SeleccionPais = new Select(driver.findElement(By.cssSelector("#input-country")));
    SeleccionPais.selectByValue(NumPais);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-zone"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    
    Select SeleccionZona = new Select(driver.findElement(By.cssSelector("#input-zone")));
    SeleccionZona.selectByValue(NumZona);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try {if (isElementPresent(By.cssSelector("#input-password"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    
    driver.findElement(By.cssSelector("#input-password")).clear();
    driver.findElement(By.cssSelector("#input-password")).sendKeys(Clave);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#input-confirm"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("#input-confirm")).clear();
    driver.findElement(By.cssSelector("#input-confirm")).sendKeys(Clave);
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div.pull-right:nth-child(1) > input:nth-child(2)"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("div.pull-right:nth-child(1) > input:nth-child(2)")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//*[@id=\"input-firstname\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("a.btn"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("a.btn")).click();
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
