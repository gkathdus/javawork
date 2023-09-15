package Constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포멧", 객체)
		// 대응 서식 : 정수 - %d, 실수 - %f, 문자 - %s
		// decimal(10진)
		// 줄바꿈 문자 - \n
		
		int year = 2023;
		//System.out.println("올해는 " + year + "년입니다");
		System.out.printf("올해는 %d년입니다\n", year);
		
		float weight = 63.7F;
		System.out.printf("그것의 무게는 %.2fkg입니다\n", weight);
		
		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.\n", nick);
		
		//'\t' 사용
		int num = 0; // 0으로 초기화
		// num += 1; // num = num +1;
		
		String table = ""; // 빈 문자열 초기화
		table += "-----------------------\n";
		table += "이름\t나이\t나라\n";
		table += "함소연\t21\t대한민국\n";
		table += "함소민\t40\t베트남\n";
		table += "-----------------------\n";
		
		System.out.println(table);

	}

}
