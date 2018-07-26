package icehs.science.chpter07;

public class PublicationTest {

	public static void main(String[] args) {
		Pubilcation pub1 = new Pubilcation();
		System.out.println("=========���ǹ� ������ �����մϴ�.===========");
		
		pub1.setTitle("��ȭ �ﱹ��");
		pub1.setPrice(-1500);
		pub1.setPage(-200);
		
		pub1.setPrice(5000);
		pub1.setPage(300);
		pub1.printPublicationInfo();

	}

}
