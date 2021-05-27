import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
    public static StringCalculator test;

    @BeforeAll
    public static void setUpClass() {
        test = new StringCalculator();
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        test = new StringCalculator();
    }

    @Test
    void checkEntradaVacia(){
    int resultadoFinal = test.add("1,2,0,4,5,7,8,77,1");
    int resultadoEsperado = 105;

        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    void checkNuevasLineas(){
        int resultadoFinal = test.add("1\n2,3");
        int resultadoEsperado = 6;

        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    void checknuevoDelimitador(){
        int resultadoFinal = test.add("//;\n1;2");
        int resultadoEsperado = 3;

        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    void checkNoNegativos(){
        int resultadoFinal = test.add("//+\n-2+1000");
        int resultadoEsperado = 2;

        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    void checkNoMayorAMil(){
        int resultadoFinal = test.add("//+\n2+1000");
        int resultadoEsperado = 1002;

        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    void checkDelimitadorMasCaracteres(){
        int resultadoFinal = test.add("//[—]\n1—2—3");
        int resultadoEsperado = 6;

        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    void checkVariosDelimitadores(){
        int resultadoFinal = test.add("//[-][%]\n1-2%3");
        int resultadoEsperado = 6;

        assertEquals(resultadoEsperado, resultadoFinal);
    }
}