package calentamientonavidenyo;

import java.util.Scanner;
public class Colgadas_o_colgantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticiones = scan.nextInt();
        String palabra = "COLGADAS";
        scan.nextLine();
        for (int i = 0; i < repeticiones; i++) {
            String nombre = scan.nextLine().toUpperCase();
            if (nombre.equals(palabra)) {
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
    }
}