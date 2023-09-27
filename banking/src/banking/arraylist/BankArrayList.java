package banking.arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArrayList {
	
	// 통장 계좌를 저장할 자료 구조의 객체 생성
	static ArrayList<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			try {
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
			}catch(NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("올바른 숫자를 입력해 주세요");
			}
			
		}
		System.out.println("프로그램 종료.");
		scanner.close();

	}
	
	private static void createAccount() {
		System.out.println("---------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("---------------------------------------");
		
		while(true) {
		System.out.println("계좌 번호(형식: 00-00-000): ");
		String ano = scanner.nextLine();
		
		String regExp = "\\d{2}-\\d{2}-\\d{3}";
		boolean result = Pattern.matches(regExp, ano);
		
		if(result) {
			// 중복 계좌가 있는 체킹
			if(findAccount(ano) != null) {
				System.out.println("이미 존재하는 계좌 번호입니다. 다른 계좌 번호를 입력해 주세요.");
			}else { // 중복 계좌 없으면
				System.out.println("예금주: ");
				String owner = scanner.nextLine();
				
				System.out.println("입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				// 입력 받은 내용을 매개변수로 계좌 생성함
				Account newAccount = new Account(ano, owner, balance);
				accountList.add(newAccount);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		
		}else {
			System.out.println("올바르지 않은 형식으로 입력하였습니다. 다시해");
		}
		
	}
	}
	private static void getAccountList() {
		System.out.println("---------------------------------------");
		System.out.println("                계좌 목록                ");
		System.out.println("---------------------------------------");
		
		// 계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌 번호: " + account.getAno() + "\t");
			System.out.print("예금주: " + account.getOwner() + "\t");
			System.out.println("잔고: " + account.getBalance());
			
		}
	}
	
	private static void deposit() {
		System.out.println("---------------------------------------");
		System.out.println("                입금액               ");
		System.out.println("---------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				Account account = findAccount(ano);
				
				System.out.println("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				
				account.setBalance(account.getBalance() + money);
				System.out.println("정상 처리되었습니다.");
				break; // while 빠져나옴
			}else {
				System.out.println("계좌 없습니다.");
			}
		} // while 끝

	}
	
	private static void withdraw() {
		System.out.println("---------------------------------------");
		System.out.println("                출금액            ");
		System.out.println("---------------------------------------");
		
		while(true) {
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
			while(true) {
				if(findAccount(ano) != null) {
					System.out.println("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
		
					Account account = findAccount(ano);
					if(money > account.getBalance()) { // 출금액이 잔고보다 많으면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
						
					account.setBalance(account.getBalance() - money);
					System.out.println("정상 처리되었습니다.");
					break;
					}
				}else {
					System.out.println("계좌 없습니다. 다시 입력해 주세요.");
					break;
				}	
			}
	   }	
    }

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size(); i++) {
			// 이미 등록된 계좌를 가져와서 외부에서 입력한 계좌와 일치하는지 비교함
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);
				break;
			}
		}
		return account;
	}

}
