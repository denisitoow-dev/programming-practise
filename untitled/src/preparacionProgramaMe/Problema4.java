package preparacionProgramaMe;

import java.util.HashMap;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticiones =  scan.nextInt();
        HashMap<String, Integer> cartas = new HashMap<>();
        cartas.put("A", 4);
        cartas.put("K", 3);
        cartas.put("Q", 2);
        cartas.put("J", 1);
        for (int i = 0; i < repeticiones; i++) {
            HashMap<Integer, Integer> palos = new HashMap<>();
            palos.put(1, 0);
            palos.put(2, 0);
            palos.put(3, 0);
            palos.put(4, 0);
            int puntos = 0;
            for (int j = 0; j < 13; j++) {
                String numero = scan.next();
                String palo = scan.next();
                if (cartas.containsKey(numero)){
                    puntos += cartas.get(numero);
                }
                switch (palo){
                    case "C":
                        palos.put(1, palos.get(1) + 1);
                        break;
                    case "D":
                        palos.put(2, palos.get(2) + 1);
                        break;
                    case "T":
                        palos.put(3, palos.get(3) + 1);
                        break;
                    case "P":
                        palos.put(4, palos.get(4) + 1);
                        break;
                }
            }
            for (int palo = 1; palo < 5; palo++){
                if (palos.get(palo) == 0){
                    puntos += 3;
                }else if (palos.get(palo) == 1){
                    puntos += 2;
                }else if (palos.get(palo) == 2){
                    puntos += 1;
                }
            }

            System.out.println(puntos);
        }
    }
}
