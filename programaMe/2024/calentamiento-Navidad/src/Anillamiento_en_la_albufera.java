package calentamientonavidenyo;

import java.util.Scanner;
public class Anillamiento_en_la_albufera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        do {
            int libres = 0;
            if (casos != 0) {
                for (int i = 0; i < casos; i++) {
                    int liberados = scan.nextInt();
                    int anillados = scan.nextInt();
                    int total = liberados - anillados;
                    libres+= total;
                }
                System.out.println(libres);
                casos = scan.nextInt();
            }
        } while (casos != 0);
    }
}
