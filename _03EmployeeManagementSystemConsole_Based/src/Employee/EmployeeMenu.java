// Source code is decompiled from a .class file using FernFlower decompiler.
package Employee;

import java.util.Scanner;

public class EmployeeMenu {
   public EmployeeMenu() {
   }

   public static void EmpshowMenu(Scanner scanner) {
      boolean running = true;

      while(running) {
         System.out.println("\n\ud83d\udc68\u200d\ud83d\udcbc Employee Menu:");
         System.out.println("1. View Profile");
         System.out.println("2. Update Profile");
         System.out.println("3. View Company Policies");
         System.out.println("4. Apply for Leave");
         System.out.println("5. View Attendance");
         System.out.println("0. Logout");
         System.out.print("Enter choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
            case 0:
               running = false;
               System.out.println("\ud83d\udc4b Logging out from Employee Section...");
               break;
            case 1:
               System.out.println("\n--- Viewing Employee Profile ---");
               break;
            case 2:
               System.out.println("\n--- Updating Employee Profile ---");
               break;
            case 3:
               System.out.println("\n--- Viewing Company Policies ---");
               break;
            case 4:
               System.out.println("\n--- Applying for Leave ---");
               break;
            case 5:
               System.out.println("\n--- Viewing Attendance ---");
               break;
            default:
               System.out.println("❌ Invalid choice. Please try again.");
         }
      }

   }
}
