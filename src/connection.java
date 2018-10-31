
import java.sql.CallableStatement;
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

    private static final String serverPath = "jdbc:mysql://localhost:3306/bike_service";
    private static final String username = "root";
    private static final String password = "root";

    Connection c = null;

    connection() {
        try {
            c = DriverManager.getConnection(serverPath, username, password);
            System.out.println("connected");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    int quotationTableRowCount = 0;

    public Object[][] bikeBill() throws SQLException {

        Object[][] row = new Object[50][5];
        int i = 0;

        CallableStatement stmt = c.prepareCall("call bike_service.bill;");

        ResultSet r = stmt.executeQuery();
        quotationTableRowCount = 0;

        while (r.next()) {
            String bike_name = r.getString("bike_name");
            String repair_cat = r.getString("repair_category");
            String bill = r.getString("cost");
            String reg = r.getString("registration_no");
            row[i][0] = bike_name;
            row[i][1] = repair_cat;
            row[i][2] = bill;
            row[i][3] = reg;
            i++;
            quotationTableRowCount++;
        }
        return row;
    }
    int quotationTable2RowCount = 0;

    public Object[][] billQuotation() throws SQLException {

        Object[][] row = new Object[50][10];
        int i = 0;

        CallableStatement stmt = c.prepareCall("call bike_service.bill_quotation;");

        ResultSet r = stmt.executeQuery();
        quotationTable2RowCount = 0;

        while (r.next()) {
            String registration_no = r.getString("registration_no");
            String cost = r.getString("cost");
            String costFor = r.getString("cost_for");
            row[i][0] = registration_no;
            row[i][1] = cost;
            row[i][2] = costFor;
            i++;
            quotationTable2RowCount++;
        }
        return row;
    }

    public Object[][] vehicleSummary(String reg) throws SQLException {

        Object[][] row = new Object[50][10];
        int i = 0;

        CallableStatement stmt = c.prepareCall("{call bike_service.vehicleSummary(?)}");
        stmt.setString(1, reg);
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            String customer_name = r.getString("customer_name");
            String bike_name = r.getString("bike_name");
            String bike_color = r.getString("bike_color");
            String registration_no = r.getString("registration_no");
            String kilometers_run = r.getString("kilometers_run");
            String repair_category = r.getString("repair_category");
            String customer_complaints = r.getString("customer_complaints");
            int sum = 0;
            
            Object[][] billOverview = new Object[50][5];
            billOverview = bikeBill();
            
            //Sum of costs in bill_quotation table:
            for (i = 0; i < quotationTableRowCount; i++) {
                if (billOverview[i][3].toString().equalsIgnoreCase(reg))
                sum += Integer.parseInt(billOverview[i][2].toString());
            }            
            row[0][0] = customer_name;
            row[0][1] = bike_name;
            row[0][2] = bike_color;
            row[0][3] = registration_no;
            row[0][4] = kilometers_run;
            row[0][5] = repair_category;
            row[0][6] = customer_complaints;
            row[0][7] = sum;

        }

        return row;
    }

}
