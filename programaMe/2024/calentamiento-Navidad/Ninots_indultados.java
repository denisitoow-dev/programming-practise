package calentamientonavidenyo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Ninots_indultados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int votos = scan.nextInt();
        do {
            if (votos != 0) {
                ArrayList<String> ninotsAdultos = new ArrayList<>();
                ArrayList<String> ninotsInfantiles = new ArrayList<>();
                for (int i = 0; i < votos; i++) {
                    String voto = scan.next();
                    if (voto.equals(voto.toUpperCase())) {
                        ninotsAdultos.add(voto);
                    }
                    else ninotsInfantiles.add(voto);
                }
                HashMap<String, Integer> contadorAdultos = new HashMap<>();
                HashMap<String, Integer> contadorInfantiles = new HashMap<>();
                for (int i = 0; i < ninotsAdultos.size(); i++) {
                    if (contadorAdultos.containsKey(ninotsAdultos.get(i))) {
                        contadorAdultos.put(ninotsAdultos.get(i),+ 1);
                    }
                    else contadorAdultos.put(ninotsAdultos.get(i), 1);
                }
                for (int i = 0; i < ninotsInfantiles.size(); i++) {
                    if (contadorInfantiles.containsKey(ninotsInfantiles.get(i))) {
                        contadorInfantiles.put(ninotsInfantiles.get(i), contadorInfantiles.get(i) + 1);
                    }
                    else contadorInfantiles.put(ninotsInfantiles.get(i), 1);
                }
                for (int i = 0; i < ninotsAdultos.size(); i++) {
                    System.out.println(contadorAdultos);
                }
            }
        } while (votos != 0);
    }
}