package banking.array;

import java.util.Scanner;

import banking.domain.Account;

public class BankMain {
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) { // void는 어떤 값을 반환하지 않음을 나타내는 키워드
		boolean sw = true;
		
		while(sw) {
			System.out.println("==================================================");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("==================================================");
			
			//메뉴 선택
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) { // == ~일 때, != ~가 아닐 때
				createAccount();
			}else if(selectNo == 2) {
				getAccountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				sw = false;
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요.");
			}
		} // while 끝
		System.out.println("프로그램 종료.");

	} // Main 끝
	
	// 계좌 생성
	private static void createAccount() {
		System.out.println("---------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("---------------------------------------");
		
		System.out.println("계좌 번호: ");
		String ano = scanner.nextLine();
		
		
		System.out.println("예금주: ");
		String owner = scanner.nextLine();
		
		System.out.println("입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		// account[0] = new Account(ano, owner, balance); // 연습 데이터 1개 생성
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
			accounts[i] = new Account(ano, owner, balance);
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
			}
		}
	}
	
	// 계좌 목록
	private static void getAccountList() {
		System.out.println("---------------------------------------");
		System.out.println("                계좌 목록                ");
		System.out.println("---------------------------------------");
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				System.out.print("계좌 번호: " + accounts[i].getAno() + "\t");
				System.out.print("예금주: " + accounts[i].getOwner() + "\t");
				System.out.println("잔고: " + accounts[i].getBalance());
			}
		}
	}
	
	// 입금
	private static void deposit() {
		System.out.println("---------------------------------------");
		System.out.println("                입금액               ");
		System.out.println("---------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("입금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("정상 처리되었습니다.");
		}else {
			System.out.println("계좌 없습니다.");
		}
		Account account = findAccount(ano);

	}
	// 출금
	private static void withdraw() {
		System.out.println("---------------------------------------");
		System.out.println("                입금액               ");
		System.out.println("---------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() - money);
			System.out.println("정상 처리되었습니다.");
		}else {
			System.out.println("계좌 없습니다.");
			
		}
		Account account = findAccount(ano);
	}
	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts != null) {
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}

}
