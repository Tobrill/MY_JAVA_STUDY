package icehs.science.chapter06;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		Book book2 = new Book("ÇØ¸®Æ÷ÅÍ", 15000);
		 
		Book book3 = new Book("Ä®ÀÇ ³ë·¡", "±èÈÆ");
		
		Book book4 = new Book("¹Ù¶÷ÀÇ µþ", "ÇÑºñ¾ß", 39200);
		
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
		book4.printBookInfo();

	}

}
