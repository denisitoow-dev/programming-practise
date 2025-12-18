package preparacionProgramaMe;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticions =  scan.nextInt();
        for (int i = 0; i < repeticions; i++) {
            int anyo = scan.nextInt();
            if (anyo > 0) {
                anyo--;
            }
            System.out.println(anyo);
        }
    }
}
