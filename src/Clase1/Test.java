package Clase1;

public class Test {

	public static void main(String[] args) {
		// llamada a metodo de clase, el metodo es STATIC (findArea)
		double area = Circle.findArea(7.5);
		System.out.print("Area of circle=" +area);
		
		// llamada a metodo de objeto
		// crear una instancia con NEW
		Circle circulo = new Circle(); // instanciacion
		int perimetro = circulo.calcularPerimetro(5);
		System.out.print("Area of circle=" + perimetro);
		System.out.print("Area of circle=" + circulo.calcularPerimetro(8));
	}

}
