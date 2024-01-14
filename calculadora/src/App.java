public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calc = new Calculadora();
        calc.SetNumero1(10);
        calc.SetNumero2(4);

        System.out.println("Numero 1:"+ calc.getNumero1());
        System.out.println("Numero 2:"+ calc.getNumero1());

        System.out.println("Soma:..."+ calc.Soma());
        System.out.println("Diferença:...." + calc.diferenca());
        System.out.println("Produto:...." + calc.produto());
        System.out.println("Duvisao:..." + calc.divisao());
        
    }
}