package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class UserSelectOneTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 연결하기 -  getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			// db 처리 작업
			// 매개 변수화된 sql문 작성 - 동적 바인딩
			String sql = "SELECT * FROM users WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			
			// ? 값 지정
			pstmt.setString(1, "today");
			
			// sql 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				// db에서 userid(칼럼은 소문자)를 꺼내옴
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				// 객체 정보를 문자열로 출력함
				// System.out.println(user);
				
				System.out.println("userId:" + user.getUserId());
				System.out.println("userName:" + user.getUserName());
				System.out.println("userPassword:" + user.getUserPassword());
				System.out.println("userAge:" + user.getUserAge());
				System.out.println("userEmail:" + user.getUserEmail());
				
				/*String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				int userAge = rs.getInt("userage");
				String userEmail = rs.getString("useremail");
				
				System.out.println("userId: " + userId);
				System.out.println("userName: " + userName);
				System.out.println("userPassword: " + userPassword);
				System.out.println("userAge: " + userAge);
				System.out.println("userEmail: " + userEmail);*/
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			rs.close();
			pstmt.close();
			
			// auto commit 됨
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
