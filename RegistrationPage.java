package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.id("LastName")).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
    }

    public void clickRegister() {
        driver.findElement(By.id("register-button")).click();
    }
}