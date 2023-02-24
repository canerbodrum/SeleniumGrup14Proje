package proje;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class proje3bolum extends BaseDriver {
    public static void main(String[] args) {
    //• Siteye gidin.
    driver.get("https://itera-qa.azurewebsites.net/");
    //• Siteye giriş yapın.
        WebElement login= driver.findElement(By.xpath("//*[@href='/Login']"));
        login.click();

        WebElement wusername= driver.findElement(By.xpath("//*[@id='Username']"));
        wusername.sendKeys("1odev");

        WebElement wpass= driver.findElement(By.xpath("//*[@id='Password']"));
        wpass.sendKeys("password");

        WebElement clicklogin= driver.findElement(By.xpath("//*[@name='login']"));
        clicklogin.click();

    //• “CREATE NEW” Butonuna tıklayınız.
        WebElement clickcreate= driver.findElement(By.xpath("//*[contains(text(),'Create')]"));
        clickcreate.click();
    //• Customer altındaki formu doldurunuz.
        WebElement name= driver.findElement(By.xpath("//*[@id='Name']"));
        name.sendKeys("ahmet");

        WebElement company= driver.findElement(By.xpath("//*[@id='Company']"));
        company.sendKeys("tester");

        WebElement address= driver.findElement(By.xpath("//*[@id='Address']"));
        address.sendKeys("Türkkuyusu");

        WebElement city=driver.findElement(By.xpath("//*[@id='City']"));
        city.sendKeys("bodrum");

        WebElement gsm=driver.findElement(By.xpath("//*[@id='Phone']"));
        gsm.sendKeys("055555555");

        WebElement email=driver.findElement(By.xpath("//*[@id='Email']"));
        email.sendKeys("testerlar@gmail.com");


    //• Create Butonuna tıklatınız
        WebElement create=driver.findElement(By.xpath("//*[@class='col-md-offset-2 col-md-10']/input"));
        create.click();
}}
