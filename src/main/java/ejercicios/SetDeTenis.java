package ejercicios;
import java.util.Scanner;



public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if ((numVictoriasA >= 6 && numVictoriasB <= 4) || (numVictoriasB >= 6 && numVictoriasA <= 4)) {
            return "Inválido";
        } else if (numVictoriasA >= 6 && numVictoriasB >= 6) {
            if (Math.abs(numVictoriasA - numVictoriasB) == 1) {
                return "Aún no termina";
            } else {
                return (numVictoriasA > numVictoriasB) ? "Ganó A" : "Ganó B";
            }
        } else {
            return "Aún no termina";
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganados por A: ");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B: ");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}






