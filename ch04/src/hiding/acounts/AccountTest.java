package hiding.acounts;

public class AccountTest {

	public static void main(String[] args) {
		// Account 인스턴트 생성
		Account account = new Account();
		// 멤버에 직접 접근하지 못하도록 제한을 둠
		// account.ano = "111-222-3333"
		// 멤버 메서드에 접근 가능
		account.setAno("111-222-3333");
		account.setOwner("함소연");
		account.setBalance(100000);
		
		// 계좌번호 출력
		System.out.println("계좌번호: " + account.getano());
		System.out.println("예금주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance());
		
		// System.out.println(account.ano);
		

	}

}
