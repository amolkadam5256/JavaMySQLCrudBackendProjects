// Source code is decompiled from a .class file using FernFlower decompiler.
package Main;

import Admin.AdminMenu;
import DAO.UserDAO;
import DB.DBConnection;
import Employee.EmployeeMenu;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      new DBConnection();
      DBConnection.getConnection();
      new AdminMenu();
      new EmployeeMenu();
      boolean running = true;

      while(running) {
         System.out.println("\n\ud83d\udd10 Login as:");
         System.out.println("1. Admin");
         System.out.println("2. Employee");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         int userChoice = scanner.nextInt();
         scanner.nextLine();
         switch (userChoice) {
            case 0:
               running = false;
               System.out.println("\ud83d\udc4b Thank you for visiting my Console Employee Management System! Exiting...");
               break;
            case 1:
               System.out.print("\ud83d\udc64 Admin Username: ");
               String adminUsername = scanner.nextLine();
               System.out.print("\ud83d\udd12 Password: ");
               String adminPassword = scanner.nextLine();
               if (UserDAO.validateLogin(adminUsername, adminPassword, "admin")) {
                  System.out.println("✅ Admin login successful!");
                  AdminMenu.adminshowMenu(scanner);
               } else {
                  System.out.println("❌ Invalid admin credentials!");
               }
               break;
            case 2:
               System.out.print("\ud83d\udc64 Employee Username: ");
               String empUsername = scanner.nextLine();
               System.out.print("\ud83d\udd12 Password: ");
               String empPassword = scanner.nextLine();
               if (UserDAO.validateLogin(empUsername, empPassword, "employee")) {
                  System.out.println("✅ Employee login successful!");
                  EmployeeMenu.EmpshowMenu(scanner);
               } else {
                  System.out.println("❌ Invalid employee credentials!");
               }
               break;
            default:
               System.out.println("❌ Invalid choice. Try again.");
         }
      }

      scanner.close();
   }
}
