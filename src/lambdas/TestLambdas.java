package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdas {
	public static void main(String args[]) {
//		example1();
//		example2();
//		example3();
		example4();
	}

	public static void print(String str, StringFunction format) {
		String answer = format.run(str);
		System.out.println(answer);
	}

	public static void order(List<Country> list) {
		Collections.sort(list, new Comparator<Country>() {
			@Override
			public int compare(Country c1, Country c2) {
				return c1.name.compareTo(c2.name);
			}
		});
	}

	public static void orderWithLambdas(List<Country> list) {
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
	}

	public static void example1() {
		// before
		for (Integer num : Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)) {
			System.out.print(num + " ");
		}
		System.out.println();

		// after
		Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// another way
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(9);
		num.add(1);
		num.add(7);
		num.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		num.forEach(System.out::print);
	}

	public static void example2() {
		// use of the interface Consumer, to store a lambda expression on a variable
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(9);
		num.add(1);
		num.add(7);
		Consumer<Integer> method = (n) -> {
			System.out.print(n + " ");
		};
		num.forEach(method);
	}

	public static void example3() {
		// order lists with lambda expressions
		// compares the names of 2 different countries
		Country country1 = new Country("Morocco");
		Country country2 = new Country("Argelia");
		Country country3 = new Country("Tunisia");
		Country country4 = new Country("Lybia");
		Country country5 = new Country("Egypt");

		List<Country> countries = new ArrayList<Country>();
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		countries.add(country4);
		countries.add(country5);

		countries.forEach((p) -> {
			System.out.print(p.name + ", ");
		});
		System.out.println();

		order(countries);
		countries.forEach((p) -> {
			System.out.print(p.name + ", ");
		});
		System.out.println();

		Country country6 = new Country("Mali");
		countries.add(country6);

		orderWithLambdas(countries);
		countries.forEach((p) -> {
			System.out.print(p.name + ", ");
		});
		System.out.println();

		countries.forEach((p) -> {
			p.name = "test";
			System.out.print(p.name + ", ");
		});
		System.out.println();
	}

	public static void example4() {
		// we use a lambda expression within a method, the method
		// has to have an interface with a single unique method
		// as it´s type
		StringFunction exclamation = (s) -> s + "!";
		StringFunction question = (q) -> q + "?";
		print("Hi", exclamation);
		print("Hello", question);
	}
}
