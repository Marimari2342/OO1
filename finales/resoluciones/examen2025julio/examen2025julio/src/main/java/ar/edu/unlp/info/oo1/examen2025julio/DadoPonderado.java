package ar.edu.unlp.info.oo1.examen2025julio;

import java.util.Map;
import java.util.Random;

public class DadoPonderado implements Dado {
    private Random random;
    private Map<Integer, Integer> pesos;

    public DadoPonderado(Map<Integer, Integer> pesos) {
        this.random = new Random();
        this.pesos = pesos;
    }

    public int lanzar() {
        int totalPeso = pesos.values()
                             .stream()
                             .mapToInt(Integer::intValue)
                             .sum();

        int aleatorio = random.nextInt(totalPeso) + 1;

        int acumulado = 0;

        for (Map.Entry<Integer, Integer> entrada : pesos.entrySet()) {
            acumulado += entrada.getValue();

            if (aleatorio <= acumulado) {
                return entrada.getKey();
            }
        }

        return 1; // nunca debería llegar
    }
}
