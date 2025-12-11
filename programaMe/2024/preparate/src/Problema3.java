package preparacionProgramaMe;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long dias;
        long emisoras;
        do {
            dias = scan.nextInt();
            emisoras = scan.nextInt();
            if (dias != 0 || emisoras!=0){
                long totalSegundos = dias * emisoras * 6 * 24;
                long dia = totalSegundos / (24 * 60 * 60);
                long hora = (totalSegundos % (24 * 60 * 60)) / 3600;
                long minuto = (totalSegundos % 3600) / 60;
                long segundo = totalSegundos % 60;
                System.out.printf("%d:%02d:%02d:%02d\n", dia, hora, minuto, segundo);
            }
        }while (dias != 0 || emisoras !=0);
    }
}
