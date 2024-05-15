/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author patel
 */
public class SearchByCategory {
    private static WebDriver driver;
    private static String baseUrl;
    
    public SearchByCategory() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testSearchByCategoryTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshall&gs_lcrp=EgZjaHJvbWUqFggBEC4YgwEYxwEYsQMYyQMY0QMYgAQyEwgAEAAYgwEY4wIYsQMYyQMYgAQyFggBEC4YgwEYxwEYsQMYyQMY0QMYgAQyBggCEEUYOTIKCAMQLhixAxiABDINCAQQABiDARixAxiABDIKCAUQLhixAxiABDINCAYQABiDARixAxiABDIHCAcQLhiABDINCAgQLhivARjHARiABDIKCAkQABiSAxiABNIBCDQ5NDBqMGoxqAIIsAIB&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.id("usmm-tl-cat3620040p")).click();
    driver.get("https://www.marshalls.com/us/store/shop/women/_/N-2906019403?tn=2");
    driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[4]/a")).click();
    driver.get("https://www.marshalls.com/us/store/shop/beauty-products/_/N-186460439?ln=4:1");
    driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[4]/a")).click();
    driver.get("https://www.marshalls.com/us/store/shop/women-women-beauty-perfume/_/N-1244655029?ln=4:2");
    driver.findElement(By.xpath("//img[@alt='3.4oz Fleur Monoi Hair And Body Mist']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/women-women-beauty-perfume/3.4oz-Fleur-Monoi-Hair-And-Body-Mist/4000250200?colorId=NS4155481&pos=1:6&N=1244655029");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.id("modal-close")).click();
  } 
    
    //@Test
    public void testAddToBagTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshall&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTINCAMQABiSAxiABBiKBTIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzIzOGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("plants");
    driver.findElement(By.id("search-submit-button")).click();
    driver.get("https://www.marshalls.com/us/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=plants&qfh_sch=Search");
    driver.findElement(By.xpath("//img[@alt='30in Snake Plant In Pot']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/30in-Snake-Plant-In-Pot/4000259086?colorId=NS4162080&pos=1:2&Ntt=plants");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("View Bag")).click();
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
  }
    
     //@Test
    public void testKeepShoppingTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMg0IAhAAGJIDGIAEGIoFMhMIAxAuGK8BGMcBGJIDGIAEGI4FMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgzODE1ajBqMagCALACAA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("flowers");
    driver.findElement(By.id("search-submit-button")).click();
    driver.get("https://www.marshalls.com/us/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=flowers&qfh_sch=Search");
    driver.findElement(By.xpath("//img[@alt='23in Real Touch Orchid In Marble Pot']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/23in-Real-Touch-Orchid-In-Marble-Pot/4000259098?colorId=NS4155761&pos=1:11&Ntt=flowers");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("Keep Shopping")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/ul/li/a/span")).click();
    driver.get("https://www.marshalls.com/us/store/shop/?Ntt=flowers");
    driver.findElement(By.xpath("//img[@alt='8in Hydrangea Pampas Arrangement']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/8in-Hydrangea-Pampas-Arrangement/4000205046?colorId=NS4155384&pos=1:16&Ntt=flowers");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("Keep Shopping")).click();
  }
    
    //@Test
    public void testLocationTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMg0IAhAAGJIDGIAEGIoFMhMIAxAuGK8BGMcBGJIDGIAEGI4FMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQg0MDc0ajBqMagCALACAA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.linkText("Stores")).click();
    driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp");
    driver.findElement(By.id("store-location-zip")).click();
    driver.findElement(By.id("store-location-zip")).clear();
    driver.findElement(By.id("store-location-zip")).sendKeys("60090");
    driver.findElement(By.id("store-location-city")).click();
    driver.findElement(By.id("store-location-city")).clear();
    driver.findElement(By.id("store-location-city")).sendKeys("wheeling");
    driver.findElement(By.id("store-location-state")).click();
    new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Illinois");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("Store Info and Directions")).click();
    driver.get("https://www.marshalls.com/us/store/stores/Arlington+Heights-IL-60004/559/aboutstore");
  }
    
     //@Test
    public void testInvalidStateAndCityTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMgYIAhBFGDsyBggDEEUYQDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzcwMGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.linkText("Stores")).click();
    
    driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp");
    driver.findElement(By.id("store-location-city")).click();
    driver.findElement(By.id("store-location-city")).clear();
    driver.findElement(By.id("store-location-city")).sendKeys("wheeling");
    driver.findElement(By.id("store-location-state")).click();
    new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Kansas"); 
    driver.findElement(By.name("submit")).click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)", "");
  }
    
    //@Test
    public void testInvalidZipcodeTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMgYIAhBFGDsyBggDEEUYQDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzU3OWowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.linkText("Stores")).click();
    driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp");
    driver.findElement(By.id("store-location-zip")).click();
    driver.findElement(By.id("store-location-zip")).clear();
    driver.findElement(By.id("store-location-zip")).sendKeys("ab1230");
    driver.findElement(By.name("submit")).click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)", "");
  }
    
    //@Test
    public void testSearchItemTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMgYIAhBFGDsyBggDEEUYQDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzI5MGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("tv");
    driver.findElement(By.id("search-submit-button")).click();
    driver.get("https://www.marshalls.com/us/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=tv&qfh_sch=Search");
  }
    
    //@Test
    public void testGiftCardTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMgYIAhBFGDsyBggDEEUYQDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzIyN2owajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.id("usmm-tl-cat3920054p")).click();
    driver.get("https://www.marshalls.com/us/store/shop/gifts/_/N-1030405284?tn=8");
    driver.findElement(By.xpath("//body[@id='page-top']/footer/nav/div/ul[3]/li[4]/a")).click();
    driver.get("https://www.marshalls.com/us/store/jump/topic/Gift-Cards/2400013");
    driver.findElement(By.xpath("//*[@id=\"WP-TBD_Content_Hero_GiftCards_D\"]/div[2]/div[2]/a[1]"));
    //driver.findElement(By.linkText("Send By Mail")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/Gift-Cards/9010000000?icid=9.28.21:Marshalls:LP:Desktop_GiftCards:by_mail");
    driver.findElement(By.xpath("//div[@id='product-9010000000']/section/div[2]/form/div[3]/div/div/ul/li[2]/a/img")).click();
    driver.findElement(By.id("addItemToOrder")).click();
  }
    
    //@Test
    public void testShoppingBagTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMgYIAhBFGDsyDQgDEAAYkgMYgAQYigUyBggEEEUYPDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDMzMjBqMGoxqAIAsAIA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.linkText("My Bag")).click();
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
    driver.findElement(By.linkText("Remove")).click();
  }
    
    //@Test
    public void testSigninTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTDOuMFFgNGB0YPDizE0sKs5IzMkpBgBWCAcx&q=marshalls&oq=marshalls&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIHCAAQABiPAjIVCAEQLhgnGMcBGMkDGNEDGIAEGIoFMgYIAhBFGDsyBggDEEUYQDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEINDY2MWowajGoAgiwAgE&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.xpath("//body[@id='page-top']/footer/nav/div/ul/li[12]/a")).click();
    driver.get("https://www.marshalls.com/us/store/account/login.jsp");
    driver.findElement(By.id("login-id")).click();
    driver.findElement(By.id("login-id")).clear();
    driver.findElement(By.id("login-id")).sendKeys("patelmasum710@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("masum710");
    driver.findElement(By.id("loginSubmit")).click();
  }
    
}
