package las12Uvas;

import java.util.ArrayList;
import java.util.Scanner;

public class Diseminacion_Luces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int luces = scan.nextInt();
        while (luces > 0) {
            int diseminacion = 0 ;
            ArrayList<Integer> led = new ArrayList<>();
           for (int i = 0; i < luces; i++) {
               int luz = scan.nextInt();
               if (led.contains(luz)) {
                   int ojo = led.indexOf(luz);
                   diseminacion+= led.size() - ojo ;
               }
               led.add(luz);
           }

           System.out.println(diseminacion);
            luces = scan.nextInt();
        }
    }
}
