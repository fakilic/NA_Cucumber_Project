package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver homepageDriver;
    public HomePage(WebDriver driver){
        this.homepageDriver=driver;
        PageFactory.initElements(homepageDriver, this);

    }

    @FindBy(how= How.XPATH, using= "//img[@alt=\"Let's Kode It\"]")
    public static WebElement homeImg;

    @FindBy(how= How.XPATH, using = "//a[@href='/pages/practice']")
    public static WebElement practiseBtn;

    @FindBy(how= How.XPATH, using = "//a[@href='/sign_up']")
    public static WebElement enrollNow;

    public void clickPractice(){
        practiseBtn.click();}

public void validateHomeSrc(String expectedSrc){
  String actualSrc=  homeImg.getAttribute("src");
    assert(actualSrc.equals(expectedSrc));
    //https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=height:60/https://www.filepicker.io/api/file/WSundQ6BT6u2OZe2kcNA
}
public void isEnrollnowDisplayed(){
        enrollNow.isDisplayed();
}
}
