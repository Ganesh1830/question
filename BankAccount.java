package lop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class BankAccount {

    private String name;
    private int accountNumber;
    private double balance;

    // constructor
    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // CREATE ACCOUNT (INSERT)
    public void saveAccount() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "insert into account values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, accountNumber);
            ps.setDouble(3, balance);

            ps.executeUpdate();

            System.out.println("Account Created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DEPOSIT
    public void deposit(double amount) {
        try {
            Connection con = DBConnection.getConnection();

            String sql =
              "update account set balance = balance + ? where accountNumber=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, amount);
            ps.setInt(2, accountNumber);

            ps.executeUpdate();

            System.out.println("Deposited: " + amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // WITHDRAW
    public void withdraw(double amount) {
        try {
            Connection con = DBConnection.getConnection();

            String sql =
             "update account set balance = balance - ? where accountNumber=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, amount);
            ps.setInt(2, accountNumber);

            ps.executeUpdate();

            System.out.println("Withdrawn: " + amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DISPLAY
    public void display() {
        try {
            Connection con = DBConnection.getConnection();

            String sql =
                "select * from account where accountNumber=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, accountNumber);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Account No: " + rs.getInt("accountNumber"));
                System.out.println("Balance: " + rs.getDouble("balance"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}