import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC_RowSet {
    CachedRowSet rowSet = null;
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/mysql");
            rowSet.setUsername("root");
            rowSet.setPassword("root");
            rowSet.setCommand("SELECT * FROM emp");
            rowSet.execute();
                ResultSetMetaData metaData = rowSet.getMetaData();
                int noOfCols = metaData.getColumnCount();
                System.out.println("Employees");

                for (int i = 1; i <= noOfCols; i++) {
                    System.out.printf("%-20st", metaData.getColumnName(i));
                }
                System.out.println();

                while (rowSet.next()) {
                    for (int i = 1; i <= noOfCols; i++) {
                        System.out.printf("%-20st", rowSet.getObject(i));
                    }
                    System.out.println();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
}




//https://sqliteonline.com/#sharedb=s%3Ater