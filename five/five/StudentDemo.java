package five;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args)throws SQLException {
        List<Student>list=new ArrayList<>();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "123456");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");
        //ResultSetMetaData metaData = resultSet.getMetaData();
       // int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
           Student s=new Student();
               s.setsNo(resultSet.getString("sNo"));
               s.setsName(resultSet.getString("sName"));
               s.setSex(resultSet.getString("sex"));//问？char怎么弄
               s.setClassNo(resultSet.getString("classNo"));
               list.add(s);
        }
        for(Student s:list){
            System.out.println(s.getsNo()+","+s.getsName()+","+s.getSex()+","+s.getClassNo());
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
