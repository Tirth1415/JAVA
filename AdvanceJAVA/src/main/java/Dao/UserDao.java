package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.mysql.cj.protocol.Resultset;

import Connectivity.DBConnection;
import Model.User;

public class UserDao {
	public static void insertuser(User u) {
		try {
			Connection connection = DBConnection.createConnection();
			String sql = "insert into user(name,contact,address,email,password) values (?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);

			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.executeUpdate();

			System.out.println("Data Updated Succesfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection connection = DBConnection.createConnection();
			String sql = "select * from user where email = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static User userlogin(User u) {
		User user = null;
		try {
			Connection connection = DBConnection.createConnection();
			String sql = "select * from user where email = ? and password = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setContact(rs.getLong("contact"));
				user.setAddress(rs.getString("address"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
