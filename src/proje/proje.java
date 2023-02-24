package proje;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class proje extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement sign=driver.findElement(By.cssSelector("[href='/UserRegister/NewUser']"));
        sign.click();

        String isim="ahmet";
        WebElement ad=driver.findElement(By.cssSelector("[id='FirstName']"));
        ad.sendKeys(isim);

        String soyisim="caner";
        WebElement soyad=driver.findElement(By.cssSelector("[id='Surname']"));
        soyad.sendKeys(soyisim);

        WebElement email=driver.findElement(By.cssSelector("[id='E_post']"));
        email.sendKeys("test@gmail.com");

        WebElement gsm=driver.findElement(By.cssSelector("[id='Mobile']"));
        gsm.sendKeys("0555555555");

        WebElement username=driver.findElement(By.cssSelector("[id='Username']"));
        username.sendKeys("1odev");

        WebElement pass=driver.findElement(By.cssSelector("[id='Password']"));
        pass.sendKeys("password");

        WebElement confirm=driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        confirm.sendKeys("password");

        WebElement submit=driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();

        WebElement textcheck= driver.findElement(By.cssSelector("[class='label-success']"));

        if (textcheck.getText().equals("Registration Successful"))
            System.out.println("test başarılı");
        else
            System.out.println(" hatalı");

        Assert.assertTrue("Hatalı oldu",textcheck.getText().equals("Registration Successful"));

        System.out.println(""+textcheck.getText());
    }
}
