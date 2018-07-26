package icehs.science.chpter07;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.NUMBER_OF_PERSONS++;
		
		System.out.println("�����:" + p1.NUMBER_OF_PERSONS);
		System.out.println("�̸� :" + p1.name);
		
		Person p2 = new Person();
		p2.name = "ȫ���";
		p2.NUMBER_OF_PERSONS++;
		System.out.println("�����:" + p2.NUMBER_OF_PERSONS);
		System.out.println("�̸� :" + p2.name);
		
		Person p3 = new Person();
		p3.name = "ȫ�氡";
		p3.NUMBER_OF_PERSONS++;
		System.out.println("�����:" + p3.NUMBER_OF_PERSONS);
		System.out.println("�̸� :" + p3.name);
		
		System.out.println(p1.NUMBER_OF_PERSONS);
		System.out.println(p2.NUMBER_OF_PERSONS);
		System.out.println(p3.NUMBER_OF_PERSONS);
		
		System.out.println(Person.NUMBER_OF_PERSONS);
	}

}
