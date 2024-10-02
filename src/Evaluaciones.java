import java.util.Random;
import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluacion = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();

            if (nota!= -1) {


            // mediaEvaluacion = mediaEvaluacion + nota;
            mediaEvaluacion += nota;
            totalEvaluacion++;

            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluacion / totalEvaluacion);


    }
}

