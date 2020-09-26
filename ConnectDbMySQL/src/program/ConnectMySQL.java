package program;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectMySQL {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/connection";
			String user="root";
			String password = "";
					
			conn = (Connection) DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("ket noi thanh cong");
			}
			String sql = "select * from connection";
			st = (Statement) conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.isBeforeFirst() == false) {
				JOptionPane.showMessageDialog( null , "Bang khong co du lieu");
				return;
				
			}
			while (rs.next()) {
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ket noi that bai");
			e.printStackTrace();
		}
	}
}
