package Regex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {
        public static void main(String[] args){
            Pattern p = Pattern.compile("[\\w.]*@gmail.com");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter email");
            String email;
            email = sc.next();
            Matcher m = p.matcher(email);
            // System.out.println(m1.find());
            if (m.find()) {
                    System.out.println("Valid Email");
                    //System.out.println(m.group());
                }
            else
                    System.out.println("not valid email");
            }
    }
