package Forms;

import Base.BaseTests;
import org.testng.annotations.Test;

public class FillFormTest extends BaseTests {
    @Test
    public void fillFormMale(){
        formPage.setFirstName("alan-anguiano@hotmail.com");
        formPage.setLastName("Rapsolo1<3");
        formPage.clickSubmitButton();
        formPage.clickBotonCelulares();
        formPage.clickBotonElemento();
        formPage.clickBotonPrepago();
        formPage.clickBotonAddC();
        formPage.clickBotonPrcederPago();
        formPage.setRfc("AUFA970104JN5");
        //formPage.setIne("124891530");
        formPage.setCelularContacto("5533927885");
        formPage.setDate("04 / 01 / 1997");
        formPage.clickCheckBoxes();
        formPage.clickBotonSiguiente();
        formPage.clickBotonRecibeCasa();
        formPage.clickBotonSiguiente2();
        formPage.setCodigoPostal("15610");
        formPage.setCalle("calle 2");
        formPage.setNoInterior("412");
        formPage.setReferencias("Casa Blanca");
        formPage.clickBotonSiguiente3();
        formPage.clickBotonAtt();
        formPage.clickBotonCelulares2();
        formPage.clickBotonElemento2();
        formPage.clickBotonSimplePlus();
        formPage.clickBoton18meses();
        formPage.clickBotonAddC2();
        formPage.clickBotonProcederPago2();
        formPage.clickBotonSiguiente4();
        formPage.clickBotonRecibeCasa2();
        formPage.clickBotonSiguiente5();
        formPage.setCalle2("2");
        formPage.setNoInterior2("412");
        formPage.setReferencias2("Casa blanca");
        formPage.clickBotonSiguiente6();
        formPage.clickBotonAtt2();
    }
}
