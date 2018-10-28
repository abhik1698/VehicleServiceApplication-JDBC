
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abhi
 */
public class connection {

    private static final String serverPath = "jdbc:mysql://localhost:3306/login";
    private static final String username = "root";
    private static final String password = "root";

    Connection c = null;

    public void connect() {

        try {
            c = DriverManager.getConnection(serverPath, username, password);
            System.out.println("connected");

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void insert(String username, String password) throws SQLException {
        String ins = "insert into credentials(username, password)" + "values (?,?)";
        PreparedStatement p = c.prepareStatement(ins);
        p.setString(1, username);
        p.setString(2, password);
        p.execute();
    }

    public Object[][] getData() throws SQLException {

        Statement s = c.createStatement();
        String func = "call login.accounts();";
        ResultSet r = s.executeQuery(func);

        Object[][] row = new Object[10][10];

        if (r.next()) {
            String user = r.getString("username");
            String pass = r.getString("password");
            row[0][0] = user;
            row[0][1] = pass;

        }

        return row;

    }
}
