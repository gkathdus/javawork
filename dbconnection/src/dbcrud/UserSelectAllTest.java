package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

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
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			
			// sql 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			while(rs.next()) {
				// db에서 userid(칼럼은 소문자)를 꺼내옴
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				// 리스트에 user 객체를 저장
				userList.add(user);
			}
			for(int i=0; i<userList.size(); i++) {
				User user = userList.get(i);
				
				// System.out.println(user);
				System.out.println("============================================");
				System.out.println("userId:" + user.getUserId());
				System.out.println("userName:" + user.getUserName());
				System.out.println("userPassword:" + user.getUserPassword());
				System.out.println("userAge:" + user.getUserAge());
				System.out.println("userEmail:" + user.getUserEmail());
				System.out.println("============================================");
			}
			
			// 스텍 구조임므로 종료 순서를 rs > pstmt > conn으로 함
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
