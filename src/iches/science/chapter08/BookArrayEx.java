package iches.science.chapter08;

public class BookArrayEx {

	public static void main(String[] args) {

		Book[] books = { new Book("������ ��" , 16000), new Book("�� ����", 12000), new Book("7�� ��", 13500)};
		
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i].getTitle() + " : " + books[i].getPrice() + "\n");
		}
		

	}

}
