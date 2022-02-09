package six_2;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2", "root", "123456");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student  limit 5,1 ");//5表示第6行，1表示1列
        ResultSetMetaData metaData = resultSet.getMetaData();
        graduate a=new graduate("jack");
        while (resultSet.next()){
            a.setName(resultSet.getString("name"));
        }
        System.out.println(a.getName()+"是研究生,导师是"+a.getTeacher());//继承与多态：如果student a=new graduate,则a不能使用子类的特有功能
        resultSet.close();
        statement.close();
        connection.close();
    }
}
