public class Calculadora {
    public int numero1;
    public int numero2;

    public void soma(){
        System.out.println("Soma: " + (numero1 + numero2));
    }

    public void sub(){
        System.out.println("Subtração: " + (numero1 - numero2));
    }

    public void mult(){
        System.out.println("Multiplicação: " + (numero1 * numero2));
    }

    public void div(){
        System.out.println("Divisão: " + (numero1 / numero2));
    }

    public static void main (String[] args) {
        Calculadora calc = new Calculadora();

        calc.numero1 = 20;
        calc.numero2 = 10;

        calc.soma();
        calc.sub();
        calc.mult();
        calc.div();
    }
}
