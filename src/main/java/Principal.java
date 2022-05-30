public class Principal {
    public static void main(String[] args) {
        System.out.println("Haga sus cuentas");
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(6, 2));
        System.out.println(calc.restar(6, 2));
        System.out.println(calc.multiplicar(6, 2));
        System.out.println(calc.dividir(6, 2));
    }
}
