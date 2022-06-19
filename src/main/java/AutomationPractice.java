import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;

public class AutomationPractice {
    WebDriver driver;
    public AutomationPractice(WebDriver driver) {
        this.driver = driver;
    }
    private String baseUrl = "http://automationpractice.com/index.php";
    private By products = By.xpath("//*[@id=\"homefeatured\"]/li");
    private By continueShoppingBtn = By.xpath("//span[@title='Continue shopping']");
    private By pricePath = By.xpath(".//span[@itemprop='price']");


    public void navigate() {
        driver.navigate().to(baseUrl);
    }
    public int getProductsPrice() {
        int result = 0;
        List<WebElement> elements = driver.findElements(products);
        for (WebElement element : elements) {
            String priceValue = element.findElement(pricePath).getText();
            System.out.println(priceValue);
        }
        return result;
    }
}
