package stringPrograms;

public class ReverseString {
	public static void main(String []a) {
		String str= "Neosoft";
		int length = str.length();
		char[] chAray= str.toCharArray();
		
//		for(int i= chAray.length-1; i>=0; i--) {
//			System.out.println(chAray[i]);
//		}
		//Approach-1
		for(int i=length-1; i>=0; i--) {
			System.out.println(chAray[i]);
		}
		//Approach-2
		for (int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		//Approach -3
		StringBuffer sb= new StringBuffer(str);
		System.out.print(sb.reverse());
		
		//Approach-4
		StringBuilder sb1= new StringBuilder(str);
		System.out.println(sb1.reverse());
	}

}
