import java.util.Scanner;

public class somar {
  
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        int resultado = soma(n1, n2, n3);

        System.out.println("A soma determida dos números foi: " + resultado);

        scanner.close();
    }
}