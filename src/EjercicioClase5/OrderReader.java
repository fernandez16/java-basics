package EjercicioClase5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class OrderReader {
	public static void main(String[] args) {

		File file = new File("C://Curso Java Capgemini//resources//pedidos.txt");

		try {

			BufferedReader in = new BufferedReader(new FileReader(file));
			OrderWriter wrt = new OrderWriter();
			
			String s;
			
			s = in.readLine();
			
			while (s != null) {
				
				StringTokenizer sf = new StringTokenizer (s, "+");
				
				while (sf != null) {
					
				}
				
				System.out.println(s);
				s = in.readLine();
			}
			
			in.close();
		
		} catch (FileNotFoundException e1) {
			System.err.println("File not found: " + file);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
