import java.sql.*;

public class Main {

	public static void main(String[] args) {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wild_db_quest", "lucas", "Glucas38+");
			
			PreparedStatement insertState = conn.prepareStatement("insert into persons (firstname, lastname, age) values (?, ?, ?)");
			// insert values
			insertState.setString(1, "Lucas");
			insertState.setString(2, "Goutaudier");
			insertState.setInt(3, 21);
			// execute
			insertState.execute();
			// insert values
			insertState.setString(1, "Loic");
			insertState.setString(2, "Pimet");
			insertState.setInt(3, 22);
			// execute
			insertState.execute();
			// insert values
			insertState.setString(1, "Tju");
			insertState.setString(2, "Yakuza");
			insertState.setInt(3, 28);
			// execute
			insertState.execute();
			
			PreparedStatement updateState = conn.prepareStatement("update persons set firstname=? where id²=?");
			// insert values
			updateState.setString(1, "Lulu");
			updateState.setInt(2, 47);
			// execute
			updateState.execute();
			
			PreparedStatement deleteState = conn.prepareStatement("delete from persons where firstname=?");
			// insert value
			deleteState.setString(1, "Lucas");
			// execute
			deleteState.execute();
			// insert value
			deleteState.setString(1, "Tju");
			// execute
			deleteState.execute();
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
