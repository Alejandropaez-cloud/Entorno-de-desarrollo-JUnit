package daw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaqueteriaTest {
    @Test
    public void testCalcularTarifaZonaA() {
        boolean resultado = false;
        double resultadoEsperado = Paqueteria.calcularTarifaEnvio(3, "A");
        if (resultadoEsperado == 10) {
            resultado = true;
        }
        assertTrue(resultado,"El resultado esperado de un paquete de 3 kg en la zona A debe de ser de 10€ y dar true");
    }
    @Test
    public void testCalularTarifaZonaBConSuplemento (){
        boolean resultado = false;
        double resultadoEsperado = Paqueteria.calcularTarifaEnvio(6, "B");
        if (resultadoEsperado == 20) {
            resultado = true;
        }
        assertTrue(resultado,"El resultado esperad de un paquete de 6 kg en la zona B debe de ser de 20€ y dar true ");
    }   
    @Test
    public void testCalcularTarifaPesoInvalido(){
        boolean resultado = false;
        
        if (Paqueteria.calcularTarifaEnvio(-5, "A") == -1) {
            resultado = true;
            
        }
        assertTrue(resultado, "")
    }
    @Test
    public void testValidarIdentificadorCorrecto(){
        boolean resultado = false;
        double
    }
}
