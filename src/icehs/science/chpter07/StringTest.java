package icehs.science.chpter07;

public class StringTest {

	public static void main(String[] args) {
		String abc = "abc";
		String cde = "abc";
		String fgh = new String("abc");
		String xyz = new String("abc");
		
		System.out.println( abc == cde);
		System.out.println(fgh == xyz);
		System.out.println( abc.equals(xyz));
		System.out.println( fgh.equals(xyz));
		
	}

}
