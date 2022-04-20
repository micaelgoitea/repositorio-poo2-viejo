package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	public int sumar (ArrayList<Integer> listOfNumbers) {
		int totalDeSuma = 0;
		for (int number: listOfNumbers) {
			totalDeSuma += number;
		}
		return totalDeSuma;
	}
	
	public int restar(ArrayList<Integer> numeros) {
        int result = 0;
        if (!numeros.isEmpty()) {
            result = numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                result -= numeros.get(i);
            }
        }
        return result;
    }
	
	public int multiplicar (ArrayList<Integer> listOfNumbers) {
		int totalDeMultiplicación = 1;
		for (int number: listOfNumbers) {
			totalDeMultiplicación *= number;
		}
		return totalDeMultiplicación;
	}
	
}