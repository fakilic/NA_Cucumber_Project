import PageFactory.PracticePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1_silindi {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\HT Electronics\\NA_Bootcamp_Test\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HT Electronics\\NA_Bootcamp_Test\\geckodriver.exe" );
        WebDriver driver =new FirefoxDriver();


        driver.get("https://learn.letskodeit.com/p/practice");
        Thread.sleep(2000);


        PracticePage practicePage = new PracticePage(driver);
        practicePage.selectRadio();
                                                    // WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
                                                    //bmwRadio.click();
        practicePage.selectDropDn("honda");// WebElement dropDn= driver.findElement(By.id("carselect"));
                                                // Select sel = new Select(dropDn);// sel.selectByValue("honda");
        practicePage.multiSelect("apple");
        practicePage.multiSelect("peach"); //WebElement multiSelect= driver.findElement(By.id("multiple-select-example"));
                                                //Select sel2= new Select(multiSelect);
                                                // sel2.selectByValue("apple");
                                                // sel2.selectByValue(("peach"));
        practicePage.checkBenz();

                                                //WebElement benzCheck= driver.findElement(By.id("benzcheck"));
                                                //benzCheck.click();
        practicePage.enterNm("Fatih");
                                                //WebElement enterName= driver.findElement(By.name("enter-name"));
                                                //enterName.sendKeys("Fatih");
        practicePage.clickAlert();
                                                //WebElement alertBtn = driver.findElement(By.id("alertbtn"));
                                                //alertBtn.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(5000);


        driver.quit();
    }

}

