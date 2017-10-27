
public class testingprogram extends test {

	public static void main(String[] args) {
		add(2, 0);
		test();
	}

	public static void add(int x, int y) {
		System.out.println(x + y);
	}

	public static void add(double x, double y) {
		System.out.println(x + y);
	}

	public static void test() {

		System.out.println("This is the overridden method");
	}
}
