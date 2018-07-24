package ichs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		
		int monthlySalary = 1000000;
		int annualSalary = monthlySalary *  12;
		
		int annualTax = annualSalary * 10/100;
		int bonus = monthlySalary * 4 * 20/100;
		int bonusTax = bonus * 55/1000;
		
		int afterAnnualSalary = annualSalary - annualTax;
		int afterbonus = bonus - bonusTax;
		
		int annualIncomeAfterTax = afterAnnualSalary + afterbonus;
		
		System.out.println( "연봉 : " + annualSalary + ", 세후 연봉 : " + afterAnnualSalary);
		System.out.println( "보너스 : " + bonus + "세후 보너스 : " + afterbonus);
		System.out.println( "지급액 : " + annualIncomeAfterTax);
		
		

	}

}
