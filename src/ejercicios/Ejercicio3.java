package ejercicios;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {

		Ejercicio3 test = new Ejercicio3();

		System.out.println("multiplicationTable test");
		System.out.println(test.multiplicationTable(2));
		System.out.println(test.multiplicationTable(3));

		System.out.println("calculateIncome test");
		System.out.println(test.calculateNetIncome("a", 1, 20000));
		System.out.println(test.calculateNetIncome("b", 7, 30000));
		System.out.println(test.calculateNetIncome("c", 14, 40000));

	}

	String multiplicationTable(int number) {

		int[] multiplicationTableResult = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 9; i++) {
			multiplicationTableResult[i] = (i + 1) * number;
		}

		return Arrays.toString(multiplicationTableResult);

	}

	int calculateNetIncome(String category, int years, int income) {

		int yearModifier = 0;
		int plus;

		switch (category) {
		case "a": {
			plus = 1000;
		}
		case "b": {
			plus = 2000;
		}
		case "c": {
			plus = 3000;
		}
		default:
			plus = 0;
		}

		if (years > 10) {
			yearModifier = 30;
		} else if (years > 5) {
			yearModifier = 10;
		} else if (years > 0) {
			yearModifier = 5;
		}

		int incomeResult = income + (income / 100) * yearModifier;
		incomeResult = incomeResult + plus;

		return incomeResult;
	}

}
