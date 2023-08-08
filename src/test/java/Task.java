import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
driver.get("https://www.amanstores.com/en");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@class=\"ammenu-link -main -parent \"][@href=\"https://www.amanstores.com/en/appliances.html\"]")).click();
driver.findElement(By.xpath("//a[@class=\"product-item-link\"][@href=\"https://www.amanstores.com/en/carrier-53khct-18-optimax-cooling-only-split-air-conditioner.html\"]")).click();
   driver.findElement(By.xpath("//button[@type=\"submit\"][@title=\"Add to Cart\"]")).click();

   Thread.sleep(5000);

   driver.findElement(By.xpath("//button[@data-role=\"proceed-to-checkout\"]")).click();
        Thread.sleep(5000);
   driver.findElement(By.xpath("//label[@data-bind=\"attr: {'for': getCode()}\"][@for=\"cashondelivery\"]")).click();
        Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mostafabadawy@gmail.com");
        Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Mustafa");
        Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Badawy");
        Thread.sleep(5000);
   driver.findElement(By.xpath("//select[@class=\"select\"][@name=\"region_id\"]")).equals(2);
        Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name=\"street[0]\"]")).sendKeys("Maadi,Cairo");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Cairo");
        Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("01094352517");

    }
}
