public class TestMethodGeneric {
	public static <E> void printArray(E[] element) {
		for(E el : element) {
			System.out.println(el);
		}
	}

	public static void main(String args[]) {
		Integer[] intLarik = {21, 14, 5, 95, 24};

		printArray(intLarik);
	}
}
