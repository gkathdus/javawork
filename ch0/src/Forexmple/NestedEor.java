package Forexmple;

public class NestedEor {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행 5열에 '*' 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print('*');
			}
			System.out.println(); //한줄 띄움
		}
        /*
         i=1 j=1 *
             j=2 **
             j=3 ***
             j=4 ****
             j=5 *****
         i=2 j=1 *
             j=2 **
             j=3 ***
             j=4 ****
             j=5 *****    
         */
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print('*');
			}
			System.out.println(); //한줄 띄움
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print('*');
			}
			System.out.println(); //한줄 띄움
		}
		
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
				// System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println(); //한줄 띄움
		}
	}

}


