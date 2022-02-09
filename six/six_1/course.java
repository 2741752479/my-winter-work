package six_1;
import java.sql.*;
import java.sql.Connection;
public class course {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2", "root", "123456");
        //执行sql
        Statement statement = connection.createStatement();
       ResultSet resultSet1 = statement.executeQuery("select a.coursenumber,a.coursename,b.score from course a,score b where a.coursenumber=b.coursenumber");
       ResultSetMetaData metaData1 = resultSet1.getMetaData();
       int columnCount1 = metaData1.getColumnCount();
       while (resultSet1.next()) {
            for (int i = 1; i <= columnCount1; i++) {
                System.out.print(resultSet1.getObject(i) + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        resultSet1.close();//注意：操作resultSet1后，应立即关闭，才可以再对resultSet2操作
        //统计课程平均分，最高分，最低分
        ResultSet resultSet2= statement.executeQuery("select coursenumber,avg(score) avg_score,max(score) max_score,min(score) min_score from score group by coursenumber");
        ResultSetMetaData metaData2 = resultSet2.getMetaData();
        int columnCount2 = metaData2.getColumnCount();
        System.out.println("课程号"+"\t"+"平均分"+"\t"+"最高分"+"\t"+"最低分");
        while (resultSet2.next()) {
            for (int i = 1; i <= columnCount2; i++) {
                System.out.print(resultSet2.getObject(i) + "\t");
            }
            System.out.println();
        }
        statement.close();
        connection.close();
    }
}
