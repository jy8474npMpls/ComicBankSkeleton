package com.company;

import java.io.StringBufferInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static input.InputUtils.*;

class BankManager {

    vault database;

    private String menu = "" +
            "1. Show all comics\n" +
            "2. Add a comic\n" +
            "3. Edit a comic's quantity\n" +
            "4. Delete a comic\n" +
            "9. Quit";

    public static void main(String[] args) {
        BankManager bankManager = new BankManager();
        bankManager.start();
    }


    public void start() {
        database = new valut();
        showMenuDoAction();
    }


    private void showMenuDoAction() {

        int choice;

        do {
            System.out.println(menu);
            choice = positiveIntInput("Enter choice");

            switch (choice) {
                case 1:
                    showAll();
                    break;
                case 2:
                    addComic();
                    break;
                case 3:
                    editComicQuantity();
                    break;
                case 4:
                    deleteComic();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }

        } while (choice != 9);
    }


    protected void showAll() {


        final String searchSQL = "select * from comic order by name";

        try  (Connection connection = DiverManager.getConnection(db_url);
              PreparedStatement searchStatement = connection.PreparedStatement(SearchSQL)) {

            Sting name = stringInput("Enter product name: " );
            int quantity = positiveIntInput("Enter product quantity: ");

            ps.setString(1, name);
            ps.setInt(2, quantity);

            ps.execute();

            if (rowsUpdated == 0) {
                System.out.println("NO products found!");
            } else {
                System.out.println(//RETURN LIST IN ORDER);
            }

        } catch (SQLException e) {
            System.out.println("An ERROR occurred!");
            System.out.println(e);
        }

    }

    protected void Comic() {

        final String addSql = "insert into comic values (?,?)";

        try  (Connection connection = DiverManager.getConnection(db_url);
              PrepareStatement ps = connection.PrepareStatement(addSql)) {

            int collectorID = intInput("Enter your Collector ID: ")
            Sting name = stringInput("Enter comic name: " );
            int quantity = positiveIntInput("Enter comic quantity: ");

            ps.setString(1, name);
            ps.setInt(2, quantity);

            ps.execute();

            if (rowsUpdated == 0) {
                System.out.println("Product ALREADY exists!");
            } else {
                System.out.println("Product added to database.");
            }

        } catch (SQLException e) {
            System.out.println("An ERROR occurred!");
            System.out.println(e);
        }

    }

    protected void editProductQuantity() {

        final String editProductQuantitySQL = "update product set quantity = ? where name like ? ";

        try (Connection connection = DriverManager(db_url);
             PreparedStatement ps = connection.prepareStatement(editProductQuantitySQL)) {

            String name = stringInput("Enter product name: ");
            int quantity = positiveIntInput("Enter product quantity: ");

            ps.setString(1, name);
            ps.setInt(2, quantity);

            ps.rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 0) {
                System.out.println("Product NOT found!");
            } else {
                System.out.println("Product added to database.");
            }

        } catch (SQLException e) {
            System.out.println("An ERROR occurred!");
            System.out.println(e);
        }


    }

    protected void deleteProduct() {

        final String deleteSql = "delete from product where name like ?";

        try (Connection connection = DriverManager(db_url);
             PreparedStatement ps = connection.prepareStatement(deleteSql)) {

            String name = stringInput("Enter product name: ");

            ps.setString(1, name);

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 0) {
                System.out.println("Product NOT found!");
            } else {
                System.out.println("Product deleted from database.");
            }

        } catch (SQLException e) {
            System.out.println("An ERROR occurred!");
            System.out.println(e);
        }

    }

}