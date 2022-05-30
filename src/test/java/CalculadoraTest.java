import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void sumarTest(){
        //Instrucciones
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(6, 2);
        assertEquals(8, resultado);
    }
    @Test
    public void restarTest(){
        //Instrucciones
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(6, 2);
        assertEquals(4, resultado);

    }
    @Test
    public void multiplicarTest(){
        //Instrucciones
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(6, 2);
        assertEquals(12, resultado);

    }
    @Test
    public void dividirTest(){
        //Instrucciones
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(6, 2);
        assertEquals(3, resultado);

    }
}
