import java.util.Scanner;
public class Usacalculadora { 
    public static void main (String[] args){
        Scanner leia     = new Scanner (System.in);
        Scanner leiaStr  = new Scanner (System.in);

        Calculadora calc = new Calculadora();
        int opcao = 0;
        do {
         System.out.println("------------------");
         System.out.println("-Calculadora-");
         System.out.println("--------------------"); 
         System.out.println("1) Entrar com numero 1(" + calc.getNumero1() +")");
         System.out.println("2) Entrar com numero 2(" + calc.getNumero2() +")");
         System.out.println("3) Somar");
         System.out.println("4) Subtrair");
         System.out.println("5) Multiplicar"); 
         System.out.println("6) Dividir");
         System.out.println("7) Sair");
         System.out.println("--------------------");
         System.out.println("Opcao:");
         opcao = leia.nextInt();
         switch (opcao) {
            case 1:
                System.out.print("Numero 1:");
                calc.SetNumero1(leia.nextInt());
                break;

            case 2: 
                System.out.print("Numero 2:");
                calc.SetNumero2(leia.nextInt());
                break;

                case 3:
                System.out.print("Soma: " + calc.Soma());
                break;

                case 4:
                System.out.print("Diferenca:" + calc.diferenca());
                break;

                case 5:
                System.out.print("Produto:" + calc.produto());
                break;
                
                case 6:
                System.out.print("Divisao:" + calc.divisao());
                break;

                case 7:
                System.out.print("Fim do programa!");
                break;

            default:
                System.out.print("opcao invalida!");
                
         }
        } while (opcao != 7);

    }

    
}

    
    

