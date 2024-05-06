package stringPrograms;

public class RemoveDuplicates {
	
	public static void main(String []arg) {

	String dup = "programming";
	StringBuffer sb2= new StringBuffer();
	//StringBuilder sb1 = new StringBuilder();
	
	dup.chars().distinct().forEach(c -> sb2.append((char)c)); // Java 8 Approarch which has distinct method and use lambda Expression.
	
	System.out.println(sb2);
	
}
}
