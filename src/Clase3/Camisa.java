package Clase3;

public class Camisa {

	private String description;
	private char color;
	private double price;

	public Camisa(String desc, char color, double price) {
		this.description = desc;
		this.color = color;
		this.price = price;
	}

	public void setFields(String desc, char color, double price) {
		this.description = desc;
		this.color = color;
		this.price = price;
	}

	public String getFields() {
		return this.description + ", " + this.color + ", " + this.price;
	}

	@Override
	public String toString() {
		return "Camisa [description=" + description + ", colorCode=" + color + ", price=" + price + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
