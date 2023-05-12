package examenm05;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {
    
    private Suma suma = new Suma();
    
    @Test
    public void comprovarSumaEnters() {
        int n1 = 3;
        int n2 = 3;
        int ResultatEsperat = 6;
        int resultat = suma.sumaEnters(n1, n2);
        assertEquals(ResultatEsperat, resultat);
    }
    
    @Test
    public void comprovarGetValor1() {
        int n1 = 3;
        int n2 = 3;
        int ResultatEsperat = 3;
        int resultat = suma.getNombre1(n1, n2);
        assertEquals(ResultatEsperat, resultat);
    }
    
    @Test
    public void comprovarValorAbsolut() {
        int ResultatEsperat = 6;
        int resultat = suma.sumaValorAbsolut(-3, 3);
        assertEquals(ResultatEsperat, resultat);
    }
}
