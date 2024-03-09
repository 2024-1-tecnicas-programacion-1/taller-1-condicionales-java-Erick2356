package test;

import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenisTest {
    @Test
    public void testAunNoTermina() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(4, 5);
        assertEquals(valorEsperado, valorActual);
    }
    public void testGanoA() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(6, 4);
        assertEquals(valorEsperado, valorActual);
    } public void testGanoB() {
        String valorEsperado = "Ganó B";
        String valorActual = SetDeTenis.evaluar(4, 6);
        assertEquals(valorEsperado, valorActual);
    }public void testInvalido() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(7, 3);
        assertEquals(valorEsperado, valorActual);
    
    // TODO: Agrega tus otros casos de prueba aquí
}
