package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FormPage {
    WebDriver driver;

    private By elementSubmitButton = By.id("send2");
    private By elementBotonCelulares = By.linkText("Celulares");
    private By elementBotonModelo = By.cssSelector("#amasty-shopby-product-list > div.products.wrapper.grid.products-grid > ol > li:nth-child(1) > div.product-item-info > a > span > span > img");
    private By elementBotonPrepago = By.cssSelector("#plan-att > div > div.select-dropdown-item.set-package.selected");
    private By elementBotonAddC = By.id("product-addtocart-button");
    private By elementBotonProcederPago = By.cssSelector("#maincontent > div.columns > div > div.cart.totals > div > div.content_total > div.cart-action-in-totals > a");
    private By elementCheckBoxes = By.cssSelector("#checkout-step-personal > div > div.container-checkbox-boletin-terminos > fieldset > div.field._error > div > div.admin__field.admin__field-option > label");
    private By elementBotonSiguiente = By.id("control_btn_checkout_footer");
    private By elementBotonRecibeCasa = By.className("container-img-shipping-house");
    private By elementBotonSiguiente2 = By.id("control_btn_checkout_footer");
    private By elementBotonModelo2 = By.cssSelector("#amasty-shopby-product-list > div.products.wrapper.grid.products-grid > ol > li:nth-child(2) > div.product-item-info > a > span > span > img");
    private By elementBotonSimplePlus = By.cssSelector("#plan-att > div > div:nth-child(2)");
    private By elementBoton18meses = By.id("18mensualidades");
    private By elementBotonAddC2 = By.id("add");
    private By elementBotonSiguiente4 = By.id("control_btn_checkout_footer");
    private By elementBotonRecibeCasa2 = By.className("container-img-shipping-house");;

    public FormPage(WebDriver driver) {

        this.driver = driver;
    }

    public By locateFieldById(String id) {

        return By.id(id);
    }

    public By locteFielByName(String name) {
        return By.name(name);
    }

    public void setFirstName(String firstName) {
        String jsSyyle = "'3px solid green'";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border=" + jsSyyle, driver.findElement(locateFieldById("email")));
        
        driver.findElement(locateFieldById("email")).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        String jsSyyle = "'3px solid green'";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border=" + jsSyyle, driver.findElement(locateFieldById("pass")));

        driver.findElement(locateFieldById("pass")).sendKeys(lastName);
    }

    public void clickSubmitButton() {
        driver.findElement(elementSubmitButton).click();
    }

    public void clickBotonCelulares() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonCelulares));
        driver.findElement(elementBotonCelulares).click();
    }

    public void clickBotonElemento() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonModelo));
        driver.findElement(elementBotonModelo).click();
    }

    public void clickBotonPrepago() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonPrepago));
        driver.findElement(elementBotonPrepago).click();
    }

    public void clickBotonAddC() {
        driver.findElement(elementBotonAddC).click();
    }

    public void clickBotonPrcederPago() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonProcederPago));
        driver.findElement(elementBotonProcederPago).click();
    }

    public void setRfc(String rfc) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.name("titular_rfc")));
        driver.findElement(By.name("titular_rfc")).sendKeys(rfc);
    }

    /*public void setIne(String ine) {
        driver.findElement(By.name("titular_numero_identificacion")).sendKeys(ine);
    }*/

    public void setCelularContacto(String celularContacto) {
        driver.findElement(By.name("titular_telephone")).sendKeys(celularContacto);
    }

    public void setDate(String date) {
        driver.findElement(By.name("titular_dob")).sendKeys(date);
    }

    public void clickCheckBoxes() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.cssSelector("#checkout-step-personal > div > div.container-checkbox-boletin-terminos > fieldset > div.field._error > div > div.admin__field.admin__field-option > label")));
        driver.findElement(elementCheckBoxes).click();
    }

    public void clickBotonSiguiente() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(elementBotonSiguiente).click();
    }

    public void clickBotonRecibeCasa() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonRecibeCasa));
        driver.findElement(elementBotonRecibeCasa).click();
    }

    public void clickBotonSiguiente2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonSiguiente2));
        driver.findElement(elementBotonSiguiente2).click();
    }

    public void setCodigoPostal(String codigoPostal) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("postcode")).sendKeys(codigoPostal);
    }

    public void setCalle(String calle) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div._required:nth-child(13) > div:nth-child(2) > input:nth-child(1")).sendKeys(calle);
    }

    public void setNoInterior(String noInterior) {
        driver.findElement(By.name("numero_exterior")).sendKeys(noInterior);
    }

    public void setReferencias(String referencias) {
        final WebElement referenciaInput = driver.findElement(By.cssSelector("#shipping-new-address-form > div:nth-child(17) > div > textarea"));
        referenciaInput.sendKeys(referencias);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("!!document.activeElement ? document.activeElement.blur() : 0");
    }

    public void clickBotonSiguiente3() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonSiguiente));
        driver.findElement(elementBotonSiguiente).click();
    }

    public void clickBotonAtt() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tienda.att.com.mx/");
    }

    public void clickBotonCelulares2() {
        driver.findElement(elementBotonCelulares).click();
    }
    public void clickBotonElemento2(){
        driver.findElement(elementBotonModelo2).click();
    }
    public void clickBotonSimplePlus(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonSimplePlus));
        driver.findElement(elementBotonSimplePlus).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.querySelector(\".set-package\").scrollHeight+300);");
    }
    public void clickBoton18meses(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBoton18meses));
        driver.findElement(elementBoton18meses).click();
    }
    public void clickBotonAddC2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonAddC2));
        driver.findElement(elementBotonAddC2).click();}
    public void clickBotonProcederPago2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonProcederPago));
        driver.findElement(elementBotonProcederPago).click();
    }
    public void clickBotonSiguiente4(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonSiguiente4));
        driver.findElement(elementBotonSiguiente4).click();
    }
    public void clickBotonRecibeCasa2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonRecibeCasa2));
        driver.findElement(elementBotonRecibeCasa2).click();
    }
    public void clickBotonSiguiente5(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonSiguiente4));
        driver.findElement(elementBotonSiguiente4).click();}
    public void setCalle2(String calle) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div._required:nth-child(13) > div:nth-child(2) > input:nth-child(1")).clear();
        driver.findElement(By.cssSelector("div._required:nth-child(13) > div:nth-child(2) > input:nth-child(1")).sendKeys(calle);
    }
    public void setNoInterior2(String noInterior) {
        driver.findElement(By.name("numero_exterior")).sendKeys(noInterior);
    }

    public void setReferencias2(String referencias) {
        final WebElement referenciaInput = driver.findElement(By.cssSelector("#shipping-new-address-form > div:nth-child(17) > div > textarea"));
        referenciaInput.sendKeys(referencias);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("!!document.activeElement ? document.activeElement.blur() : 0");
    }
    public void clickBotonSiguiente6(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementBotonSiguiente4));
        driver.findElement(elementBotonSiguiente4).click();
    }
    public void clickBotonAtt2() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tienda.att.com.mx/");
    }
}


