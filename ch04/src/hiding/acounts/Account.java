package hiding.acounts;

// 은행 통장 계좌 자료형 생성 
// 정보 은닉 및 캡슐화 - private 사용
public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	// 생략된 기본 생성자
	 public Account() {}
	 
	 // 매개변수 있는 생성자
	 public Account(String ano, String own, int bal) {
	 	this.ano = ano;
	 	this.owner = own;
	 	this.balance = bal;
	 }
	 
	 // get(), set() 메서드 생성
	 // 만드는 방법 : set + 필드 이름()
	 public void setAno(String a) { // 매개변수로 계좌번호 전달
		 ano = a;
		 
	 }
	 
	 public String getano() {
		 return ano;
	 }
	 
	 public void setOwner(String own) {
		 owner = own;
	 }
	 
	 public String getOwner() {
		 return owner;
	 }
	 
	 public void setBalance(int bal) {
		 balance = bal;
	 }
	 
	 public int getBalance() {
		 return balance;
	 }

}
