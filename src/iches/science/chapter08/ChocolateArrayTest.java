package iches.science.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		
		Chocolate [] choco = { new Chocolate("�Ƹ�����", "��ũ", 2200), new Chocolate("ī�� Ű����", "��ũ", 2500), new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300)};
		
		int sum = 0;
		
		for (int i = 0; i < choco.length; i++) {
			if (choco[i].getType().equals("ȭ��Ʈ")) {
				sum += choco[i].getPrice() * 80/100;
			}else {
				sum += choco[i].getPrice();
			}
		}
		
		for (int i = 0; i < choco.length; i++) {
			System.out.println("�̸� : " + choco[i].getName() + ", ���� : " + choco[i].getType() + ", ���� : " + choco[i].getPrice());
			
		}
		
		System.out.println("�ϳ��� �������� �� �� ���� : " + sum);

		}

}
