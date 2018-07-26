package icehs.science.chpter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		ItBook java = new ItBook("JAVA 2.0", 28000, 3.2);
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		
		sql.printItBookInfo();
		java.printItBookInfo();
		jsp.printItBookInfo();
		
		System.out.println();
		
		System.out.println("SQL Plus ������ �������� �����մϴ�.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printItBookInfo();
		
		System.out.println();
		
		System.out.println("JAVA 2.0 ������ �����մϴ�.");
		java.setPrice(33000);
		java.printItBookInfo();
		
		System.out.println();
		
		System.out.println("JSP Servlet ����� �������� �����մϴ�.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printItBookInfo();
		
		
	
		
		
		
		
	}

}
