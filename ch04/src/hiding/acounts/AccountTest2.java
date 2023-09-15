package hiding.acounts;

public class AccountTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = 
				new Account("111-222-3333", "함소연", 100000);
		
		// 계좌번호 출력
		System.out.println("계좌번호: " + account.getano());
		System.out.println("예금주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance());

	}

}
