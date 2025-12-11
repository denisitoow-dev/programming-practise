package las12Uvas;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto_de_polvorones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limite = scan.nextInt();
        while (limite > 0) {
            int polvorones = scan.nextInt();
            ArrayList<Integer> polvoronesmax = new ArrayList<>();
            for (int i = 0; i < polvorones; i++) {
                int polvoron = scan.nextInt();
                polvoronesmax.add(polvoron);
            }
            ArrayList<Integer> polvoronesmesa = new ArrayList<>();
            for (int i = 0; i < polvorones; i++) {
                int polvoron = scan.nextInt();
                polvoronesmesa.add(polvoron);
            }
            boolean demas = false;

            int suma = 0;
            for (int i = 0; i < polvoronesmax.size(); i++) {
                if (polvoronesmax.get(i) >= polvoronesmesa.get(i)) {
                    suma += polvoronesmesa.get(i);
                }
                else demas = true;
            }
            if (limite >= suma && !demas) {
                System.out.println("SI");
            }
            else System.out.println("NO");
            limite = scan.nextInt();
        }
    }
}

