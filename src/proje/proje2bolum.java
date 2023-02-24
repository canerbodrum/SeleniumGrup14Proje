package proje;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class proje2bolum extends BaseDriver {
    public static void main(String[] args) {
//        Test Case 2: Giriş Yapma
//• Siteye gidiniz.
        driver.get("https://itera-qa.azurewebsites.net/");
//• “Login” butonuna tıklatınız.
        WebElement login= driver.findElement(By.xpath("//*[@href='/Login']"));
        login.click();
//• Oluşturmuş olduğunuz username ve password’u giriniz.
        WebElement wusername= driver.findElement(By.xpath("//*[@id='Username']"));
        wusername.sendKeys("1odev");

        WebElement wpass= driver.findElement(By.xpath("//*[@id='Password']"));
        wpass.sendKeys("password");
//• Login Butonuna tıklayınız.
        WebElement clicklogin= driver.findElement(By.xpath("//*[@name='login']"));
        clicklogin.click();

        WebElement check= driver.findElement(By.xpath("//*[text()='Welcome 1odev']"));
        System.out.println(check.getText());


        Assert.assertTrue("hatalı oldu",check.getText().equals("Welcome 1odev"));

        if (check.getText().equals("Welcome 1odev"))
            System.out.println("Test Başarılı");
        else
            System.out.println("Test Hatalı");
//• Siteye giriş yaptığınızı doğrulayınız.
    }
}
