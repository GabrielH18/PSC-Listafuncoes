package projetosjava;
import java.util.Scanner;

public class psc8 {
    public static void valordesejado(int n) {
        for (int n = 1; n <= n; n++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        
        imprimirPadrao(n);

      
        scanner.close();
    }
}