package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(By.id("small-searchterms")).sendKeys(productName);
        driver.findElement(By.cssSelector("input[value='Search']")).click();
    }

    public void clickComputerBooks() {
        driver.findElement(By.linkText("Computer Books")).click();
    }
}