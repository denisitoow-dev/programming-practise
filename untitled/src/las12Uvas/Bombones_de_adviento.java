package las12Uvas;

import java.util.ArrayList;
import java.util.Scanner;

public class Bombones_de_adviento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        while (numero1 > 0) {
            ArrayList<Integer> bombones = new ArrayList<>();
            bombones.add(numero1);
            int bombon = scan.nextInt();
            while(bombon > 0) {
                bombones.add(bombon);
                bombon = scan.nextInt();
            }
            int minimo= 0;
            for (int i = 0; i < bombones.size() - 1; i++) {
                if (bombones.get(i) + bombones.get(i + 1) > minimo) {
                minimo = bombones.get(i) + bombones.get(i + 1);
                }
                else if (bombones.get(i) + bombones.get(i - 1) > minimo && i > 0) {
                    minimo = bombones.get(i) - bombones.get(i - 1);
                }
            }
            System.out.println(minimo);
            numero1 = scan.nextInt();
        }
    }
}

