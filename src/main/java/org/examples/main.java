package org.examples;

        import java.sql.Connection;
        import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Connection connection=DBUtils.connect();

        String username;
        int id;
        int password;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        username = scanner.nextLine();
        User user = new User(01,"gauri",123);

        Scanner myInput = new Scanner( System.in );
        System.out.println("enter id");
        id = scanner.nextInt();

        System.out.println("enter password");
        password = scanner.nextInt();
    }
}