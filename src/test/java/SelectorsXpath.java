import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsXpath {

    @Test
    public void iLcarroXpathTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ilcarro.web.app/home");


        driver.findElement(By.xpath("//a[@ng-reflect-router-link='login']")).click();
        driver.findElement(By.id("email")).sendKeys("svetamoshkovich@outlook.com");
        driver.findElement(By.id("password")).sendKeys("12345Rassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        pause(6);


        WebElement okButton = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
        okButton.click();


        pause(3);


        WebElement btnLogout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        btnLogout.click();


        pause(4);


        driver.get("https://ilcarro.web.app/home");

        pause(3);

        driver.quit();
    }

    public void pause(int time){
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}