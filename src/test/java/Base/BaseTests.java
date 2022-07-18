package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import pages.FormPage;
public class BaseTests {
    private WebDriver driver;

    protected FormPage formPage;

    public BaseTests() {
    }

    @BeforeClass
    public void SetUp(){
        ChromeOptions options = new ChromeOptions();
        //options.setBinary("C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tienda.att.com.mx/");
        driver.get(
                "https://tienda.att.com.mx/customer/account/login?_gl=1*vxejgw*_up*MQ..&gclid=CjwKCAjwwdWVBhA4EiwAjcYJEJ7MuFXB-31t5VrBDz_jg7mHl2qpZCNcsKLyZOnrdhqZfKnlT3YoBBoC4BoQAvD_BwE&gclsrc=aw.ds");
        driver.manage().window().maximize();

        formPage = new FormPage(driver);

        //driver.quit();
    }
    public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.SetUp();
    }
}
