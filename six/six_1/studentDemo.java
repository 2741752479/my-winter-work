package six_1;

import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args)throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2", "root", "123456");
        Statement statement = connection.createStatement();
        ResultSet resultSet1 = statement.executeQuery("select a.eid,a.name,a.sex,a.age,a.heigh,a.place,b.coursenumber,c.coursename,b.score from student a,score b, course c where a.eid=b.eid and b.coursenumber=c.coursenumber order by a.eid");
        ResultSetMetaData metaData1 = resultSet1.getMetaData();
        int columnCount1 = metaData1.getColumnCount();
        while (resultSet1.next()) {
            for (int i = 1; i <= columnCount1; i++) {
                System.out.print(resultSet1.getObject(i) + "\t");
            }
            System.out.println();
        }
        resultSet1.close();
        ResultSet resultSet = statement.executeQuery("select eid from score  group by eid having sum(score<60)>2");
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        System.out.println("对以下学生提出警告：");
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getObject(i) + "号"+"\t");
            }
            System.out.println();
        }
        resultSet.close();
        Scanner Scanner = new Scanner(System.in);
        System.out.println("输入学号:");
        int eid = Scanner.nextInt();
        String sql="select*from score where eid=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1,eid);
        ResultSet resultSet2 = preparedStatement.executeQuery();
        ResultSetMetaData metaData2 = resultSet2.getMetaData();
        int columnCount2 = metaData2.getColumnCount();
        if(resultSet2.next()){
            while (resultSet2.next()){
                for (int i = 1; i <= columnCount2; i++) {
                    System.out.print(resultSet2.getObject(i) + "\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("学号错误");
        }
        statement.close();
        connection.close();
    }
}
