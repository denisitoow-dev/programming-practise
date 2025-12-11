package las12Uvas;

import java.util.Scanner;

public class Cuatro_centimetros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticions =  scan.nextInt();
        for (int i = 0; i < repeticions; i++) {
            int anyos = scan.nextInt();
            int resultado = 4*anyos;
            System.out.println(resultado);
        }
    }
}
