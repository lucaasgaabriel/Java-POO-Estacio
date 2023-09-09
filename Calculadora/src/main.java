public class main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        calc.numero1 = 20;
        calc.numero2 = 10;

        calc.soma();
        calc.sub();
        calc.mult();
        calc.div();
    }
}