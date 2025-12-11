package las12Uvas;

import java.util.Scanner;

public class Cuando_Volvera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anyo = scan.nextInt();
        while (anyo > 0) {
            int a = scan.nextInt();
            int primerafecha = anyo +74*a;
            int segundafecha = anyo +79*a ;
            System.out.println("[" +primerafecha + " .. "+segundafecha + "]");
            anyo = scan.nextInt();
        }
    }
}
