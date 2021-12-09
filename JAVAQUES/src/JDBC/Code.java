package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class UserException extends Exception {
    UserException(String s) {

        super(s);
    }
}
class Code {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internalmarks", "root", "");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mix name for pattern matching and insertion");
        String name=sc.nextLine();
        System.out.println("enter mix phonenumber for pattern matching and insertion");
        String phone=sc.nextLine();
        Pattern p2=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern p1=Pattern.compile("[a,r,A,R][a-zA-Z]*");
        Matcher m1=p1.matcher(name);
        Matcher m2=p2.matcher(phone);
        PreparedStatement ps=con.prepareStatement("insert into info values(?,?)");
        String[] arr1=new String[10];
        String[] arr2=new String[10];
        int c1=0;
        int c2=0;
        while(m1.find())
        {
            arr1[c1++]=m1.group();
            // System.out.println(ar1[0]);
        }
        //System.out.println(arr1);
        while(m2.find())
        {
            arr2[c2++]=m2.group();
        }
        try {
            if (c1>=c2 && c1<=c2) {
                for(int i=0;i<Math.min(c1,c2);i++)
                {
                    ps.setString(1,arr1[i]);
                    ps.setString(2,arr2[i]);
                    ps.execute();
                }
            }
            else {
                throw new UserException("Invalid Details Input");
            }
        }
        catch (Exception exp)
        {
            System.out.println(exp);
        }
    }
}