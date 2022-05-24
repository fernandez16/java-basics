package EjercicioClase5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class OrderWriter {

	public static void main(String[] args) {
		
		File file = new File("C://Curso Java Capgemini//resources//pedidosTest.txt");
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			OrderReader ordRead = new OrderReader();
			
			String s;

			while ((s = in.readLine()) != null) {
				out.println(s);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}