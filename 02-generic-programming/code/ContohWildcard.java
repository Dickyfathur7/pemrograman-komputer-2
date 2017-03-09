public class ContohWildcard {
	
	public static void main(String args[]) {
		
	}

	public static void drawShapes(ContohKelasGeneric<? extends Shape> data) {
		if(data instanceof Shape) {
			data.siapkan();
		}
	}


}
