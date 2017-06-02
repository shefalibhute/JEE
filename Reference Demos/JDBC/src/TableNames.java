//DATABASE META DATA

import java.sql.*;

import javax.naming.InitialContext;
import javax.sql.DataSource;
public class TableNames
{
public static void main(String args[])
{
	System.out.println("in main");
try
{		InitialContext ctx = new InitialContext();
DataSource ds =  (DataSource) ctx.lookup("dizzyworldDS");
//dizzyworldDS name of data source
Connection con = ds.getConnection();
//create a databaseMetaData object
DatabaseMetaData dbmd=con.getMetaData();

String[] tabTypes={"TABLE"};
//Retrive the name of database tables
System.out.println("TABLE NAMES:");

ResultSet rs=dbmd.getTables(null,null,null,tabTypes);
while(rs.next())
	System.out.println(rs.getString("TABLE_NAME"));

System.out.println("DB minor version: "+dbmd.getDatabaseMinorVersion());
System.out.println("DB major version: "+dbmd.getDatabaseMajorVersion());


con.close();
}catch(Exception ee){
	ee.printStackTrace();
}
}
}
