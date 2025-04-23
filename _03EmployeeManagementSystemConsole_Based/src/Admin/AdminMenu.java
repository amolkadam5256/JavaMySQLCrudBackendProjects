// Source code is decompiled from a .class file using FernFlower decompiler.
package Admin;

import java.util.Scanner;

public class AdminMenu {
   public AdminMenu() {
   }

   public static void adminshowMenu(Scanner scanner) {
      boolean running = true;

      while(running) {
         System.out.println("\n\ud83d\udd11 Admin Menu:");
         System.out.println("1. Add Employee");
         System.out.println("2. View All Employees");
         System.out.println("3. Search Employee by ID");
         System.out.println("4. Update Employee");
         System.out.println("5. Delete Employee");
         System.out.println("0. Logout");
         System.out.print("Enter choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
            case 0:
               running = false;
               System.out.println("\ud83d\udc4b Logging out...");
               break;
            case 1:
               System.out.println("\n--- Adding New Employee ---");
               break;
            case 2:
               System.out.println("\n--- Viewing All Employees ---");
               break;
            case 3:
               System.out.println("\n--- Searching Employee by ID ---");
               break;
            case 4:
               System.out.println("\n--- Updating Employee ---");
               break;
            case 5:
               System.out.println("\n--- Deleting Employee ---");
               break;
            default:
               System.out.println("❌ Invalid choice. Please try again.");
         }
      }

   }
}
