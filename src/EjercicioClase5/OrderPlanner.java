package EjercicioClase5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class OrderPlanner {

	public static void main(String[] args) {

		File file = new File("C://Curso Java Capgemini//resources//pedidos.txt");
		File newFile = new File("C://Curso Java Capgemini//resources//pedidos.csv");

		try {

			BufferedReader in = new BufferedReader(new FileReader(file));
			PrintWriter out = new PrintWriter(new FileWriter(newFile));

			out.print("Pedido;");
			out.print("Bolson;");
			out.print("Huevos x30;");
			out.print("Kiwi;");
			out.println();

			String order = in.readLine();

			while (order != null) {

				out.print(order + ";");

				String article = null;
				String bolson = "";
				String huevos = "";
				String kiwi = "";

				StringTokenizer st = new StringTokenizer(order, "+");

				while (st.hasMoreTokens()) {

					article = st.nextToken().toString();

					String articleAmount = "";
					StringTokenizer st2 = new StringTokenizer(article, " ");
					articleAmount = st2.nextToken();

					if (article.indexOf("Bolson") > 1) {
						bolson = articleAmount;
					}

					if (article.indexOf("Huevos") > 1) {
						huevos = articleAmount;
					}

					if (article.indexOf("Kiwi") > 1) {
						kiwi = articleAmount;
					}

				}
				
				out.print(bolson + ";" + huevos + ";" + kiwi + ";");

				out.println();

				order = in.readLine();
			
			}

			in.close();
			out.close();

		} catch (FileNotFoundException e1) {
			System.err.println("File not found: " + file);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
