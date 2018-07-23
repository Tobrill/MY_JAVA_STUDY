package icehs.science.chapter03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		double lottoProbabilityVer1 = 1.235E-7;
		int lottoProbalbilityVer2 = (int)lottoProbabilityVer1;
		long populationVer1 = 6973738433L;
		int populationVer2 = (int)populationVer1;
		
		System.out.println( "로또에 당첨될 확률 :" + lottoProbabilityVer1);
		System.out.println( "로또에 당첨될 확률 int 변환 : " + lottoProbalbilityVer2);
		System.out.println( " 전 세계의 인구 수 : " + populationVer1);
		System.out.println( "전 세계의 인구 수 int 변환 : " + populationVer2);
		
	}

}
