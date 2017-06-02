import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  
  
public class RowSetExample_Basic {  
        public static void main(String[] args) throws Exception {  
                 Class.forName("oracle.jdbc.driver.OracleDriver");  
      
    //Creating and Executing RowSet  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:oracle:thin:@10.10.3.159:1521:TLSDB");  
        rowSet.setUsername("cepuser");  
        rowSet.setPassword("cepuser");  
                   
        rowSet.setCommand("select * from emp");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getInt(1));  
                        System.out.println("Name: " + rowSet.getString(2));  
                         
                }  
                 
        }  
}  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
rowset.setCommand("SELECT ename, sal FROM emp WHERE empno = ?");
  // setting the employee number input parameter for employee named "KING"
  rowset.setInt(1, 7839);
  rowset.execute();
*/

/**
 *  Scrolling forward, and printing the empno in 
 *  the order in which it was fetched.
 
...
rowset.setCommand("SELECT empno, ename, sal FROM emp");
rowset.execute();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// going to the first row of the rowset
rowset.beforeFirst ();
while (rowset.next ())
  System.out.println ("empno: " +rowset.getInt (1));
*/

/**
 *  Scrolling backward, and printing the empno in 
 *  the reverse order as it was fetched.
 
//going to the last row of the rowset
rowset.afterLast ();
while (rowset.previous ())
  System.out.println ("empno: " +rowset.getInt (1));
*/


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
  * Make rowset updatable
  */
//rowset.setReadOnly (false); 
/**
 * Inserting a row in the 5th position of the rowset.
 */
// moving the cursor to the 5th position in the rowset
/*if (rowset.absolute(5))
{
  rowset.moveToInsertRow ();
  rowset.updateInt (1, 193);
  rowset.updateString (2, "Ashok");
  rowset.updateInt (3, 7200);

  // inserting a row in the rowset
  rowset.insertRow ();

  // Synchronizing the data in RowSet with that in the database.
  rowset.acceptChanges ();
}
...*/