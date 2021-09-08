package com.company.view;

import com.company.controller.PhoneProductManagement;
import com.company.controller.UserData;
import com.company.controller.UserManagement;
import com.company.model.User;

import static com.company.Main.*;


public class UserMenu {
    private void menu() {

        System.out.println("-------------------------------");
        System.out.println("-----Contraband-Buying-App-----");
        System.out.println("-------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("0. Exit");
        System.out.print("Select 1 to 2 and 0 is exit: ");
    }

    public void run() {
        int select;
        do {
            menu();
            select = input.nextInt();
            switch (select) {
                case 1:
                    doLogin();
                    break;
                case 2:
                    doRegister();
                    break;
            }
        } while (select != 0);

    }


    private void doLogin() {

        System.out.println("Login");
        input.nextLine();

        System.out.print("Enter account name:");
        String name = input.nextLine();

        System.out.print("Enter account password:");
        String password = input.nextLine();

        UserData userData = new UserData();
        for (User user : userData.readToUserFile()) {
            if (user.getUserName().equals(name) && user.getUserPassword().equals(password)) {
                if (user.getType().equals("admin"))
                    showAdminMenu();
                else
                    showUserMenu();
            } else {
                System.err.println("Wrong account or password, please re-enter!!!");
                System.out.println();
            }
        }
    }

    private void doRegister() {
        UserManagement userManagement = new UserManagement();

        System.out.println("Create a new account");
        input.nextLine();

        System.out.print("Enter id:");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter account name:");
        String name = input.nextLine();

        System.out.print("Enter account password:");
        String password = input.nextLine();

        System.out.print("Enter account type:");
        String type = input.nextLine();

        userManagement.addNew(new User(id, name, password, type));
    }

    private void showAdminMenu() {
        PhoneProductMenu phoneProductMenu = new PhoneProductMenu();
        System.out.println("1.Phone product management");
        System.out.println("2.");
        int select;
        do {
            System.out.print("Enter selection: ");
            select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1:
//                    phoneProductMenu.run();
                case 2:
            }
        } while (select != 0);

    }

    private void showUserMenu() {
    }

}
