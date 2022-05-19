package Clase2;

public class TestArrays {

	public static void main(String[] args) {
		ejemplo1();
	}

	static void ejemplo1() {
		String[] items = { "bla", "ble", "bli" };
		try {
			for (int i = 0; i <= items.length; i++) {
				System.out.println(items[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
