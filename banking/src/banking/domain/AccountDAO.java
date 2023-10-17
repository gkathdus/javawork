package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

// Account를 생성, 조회, 수정, 삭제하는 클래스
// DAO - Data Access Object
public class AccountDAO {
	Connection conn; // db 연결 객체 선언
	PreparedStatement pstmt; //
	ResultSet rs;
	Scanner scanner = new Scanner(System.in);

	
	public void createAccount() {
		System.out.println("=======================================");
		System.out.println("                계좌 생성                ");
		System.out.println("=======================================");
		
		while(true) {
		System.out.println("계좌 번호(형식: 00-00-000): ");
		String ano = scanner.nextLine();
		
		String regExp = "\\d{2}-\\d{2}-\\d{3}"; // 정규 표현식
		boolean result = Pattern.matches(regExp, ano);
		
		if(result) {
			// 중복 계좌가 있는 체킹
			if(findAccount(ano) != null) {
				System.out.println("이미 존재하는 계좌 번호입니다. 다른 계좌 번호를 입력해 주세요.");
			}else { // 중복 계좌 없으면
				while(true) {
					System.out.println("예금주: ");
					String owner = scanner.nextLine();
					
					regExp = "[a-zA-Z가-힣]+"; // 영어, 한글만
					result = Pattern.matches(regExp, owner);
					if(result) {
						System.out.println("입금액: ");
						int balance = Integer.parseInt(scanner.nextLine());
						
						// db 작업
						try {
							conn = JDBCUtil.getConnection();
							String sql = "INSERT INTO account(ano, owner, balance)"
									+ "VALUES(?, ?, ?)";
							pstmt = conn.prepareStatement(sql);
							
							// 값 설정
							pstmt.setString(1, ano);
							pstmt.setString(2, owner);
							pstmt.setInt(3, balance);
							
							// sql 실행
							pstmt.executeUpdate();
							System.out.println("계좌가 생성되었습니다");
							
							
						} catch (SQLException e) {
							e.printStackTrace();
						}finally {
							
						}
						
						break;
						
					}else {
						System.out.println("계좌주는 한글과 영문만 가능합니다. 다시");
					}
				} // 내부 while
				break;
			}
		
		}else {
			System.out.println("올바르지 않은 형식으로 입력하였습니다. 다시해");
		}
	}
}
	public void getAccountList() {
		System.out.println("=======================================");
		System.out.println("                계좌 목록                ");
		System.out.println("=======================================");
		
		List<Account> accountList = new ArrayList<>();
		// db 작업
		try {
			conn = JDBCUtil.getConnection(); // db연결
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			
			// 검색 처리
			rs = pstmt.executeQuery();
			while(rs.next()) { // 다음 데이터가 있는 동안 반복
				// account 객체
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				
				accountList.add(account); // 계좌를 리스트에 저장
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		// 계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌 번호: " + account.getAno() + "\t");
			System.out.print("예금주: " + account.getOwner() + "\t");
			System.out.println("잔고: " + account.getBalance());
			
		}
	}
	
	public void deposit() {
		System.out.println("=======================================");
		System.out.println("                입금액               ");
		System.out.println("=======================================");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				Account account = findAccount(ano);
				
				System.out.println("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());

				int balance = account.getBalance() + money;
				
				try {
					conn = JDBCUtil.getConnection();
					String sql = "UPDATE account SET balance = ?"
							+ "WHERE ano = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, balance);
					pstmt.setString(2, ano);
					// sql 실행
					pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
				System.out.println("정상 처리되었습니다.");
				break; // while 빠져나옴
			}else {
				System.out.println("계좌 없습니다.");
			}
		} // while 끝

	}
	
	public void withdraw() {
		System.out.println("========================================");
		System.out.println("                  출금액                  ");
		System.out.println("========================================");
		
		while(true) {
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		if(findAccount(ano) != null) {
			while(true) {
					System.out.println("출금액: ");
					Account account = findAccount(ano);
					int money = Integer.parseInt(scanner.nextLine());
					
					int balance = account.getBalance() - money;
					
					try {
						conn = JDBCUtil.getConnection();
						String sql = "UPDATE account SET balance = ?"
								+ "WHERE ano = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, balance);
						pstmt.setString(2, ano);
						// sql 실행
						pstmt.executeUpdate();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					System.out.println("정상 처리 되었습니다");
					
		
					if(money > account.getBalance()) { // 출금액이 잔고보다 많으면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
						
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("잔액 " + account.getBalance());
						break;
					}
					
			        }
					}else {
						System.out.println("계좌 없습니다. 다시 입력해 주세요.");
					}
					break;	
					}
					
   }
	
	   //계좌 삭제
	public void removeAccount() {
	      
	      System.out.println("======================================================");
	      System.out.println("                     계좌 삭제                          ");
	      System.out.println("======================================================");
	      
	      while(true) {
	         System.out.print("계좌 번호 : ");
	         String ano = scanner.nextLine();
	         
	         if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
	        	 try {
						conn = JDBCUtil.getConnection();
						String sql = "DELETE FROM account WHERE ano = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ano);
						// sql 실행
						pstmt.executeUpdate();
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
						JDBCUtil.close(conn, pstmt);
					}
	        	 	System.out.println("삭제 완료");
	                break;
	            
	         }else{            
	            System.out.println("계좌가 존재하지 않습니다. 다시 입력해주세요");
	         }         
	      }//whlie 끝
	      
	   }
	   
    // 계좌 검색
	public void selectAccount() {
    	// 계좌번호와 일치하는 계좌 검색
    	System.out.println("=====================================================");
	    System.out.println("                    계좌 검색                          ");
	    System.out.println("=====================================================");
	    
	    while(true) {
	         System.out.print("계좌 번호 : ");
	         String ano = scanner.nextLine();
	         
	         
	         if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
	            
	            break;
	         }else{            
	            System.out.println("계좌가 존재하지 않습니다. 다시 입력해주세요");
	         }         
	      }//whlie 끝
	    
	    
    }

	public Account findAccount(String ano) {
		Account account = null;
		// db처리
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			// 1개 검색 처리
			rs = pstmt.executeQuery();
			while(rs.next()) { // 다음 데이터가 있는 동안 반복
				// account 객체
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
		return account;
	}
		
}
