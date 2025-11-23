import java.util.*;

public class StudentIDManagement {
    public static void main(String[] args) {
        HashSet<Integer> studentIDs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student ID Management System ---");
            System.out.println("1. Add Student ID");
            System.out.println("2. Remove Student ID");
            System.out.println("3. Search Student ID");
            System.out.println("4. Display All Student IDs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID to Add: ");
                    int addID = sc.nextInt();
                    if (studentIDs.add(addID)) {
                        System.out.println("Student ID added successfully!");
                    } else {
                        System.out.println("ID already exists in the system!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to Remove: ");
                    int removeID = sc.nextInt();
                    if (studentIDs.remove(removeID)) {
                        System.out.println("Student ID removed successfully!");
                    } else {
                        System.out.println("ID not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchID = sc.nextInt();
                    if (studentIDs.contains(searchID)) {
                        System.out.println("Student ID found!");
                    } else {
                        System.out.println("Student ID not found!");
                    }
                    break;

                case 4:
                    System.out.println("All Student IDs: " + studentIDs);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}