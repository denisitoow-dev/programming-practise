package calentamientonavidenyo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ninots_indultados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int votos = scan.nextInt();
        while (votos != 0) {
            ArrayList<String> ninotsAdultos = new ArrayList<>();
            ArrayList<String> ninotsInfantiles = new ArrayList<>();
            int maxA = 0;
            int maxI = 0;
            for (int i = 0; i < votos; i++) {
                String voto = scan.next();
                if (voto.equals(voto.toUpperCase())) {
                    ninotsAdultos.add(voto);
                } else ninotsInfantiles.add(voto);
            }
            HashMap<String, Integer> contadorAdultos = new HashMap<>();
            HashMap<String, Integer> contadorInfantiles = new HashMap<>();
            for (String ninotsAdulto : ninotsAdultos) {
                int votosActuales;
                if (contadorAdultos.containsKey(ninotsAdulto)) {
                    votosActuales = contadorAdultos.get(ninotsAdulto) + 1;
                } else {
                    votosActuales = 1;
                }
                contadorAdultos.put(ninotsAdulto, votosActuales);
                if (votosActuales > maxA) {
                    maxA = votosActuales;
                }
            }
            for (String ninotsInfantil : ninotsInfantiles) {
                int votosActuales;
                if (contadorInfantiles.containsKey(ninotsInfantil)) {
                    votosActuales = contadorInfantiles.get(ninotsInfantil) + 1;
                } else {
                    votosActuales = 1;
                }
                contadorInfantiles.put(ninotsInfantil, votosActuales);
                if (votosActuales > maxI) {
                    maxI = votosActuales;
                }
            }

            String ganadorA = "";
            String ganadorI = "";
            int numGanadoresA = 0;
            int numGanadoresI = 0;

            for (String nombre : contadorAdultos.keySet()) {
                if (contadorAdultos.get(nombre) == maxA) {
                    ganadorA = nombre;
                    numGanadoresA++;
                }
            }

            for (String nombre : contadorInfantiles.keySet()) {
                if (contadorInfantiles.get(nombre) == maxI) {
                    ganadorI = nombre;
                    numGanadoresI++;
                }
            }

            if (numGanadoresA > 1) {
                ganadorA = "EMPATE";
            }
            if (numGanadoresI > 1) {
                ganadorI = "empate";
            }
            System.out.println(ganadorI + " " + ganadorA);
            votos = scan.nextInt();
        }
    }
}