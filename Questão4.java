import java.util.Scanner;
public class 8PSC {

public static char analise(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = computador.nextInt();

        char resultado = analise(num);

        System.out.println("Resultado: " + resultado);

        computador.close();
    }
}
    