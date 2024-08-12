package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/stu";
        String username ="root";
        String password = "@#4321Abc";
        try {


            Connection connection = DriverManager.getConnection(url, username ,password);
            System.out.println(connection+"\n coonected to db");
        }
        catch (Exception e){
            System.out.println("#Q# error ;"+e.getMessage());
        }
    }
}
