package five;

import java.sql.*;
import java.sql.Connection;

public class jdbcDemo01 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "123456");
        //执行sql
        Statement statement = connection.createStatement();
        //增加数据
        statement.executeUpdate("insert into student values ('03','kang','男','三班')");
        //修改数据
        statement.executeUpdate("update student set classNo='四班' where sNo='01'");
        //删除数据
        statement.executeUpdate("delete from student where sNo='02'");
        //查数据
        ResultSet resultSet = statement.executeQuery("select * from student");
        //获取表的列数
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        //处理结果集
        while (resultSet.next()) {

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getObject(i) + "\t");
            }
            System.out.println();
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
