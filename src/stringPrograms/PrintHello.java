package stringPrograms;

public class PrintHello {

	public static void main(String []args) {
		//System.out.println("Hello");
		
		String st = "Hello";
		char[] chAray = st.toCharArray();
		for (int i= chAray.length -1; i>= 0; i--) {
			System.out.println(chAray[i]);
		}
}
}