import java.util.Scanner;

public class ConversaoHorario {

    public static String converterHora(int hora, int minuto) {
        int hora12;
        String amPm;

        if (hora >= 12) { 
            amPm = "P.M.";
            if (hora > 12) {
                hora12 = hora - 12; 
            } else {
                hora12 = hora; 
            }
        } else { // Se for AM
            amPm = "A.M.";
            if (hora == 0) {
                hora12 = 12;
            } else {
                hora12 = hora; 
            }
        }

        return hora12 + ":" + minuto + " " + amPm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Digite a hora em 24h: ");
            int hora = scanner.nextInt();

            System.out.print("Digite os minutos: ");
            int minuto = scanner.nextInt();

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Hora ou minuto inválido.");
            } else {
                String horaConvertida = converterHora(hora, minuto);
                System.out.println("A hora convertida é: " + horaConvertida);
            }

            System.out.print("Quer fazer outra conversão? (s/n): ");
            repetir = scanner.next().charAt(0);

        } while (repetir == 's' || repetir == 'S');

        scanner.close();
    }
}